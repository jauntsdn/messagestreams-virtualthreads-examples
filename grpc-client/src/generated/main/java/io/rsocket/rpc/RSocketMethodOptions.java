// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rsocket/options.proto

package io.rsocket.rpc;

/**
 * Protobuf type {@code io.rsocket.rpc.RSocketMethodOptions}
 */
public final class RSocketMethodOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.rsocket.rpc.RSocketMethodOptions)
    RSocketMethodOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RSocketMethodOptions.newBuilder() to construct.
  private RSocketMethodOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RSocketMethodOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RSocketMethodOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.rsocket.rpc.RSocketOptions.internal_static_io_rsocket_rpc_RSocketMethodOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.rsocket.rpc.RSocketOptions.internal_static_io_rsocket_rpc_RSocketMethodOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.rsocket.rpc.RSocketMethodOptions.class, io.rsocket.rpc.RSocketMethodOptions.Builder.class);
  }

  public static final int FIRE_AND_FORGET_FIELD_NUMBER = 1;
  private boolean fireAndForget_ = false;
  /**
   * <code>bool fire_and_forget = 1;</code>
   * @return The fireAndForget.
   */
  @java.lang.Override
  public boolean getFireAndForget() {
    return fireAndForget_;
  }

  public static final int RANK_FIELD_NUMBER = 112;
  private int rank_ = 0;
  /**
   * <code>int32 rank = 112;</code>
   * @return The rank.
   */
  @java.lang.Override
  public int getRank() {
    return rank_;
  }

  public static final int IDEMPOTENT_FIELD_NUMBER = 113;
  private boolean idempotent_ = false;
  /**
   * <code>bool idempotent = 113;</code>
   * @return The idempotent.
   */
  @java.lang.Override
  public boolean getIdempotent() {
    return idempotent_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (fireAndForget_ != false) {
      output.writeBool(1, fireAndForget_);
    }
    if (rank_ != 0) {
      output.writeInt32(112, rank_);
    }
    if (idempotent_ != false) {
      output.writeBool(113, idempotent_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fireAndForget_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, fireAndForget_);
    }
    if (rank_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(112, rank_);
    }
    if (idempotent_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(113, idempotent_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.rsocket.rpc.RSocketMethodOptions)) {
      return super.equals(obj);
    }
    io.rsocket.rpc.RSocketMethodOptions other = (io.rsocket.rpc.RSocketMethodOptions) obj;

    if (getFireAndForget()
        != other.getFireAndForget()) return false;
    if (getRank()
        != other.getRank()) return false;
    if (getIdempotent()
        != other.getIdempotent()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FIRE_AND_FORGET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFireAndForget());
    hash = (37 * hash) + RANK_FIELD_NUMBER;
    hash = (53 * hash) + getRank();
    hash = (37 * hash) + IDEMPOTENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIdempotent());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.rsocket.rpc.RSocketMethodOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.rsocket.rpc.RSocketMethodOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.rsocket.rpc.RSocketMethodOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.rsocket.rpc.RSocketMethodOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.rsocket.rpc.RSocketMethodOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.rsocket.rpc.RSocketMethodOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.rsocket.rpc.RSocketMethodOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.rsocket.rpc.RSocketMethodOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.rsocket.rpc.RSocketMethodOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.rsocket.rpc.RSocketMethodOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.rsocket.rpc.RSocketMethodOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.rsocket.rpc.RSocketMethodOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.rsocket.rpc.RSocketMethodOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code io.rsocket.rpc.RSocketMethodOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.rsocket.rpc.RSocketMethodOptions)
      io.rsocket.rpc.RSocketMethodOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.rsocket.rpc.RSocketOptions.internal_static_io_rsocket_rpc_RSocketMethodOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.rsocket.rpc.RSocketOptions.internal_static_io_rsocket_rpc_RSocketMethodOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.rsocket.rpc.RSocketMethodOptions.class, io.rsocket.rpc.RSocketMethodOptions.Builder.class);
    }

    // Construct using io.rsocket.rpc.RSocketMethodOptions.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fireAndForget_ = false;
      rank_ = 0;
      idempotent_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.rsocket.rpc.RSocketOptions.internal_static_io_rsocket_rpc_RSocketMethodOptions_descriptor;
    }

    @java.lang.Override
    public io.rsocket.rpc.RSocketMethodOptions getDefaultInstanceForType() {
      return io.rsocket.rpc.RSocketMethodOptions.getDefaultInstance();
    }

    @java.lang.Override
    public io.rsocket.rpc.RSocketMethodOptions build() {
      io.rsocket.rpc.RSocketMethodOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.rsocket.rpc.RSocketMethodOptions buildPartial() {
      io.rsocket.rpc.RSocketMethodOptions result = new io.rsocket.rpc.RSocketMethodOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.rsocket.rpc.RSocketMethodOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fireAndForget_ = fireAndForget_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rank_ = rank_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.idempotent_ = idempotent_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.rsocket.rpc.RSocketMethodOptions) {
        return mergeFrom((io.rsocket.rpc.RSocketMethodOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.rsocket.rpc.RSocketMethodOptions other) {
      if (other == io.rsocket.rpc.RSocketMethodOptions.getDefaultInstance()) return this;
      if (other.getFireAndForget() != false) {
        setFireAndForget(other.getFireAndForget());
      }
      if (other.getRank() != 0) {
        setRank(other.getRank());
      }
      if (other.getIdempotent() != false) {
        setIdempotent(other.getIdempotent());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              fireAndForget_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 896: {
              rank_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 896
            case 904: {
              idempotent_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 904
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private boolean fireAndForget_ ;
    /**
     * <code>bool fire_and_forget = 1;</code>
     * @return The fireAndForget.
     */
    @java.lang.Override
    public boolean getFireAndForget() {
      return fireAndForget_;
    }
    /**
     * <code>bool fire_and_forget = 1;</code>
     * @param value The fireAndForget to set.
     * @return This builder for chaining.
     */
    public Builder setFireAndForget(boolean value) {

      fireAndForget_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool fire_and_forget = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFireAndForget() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fireAndForget_ = false;
      onChanged();
      return this;
    }

    private int rank_ ;
    /**
     * <code>int32 rank = 112;</code>
     * @return The rank.
     */
    @java.lang.Override
    public int getRank() {
      return rank_;
    }
    /**
     * <code>int32 rank = 112;</code>
     * @param value The rank to set.
     * @return This builder for chaining.
     */
    public Builder setRank(int value) {

      rank_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 rank = 112;</code>
     * @return This builder for chaining.
     */
    public Builder clearRank() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rank_ = 0;
      onChanged();
      return this;
    }

    private boolean idempotent_ ;
    /**
     * <code>bool idempotent = 113;</code>
     * @return The idempotent.
     */
    @java.lang.Override
    public boolean getIdempotent() {
      return idempotent_;
    }
    /**
     * <code>bool idempotent = 113;</code>
     * @param value The idempotent to set.
     * @return This builder for chaining.
     */
    public Builder setIdempotent(boolean value) {

      idempotent_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool idempotent = 113;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdempotent() {
      bitField0_ = (bitField0_ & ~0x00000004);
      idempotent_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.rsocket.rpc.RSocketMethodOptions)
  }

  // @@protoc_insertion_point(class_scope:io.rsocket.rpc.RSocketMethodOptions)
  private static final io.rsocket.rpc.RSocketMethodOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.rsocket.rpc.RSocketMethodOptions();
  }

  public static io.rsocket.rpc.RSocketMethodOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RSocketMethodOptions>
      PARSER = new com.google.protobuf.AbstractParser<RSocketMethodOptions>() {
    @java.lang.Override
    public RSocketMethodOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RSocketMethodOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RSocketMethodOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.rsocket.rpc.RSocketMethodOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

