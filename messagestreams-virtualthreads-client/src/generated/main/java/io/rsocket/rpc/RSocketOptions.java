// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rsocket/options.proto

package io.rsocket.rpc;

public final class RSocketOptions {
  private RSocketOptions() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(io.rsocket.rpc.RSocketOptions.options);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int OPTIONS_FIELD_NUMBER = 1057;
  /**
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MethodOptions,
      io.rsocket.rpc.RSocketMethodOptions> options = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        io.rsocket.rpc.RSocketMethodOptions.class,
        io.rsocket.rpc.RSocketMethodOptions.getDefaultInstance());
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_rsocket_rpc_RSocketMethodOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_rsocket_rpc_RSocketMethodOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025rsocket/options.proto\022\016io.rsocket.rpc\032" +
      " google/protobuf/descriptor.proto\"Q\n\024RSo" +
      "cketMethodOptions\022\027\n\017fire_and_forget\030\001 \001" +
      "(\010\022\014\n\004rank\030p \001(\005\022\022\n\nidempotent\030q \001(\010:V\n\007" +
      "options\022\036.google.protobuf.MethodOptions\030" +
      "\241\010 \001(\0132$.io.rsocket.rpc.RSocketMethodOpt" +
      "ionsB\"\n\016io.rsocket.rpcB\016RSocketOptionsP\001" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_io_rsocket_rpc_RSocketMethodOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_rsocket_rpc_RSocketMethodOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_rsocket_rpc_RSocketMethodOptions_descriptor,
        new java.lang.String[] { "FireAndForget", "Rank", "Idempotent", });
    options.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
