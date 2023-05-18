package com.jauntsdn.messagestreams.virtualthreads.client;

import com.jauntsdn.messagestreams.virtualthreads.MessageStreamsFactory;
import com.jauntsdn.rsocket.MessageStreams;
import futures.DinerClient;
import futures.Order;
import futures.Payment;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.function.BiConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(MessageStreamsFactory messageStreamsFactory) {
    onAppStarted();
    var transportAddress = System.getProperty("SERVICE_ADDRESS", "tcp://localhost:7780");
    logger.info("==> FUTURES SERVICE: address {}", transportAddress);

    var messageStreamsClient = messageStreamsFactory.client("FUTURES", transportAddress);

    var messageStreamsFuture = new CompletableFuture<MessageStreams>();

    try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
      executor.execute(
          () -> {
            var messageStreams =
                messageStreamsClient
                    .toCompletableFuture()
                    .whenComplete(clientStartListener())
                    .join();

            var diner = DinerClient.create(messageStreams);

            var borsch = "borsch";
            var count = 2;
            logger.info("Ordering meal: {}, {} portions", borsch, count);

            var meal = diner.order(Order.newBuilder().setMeal(borsch).setCount(count).build());
            logger.info(
                "Got meal: {}, {} portions for {} $",
                meal.getMeal(),
                meal.getCount(),
                meal.getPrice());

            diner.pay(
                Payment.newBuilder()
                    .setAmount(meal.getPrice())
                    .setCode(meal.getPaymentCode())
                    .build());
            logger.info("Paid for meal with code: {}", meal.getPaymentCode());

            messageStreams.dispose();
            messageStreamsFuture.complete(messageStreams);
          });
    }
    messageStreamsFuture.thenCompose(MessageStreams::onClose).join();
    logger.info("MessageStreams closed");
  }

  private static BiConsumer<MessageStreams, Throwable> clientStartListener() {
    return (ignored, err) -> {
      if (err != null) {
        logger.info(
            "==> FUTURES SERVICE CONNECTION ERROR: {}:{}", err.getClass(), err.getMessage());
      } else {
        var startMillis = startMillis();
        if (startMillis > 0) {
          logger.info(
              "==> FUTURES SERVICE CONNECTED SUCCESSFULLY. START TIME, MILLIS: {}",
              System.currentTimeMillis() - startMillis);
        } else {
          logger.info("==> FUTURES SERVICE CONNECTED SUCCESSFULLY");
        }
      }
    };
  }

  private static void onAppStarted() {
    long startMillis = startMillis();
    if (startMillis > 0) {
      logger.info(
          "==> FUTURES SERVICE STARTED SUCCESSFULLY. START TIME, MILLIS: {}",
          System.currentTimeMillis() - startMillis);
    }
  }

  private static long startMillis() {
    var startMillisProperty = System.getProperty("START_MILLIS", "");
    return startMillisProperty.isEmpty() ? 0 : Long.parseLong(startMillisProperty);
  }
}
