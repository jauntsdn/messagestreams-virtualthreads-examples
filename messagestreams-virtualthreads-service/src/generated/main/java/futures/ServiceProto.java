// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package futures;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_futures_Order_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_futures_Order_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_futures_Meal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_futures_Meal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_futures_Payment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_futures_Payment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rservice.proto\022\007futures\032\033google/protobu" +
      "f/empty.proto\032\025rsocket/options.proto\"$\n\005" +
      "Order\022\014\n\004meal\030\001 \001(\t\022\r\n\005count\030\002 \001(\005\"G\n\004Me" +
      "al\022\014\n\004meal\030\001 \001(\t\022\r\n\005count\030\002 \001(\005\022\r\n\005price" +
      "\030\003 \001(\002\022\023\n\013paymentCode\030\004 \001(\003\"\'\n\007Payment\022\014" +
      "\n\004code\030\001 \001(\003\022\016\n\006amount\030\002 \001(\0022i\n\005Diner\022(\n" +
      "\005order\022\016.futures.Order\032\r.futures.Meal\"\000\022" +
      "6\n\003pay\022\020.futures.Payment\032\026.google.protob" +
      "uf.Empty\"\005\212B\002\010\001B\031\n\007futuresB\014ServiceProto" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          io.rsocket.rpc.RSocketOptions.getDescriptor(),
        });
    internal_static_futures_Order_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_futures_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_futures_Order_descriptor,
        new java.lang.String[] { "Meal", "Count", });
    internal_static_futures_Meal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_futures_Meal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_futures_Meal_descriptor,
        new java.lang.String[] { "Meal", "Count", "Price", "PaymentCode", });
    internal_static_futures_Payment_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_futures_Payment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_futures_Payment_descriptor,
        new java.lang.String[] { "Code", "Amount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(io.rsocket.rpc.RSocketOptions.options);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.EmptyProto.getDescriptor();
    io.rsocket.rpc.RSocketOptions.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
