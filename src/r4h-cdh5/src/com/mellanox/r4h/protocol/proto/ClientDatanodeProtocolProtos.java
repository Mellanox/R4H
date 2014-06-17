package com.mellanox.r4h.protocol.proto;


public final class ClientDatanodeProtocolProtos {
  private ClientDatanodeProtocolProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetReplicaVisibleLengthRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.ExtendedBlockProto block = 1;
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    boolean hasBlock();
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock();
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetReplicaVisibleLengthRequestProto}
   *
   * <pre>
   **
   * block - block for which visible length is requested
   * </pre>
   */
  public static final class GetReplicaVisibleLengthRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements GetReplicaVisibleLengthRequestProtoOrBuilder {
    // Use GetReplicaVisibleLengthRequestProto.newBuilder() to construct.
    private GetReplicaVisibleLengthRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetReplicaVisibleLengthRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetReplicaVisibleLengthRequestProto defaultInstance;
    public static GetReplicaVisibleLengthRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetReplicaVisibleLengthRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetReplicaVisibleLengthRequestProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = block_.toBuilder();
              }
              block_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(block_);
                block_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetReplicaVisibleLengthRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetReplicaVisibleLengthRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetReplicaVisibleLengthRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<GetReplicaVisibleLengthRequestProto>() {
      public GetReplicaVisibleLengthRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetReplicaVisibleLengthRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetReplicaVisibleLengthRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.ExtendedBlockProto block = 1;
    public static final int BLOCK_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto block_;
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock() {
      return block_;
    }
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder() {
      return block_;
    }

    private void initFields() {
      block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBlock()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getBlock().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, block_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, block_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto) obj;

      boolean result = true;
      result = result && (hasBlock() == other.hasBlock());
      if (hasBlock()) {
        result = result && getBlock()
            .equals(other.getBlock());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasBlock()) {
        hash = (37 * hash) + BLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getBlock().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.GetReplicaVisibleLengthRequestProto}
     *
     * <pre>
     **
     * block - block for which visible length is requested
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetReplicaVisibleLengthRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetReplicaVisibleLengthRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBlockFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (blockBuilder_ == null) {
          block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetReplicaVisibleLengthRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (blockBuilder_ == null) {
          result.block_ = block_;
        } else {
          result.block_ = blockBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto.getDefaultInstance()) return this;
        if (other.hasBlock()) {
          mergeBlock(other.getBlock());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBlock()) {
          
          return false;
        }
        if (!getBlock().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.ExtendedBlockProto block = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder> blockBuilder_;
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public boolean hasBlock() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock() {
        if (blockBuilder_ == null) {
          return block_;
        } else {
          return blockBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder setBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto value) {
        if (blockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          block_ = value;
          onChanged();
        } else {
          blockBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder setBlock(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder builderForValue) {
        if (blockBuilder_ == null) {
          block_ = builderForValue.build();
          onChanged();
        } else {
          blockBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder mergeBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto value) {
        if (blockBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              block_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance()) {
            block_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.newBuilder(block_).mergeFrom(value).buildPartial();
          } else {
            block_ = value;
          }
          onChanged();
        } else {
          blockBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder clearBlock() {
        if (blockBuilder_ == null) {
          block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
          onChanged();
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder getBlockBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder() {
        if (blockBuilder_ != null) {
          return blockBuilder_.getMessageOrBuilder();
        } else {
          return block_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder> 
          getBlockFieldBuilder() {
        if (blockBuilder_ == null) {
          blockBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder>(
                  block_,
                  getParentForChildren(),
                  isClean());
          block_ = null;
        }
        return blockBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetReplicaVisibleLengthRequestProto)
    }

    static {
      defaultInstance = new GetReplicaVisibleLengthRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetReplicaVisibleLengthRequestProto)
  }

  public interface GetReplicaVisibleLengthResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required uint64 length = 1;
    /**
     * <code>required uint64 length = 1;</code>
     */
    boolean hasLength();
    /**
     * <code>required uint64 length = 1;</code>
     */
    long getLength();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetReplicaVisibleLengthResponseProto}
   *
   * <pre>
   **
   * length - visible length of the block
   * </pre>
   */
  public static final class GetReplicaVisibleLengthResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements GetReplicaVisibleLengthResponseProtoOrBuilder {
    // Use GetReplicaVisibleLengthResponseProto.newBuilder() to construct.
    private GetReplicaVisibleLengthResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetReplicaVisibleLengthResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetReplicaVisibleLengthResponseProto defaultInstance;
    public static GetReplicaVisibleLengthResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetReplicaVisibleLengthResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetReplicaVisibleLengthResponseProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              length_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetReplicaVisibleLengthResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetReplicaVisibleLengthResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetReplicaVisibleLengthResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<GetReplicaVisibleLengthResponseProto>() {
      public GetReplicaVisibleLengthResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetReplicaVisibleLengthResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetReplicaVisibleLengthResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required uint64 length = 1;
    public static final int LENGTH_FIELD_NUMBER = 1;
    private long length_;
    /**
     * <code>required uint64 length = 1;</code>
     */
    public boolean hasLength() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint64 length = 1;</code>
     */
    public long getLength() {
      return length_;
    }

    private void initFields() {
      length_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasLength()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, length_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, length_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto) obj;

      boolean result = true;
      result = result && (hasLength() == other.hasLength());
      if (hasLength()) {
        result = result && (getLength()
            == other.getLength());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasLength()) {
        hash = (37 * hash) + LENGTH_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getLength());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.GetReplicaVisibleLengthResponseProto}
     *
     * <pre>
     **
     * length - visible length of the block
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetReplicaVisibleLengthResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetReplicaVisibleLengthResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        length_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetReplicaVisibleLengthResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.length_ = length_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.getDefaultInstance()) return this;
        if (other.hasLength()) {
          setLength(other.getLength());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasLength()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required uint64 length = 1;
      private long length_ ;
      /**
       * <code>required uint64 length = 1;</code>
       */
      public boolean hasLength() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required uint64 length = 1;</code>
       */
      public long getLength() {
        return length_;
      }
      /**
       * <code>required uint64 length = 1;</code>
       */
      public Builder setLength(long value) {
        bitField0_ |= 0x00000001;
        length_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 length = 1;</code>
       */
      public Builder clearLength() {
        bitField0_ = (bitField0_ & ~0x00000001);
        length_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetReplicaVisibleLengthResponseProto)
    }

    static {
      defaultInstance = new GetReplicaVisibleLengthResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetReplicaVisibleLengthResponseProto)
  }

  public interface RefreshNamenodesRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RefreshNamenodesRequestProto}
   *
   * <pre>
   **
   * void request
   * </pre>
   */
  public static final class RefreshNamenodesRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements RefreshNamenodesRequestProtoOrBuilder {
    // Use RefreshNamenodesRequestProto.newBuilder() to construct.
    private RefreshNamenodesRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RefreshNamenodesRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RefreshNamenodesRequestProto defaultInstance;
    public static RefreshNamenodesRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public RefreshNamenodesRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RefreshNamenodesRequestProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_RefreshNamenodesRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_RefreshNamenodesRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RefreshNamenodesRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<RefreshNamenodesRequestProto>() {
      public RefreshNamenodesRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RefreshNamenodesRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RefreshNamenodesRequestProto> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto) obj;

      boolean result = true;
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.RefreshNamenodesRequestProto}
     *
     * <pre>
     **
     * void request
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_RefreshNamenodesRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_RefreshNamenodesRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_RefreshNamenodesRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RefreshNamenodesRequestProto)
    }

    static {
      defaultInstance = new RefreshNamenodesRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RefreshNamenodesRequestProto)
  }

  public interface RefreshNamenodesResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RefreshNamenodesResponseProto}
   *
   * <pre>
   **
   * void response
   * </pre>
   */
  public static final class RefreshNamenodesResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements RefreshNamenodesResponseProtoOrBuilder {
    // Use RefreshNamenodesResponseProto.newBuilder() to construct.
    private RefreshNamenodesResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RefreshNamenodesResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RefreshNamenodesResponseProto defaultInstance;
    public static RefreshNamenodesResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public RefreshNamenodesResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RefreshNamenodesResponseProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_RefreshNamenodesResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_RefreshNamenodesResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RefreshNamenodesResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<RefreshNamenodesResponseProto>() {
      public RefreshNamenodesResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RefreshNamenodesResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RefreshNamenodesResponseProto> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto) obj;

      boolean result = true;
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.RefreshNamenodesResponseProto}
     *
     * <pre>
     **
     * void response
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_RefreshNamenodesResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_RefreshNamenodesResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_RefreshNamenodesResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RefreshNamenodesResponseProto)
    }

    static {
      defaultInstance = new RefreshNamenodesResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RefreshNamenodesResponseProto)
  }

  public interface DeleteBlockPoolRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string blockPool = 1;
    /**
     * <code>required string blockPool = 1;</code>
     */
    boolean hasBlockPool();
    /**
     * <code>required string blockPool = 1;</code>
     */
    java.lang.String getBlockPool();
    /**
     * <code>required string blockPool = 1;</code>
     */
    com.google.protobuf.ByteString
        getBlockPoolBytes();

    // required bool force = 2;
    /**
     * <code>required bool force = 2;</code>
     */
    boolean hasForce();
    /**
     * <code>required bool force = 2;</code>
     */
    boolean getForce();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.DeleteBlockPoolRequestProto}
   *
   * <pre>
   **
   * blockPool - block pool to be deleted
   * force - if false, delete the block pool only if it is empty.
   *         if true, delete the block pool even if it has blocks.
   * </pre>
   */
  public static final class DeleteBlockPoolRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements DeleteBlockPoolRequestProtoOrBuilder {
    // Use DeleteBlockPoolRequestProto.newBuilder() to construct.
    private DeleteBlockPoolRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DeleteBlockPoolRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DeleteBlockPoolRequestProto defaultInstance;
    public static DeleteBlockPoolRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public DeleteBlockPoolRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DeleteBlockPoolRequestProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              blockPool_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              force_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_DeleteBlockPoolRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_DeleteBlockPoolRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<DeleteBlockPoolRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<DeleteBlockPoolRequestProto>() {
      public DeleteBlockPoolRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeleteBlockPoolRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DeleteBlockPoolRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string blockPool = 1;
    public static final int BLOCKPOOL_FIELD_NUMBER = 1;
    private java.lang.Object blockPool_;
    /**
     * <code>required string blockPool = 1;</code>
     */
    public boolean hasBlockPool() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string blockPool = 1;</code>
     */
    public java.lang.String getBlockPool() {
      java.lang.Object ref = blockPool_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          blockPool_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string blockPool = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBlockPoolBytes() {
      java.lang.Object ref = blockPool_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        blockPool_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required bool force = 2;
    public static final int FORCE_FIELD_NUMBER = 2;
    private boolean force_;
    /**
     * <code>required bool force = 2;</code>
     */
    public boolean hasForce() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bool force = 2;</code>
     */
    public boolean getForce() {
      return force_;
    }

    private void initFields() {
      blockPool_ = "";
      force_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBlockPool()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasForce()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getBlockPoolBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, force_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getBlockPoolBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, force_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto) obj;

      boolean result = true;
      result = result && (hasBlockPool() == other.hasBlockPool());
      if (hasBlockPool()) {
        result = result && getBlockPool()
            .equals(other.getBlockPool());
      }
      result = result && (hasForce() == other.hasForce());
      if (hasForce()) {
        result = result && (getForce()
            == other.getForce());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasBlockPool()) {
        hash = (37 * hash) + BLOCKPOOL_FIELD_NUMBER;
        hash = (53 * hash) + getBlockPool().hashCode();
      }
      if (hasForce()) {
        hash = (37 * hash) + FORCE_FIELD_NUMBER;
        hash = (53 * hash) + hashBoolean(getForce());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.DeleteBlockPoolRequestProto}
     *
     * <pre>
     **
     * blockPool - block pool to be deleted
     * force - if false, delete the block pool only if it is empty.
     *         if true, delete the block pool even if it has blocks.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_DeleteBlockPoolRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_DeleteBlockPoolRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        blockPool_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        force_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_DeleteBlockPoolRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.blockPool_ = blockPool_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.force_ = force_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto.getDefaultInstance()) return this;
        if (other.hasBlockPool()) {
          bitField0_ |= 0x00000001;
          blockPool_ = other.blockPool_;
          onChanged();
        }
        if (other.hasForce()) {
          setForce(other.getForce());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBlockPool()) {
          
          return false;
        }
        if (!hasForce()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string blockPool = 1;
      private java.lang.Object blockPool_ = "";
      /**
       * <code>required string blockPool = 1;</code>
       */
      public boolean hasBlockPool() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string blockPool = 1;</code>
       */
      public java.lang.String getBlockPool() {
        java.lang.Object ref = blockPool_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          blockPool_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string blockPool = 1;</code>
       */
      public com.google.protobuf.ByteString
          getBlockPoolBytes() {
        java.lang.Object ref = blockPool_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          blockPool_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string blockPool = 1;</code>
       */
      public Builder setBlockPool(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        blockPool_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string blockPool = 1;</code>
       */
      public Builder clearBlockPool() {
        bitField0_ = (bitField0_ & ~0x00000001);
        blockPool_ = getDefaultInstance().getBlockPool();
        onChanged();
        return this;
      }
      /**
       * <code>required string blockPool = 1;</code>
       */
      public Builder setBlockPoolBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        blockPool_ = value;
        onChanged();
        return this;
      }

      // required bool force = 2;
      private boolean force_ ;
      /**
       * <code>required bool force = 2;</code>
       */
      public boolean hasForce() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bool force = 2;</code>
       */
      public boolean getForce() {
        return force_;
      }
      /**
       * <code>required bool force = 2;</code>
       */
      public Builder setForce(boolean value) {
        bitField0_ |= 0x00000002;
        force_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool force = 2;</code>
       */
      public Builder clearForce() {
        bitField0_ = (bitField0_ & ~0x00000002);
        force_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.DeleteBlockPoolRequestProto)
    }

    static {
      defaultInstance = new DeleteBlockPoolRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.DeleteBlockPoolRequestProto)
  }

  public interface DeleteBlockPoolResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.DeleteBlockPoolResponseProto}
   *
   * <pre>
   **
   * void response
   * </pre>
   */
  public static final class DeleteBlockPoolResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements DeleteBlockPoolResponseProtoOrBuilder {
    // Use DeleteBlockPoolResponseProto.newBuilder() to construct.
    private DeleteBlockPoolResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DeleteBlockPoolResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DeleteBlockPoolResponseProto defaultInstance;
    public static DeleteBlockPoolResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public DeleteBlockPoolResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DeleteBlockPoolResponseProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_DeleteBlockPoolResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_DeleteBlockPoolResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<DeleteBlockPoolResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<DeleteBlockPoolResponseProto>() {
      public DeleteBlockPoolResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeleteBlockPoolResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DeleteBlockPoolResponseProto> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto) obj;

      boolean result = true;
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.DeleteBlockPoolResponseProto}
     *
     * <pre>
     **
     * void response
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_DeleteBlockPoolResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_DeleteBlockPoolResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_DeleteBlockPoolResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.DeleteBlockPoolResponseProto)
    }

    static {
      defaultInstance = new DeleteBlockPoolResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.DeleteBlockPoolResponseProto)
  }

  public interface GetBlockLocalPathInfoRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.ExtendedBlockProto block = 1;
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    boolean hasBlock();
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock();
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder();

    // required .hadoop.common.TokenProto token = 2;
    /**
     * <code>required .hadoop.common.TokenProto token = 2;</code>
     */
    boolean hasToken();
    /**
     * <code>required .hadoop.common.TokenProto token = 2;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken();
    /**
     * <code>required .hadoop.common.TokenProto token = 2;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetBlockLocalPathInfoRequestProto}
   *
   * <pre>
   **
   * Gets the file information where block and its metadata is stored
   * block - block for which path information is being requested
   * token - block token
   *
   * This message is deprecated in favor of file descriptor passing.
   * </pre>
   */
  public static final class GetBlockLocalPathInfoRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements GetBlockLocalPathInfoRequestProtoOrBuilder {
    // Use GetBlockLocalPathInfoRequestProto.newBuilder() to construct.
    private GetBlockLocalPathInfoRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetBlockLocalPathInfoRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetBlockLocalPathInfoRequestProto defaultInstance;
    public static GetBlockLocalPathInfoRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetBlockLocalPathInfoRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetBlockLocalPathInfoRequestProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = block_.toBuilder();
              }
              block_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(block_);
                block_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = token_.toBuilder();
              }
              token_ = input.readMessage(org.apache.hadoop.security.proto.SecurityProtos.TokenProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(token_);
                token_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockLocalPathInfoRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockLocalPathInfoRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetBlockLocalPathInfoRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<GetBlockLocalPathInfoRequestProto>() {
      public GetBlockLocalPathInfoRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetBlockLocalPathInfoRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetBlockLocalPathInfoRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.ExtendedBlockProto block = 1;
    public static final int BLOCK_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto block_;
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock() {
      return block_;
    }
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder() {
      return block_;
    }

    // required .hadoop.common.TokenProto token = 2;
    public static final int TOKEN_FIELD_NUMBER = 2;
    private org.apache.hadoop.security.proto.SecurityProtos.TokenProto token_;
    /**
     * <code>required .hadoop.common.TokenProto token = 2;</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .hadoop.common.TokenProto token = 2;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken() {
      return token_;
    }
    /**
     * <code>required .hadoop.common.TokenProto token = 2;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder() {
      return token_;
    }

    private void initFields() {
      block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
      token_ = org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBlock()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasToken()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getBlock().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getToken().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, block_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, token_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, block_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, token_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto) obj;

      boolean result = true;
      result = result && (hasBlock() == other.hasBlock());
      if (hasBlock()) {
        result = result && getBlock()
            .equals(other.getBlock());
      }
      result = result && (hasToken() == other.hasToken());
      if (hasToken()) {
        result = result && getToken()
            .equals(other.getToken());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasBlock()) {
        hash = (37 * hash) + BLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getBlock().hashCode();
      }
      if (hasToken()) {
        hash = (37 * hash) + TOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getToken().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.GetBlockLocalPathInfoRequestProto}
     *
     * <pre>
     **
     * Gets the file information where block and its metadata is stored
     * block - block for which path information is being requested
     * token - block token
     *
     * This message is deprecated in favor of file descriptor passing.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockLocalPathInfoRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockLocalPathInfoRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBlockFieldBuilder();
          getTokenFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (blockBuilder_ == null) {
          block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (tokenBuilder_ == null) {
          token_ = org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance();
        } else {
          tokenBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockLocalPathInfoRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (blockBuilder_ == null) {
          result.block_ = block_;
        } else {
          result.block_ = blockBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (tokenBuilder_ == null) {
          result.token_ = token_;
        } else {
          result.token_ = tokenBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto.getDefaultInstance()) return this;
        if (other.hasBlock()) {
          mergeBlock(other.getBlock());
        }
        if (other.hasToken()) {
          mergeToken(other.getToken());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBlock()) {
          
          return false;
        }
        if (!hasToken()) {
          
          return false;
        }
        if (!getBlock().isInitialized()) {
          
          return false;
        }
        if (!getToken().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.ExtendedBlockProto block = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder> blockBuilder_;
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public boolean hasBlock() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock() {
        if (blockBuilder_ == null) {
          return block_;
        } else {
          return blockBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder setBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto value) {
        if (blockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          block_ = value;
          onChanged();
        } else {
          blockBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder setBlock(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder builderForValue) {
        if (blockBuilder_ == null) {
          block_ = builderForValue.build();
          onChanged();
        } else {
          blockBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder mergeBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto value) {
        if (blockBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              block_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance()) {
            block_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.newBuilder(block_).mergeFrom(value).buildPartial();
          } else {
            block_ = value;
          }
          onChanged();
        } else {
          blockBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder clearBlock() {
        if (blockBuilder_ == null) {
          block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
          onChanged();
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder getBlockBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder() {
        if (blockBuilder_ != null) {
          return blockBuilder_.getMessageOrBuilder();
        } else {
          return block_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder> 
          getBlockFieldBuilder() {
        if (blockBuilder_ == null) {
          blockBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder>(
                  block_,
                  getParentForChildren(),
                  isClean());
          block_ = null;
        }
        return blockBuilder_;
      }

      // required .hadoop.common.TokenProto token = 2;
      private org.apache.hadoop.security.proto.SecurityProtos.TokenProto token_ = org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> tokenBuilder_;
      /**
       * <code>required .hadoop.common.TokenProto token = 2;</code>
       */
      public boolean hasToken() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken() {
        if (tokenBuilder_ == null) {
          return token_;
        } else {
          return tokenBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 2;</code>
       */
      public Builder setToken(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokenBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          token_ = value;
          onChanged();
        } else {
          tokenBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 2;</code>
       */
      public Builder setToken(
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder builderForValue) {
        if (tokenBuilder_ == null) {
          token_ = builderForValue.build();
          onChanged();
        } else {
          tokenBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 2;</code>
       */
      public Builder mergeToken(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokenBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              token_ != org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance()) {
            token_ =
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto.newBuilder(token_).mergeFrom(value).buildPartial();
          } else {
            token_ = value;
          }
          onChanged();
        } else {
          tokenBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 2;</code>
       */
      public Builder clearToken() {
        if (tokenBuilder_ == null) {
          token_ = org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance();
          onChanged();
        } else {
          tokenBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder getTokenBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getTokenFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder() {
        if (tokenBuilder_ != null) {
          return tokenBuilder_.getMessageOrBuilder();
        } else {
          return token_;
        }
      }
      /**
       * <code>required .hadoop.common.TokenProto token = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> 
          getTokenFieldBuilder() {
        if (tokenBuilder_ == null) {
          tokenBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder>(
                  token_,
                  getParentForChildren(),
                  isClean());
          token_ = null;
        }
        return tokenBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetBlockLocalPathInfoRequestProto)
    }

    static {
      defaultInstance = new GetBlockLocalPathInfoRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetBlockLocalPathInfoRequestProto)
  }

  public interface GetBlockLocalPathInfoResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.ExtendedBlockProto block = 1;
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    boolean hasBlock();
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock();
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder();

    // required string localPath = 2;
    /**
     * <code>required string localPath = 2;</code>
     */
    boolean hasLocalPath();
    /**
     * <code>required string localPath = 2;</code>
     */
    java.lang.String getLocalPath();
    /**
     * <code>required string localPath = 2;</code>
     */
    com.google.protobuf.ByteString
        getLocalPathBytes();

    // required string localMetaPath = 3;
    /**
     * <code>required string localMetaPath = 3;</code>
     */
    boolean hasLocalMetaPath();
    /**
     * <code>required string localMetaPath = 3;</code>
     */
    java.lang.String getLocalMetaPath();
    /**
     * <code>required string localMetaPath = 3;</code>
     */
    com.google.protobuf.ByteString
        getLocalMetaPathBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetBlockLocalPathInfoResponseProto}
   *
   * <pre>
   **
   * block - block for which file path information is being returned
   * localPath - file path where the block data is stored
   * localMetaPath - file path where the block meta data is stored
   *
   * This message is deprecated in favor of file descriptor passing.
   * </pre>
   */
  public static final class GetBlockLocalPathInfoResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements GetBlockLocalPathInfoResponseProtoOrBuilder {
    // Use GetBlockLocalPathInfoResponseProto.newBuilder() to construct.
    private GetBlockLocalPathInfoResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetBlockLocalPathInfoResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetBlockLocalPathInfoResponseProto defaultInstance;
    public static GetBlockLocalPathInfoResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetBlockLocalPathInfoResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetBlockLocalPathInfoResponseProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = block_.toBuilder();
              }
              block_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(block_);
                block_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              localPath_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              localMetaPath_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockLocalPathInfoResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockLocalPathInfoResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetBlockLocalPathInfoResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<GetBlockLocalPathInfoResponseProto>() {
      public GetBlockLocalPathInfoResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetBlockLocalPathInfoResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetBlockLocalPathInfoResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.ExtendedBlockProto block = 1;
    public static final int BLOCK_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto block_;
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock() {
      return block_;
    }
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder() {
      return block_;
    }

    // required string localPath = 2;
    public static final int LOCALPATH_FIELD_NUMBER = 2;
    private java.lang.Object localPath_;
    /**
     * <code>required string localPath = 2;</code>
     */
    public boolean hasLocalPath() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string localPath = 2;</code>
     */
    public java.lang.String getLocalPath() {
      java.lang.Object ref = localPath_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          localPath_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string localPath = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLocalPathBytes() {
      java.lang.Object ref = localPath_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        localPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string localMetaPath = 3;
    public static final int LOCALMETAPATH_FIELD_NUMBER = 3;
    private java.lang.Object localMetaPath_;
    /**
     * <code>required string localMetaPath = 3;</code>
     */
    public boolean hasLocalMetaPath() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string localMetaPath = 3;</code>
     */
    public java.lang.String getLocalMetaPath() {
      java.lang.Object ref = localMetaPath_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          localMetaPath_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string localMetaPath = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLocalMetaPathBytes() {
      java.lang.Object ref = localMetaPath_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        localMetaPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
      localPath_ = "";
      localMetaPath_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBlock()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLocalPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLocalMetaPath()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getBlock().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, block_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getLocalPathBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getLocalMetaPathBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, block_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getLocalPathBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getLocalMetaPathBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto) obj;

      boolean result = true;
      result = result && (hasBlock() == other.hasBlock());
      if (hasBlock()) {
        result = result && getBlock()
            .equals(other.getBlock());
      }
      result = result && (hasLocalPath() == other.hasLocalPath());
      if (hasLocalPath()) {
        result = result && getLocalPath()
            .equals(other.getLocalPath());
      }
      result = result && (hasLocalMetaPath() == other.hasLocalMetaPath());
      if (hasLocalMetaPath()) {
        result = result && getLocalMetaPath()
            .equals(other.getLocalMetaPath());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasBlock()) {
        hash = (37 * hash) + BLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getBlock().hashCode();
      }
      if (hasLocalPath()) {
        hash = (37 * hash) + LOCALPATH_FIELD_NUMBER;
        hash = (53 * hash) + getLocalPath().hashCode();
      }
      if (hasLocalMetaPath()) {
        hash = (37 * hash) + LOCALMETAPATH_FIELD_NUMBER;
        hash = (53 * hash) + getLocalMetaPath().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.GetBlockLocalPathInfoResponseProto}
     *
     * <pre>
     **
     * block - block for which file path information is being returned
     * localPath - file path where the block data is stored
     * localMetaPath - file path where the block meta data is stored
     *
     * This message is deprecated in favor of file descriptor passing.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockLocalPathInfoResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockLocalPathInfoResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBlockFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (blockBuilder_ == null) {
          block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        localPath_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        localMetaPath_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockLocalPathInfoResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (blockBuilder_ == null) {
          result.block_ = block_;
        } else {
          result.block_ = blockBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.localPath_ = localPath_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.localMetaPath_ = localMetaPath_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.getDefaultInstance()) return this;
        if (other.hasBlock()) {
          mergeBlock(other.getBlock());
        }
        if (other.hasLocalPath()) {
          bitField0_ |= 0x00000002;
          localPath_ = other.localPath_;
          onChanged();
        }
        if (other.hasLocalMetaPath()) {
          bitField0_ |= 0x00000004;
          localMetaPath_ = other.localMetaPath_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBlock()) {
          
          return false;
        }
        if (!hasLocalPath()) {
          
          return false;
        }
        if (!hasLocalMetaPath()) {
          
          return false;
        }
        if (!getBlock().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.ExtendedBlockProto block = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder> blockBuilder_;
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public boolean hasBlock() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock() {
        if (blockBuilder_ == null) {
          return block_;
        } else {
          return blockBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder setBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto value) {
        if (blockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          block_ = value;
          onChanged();
        } else {
          blockBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder setBlock(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder builderForValue) {
        if (blockBuilder_ == null) {
          block_ = builderForValue.build();
          onChanged();
        } else {
          blockBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder mergeBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto value) {
        if (blockBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              block_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance()) {
            block_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.newBuilder(block_).mergeFrom(value).buildPartial();
          } else {
            block_ = value;
          }
          onChanged();
        } else {
          blockBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public Builder clearBlock() {
        if (blockBuilder_ == null) {
          block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
          onChanged();
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder getBlockBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder() {
        if (blockBuilder_ != null) {
          return blockBuilder_.getMessageOrBuilder();
        } else {
          return block_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder> 
          getBlockFieldBuilder() {
        if (blockBuilder_ == null) {
          blockBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder>(
                  block_,
                  getParentForChildren(),
                  isClean());
          block_ = null;
        }
        return blockBuilder_;
      }

      // required string localPath = 2;
      private java.lang.Object localPath_ = "";
      /**
       * <code>required string localPath = 2;</code>
       */
      public boolean hasLocalPath() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string localPath = 2;</code>
       */
      public java.lang.String getLocalPath() {
        java.lang.Object ref = localPath_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          localPath_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string localPath = 2;</code>
       */
      public com.google.protobuf.ByteString
          getLocalPathBytes() {
        java.lang.Object ref = localPath_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          localPath_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string localPath = 2;</code>
       */
      public Builder setLocalPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        localPath_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string localPath = 2;</code>
       */
      public Builder clearLocalPath() {
        bitField0_ = (bitField0_ & ~0x00000002);
        localPath_ = getDefaultInstance().getLocalPath();
        onChanged();
        return this;
      }
      /**
       * <code>required string localPath = 2;</code>
       */
      public Builder setLocalPathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        localPath_ = value;
        onChanged();
        return this;
      }

      // required string localMetaPath = 3;
      private java.lang.Object localMetaPath_ = "";
      /**
       * <code>required string localMetaPath = 3;</code>
       */
      public boolean hasLocalMetaPath() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string localMetaPath = 3;</code>
       */
      public java.lang.String getLocalMetaPath() {
        java.lang.Object ref = localMetaPath_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          localMetaPath_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string localMetaPath = 3;</code>
       */
      public com.google.protobuf.ByteString
          getLocalMetaPathBytes() {
        java.lang.Object ref = localMetaPath_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          localMetaPath_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string localMetaPath = 3;</code>
       */
      public Builder setLocalMetaPath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        localMetaPath_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string localMetaPath = 3;</code>
       */
      public Builder clearLocalMetaPath() {
        bitField0_ = (bitField0_ & ~0x00000004);
        localMetaPath_ = getDefaultInstance().getLocalMetaPath();
        onChanged();
        return this;
      }
      /**
       * <code>required string localMetaPath = 3;</code>
       */
      public Builder setLocalMetaPathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        localMetaPath_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetBlockLocalPathInfoResponseProto)
    }

    static {
      defaultInstance = new GetBlockLocalPathInfoResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetBlockLocalPathInfoResponseProto)
  }

  public interface GetHdfsBlockLocationsRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated .hadoop.common.TokenProto tokens = 2;
    /**
     * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
     *
     * <pre>
     * Removed: HDFS-3969
     * repeated ExtendedBlockProto blocks = 1;
     * </pre>
     */
    java.util.List<org.apache.hadoop.security.proto.SecurityProtos.TokenProto> 
        getTokensList();
    /**
     * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
     *
     * <pre>
     * Removed: HDFS-3969
     * repeated ExtendedBlockProto blocks = 1;
     * </pre>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProto getTokens(int index);
    /**
     * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
     *
     * <pre>
     * Removed: HDFS-3969
     * repeated ExtendedBlockProto blocks = 1;
     * </pre>
     */
    int getTokensCount();
    /**
     * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
     *
     * <pre>
     * Removed: HDFS-3969
     * repeated ExtendedBlockProto blocks = 1;
     * </pre>
     */
    java.util.List<? extends org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> 
        getTokensOrBuilderList();
    /**
     * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
     *
     * <pre>
     * Removed: HDFS-3969
     * repeated ExtendedBlockProto blocks = 1;
     * </pre>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokensOrBuilder(
        int index);

    // required string blockPoolId = 3;
    /**
     * <code>required string blockPoolId = 3;</code>
     */
    boolean hasBlockPoolId();
    /**
     * <code>required string blockPoolId = 3;</code>
     */
    java.lang.String getBlockPoolId();
    /**
     * <code>required string blockPoolId = 3;</code>
     */
    com.google.protobuf.ByteString
        getBlockPoolIdBytes();

    // repeated sfixed64 blockIds = 4 [packed = true];
    /**
     * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
     */
    java.util.List<java.lang.Long> getBlockIdsList();
    /**
     * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
     */
    int getBlockIdsCount();
    /**
     * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
     */
    long getBlockIds(int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetHdfsBlockLocationsRequestProto}
   *
   * <pre>
   **
   * Query for the disk locations of a number of blocks on this DN.
   * blockPoolId - the pool to query
   * blockIds - list of block IDs to query
   * tokens - list of access tokens corresponding to list of block IDs
   * </pre>
   */
  public static final class GetHdfsBlockLocationsRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements GetHdfsBlockLocationsRequestProtoOrBuilder {
    // Use GetHdfsBlockLocationsRequestProto.newBuilder() to construct.
    private GetHdfsBlockLocationsRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetHdfsBlockLocationsRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetHdfsBlockLocationsRequestProto defaultInstance;
    public static GetHdfsBlockLocationsRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetHdfsBlockLocationsRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetHdfsBlockLocationsRequestProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                tokens_ = new java.util.ArrayList<org.apache.hadoop.security.proto.SecurityProtos.TokenProto>();
                mutable_bitField0_ |= 0x00000001;
              }
              tokens_.add(input.readMessage(org.apache.hadoop.security.proto.SecurityProtos.TokenProto.PARSER, extensionRegistry));
              break;
            }
            case 26: {
              bitField0_ |= 0x00000001;
              blockPoolId_ = input.readBytes();
              break;
            }
            case 33: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                blockIds_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000004;
              }
              blockIds_.add(input.readSFixed64());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
                blockIds_ = new java.util.ArrayList<java.lang.Long>();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                blockIds_.add(input.readSFixed64());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          tokens_ = java.util.Collections.unmodifiableList(tokens_);
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          blockIds_ = java.util.Collections.unmodifiableList(blockIds_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetHdfsBlockLocationsRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetHdfsBlockLocationsRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetHdfsBlockLocationsRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<GetHdfsBlockLocationsRequestProto>() {
      public GetHdfsBlockLocationsRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetHdfsBlockLocationsRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetHdfsBlockLocationsRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // repeated .hadoop.common.TokenProto tokens = 2;
    public static final int TOKENS_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.security.proto.SecurityProtos.TokenProto> tokens_;
    /**
     * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
     *
     * <pre>
     * Removed: HDFS-3969
     * repeated ExtendedBlockProto blocks = 1;
     * </pre>
     */
    public java.util.List<org.apache.hadoop.security.proto.SecurityProtos.TokenProto> getTokensList() {
      return tokens_;
    }
    /**
     * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
     *
     * <pre>
     * Removed: HDFS-3969
     * repeated ExtendedBlockProto blocks = 1;
     * </pre>
     */
    public java.util.List<? extends org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> 
        getTokensOrBuilderList() {
      return tokens_;
    }
    /**
     * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
     *
     * <pre>
     * Removed: HDFS-3969
     * repeated ExtendedBlockProto blocks = 1;
     * </pre>
     */
    public int getTokensCount() {
      return tokens_.size();
    }
    /**
     * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
     *
     * <pre>
     * Removed: HDFS-3969
     * repeated ExtendedBlockProto blocks = 1;
     * </pre>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getTokens(int index) {
      return tokens_.get(index);
    }
    /**
     * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
     *
     * <pre>
     * Removed: HDFS-3969
     * repeated ExtendedBlockProto blocks = 1;
     * </pre>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokensOrBuilder(
        int index) {
      return tokens_.get(index);
    }

    // required string blockPoolId = 3;
    public static final int BLOCKPOOLID_FIELD_NUMBER = 3;
    private java.lang.Object blockPoolId_;
    /**
     * <code>required string blockPoolId = 3;</code>
     */
    public boolean hasBlockPoolId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string blockPoolId = 3;</code>
     */
    public java.lang.String getBlockPoolId() {
      java.lang.Object ref = blockPoolId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          blockPoolId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string blockPoolId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getBlockPoolIdBytes() {
      java.lang.Object ref = blockPoolId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        blockPoolId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated sfixed64 blockIds = 4 [packed = true];
    public static final int BLOCKIDS_FIELD_NUMBER = 4;
    private java.util.List<java.lang.Long> blockIds_;
    /**
     * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
     */
    public java.util.List<java.lang.Long>
        getBlockIdsList() {
      return blockIds_;
    }
    /**
     * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
     */
    public int getBlockIdsCount() {
      return blockIds_.size();
    }
    /**
     * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
     */
    public long getBlockIds(int index) {
      return blockIds_.get(index);
    }
    private int blockIdsMemoizedSerializedSize = -1;

    private void initFields() {
      tokens_ = java.util.Collections.emptyList();
      blockPoolId_ = "";
      blockIds_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBlockPoolId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getTokensCount(); i++) {
        if (!getTokens(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < tokens_.size(); i++) {
        output.writeMessage(2, tokens_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(3, getBlockPoolIdBytes());
      }
      if (getBlockIdsList().size() > 0) {
        output.writeRawVarint32(34);
        output.writeRawVarint32(blockIdsMemoizedSerializedSize);
      }
      for (int i = 0; i < blockIds_.size(); i++) {
        output.writeSFixed64NoTag(blockIds_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < tokens_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, tokens_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getBlockPoolIdBytes());
      }
      {
        int dataSize = 0;
        dataSize = 8 * getBlockIdsList().size();
        size += dataSize;
        if (!getBlockIdsList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        blockIdsMemoizedSerializedSize = dataSize;
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto) obj;

      boolean result = true;
      result = result && getTokensList()
          .equals(other.getTokensList());
      result = result && (hasBlockPoolId() == other.hasBlockPoolId());
      if (hasBlockPoolId()) {
        result = result && getBlockPoolId()
            .equals(other.getBlockPoolId());
      }
      result = result && getBlockIdsList()
          .equals(other.getBlockIdsList());
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (getTokensCount() > 0) {
        hash = (37 * hash) + TOKENS_FIELD_NUMBER;
        hash = (53 * hash) + getTokensList().hashCode();
      }
      if (hasBlockPoolId()) {
        hash = (37 * hash) + BLOCKPOOLID_FIELD_NUMBER;
        hash = (53 * hash) + getBlockPoolId().hashCode();
      }
      if (getBlockIdsCount() > 0) {
        hash = (37 * hash) + BLOCKIDS_FIELD_NUMBER;
        hash = (53 * hash) + getBlockIdsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.GetHdfsBlockLocationsRequestProto}
     *
     * <pre>
     **
     * Query for the disk locations of a number of blocks on this DN.
     * blockPoolId - the pool to query
     * blockIds - list of block IDs to query
     * tokens - list of access tokens corresponding to list of block IDs
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetHdfsBlockLocationsRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetHdfsBlockLocationsRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTokensFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (tokensBuilder_ == null) {
          tokens_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          tokensBuilder_.clear();
        }
        blockPoolId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        blockIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetHdfsBlockLocationsRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (tokensBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            tokens_ = java.util.Collections.unmodifiableList(tokens_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.tokens_ = tokens_;
        } else {
          result.tokens_ = tokensBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        result.blockPoolId_ = blockPoolId_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          blockIds_ = java.util.Collections.unmodifiableList(blockIds_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.blockIds_ = blockIds_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto.getDefaultInstance()) return this;
        if (tokensBuilder_ == null) {
          if (!other.tokens_.isEmpty()) {
            if (tokens_.isEmpty()) {
              tokens_ = other.tokens_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTokensIsMutable();
              tokens_.addAll(other.tokens_);
            }
            onChanged();
          }
        } else {
          if (!other.tokens_.isEmpty()) {
            if (tokensBuilder_.isEmpty()) {
              tokensBuilder_.dispose();
              tokensBuilder_ = null;
              tokens_ = other.tokens_;
              bitField0_ = (bitField0_ & ~0x00000001);
              tokensBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getTokensFieldBuilder() : null;
            } else {
              tokensBuilder_.addAllMessages(other.tokens_);
            }
          }
        }
        if (other.hasBlockPoolId()) {
          bitField0_ |= 0x00000002;
          blockPoolId_ = other.blockPoolId_;
          onChanged();
        }
        if (!other.blockIds_.isEmpty()) {
          if (blockIds_.isEmpty()) {
            blockIds_ = other.blockIds_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureBlockIdsIsMutable();
            blockIds_.addAll(other.blockIds_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBlockPoolId()) {
          
          return false;
        }
        for (int i = 0; i < getTokensCount(); i++) {
          if (!getTokens(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated .hadoop.common.TokenProto tokens = 2;
      private java.util.List<org.apache.hadoop.security.proto.SecurityProtos.TokenProto> tokens_ =
        java.util.Collections.emptyList();
      private void ensureTokensIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          tokens_ = new java.util.ArrayList<org.apache.hadoop.security.proto.SecurityProtos.TokenProto>(tokens_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> tokensBuilder_;

      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public java.util.List<org.apache.hadoop.security.proto.SecurityProtos.TokenProto> getTokensList() {
        if (tokensBuilder_ == null) {
          return java.util.Collections.unmodifiableList(tokens_);
        } else {
          return tokensBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public int getTokensCount() {
        if (tokensBuilder_ == null) {
          return tokens_.size();
        } else {
          return tokensBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getTokens(int index) {
        if (tokensBuilder_ == null) {
          return tokens_.get(index);
        } else {
          return tokensBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public Builder setTokens(
          int index, org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokensBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTokensIsMutable();
          tokens_.set(index, value);
          onChanged();
        } else {
          tokensBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public Builder setTokens(
          int index, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder builderForValue) {
        if (tokensBuilder_ == null) {
          ensureTokensIsMutable();
          tokens_.set(index, builderForValue.build());
          onChanged();
        } else {
          tokensBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public Builder addTokens(org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokensBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTokensIsMutable();
          tokens_.add(value);
          onChanged();
        } else {
          tokensBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public Builder addTokens(
          int index, org.apache.hadoop.security.proto.SecurityProtos.TokenProto value) {
        if (tokensBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTokensIsMutable();
          tokens_.add(index, value);
          onChanged();
        } else {
          tokensBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public Builder addTokens(
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder builderForValue) {
        if (tokensBuilder_ == null) {
          ensureTokensIsMutable();
          tokens_.add(builderForValue.build());
          onChanged();
        } else {
          tokensBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public Builder addTokens(
          int index, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder builderForValue) {
        if (tokensBuilder_ == null) {
          ensureTokensIsMutable();
          tokens_.add(index, builderForValue.build());
          onChanged();
        } else {
          tokensBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public Builder addAllTokens(
          java.lang.Iterable<? extends org.apache.hadoop.security.proto.SecurityProtos.TokenProto> values) {
        if (tokensBuilder_ == null) {
          ensureTokensIsMutable();
          super.addAll(values, tokens_);
          onChanged();
        } else {
          tokensBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public Builder clearTokens() {
        if (tokensBuilder_ == null) {
          tokens_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          tokensBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public Builder removeTokens(int index) {
        if (tokensBuilder_ == null) {
          ensureTokensIsMutable();
          tokens_.remove(index);
          onChanged();
        } else {
          tokensBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder getTokensBuilder(
          int index) {
        return getTokensFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokensOrBuilder(
          int index) {
        if (tokensBuilder_ == null) {
          return tokens_.get(index);  } else {
          return tokensBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public java.util.List<? extends org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> 
           getTokensOrBuilderList() {
        if (tokensBuilder_ != null) {
          return tokensBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(tokens_);
        }
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder addTokensBuilder() {
        return getTokensFieldBuilder().addBuilder(
            org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder addTokensBuilder(
          int index) {
        return getTokensFieldBuilder().addBuilder(
            index, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.common.TokenProto tokens = 2;</code>
       *
       * <pre>
       * Removed: HDFS-3969
       * repeated ExtendedBlockProto blocks = 1;
       * </pre>
       */
      public java.util.List<org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder> 
           getTokensBuilderList() {
        return getTokensFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> 
          getTokensFieldBuilder() {
        if (tokensBuilder_ == null) {
          tokensBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder>(
                  tokens_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          tokens_ = null;
        }
        return tokensBuilder_;
      }

      // required string blockPoolId = 3;
      private java.lang.Object blockPoolId_ = "";
      /**
       * <code>required string blockPoolId = 3;</code>
       */
      public boolean hasBlockPoolId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string blockPoolId = 3;</code>
       */
      public java.lang.String getBlockPoolId() {
        java.lang.Object ref = blockPoolId_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          blockPoolId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string blockPoolId = 3;</code>
       */
      public com.google.protobuf.ByteString
          getBlockPoolIdBytes() {
        java.lang.Object ref = blockPoolId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          blockPoolId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string blockPoolId = 3;</code>
       */
      public Builder setBlockPoolId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        blockPoolId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string blockPoolId = 3;</code>
       */
      public Builder clearBlockPoolId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        blockPoolId_ = getDefaultInstance().getBlockPoolId();
        onChanged();
        return this;
      }
      /**
       * <code>required string blockPoolId = 3;</code>
       */
      public Builder setBlockPoolIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        blockPoolId_ = value;
        onChanged();
        return this;
      }

      // repeated sfixed64 blockIds = 4 [packed = true];
      private java.util.List<java.lang.Long> blockIds_ = java.util.Collections.emptyList();
      private void ensureBlockIdsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          blockIds_ = new java.util.ArrayList<java.lang.Long>(blockIds_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
       */
      public java.util.List<java.lang.Long>
          getBlockIdsList() {
        return java.util.Collections.unmodifiableList(blockIds_);
      }
      /**
       * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
       */
      public int getBlockIdsCount() {
        return blockIds_.size();
      }
      /**
       * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
       */
      public long getBlockIds(int index) {
        return blockIds_.get(index);
      }
      /**
       * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
       */
      public Builder setBlockIds(
          int index, long value) {
        ensureBlockIdsIsMutable();
        blockIds_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
       */
      public Builder addBlockIds(long value) {
        ensureBlockIdsIsMutable();
        blockIds_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
       */
      public Builder addAllBlockIds(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureBlockIdsIsMutable();
        super.addAll(values, blockIds_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated sfixed64 blockIds = 4 [packed = true];</code>
       */
      public Builder clearBlockIds() {
        blockIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetHdfsBlockLocationsRequestProto)
    }

    static {
      defaultInstance = new GetHdfsBlockLocationsRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetHdfsBlockLocationsRequestProto)
  }

  public interface GetHdfsBlockLocationsResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // repeated bytes volumeIds = 1;
    /**
     * <code>repeated bytes volumeIds = 1;</code>
     */
    java.util.List<com.google.protobuf.ByteString> getVolumeIdsList();
    /**
     * <code>repeated bytes volumeIds = 1;</code>
     */
    int getVolumeIdsCount();
    /**
     * <code>repeated bytes volumeIds = 1;</code>
     */
    com.google.protobuf.ByteString getVolumeIds(int index);

    // repeated uint32 volumeIndexes = 2 [packed = true];
    /**
     * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
     */
    java.util.List<java.lang.Integer> getVolumeIndexesList();
    /**
     * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
     */
    int getVolumeIndexesCount();
    /**
     * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
     */
    int getVolumeIndexes(int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetHdfsBlockLocationsResponseProto}
   *
   * <pre>
   **
   * volumeIds - id of each volume, potentially multiple bytes
   * volumeIndexes - for each block, an index into volumeIds specifying the volume
   *               on which it is located. If block is not present on any volume,
   *               index is set to MAX_INT.
   * </pre>
   */
  public static final class GetHdfsBlockLocationsResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements GetHdfsBlockLocationsResponseProtoOrBuilder {
    // Use GetHdfsBlockLocationsResponseProto.newBuilder() to construct.
    private GetHdfsBlockLocationsResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetHdfsBlockLocationsResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetHdfsBlockLocationsResponseProto defaultInstance;
    public static GetHdfsBlockLocationsResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetHdfsBlockLocationsResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetHdfsBlockLocationsResponseProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                volumeIds_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000001;
              }
              volumeIds_.add(input.readBytes());
              break;
            }
            case 16: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                volumeIndexes_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              volumeIndexes_.add(input.readUInt32());
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                volumeIndexes_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                volumeIndexes_.add(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          volumeIds_ = java.util.Collections.unmodifiableList(volumeIds_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          volumeIndexes_ = java.util.Collections.unmodifiableList(volumeIndexes_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetHdfsBlockLocationsResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetHdfsBlockLocationsResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetHdfsBlockLocationsResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<GetHdfsBlockLocationsResponseProto>() {
      public GetHdfsBlockLocationsResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetHdfsBlockLocationsResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetHdfsBlockLocationsResponseProto> getParserForType() {
      return PARSER;
    }

    // repeated bytes volumeIds = 1;
    public static final int VOLUMEIDS_FIELD_NUMBER = 1;
    private java.util.List<com.google.protobuf.ByteString> volumeIds_;
    /**
     * <code>repeated bytes volumeIds = 1;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getVolumeIdsList() {
      return volumeIds_;
    }
    /**
     * <code>repeated bytes volumeIds = 1;</code>
     */
    public int getVolumeIdsCount() {
      return volumeIds_.size();
    }
    /**
     * <code>repeated bytes volumeIds = 1;</code>
     */
    public com.google.protobuf.ByteString getVolumeIds(int index) {
      return volumeIds_.get(index);
    }

    // repeated uint32 volumeIndexes = 2 [packed = true];
    public static final int VOLUMEINDEXES_FIELD_NUMBER = 2;
    private java.util.List<java.lang.Integer> volumeIndexes_;
    /**
     * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
     */
    public java.util.List<java.lang.Integer>
        getVolumeIndexesList() {
      return volumeIndexes_;
    }
    /**
     * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
     */
    public int getVolumeIndexesCount() {
      return volumeIndexes_.size();
    }
    /**
     * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
     */
    public int getVolumeIndexes(int index) {
      return volumeIndexes_.get(index);
    }
    private int volumeIndexesMemoizedSerializedSize = -1;

    private void initFields() {
      volumeIds_ = java.util.Collections.emptyList();
      volumeIndexes_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < volumeIds_.size(); i++) {
        output.writeBytes(1, volumeIds_.get(i));
      }
      if (getVolumeIndexesList().size() > 0) {
        output.writeRawVarint32(18);
        output.writeRawVarint32(volumeIndexesMemoizedSerializedSize);
      }
      for (int i = 0; i < volumeIndexes_.size(); i++) {
        output.writeUInt32NoTag(volumeIndexes_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < volumeIds_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(volumeIds_.get(i));
        }
        size += dataSize;
        size += 1 * getVolumeIdsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < volumeIndexes_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(volumeIndexes_.get(i));
        }
        size += dataSize;
        if (!getVolumeIndexesList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        volumeIndexesMemoizedSerializedSize = dataSize;
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto) obj;

      boolean result = true;
      result = result && getVolumeIdsList()
          .equals(other.getVolumeIdsList());
      result = result && getVolumeIndexesList()
          .equals(other.getVolumeIndexesList());
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (getVolumeIdsCount() > 0) {
        hash = (37 * hash) + VOLUMEIDS_FIELD_NUMBER;
        hash = (53 * hash) + getVolumeIdsList().hashCode();
      }
      if (getVolumeIndexesCount() > 0) {
        hash = (37 * hash) + VOLUMEINDEXES_FIELD_NUMBER;
        hash = (53 * hash) + getVolumeIndexesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.GetHdfsBlockLocationsResponseProto}
     *
     * <pre>
     **
     * volumeIds - id of each volume, potentially multiple bytes
     * volumeIndexes - for each block, an index into volumeIds specifying the volume
     *               on which it is located. If block is not present on any volume,
     *               index is set to MAX_INT.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetHdfsBlockLocationsResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetHdfsBlockLocationsResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        volumeIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        volumeIndexes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetHdfsBlockLocationsResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          volumeIds_ = java.util.Collections.unmodifiableList(volumeIds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.volumeIds_ = volumeIds_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          volumeIndexes_ = java.util.Collections.unmodifiableList(volumeIndexes_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.volumeIndexes_ = volumeIndexes_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.getDefaultInstance()) return this;
        if (!other.volumeIds_.isEmpty()) {
          if (volumeIds_.isEmpty()) {
            volumeIds_ = other.volumeIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVolumeIdsIsMutable();
            volumeIds_.addAll(other.volumeIds_);
          }
          onChanged();
        }
        if (!other.volumeIndexes_.isEmpty()) {
          if (volumeIndexes_.isEmpty()) {
            volumeIndexes_ = other.volumeIndexes_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureVolumeIndexesIsMutable();
            volumeIndexes_.addAll(other.volumeIndexes_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // repeated bytes volumeIds = 1;
      private java.util.List<com.google.protobuf.ByteString> volumeIds_ = java.util.Collections.emptyList();
      private void ensureVolumeIdsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          volumeIds_ = new java.util.ArrayList<com.google.protobuf.ByteString>(volumeIds_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated bytes volumeIds = 1;</code>
       */
      public java.util.List<com.google.protobuf.ByteString>
          getVolumeIdsList() {
        return java.util.Collections.unmodifiableList(volumeIds_);
      }
      /**
       * <code>repeated bytes volumeIds = 1;</code>
       */
      public int getVolumeIdsCount() {
        return volumeIds_.size();
      }
      /**
       * <code>repeated bytes volumeIds = 1;</code>
       */
      public com.google.protobuf.ByteString getVolumeIds(int index) {
        return volumeIds_.get(index);
      }
      /**
       * <code>repeated bytes volumeIds = 1;</code>
       */
      public Builder setVolumeIds(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureVolumeIdsIsMutable();
        volumeIds_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes volumeIds = 1;</code>
       */
      public Builder addVolumeIds(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureVolumeIdsIsMutable();
        volumeIds_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes volumeIds = 1;</code>
       */
      public Builder addAllVolumeIds(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureVolumeIdsIsMutable();
        super.addAll(values, volumeIds_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes volumeIds = 1;</code>
       */
      public Builder clearVolumeIds() {
        volumeIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // repeated uint32 volumeIndexes = 2 [packed = true];
      private java.util.List<java.lang.Integer> volumeIndexes_ = java.util.Collections.emptyList();
      private void ensureVolumeIndexesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          volumeIndexes_ = new java.util.ArrayList<java.lang.Integer>(volumeIndexes_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
       */
      public java.util.List<java.lang.Integer>
          getVolumeIndexesList() {
        return java.util.Collections.unmodifiableList(volumeIndexes_);
      }
      /**
       * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
       */
      public int getVolumeIndexesCount() {
        return volumeIndexes_.size();
      }
      /**
       * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
       */
      public int getVolumeIndexes(int index) {
        return volumeIndexes_.get(index);
      }
      /**
       * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
       */
      public Builder setVolumeIndexes(
          int index, int value) {
        ensureVolumeIndexesIsMutable();
        volumeIndexes_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
       */
      public Builder addVolumeIndexes(int value) {
        ensureVolumeIndexesIsMutable();
        volumeIndexes_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
       */
      public Builder addAllVolumeIndexes(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureVolumeIndexesIsMutable();
        super.addAll(values, volumeIndexes_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 volumeIndexes = 2 [packed = true];</code>
       */
      public Builder clearVolumeIndexes() {
        volumeIndexes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetHdfsBlockLocationsResponseProto)
    }

    static {
      defaultInstance = new GetHdfsBlockLocationsResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetHdfsBlockLocationsResponseProto)
  }

  public interface ShutdownDatanodeRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required bool forUpgrade = 1;
    /**
     * <code>required bool forUpgrade = 1;</code>
     */
    boolean hasForUpgrade();
    /**
     * <code>required bool forUpgrade = 1;</code>
     */
    boolean getForUpgrade();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ShutdownDatanodeRequestProto}
   *
   * <pre>
   **
   * forUpgrade - if true, clients are advised to wait for restart and quick
   *              upgrade restart is instrumented. Otherwise, datanode does
   *              the regular shutdown.
   * </pre>
   */
  public static final class ShutdownDatanodeRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements ShutdownDatanodeRequestProtoOrBuilder {
    // Use ShutdownDatanodeRequestProto.newBuilder() to construct.
    private ShutdownDatanodeRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ShutdownDatanodeRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ShutdownDatanodeRequestProto defaultInstance;
    public static ShutdownDatanodeRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public ShutdownDatanodeRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ShutdownDatanodeRequestProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              forUpgrade_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_ShutdownDatanodeRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_ShutdownDatanodeRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ShutdownDatanodeRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<ShutdownDatanodeRequestProto>() {
      public ShutdownDatanodeRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShutdownDatanodeRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ShutdownDatanodeRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required bool forUpgrade = 1;
    public static final int FORUPGRADE_FIELD_NUMBER = 1;
    private boolean forUpgrade_;
    /**
     * <code>required bool forUpgrade = 1;</code>
     */
    public boolean hasForUpgrade() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bool forUpgrade = 1;</code>
     */
    public boolean getForUpgrade() {
      return forUpgrade_;
    }

    private void initFields() {
      forUpgrade_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasForUpgrade()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, forUpgrade_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, forUpgrade_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto) obj;

      boolean result = true;
      result = result && (hasForUpgrade() == other.hasForUpgrade());
      if (hasForUpgrade()) {
        result = result && (getForUpgrade()
            == other.getForUpgrade());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasForUpgrade()) {
        hash = (37 * hash) + FORUPGRADE_FIELD_NUMBER;
        hash = (53 * hash) + hashBoolean(getForUpgrade());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.ShutdownDatanodeRequestProto}
     *
     * <pre>
     **
     * forUpgrade - if true, clients are advised to wait for restart and quick
     *              upgrade restart is instrumented. Otherwise, datanode does
     *              the regular shutdown.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_ShutdownDatanodeRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_ShutdownDatanodeRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        forUpgrade_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_ShutdownDatanodeRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.forUpgrade_ = forUpgrade_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto.getDefaultInstance()) return this;
        if (other.hasForUpgrade()) {
          setForUpgrade(other.getForUpgrade());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasForUpgrade()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required bool forUpgrade = 1;
      private boolean forUpgrade_ ;
      /**
       * <code>required bool forUpgrade = 1;</code>
       */
      public boolean hasForUpgrade() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bool forUpgrade = 1;</code>
       */
      public boolean getForUpgrade() {
        return forUpgrade_;
      }
      /**
       * <code>required bool forUpgrade = 1;</code>
       */
      public Builder setForUpgrade(boolean value) {
        bitField0_ |= 0x00000001;
        forUpgrade_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool forUpgrade = 1;</code>
       */
      public Builder clearForUpgrade() {
        bitField0_ = (bitField0_ & ~0x00000001);
        forUpgrade_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ShutdownDatanodeRequestProto)
    }

    static {
      defaultInstance = new ShutdownDatanodeRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ShutdownDatanodeRequestProto)
  }

  public interface ShutdownDatanodeResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ShutdownDatanodeResponseProto}
   */
  public static final class ShutdownDatanodeResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements ShutdownDatanodeResponseProtoOrBuilder {
    // Use ShutdownDatanodeResponseProto.newBuilder() to construct.
    private ShutdownDatanodeResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ShutdownDatanodeResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ShutdownDatanodeResponseProto defaultInstance;
    public static ShutdownDatanodeResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public ShutdownDatanodeResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ShutdownDatanodeResponseProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_ShutdownDatanodeResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_ShutdownDatanodeResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ShutdownDatanodeResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<ShutdownDatanodeResponseProto>() {
      public ShutdownDatanodeResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShutdownDatanodeResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ShutdownDatanodeResponseProto> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto) obj;

      boolean result = true;
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.ShutdownDatanodeResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_ShutdownDatanodeResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_ShutdownDatanodeResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_ShutdownDatanodeResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ShutdownDatanodeResponseProto)
    }

    static {
      defaultInstance = new ShutdownDatanodeResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ShutdownDatanodeResponseProto)
  }

  public interface GetDatanodeInfoRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetDatanodeInfoRequestProto}
   *
   * <pre>
   **
   * Ping datanode for liveness and quick info
   * </pre>
   */
  public static final class GetDatanodeInfoRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements GetDatanodeInfoRequestProtoOrBuilder {
    // Use GetDatanodeInfoRequestProto.newBuilder() to construct.
    private GetDatanodeInfoRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetDatanodeInfoRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetDatanodeInfoRequestProto defaultInstance;
    public static GetDatanodeInfoRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetDatanodeInfoRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetDatanodeInfoRequestProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetDatanodeInfoRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetDatanodeInfoRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetDatanodeInfoRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<GetDatanodeInfoRequestProto>() {
      public GetDatanodeInfoRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetDatanodeInfoRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetDatanodeInfoRequestProto> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto) obj;

      boolean result = true;
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.GetDatanodeInfoRequestProto}
     *
     * <pre>
     **
     * Ping datanode for liveness and quick info
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetDatanodeInfoRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetDatanodeInfoRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetDatanodeInfoRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetDatanodeInfoRequestProto)
    }

    static {
      defaultInstance = new GetDatanodeInfoRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetDatanodeInfoRequestProto)
  }

  public interface GetDatanodeInfoResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;
    /**
     * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
     */
    boolean hasLocalInfo();
    /**
     * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto getLocalInfo();
    /**
     * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProtoOrBuilder getLocalInfoOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetDatanodeInfoResponseProto}
   */
  public static final class GetDatanodeInfoResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements GetDatanodeInfoResponseProtoOrBuilder {
    // Use GetDatanodeInfoResponseProto.newBuilder() to construct.
    private GetDatanodeInfoResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetDatanodeInfoResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetDatanodeInfoResponseProto defaultInstance;
    public static GetDatanodeInfoResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetDatanodeInfoResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetDatanodeInfoResponseProto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = localInfo_.toBuilder();
              }
              localInfo_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(localInfo_);
                localInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetDatanodeInfoResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetDatanodeInfoResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetDatanodeInfoResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<GetDatanodeInfoResponseProto>() {
      public GetDatanodeInfoResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetDatanodeInfoResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetDatanodeInfoResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;
    public static final int LOCALINFO_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto localInfo_;
    /**
     * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
     */
    public boolean hasLocalInfo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto getLocalInfo() {
      return localInfo_;
    }
    /**
     * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProtoOrBuilder getLocalInfoOrBuilder() {
      return localInfo_;
    }

    private void initFields() {
      localInfo_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasLocalInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getLocalInfo().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, localInfo_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, localInfo_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto) obj;

      boolean result = true;
      result = result && (hasLocalInfo() == other.hasLocalInfo());
      if (hasLocalInfo()) {
        result = result && getLocalInfo()
            .equals(other.getLocalInfo());
      }
      result = result &&
          getUnknownFields().equals(other.getUnknownFields());
      return result;
    }

    private int memoizedHashCode = 0;
    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasLocalInfo()) {
        hash = (37 * hash) + LOCALINFO_FIELD_NUMBER;
        hash = (53 * hash) + getLocalInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hadoop.hdfs.GetDatanodeInfoResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetDatanodeInfoResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetDatanodeInfoResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getLocalInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (localInfoBuilder_ == null) {
          localInfo_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.getDefaultInstance();
        } else {
          localInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.internal_static_hadoop_hdfs_GetDatanodeInfoResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (localInfoBuilder_ == null) {
          result.localInfo_ = localInfo_;
        } else {
          result.localInfo_ = localInfoBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.getDefaultInstance()) return this;
        if (other.hasLocalInfo()) {
          mergeLocalInfo(other.getLocalInfo());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasLocalInfo()) {
          
          return false;
        }
        if (!getLocalInfo().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto localInfo_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProtoOrBuilder> localInfoBuilder_;
      /**
       * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
       */
      public boolean hasLocalInfo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto getLocalInfo() {
        if (localInfoBuilder_ == null) {
          return localInfo_;
        } else {
          return localInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
       */
      public Builder setLocalInfo(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto value) {
        if (localInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          localInfo_ = value;
          onChanged();
        } else {
          localInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
       */
      public Builder setLocalInfo(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.Builder builderForValue) {
        if (localInfoBuilder_ == null) {
          localInfo_ = builderForValue.build();
          onChanged();
        } else {
          localInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
       */
      public Builder mergeLocalInfo(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto value) {
        if (localInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              localInfo_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.getDefaultInstance()) {
            localInfo_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.newBuilder(localInfo_).mergeFrom(value).buildPartial();
          } else {
            localInfo_ = value;
          }
          onChanged();
        } else {
          localInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
       */
      public Builder clearLocalInfo() {
        if (localInfoBuilder_ == null) {
          localInfo_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.getDefaultInstance();
          onChanged();
        } else {
          localInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.Builder getLocalInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getLocalInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProtoOrBuilder getLocalInfoOrBuilder() {
        if (localInfoBuilder_ != null) {
          return localInfoBuilder_.getMessageOrBuilder();
        } else {
          return localInfo_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeLocalInfoProto localInfo = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProtoOrBuilder> 
          getLocalInfoFieldBuilder() {
        if (localInfoBuilder_ == null) {
          localInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeLocalInfoProtoOrBuilder>(
                  localInfo_,
                  getParentForChildren(),
                  isClean());
          localInfo_ = null;
        }
        return localInfoBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetDatanodeInfoResponseProto)
    }

    static {
      defaultInstance = new GetDatanodeInfoResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetDatanodeInfoResponseProto)
  }

  /**
   * Protobuf service {@code hadoop.hdfs.ClientDatanodeProtocolService}
   *
   * <pre>
   **
   * Protocol used from client to the Datanode.
   * See the request and response for details of rpc call.
   * </pre>
   */
  public static abstract class ClientDatanodeProtocolService
      implements com.google.protobuf.Service {
    protected ClientDatanodeProtocolService() {}

    public interface Interface {
      /**
       * <code>rpc getReplicaVisibleLength(.hadoop.hdfs.GetReplicaVisibleLengthRequestProto) returns (.hadoop.hdfs.GetReplicaVisibleLengthResponseProto);</code>
       *
       * <pre>
       **
       * Returns the visible length of the replica
       * </pre>
       */
      public abstract void getReplicaVisibleLength(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto> done);

      /**
       * <code>rpc refreshNamenodes(.hadoop.hdfs.RefreshNamenodesRequestProto) returns (.hadoop.hdfs.RefreshNamenodesResponseProto);</code>
       *
       * <pre>
       **
       * Refresh the list of federated namenodes from updated configuration.
       * Adds new namenodes and stops the deleted namenodes.
       * </pre>
       */
      public abstract void refreshNamenodes(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto> done);

      /**
       * <code>rpc deleteBlockPool(.hadoop.hdfs.DeleteBlockPoolRequestProto) returns (.hadoop.hdfs.DeleteBlockPoolResponseProto);</code>
       *
       * <pre>
       **
       * Delete the block pool from the datanode.
       * </pre>
       */
      public abstract void deleteBlockPool(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto> done);

      /**
       * <code>rpc getBlockLocalPathInfo(.hadoop.hdfs.GetBlockLocalPathInfoRequestProto) returns (.hadoop.hdfs.GetBlockLocalPathInfoResponseProto);</code>
       *
       * <pre>
       **
       * Retrieves the path names of the block file and metadata file stored on the
       * local file system.
       * </pre>
       */
      public abstract void getBlockLocalPathInfo(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto> done);

      /**
       * <code>rpc getHdfsBlockLocations(.hadoop.hdfs.GetHdfsBlockLocationsRequestProto) returns (.hadoop.hdfs.GetHdfsBlockLocationsResponseProto);</code>
       *
       * <pre>
       **
       * Retrieve additional HDFS-specific metadata about a set of blocks stored
       * on the local file system.
       * </pre>
       */
      public abstract void getHdfsBlockLocations(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto> done);

      /**
       * <code>rpc shutdownDatanode(.hadoop.hdfs.ShutdownDatanodeRequestProto) returns (.hadoop.hdfs.ShutdownDatanodeResponseProto);</code>
       */
      public abstract void shutdownDatanode(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto> done);

      /**
       * <code>rpc getDatanodeInfo(.hadoop.hdfs.GetDatanodeInfoRequestProto) returns (.hadoop.hdfs.GetDatanodeInfoResponseProto);</code>
       */
      public abstract void getDatanodeInfo(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new ClientDatanodeProtocolService() {
        @java.lang.Override
        public  void getReplicaVisibleLength(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto> done) {
          impl.getReplicaVisibleLength(controller, request, done);
        }

        @java.lang.Override
        public  void refreshNamenodes(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto> done) {
          impl.refreshNamenodes(controller, request, done);
        }

        @java.lang.Override
        public  void deleteBlockPool(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto> done) {
          impl.deleteBlockPool(controller, request, done);
        }

        @java.lang.Override
        public  void getBlockLocalPathInfo(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto> done) {
          impl.getBlockLocalPathInfo(controller, request, done);
        }

        @java.lang.Override
        public  void getHdfsBlockLocations(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto> done) {
          impl.getHdfsBlockLocations(controller, request, done);
        }

        @java.lang.Override
        public  void shutdownDatanode(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto> done) {
          impl.shutdownDatanode(controller, request, done);
        }

        @java.lang.Override
        public  void getDatanodeInfo(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto> done) {
          impl.getDatanodeInfo(controller, request, done);
        }

      };
    }

    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.getReplicaVisibleLength(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto)request);
            case 1:
              return impl.refreshNamenodes(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto)request);
            case 2:
              return impl.deleteBlockPool(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto)request);
            case 3:
              return impl.getBlockLocalPathInfo(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto)request);
            case 4:
              return impl.getHdfsBlockLocations(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto)request);
            case 5:
              return impl.shutdownDatanode(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto)request);
            case 6:
              return impl.getDatanodeInfo(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto.getDefaultInstance();
            case 3:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto.getDefaultInstance();
            case 4:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto.getDefaultInstance();
            case 5:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto.getDefaultInstance();
            case 6:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.getDefaultInstance();
            case 3:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.getDefaultInstance();
            case 4:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.getDefaultInstance();
            case 5:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.getDefaultInstance();
            case 6:
              return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc getReplicaVisibleLength(.hadoop.hdfs.GetReplicaVisibleLengthRequestProto) returns (.hadoop.hdfs.GetReplicaVisibleLengthResponseProto);</code>
     *
     * <pre>
     **
     * Returns the visible length of the replica
     * </pre>
     */
    public abstract void getReplicaVisibleLength(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto> done);

    /**
     * <code>rpc refreshNamenodes(.hadoop.hdfs.RefreshNamenodesRequestProto) returns (.hadoop.hdfs.RefreshNamenodesResponseProto);</code>
     *
     * <pre>
     **
     * Refresh the list of federated namenodes from updated configuration.
     * Adds new namenodes and stops the deleted namenodes.
     * </pre>
     */
    public abstract void refreshNamenodes(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto> done);

    /**
     * <code>rpc deleteBlockPool(.hadoop.hdfs.DeleteBlockPoolRequestProto) returns (.hadoop.hdfs.DeleteBlockPoolResponseProto);</code>
     *
     * <pre>
     **
     * Delete the block pool from the datanode.
     * </pre>
     */
    public abstract void deleteBlockPool(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto> done);

    /**
     * <code>rpc getBlockLocalPathInfo(.hadoop.hdfs.GetBlockLocalPathInfoRequestProto) returns (.hadoop.hdfs.GetBlockLocalPathInfoResponseProto);</code>
     *
     * <pre>
     **
     * Retrieves the path names of the block file and metadata file stored on the
     * local file system.
     * </pre>
     */
    public abstract void getBlockLocalPathInfo(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto> done);

    /**
     * <code>rpc getHdfsBlockLocations(.hadoop.hdfs.GetHdfsBlockLocationsRequestProto) returns (.hadoop.hdfs.GetHdfsBlockLocationsResponseProto);</code>
     *
     * <pre>
     **
     * Retrieve additional HDFS-specific metadata about a set of blocks stored
     * on the local file system.
     * </pre>
     */
    public abstract void getHdfsBlockLocations(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto> done);

    /**
     * <code>rpc shutdownDatanode(.hadoop.hdfs.ShutdownDatanodeRequestProto) returns (.hadoop.hdfs.ShutdownDatanodeResponseProto);</code>
     */
    public abstract void shutdownDatanode(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto> done);

    /**
     * <code>rpc getDatanodeInfo(.hadoop.hdfs.GetDatanodeInfoRequestProto) returns (.hadoop.hdfs.GetDatanodeInfoResponseProto);</code>
     */
    public abstract void getDatanodeInfo(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.getReplicaVisibleLength(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.refreshNamenodes(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto>specializeCallback(
              done));
          return;
        case 2:
          this.deleteBlockPool(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto>specializeCallback(
              done));
          return;
        case 3:
          this.getBlockLocalPathInfo(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto>specializeCallback(
              done));
          return;
        case 4:
          this.getHdfsBlockLocations(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto>specializeCallback(
              done));
          return;
        case 5:
          this.shutdownDatanode(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto>specializeCallback(
              done));
          return;
        case 6:
          this.getDatanodeInfo(controller, (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto.getDefaultInstance();
        case 3:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto.getDefaultInstance();
        case 4:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto.getDefaultInstance();
        case 5:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto.getDefaultInstance();
        case 6:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.getDefaultInstance();
        case 3:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.getDefaultInstance();
        case 4:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.getDefaultInstance();
        case 5:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.getDefaultInstance();
        case 6:
          return org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ClientDatanodeProtocolService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void getReplicaVisibleLength(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.getDefaultInstance()));
      }

      public  void refreshNamenodes(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.getDefaultInstance()));
      }

      public  void deleteBlockPool(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.getDefaultInstance()));
      }

      public  void getBlockLocalPathInfo(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.getDefaultInstance()));
      }

      public  void getHdfsBlockLocations(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.getDefaultInstance()));
      }

      public  void shutdownDatanode(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(5),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.getDefaultInstance()));
      }

      public  void getDatanodeInfo(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(6),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto getReplicaVisibleLength(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto refreshNamenodes(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto deleteBlockPool(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto getBlockLocalPathInfo(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto getHdfsBlockLocations(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto shutdownDatanode(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto getDatanodeInfo(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto getReplicaVisibleLength(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetReplicaVisibleLengthResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto refreshNamenodes(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.RefreshNamenodesResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto deleteBlockPool(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.DeleteBlockPoolResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto getBlockLocalPathInfo(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetBlockLocalPathInfoResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto getHdfsBlockLocations(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetHdfsBlockLocationsResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto shutdownDatanode(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(5),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.ShutdownDatanodeResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto getDatanodeInfo(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(6),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.ClientDatanodeProtocolProtos.GetDatanodeInfoResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ClientDatanodeProtocolService)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetReplicaVisibleLengthRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetReplicaVisibleLengthRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetReplicaVisibleLengthResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetReplicaVisibleLengthResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RefreshNamenodesRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_RefreshNamenodesRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RefreshNamenodesResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_RefreshNamenodesResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_DeleteBlockPoolRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_DeleteBlockPoolRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_DeleteBlockPoolResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_DeleteBlockPoolResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetBlockLocalPathInfoRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetBlockLocalPathInfoRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetBlockLocalPathInfoResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetBlockLocalPathInfoResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetHdfsBlockLocationsRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetHdfsBlockLocationsRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetHdfsBlockLocationsResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetHdfsBlockLocationsResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ShutdownDatanodeRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ShutdownDatanodeRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ShutdownDatanodeResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ShutdownDatanodeResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetDatanodeInfoRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetDatanodeInfoRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetDatanodeInfoResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetDatanodeInfoResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ClientDatanodeProtocol.proto\022\013hadoop.h" +
      "dfs\032\016Security.proto\032\nhdfs.proto\"U\n#GetRe" +
      "plicaVisibleLengthRequestProto\022.\n\005block\030" +
      "\001 \002(\0132\037.hadoop.hdfs.ExtendedBlockProto\"6" +
      "\n$GetReplicaVisibleLengthResponseProto\022\016" +
      "\n\006length\030\001 \002(\004\"\036\n\034RefreshNamenodesReques" +
      "tProto\"\037\n\035RefreshNamenodesResponseProto\"" +
      "?\n\033DeleteBlockPoolRequestProto\022\021\n\tblockP" +
      "ool\030\001 \002(\t\022\r\n\005force\030\002 \002(\010\"\036\n\034DeleteBlockP" +
      "oolResponseProto\"}\n!GetBlockLocalPathInf",
      "oRequestProto\022.\n\005block\030\001 \002(\0132\037.hadoop.hd" +
      "fs.ExtendedBlockProto\022(\n\005token\030\002 \002(\0132\031.h" +
      "adoop.common.TokenProto\"~\n\"GetBlockLocal" +
      "PathInfoResponseProto\022.\n\005block\030\001 \002(\0132\037.h" +
      "adoop.hdfs.ExtendedBlockProto\022\021\n\tlocalPa" +
      "th\030\002 \002(\t\022\025\n\rlocalMetaPath\030\003 \002(\t\"y\n!GetHd" +
      "fsBlockLocationsRequestProto\022)\n\006tokens\030\002" +
      " \003(\0132\031.hadoop.common.TokenProto\022\023\n\013block" +
      "PoolId\030\003 \002(\t\022\024\n\010blockIds\030\004 \003(\020B\002\020\001\"R\n\"Ge" +
      "tHdfsBlockLocationsResponseProto\022\021\n\tvolu",
      "meIds\030\001 \003(\014\022\031\n\rvolumeIndexes\030\002 \003(\rB\002\020\001\"2" +
      "\n\034ShutdownDatanodeRequestProto\022\022\n\nforUpg" +
      "rade\030\001 \002(\010\"\037\n\035ShutdownDatanodeResponsePr" +
      "oto\"\035\n\033GetDatanodeInfoRequestProto\"V\n\034Ge" +
      "tDatanodeInfoResponseProto\0226\n\tlocalInfo\030" +
      "\001 \002(\0132#.hadoop.hdfs.DatanodeLocalInfoPro" +
      "to2\271\006\n\035ClientDatanodeProtocolService\022~\n\027" +
      "getReplicaVisibleLength\0220.hadoop.hdfs.Ge" +
      "tReplicaVisibleLengthRequestProto\0321.hado" +
      "op.hdfs.GetReplicaVisibleLengthResponseP",
      "roto\022i\n\020refreshNamenodes\022).hadoop.hdfs.R" +
      "efreshNamenodesRequestProto\032*.hadoop.hdf" +
      "s.RefreshNamenodesResponseProto\022f\n\017delet" +
      "eBlockPool\022(.hadoop.hdfs.DeleteBlockPool" +
      "RequestProto\032).hadoop.hdfs.DeleteBlockPo" +
      "olResponseProto\022x\n\025getBlockLocalPathInfo" +
      "\022..hadoop.hdfs.GetBlockLocalPathInfoRequ" +
      "estProto\032/.hadoop.hdfs.GetBlockLocalPath" +
      "InfoResponseProto\022x\n\025getHdfsBlockLocatio" +
      "ns\022..hadoop.hdfs.GetHdfsBlockLocationsRe",
      "questProto\032/.hadoop.hdfs.GetHdfsBlockLoc" +
      "ationsResponseProto\022i\n\020shutdownDatanode\022" +
      ").hadoop.hdfs.ShutdownDatanodeRequestPro" +
      "to\032*.hadoop.hdfs.ShutdownDatanodeRespons" +
      "eProto\022f\n\017getDatanodeInfo\022(.hadoop.hdfs." +
      "GetDatanodeInfoRequestProto\032).hadoop.hdf" +
      "s.GetDatanodeInfoResponseProtoBK\n%org.ap" +
      "ache.hadoop.hdfs.protocol.protoB\034ClientD" +
      "atanodeProtocolProtos\210\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hadoop_hdfs_GetReplicaVisibleLengthRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hadoop_hdfs_GetReplicaVisibleLengthRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetReplicaVisibleLengthRequestProto_descriptor,
              new java.lang.String[] { "Block", });
          internal_static_hadoop_hdfs_GetReplicaVisibleLengthResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_hadoop_hdfs_GetReplicaVisibleLengthResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetReplicaVisibleLengthResponseProto_descriptor,
              new java.lang.String[] { "Length", });
          internal_static_hadoop_hdfs_RefreshNamenodesRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_hadoop_hdfs_RefreshNamenodesRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_RefreshNamenodesRequestProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_RefreshNamenodesResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_hadoop_hdfs_RefreshNamenodesResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_RefreshNamenodesResponseProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_DeleteBlockPoolRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_hadoop_hdfs_DeleteBlockPoolRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_DeleteBlockPoolRequestProto_descriptor,
              new java.lang.String[] { "BlockPool", "Force", });
          internal_static_hadoop_hdfs_DeleteBlockPoolResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_hadoop_hdfs_DeleteBlockPoolResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_DeleteBlockPoolResponseProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_GetBlockLocalPathInfoRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_hadoop_hdfs_GetBlockLocalPathInfoRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetBlockLocalPathInfoRequestProto_descriptor,
              new java.lang.String[] { "Block", "Token", });
          internal_static_hadoop_hdfs_GetBlockLocalPathInfoResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(7);
          internal_static_hadoop_hdfs_GetBlockLocalPathInfoResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetBlockLocalPathInfoResponseProto_descriptor,
              new java.lang.String[] { "Block", "LocalPath", "LocalMetaPath", });
          internal_static_hadoop_hdfs_GetHdfsBlockLocationsRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(8);
          internal_static_hadoop_hdfs_GetHdfsBlockLocationsRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetHdfsBlockLocationsRequestProto_descriptor,
              new java.lang.String[] { "Tokens", "BlockPoolId", "BlockIds", });
          internal_static_hadoop_hdfs_GetHdfsBlockLocationsResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(9);
          internal_static_hadoop_hdfs_GetHdfsBlockLocationsResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetHdfsBlockLocationsResponseProto_descriptor,
              new java.lang.String[] { "VolumeIds", "VolumeIndexes", });
          internal_static_hadoop_hdfs_ShutdownDatanodeRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(10);
          internal_static_hadoop_hdfs_ShutdownDatanodeRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ShutdownDatanodeRequestProto_descriptor,
              new java.lang.String[] { "ForUpgrade", });
          internal_static_hadoop_hdfs_ShutdownDatanodeResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(11);
          internal_static_hadoop_hdfs_ShutdownDatanodeResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ShutdownDatanodeResponseProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_GetDatanodeInfoRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(12);
          internal_static_hadoop_hdfs_GetDatanodeInfoRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetDatanodeInfoRequestProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_GetDatanodeInfoResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(13);
          internal_static_hadoop_hdfs_GetDatanodeInfoResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetDatanodeInfoResponseProto_descriptor,
              new java.lang.String[] { "LocalInfo", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.hadoop.security.proto.SecurityProtos.getDescriptor(),
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
