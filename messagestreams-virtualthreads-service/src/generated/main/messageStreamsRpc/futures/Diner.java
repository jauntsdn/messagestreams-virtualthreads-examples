// Generated by jauntsdn.com rsocket-rpc compiler (version 1.5.0)
// source: service.proto

package futures;

public interface Diner {
  String SERVICE = "futures.Diner";
  Class<?> SERVICE_TYPE = futures.Diner.class;

  String METHOD_ORDER = "order";
  boolean METHOD_ORDER_IDEMPOTENT = false;
  int METHOD_ORDER_RANK = 0;

  String METHOD_PAY = "pay";
  boolean METHOD_PAY_IDEMPOTENT = false;
  int METHOD_PAY_RANK = 0;

  futures.Meal order(futures.Order message, com.jauntsdn.rsocket.Headers metadata);

  void pay(futures.Payment message, com.jauntsdn.rsocket.Headers metadata);

  default futures.Meal order(futures.Order message) {
    return order(message, com.jauntsdn.rsocket.Headers.empty());
  }

  default void pay(futures.Payment message) {
    pay(message, com.jauntsdn.rsocket.Headers.empty());
  }
}
