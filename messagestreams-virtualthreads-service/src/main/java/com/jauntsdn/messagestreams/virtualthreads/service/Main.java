package com.jauntsdn.messagestreams.virtualthreads.service;

import com.jauntsdn.messagestreams.virtualthreads.MessageStreamsFactory;
import com.jauntsdn.rsocket.Disposable;
import com.jauntsdn.rsocket.ServerStreamsAcceptor;
import futures.*;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  @SuppressWarnings("unchecked")
  public static void main(MessageStreamsFactory messageStreamsFactory) {
    String serviceTcpAddress = System.getProperty("SERVICE_ADDRESS_TCP", "tcp://localhost:7780");
    String serviceWsAddress = System.getProperty("SERVICE_ADDRESS_WS", "ws1://localhost:7781");
    String serviceGrpcAddress = System.getProperty("SERVICE_ADDRESS_GRPC", "grpc://localhost:7782");
    logger.info("==> FUTURES SERVICE, TCP: {}", serviceTcpAddress);
    logger.info("==> FUTURES SERVICE, WEBSOCKET: {}", serviceWsAddress);
    logger.info("==> FUTURES SERVICE, GRPC: {}", serviceGrpcAddress);

    Diner diner = new GoodDiner();

    ServerStreamsAcceptor acceptor =
        (setupMessage, messageStreams) ->
            CompletableFuture.completedFuture(
                DinerServer.create(diner).withLifecycle(messageStreams));

    /*Runtime - including network transports, metrics, load estimator may be trivially
     * hidden from application developer*/

    /*TCP*/
    CompletionStage<Disposable> tcpServer =
        messageStreamsFactory.server("FUTURES_SERVICE", serviceTcpAddress).start(acceptor);

    /*WEBSOCKET*/
    CompletionStage<Disposable> ws2Server =
        messageStreamsFactory.server("FUTURES_SERVICE", serviceWsAddress).start(acceptor);

    /*GRPC*/
    CompletionStage<Disposable> grpcServer =
        messageStreamsFactory.server("FUTURES_SERVICE", serviceGrpcAddress).start(acceptor);

    awaitServersClose(tcpServer, ws2Server, grpcServer);
  }

  private static class GoodDiner implements Diner {

    @Override
    public Meal order(Order message, ByteBuf metadata) {
      ThreadLocalRandom random = ThreadLocalRandom.current();
      int count = message.getCount();
      int mealCount = random.nextInt(1, count + 1);
      double pricePerMeal = 11 + random.nextDouble(0, 2);
      float price = (float) Math.min(Float.MAX_VALUE, pricePerMeal * mealCount);
      return Meal.newBuilder()
          .setMeal(message.getMeal())
          .setCount(mealCount)
          .setPrice(price)
          .setPaymentCode(random.nextLong(0, Long.MAX_VALUE))
          .build();
    }

    @Override
    public void pay(Payment message, ByteBuf metadata) {
      logger.info("Received payment: {} $ for order: {}", message.getAmount(), message.getCode());
    }
  }

  private static void awaitServersClose(CompletionStage<Disposable>... servers) {
    BiConsumer<Disposable, Throwable> serverStartListener = serverStartListener();
    List<Disposable> startedServers = new ArrayList<>(servers.length);
    for (CompletionStage<Disposable> server : servers) {
      Disposable startedServer =
          server
              .whenComplete(serverStartListener)
              .toCompletableFuture()
              .orTimeout(15, TimeUnit.SECONDS)
              .join();
      startedServers.add(startedServer);
    }
    for (Disposable startedServer : startedServers) {
      startedServer.onClose().awaitUninterruptibly();
    }
  }

  private static BiConsumer<Disposable, Throwable> serverStartListener() {
    return new BiConsumer<>() {
      boolean isStart = true;

      @Override
      public void accept(Disposable disposable, Throwable err) {
        if (err != null) {
          logger.info(
              "==> FUTURES SERVER BOUND WITH ERROR: {}:{}", err.getClass(), err.getMessage());
        } else {
          long startMillis = 0;
          if (isStart) {
            isStart = false;
            String startMillisProperty = System.getProperty("START_MILLIS", "");
            startMillis = startMillisProperty.isEmpty() ? 0 : Long.parseLong(startMillisProperty);
          }
          if (startMillis > 0) {
            logger.info(
                "==> FUTURES SERVER BOUND SUCCESSFULLY. START TIME, MILLIS: {}",
                System.currentTimeMillis() - startMillis);
          } else {
            logger.info("==> FUTURES SERVER BOUND SUCCESSFULLY");
          }
        }
      }
    };
  }
}
