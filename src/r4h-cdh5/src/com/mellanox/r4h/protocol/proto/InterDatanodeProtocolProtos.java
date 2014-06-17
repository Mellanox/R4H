package com.mellanox.r4h.protocol.proto;


public final class InterDatanodeProtocolProtos {
  private InterDatanodeProtocolProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface InitReplicaRecoveryRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.RecoveringBlockProto block = 1;
    /**
     * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
     */
    boolean hasBlock();
    /**
     * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto getBlock();
    /**
     * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProtoOrBuilder getBlockOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.InitReplicaRecoveryRequestProto}
   *
   * <pre>
   **
   * Block with location information and new generation stamp
   * to be used for recovery.
   * </pre>
   */
  public static final class InitReplicaRecoveryRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements InitReplicaRecoveryRequestProtoOrBuilder {
    // Use InitReplicaRecoveryRequestProto.newBuilder() to construct.
    private InitReplicaRecoveryRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private InitReplicaRecoveryRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final InitReplicaRecoveryRequestProto defaultInstance;
    public static InitReplicaRecoveryRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public InitReplicaRecoveryRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private InitReplicaRecoveryRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = block_.toBuilder();
              }
              block_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.PARSER, extensionRegistry);
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
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<InitReplicaRecoveryRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<InitReplicaRecoveryRequestProto>() {
      public InitReplicaRecoveryRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InitReplicaRecoveryRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<InitReplicaRecoveryRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.RecoveringBlockProto block = 1;
    public static final int BLOCK_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto block_;
    /**
     * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto getBlock() {
      return block_;
    }
    /**
     * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProtoOrBuilder getBlockOrBuilder() {
      return block_;
    }

    private void initFields() {
      block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.getDefaultInstance();
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.InitReplicaRecoveryRequestProto}
     *
     * <pre>
     **
     * Block with location information and new generation stamp
     * to be used for recovery.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.newBuilder()
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
          block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.getDefaultInstance();
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
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.RecoveringBlockProto block = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProtoOrBuilder> blockBuilder_;
      /**
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public boolean hasBlock() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto getBlock() {
        if (blockBuilder_ == null) {
          return block_;
        } else {
          return blockBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public Builder setBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto value) {
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
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public Builder setBlock(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.Builder builderForValue) {
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
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public Builder mergeBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto value) {
        if (blockBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              block_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.getDefaultInstance()) {
            block_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.newBuilder(block_).mergeFrom(value).buildPartial();
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
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public Builder clearBlock() {
        if (blockBuilder_ == null) {
          block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.getDefaultInstance();
          onChanged();
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.Builder getBlockBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProtoOrBuilder getBlockOrBuilder() {
        if (blockBuilder_ != null) {
          return blockBuilder_.getMessageOrBuilder();
        } else {
          return block_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.RecoveringBlockProto block = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProtoOrBuilder> 
          getBlockFieldBuilder() {
        if (blockBuilder_ == null) {
          blockBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RecoveringBlockProtoOrBuilder>(
                  block_,
                  getParentForChildren(),
                  isClean());
          block_ = null;
        }
        return blockBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.InitReplicaRecoveryRequestProto)
    }

    static {
      defaultInstance = new InitReplicaRecoveryRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.InitReplicaRecoveryRequestProto)
  }

  public interface InitReplicaRecoveryResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required bool replicaFound = 1;
    /**
     * <code>required bool replicaFound = 1;</code>
     */
    boolean hasReplicaFound();
    /**
     * <code>required bool replicaFound = 1;</code>
     */
    boolean getReplicaFound();

    // optional .hadoop.hdfs.ReplicaStateProto state = 2;
    /**
     * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
     *
     * <pre>
     * The following entries are not set if there was no replica found.
     * </pre>
     */
    boolean hasState();
    /**
     * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
     *
     * <pre>
     * The following entries are not set if there was no replica found.
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ReplicaStateProto getState();

    // optional .hadoop.hdfs.BlockProto block = 3;
    /**
     * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
     *
     * <pre>
     * block information
     * </pre>
     */
    boolean hasBlock();
    /**
     * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
     *
     * <pre>
     * block information
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getBlock();
    /**
     * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
     *
     * <pre>
     * block information
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getBlockOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.InitReplicaRecoveryResponseProto}
   *
   * <pre>
   **
   * Repica recovery information
   * </pre>
   */
  public static final class InitReplicaRecoveryResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements InitReplicaRecoveryResponseProtoOrBuilder {
    // Use InitReplicaRecoveryResponseProto.newBuilder() to construct.
    private InitReplicaRecoveryResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private InitReplicaRecoveryResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final InitReplicaRecoveryResponseProto defaultInstance;
    public static InitReplicaRecoveryResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public InitReplicaRecoveryResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private InitReplicaRecoveryResponseProto(
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
              replicaFound_ = input.readBool();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ReplicaStateProto value = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ReplicaStateProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                state_ = value;
              }
              break;
            }
            case 26: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = block_.toBuilder();
              }
              block_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(block_);
                block_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
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
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<InitReplicaRecoveryResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<InitReplicaRecoveryResponseProto>() {
      public InitReplicaRecoveryResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InitReplicaRecoveryResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<InitReplicaRecoveryResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required bool replicaFound = 1;
    public static final int REPLICAFOUND_FIELD_NUMBER = 1;
    private boolean replicaFound_;
    /**
     * <code>required bool replicaFound = 1;</code>
     */
    public boolean hasReplicaFound() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required bool replicaFound = 1;</code>
     */
    public boolean getReplicaFound() {
      return replicaFound_;
    }

    // optional .hadoop.hdfs.ReplicaStateProto state = 2;
    public static final int STATE_FIELD_NUMBER = 2;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ReplicaStateProto state_;
    /**
     * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
     *
     * <pre>
     * The following entries are not set if there was no replica found.
     * </pre>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
     *
     * <pre>
     * The following entries are not set if there was no replica found.
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ReplicaStateProto getState() {
      return state_;
    }

    // optional .hadoop.hdfs.BlockProto block = 3;
    public static final int BLOCK_FIELD_NUMBER = 3;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto block_;
    /**
     * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
     *
     * <pre>
     * block information
     * </pre>
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
     *
     * <pre>
     * block information
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getBlock() {
      return block_;
    }
    /**
     * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
     *
     * <pre>
     * block information
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getBlockOrBuilder() {
      return block_;
    }

    private void initFields() {
      replicaFound_ = false;
      state_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ReplicaStateProto.FINALIZED;
      block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasReplicaFound()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasBlock()) {
        if (!getBlock().isInitialized()) {
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, replicaFound_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, state_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, block_);
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
          .computeBoolSize(1, replicaFound_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, state_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, block_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto) obj;

      boolean result = true;
      result = result && (hasReplicaFound() == other.hasReplicaFound());
      if (hasReplicaFound()) {
        result = result && (getReplicaFound()
            == other.getReplicaFound());
      }
      result = result && (hasState() == other.hasState());
      if (hasState()) {
        result = result &&
            (getState() == other.getState());
      }
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
      if (hasReplicaFound()) {
        hash = (37 * hash) + REPLICAFOUND_FIELD_NUMBER;
        hash = (53 * hash) + hashBoolean(getReplicaFound());
      }
      if (hasState()) {
        hash = (37 * hash) + STATE_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getState());
      }
      if (hasBlock()) {
        hash = (37 * hash) + BLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getBlock().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.InitReplicaRecoveryResponseProto}
     *
     * <pre>
     **
     * Repica recovery information
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.newBuilder()
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
        replicaFound_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ReplicaStateProto.FINALIZED;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (blockBuilder_ == null) {
          block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance();
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.replicaFound_ = replicaFound_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance()) return this;
        if (other.hasReplicaFound()) {
          setReplicaFound(other.getReplicaFound());
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasBlock()) {
          mergeBlock(other.getBlock());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasReplicaFound()) {
          
          return false;
        }
        if (hasBlock()) {
          if (!getBlock().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required bool replicaFound = 1;
      private boolean replicaFound_ ;
      /**
       * <code>required bool replicaFound = 1;</code>
       */
      public boolean hasReplicaFound() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required bool replicaFound = 1;</code>
       */
      public boolean getReplicaFound() {
        return replicaFound_;
      }
      /**
       * <code>required bool replicaFound = 1;</code>
       */
      public Builder setReplicaFound(boolean value) {
        bitField0_ |= 0x00000001;
        replicaFound_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool replicaFound = 1;</code>
       */
      public Builder clearReplicaFound() {
        bitField0_ = (bitField0_ & ~0x00000001);
        replicaFound_ = false;
        onChanged();
        return this;
      }

      // optional .hadoop.hdfs.ReplicaStateProto state = 2;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ReplicaStateProto state_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ReplicaStateProto.FINALIZED;
      /**
       * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
       *
       * <pre>
       * The following entries are not set if there was no replica found.
       * </pre>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
       *
       * <pre>
       * The following entries are not set if there was no replica found.
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ReplicaStateProto getState() {
        return state_;
      }
      /**
       * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
       *
       * <pre>
       * The following entries are not set if there was no replica found.
       * </pre>
       */
      public Builder setState(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ReplicaStateProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ReplicaStateProto state = 2;</code>
       *
       * <pre>
       * The following entries are not set if there was no replica found.
       * </pre>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000002);
        state_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ReplicaStateProto.FINALIZED;
        onChanged();
        return this;
      }

      // optional .hadoop.hdfs.BlockProto block = 3;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> blockBuilder_;
      /**
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       *
       * <pre>
       * block information
       * </pre>
       */
      public boolean hasBlock() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       *
       * <pre>
       * block information
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto getBlock() {
        if (blockBuilder_ == null) {
          return block_;
        } else {
          return blockBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       *
       * <pre>
       * block information
       * </pre>
       */
      public Builder setBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (blockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          block_ = value;
          onChanged();
        } else {
          blockBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       *
       * <pre>
       * block information
       * </pre>
       */
      public Builder setBlock(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder builderForValue) {
        if (blockBuilder_ == null) {
          block_ = builderForValue.build();
          onChanged();
        } else {
          blockBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       *
       * <pre>
       * block information
       * </pre>
       */
      public Builder mergeBlock(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto value) {
        if (blockBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              block_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance()) {
            block_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.newBuilder(block_).mergeFrom(value).buildPartial();
          } else {
            block_ = value;
          }
          onChanged();
        } else {
          blockBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       *
       * <pre>
       * block information
       * </pre>
       */
      public Builder clearBlock() {
        if (blockBuilder_ == null) {
          block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.getDefaultInstance();
          onChanged();
        } else {
          blockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       *
       * <pre>
       * block information
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder getBlockBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       *
       * <pre>
       * block information
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder getBlockOrBuilder() {
        if (blockBuilder_ != null) {
          return blockBuilder_.getMessageOrBuilder();
        } else {
          return block_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.BlockProto block = 3;</code>
       *
       * <pre>
       * block information
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder> 
          getBlockFieldBuilder() {
        if (blockBuilder_ == null) {
          blockBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlockProtoOrBuilder>(
                  block_,
                  getParentForChildren(),
                  isClean());
          block_ = null;
        }
        return blockBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.InitReplicaRecoveryResponseProto)
    }

    static {
      defaultInstance = new InitReplicaRecoveryResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.InitReplicaRecoveryResponseProto)
  }

  public interface UpdateReplicaUnderRecoveryRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.ExtendedBlockProto block = 1;
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     *
     * <pre>
     * Block identifier
     * </pre>
     */
    boolean hasBlock();
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     *
     * <pre>
     * Block identifier
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock();
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     *
     * <pre>
     * Block identifier
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder();

    // required uint64 recoveryId = 2;
    /**
     * <code>required uint64 recoveryId = 2;</code>
     *
     * <pre>
     * New genstamp of the replica
     * </pre>
     */
    boolean hasRecoveryId();
    /**
     * <code>required uint64 recoveryId = 2;</code>
     *
     * <pre>
     * New genstamp of the replica
     * </pre>
     */
    long getRecoveryId();

    // required uint64 newLength = 3;
    /**
     * <code>required uint64 newLength = 3;</code>
     *
     * <pre>
     * New length of the replica
     * </pre>
     */
    boolean hasNewLength();
    /**
     * <code>required uint64 newLength = 3;</code>
     *
     * <pre>
     * New length of the replica
     * </pre>
     */
    long getNewLength();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto}
   *
   * <pre>
   **
   * Update replica with new generation stamp and length
   * </pre>
   */
  public static final class UpdateReplicaUnderRecoveryRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements UpdateReplicaUnderRecoveryRequestProtoOrBuilder {
    // Use UpdateReplicaUnderRecoveryRequestProto.newBuilder() to construct.
    private UpdateReplicaUnderRecoveryRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private UpdateReplicaUnderRecoveryRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final UpdateReplicaUnderRecoveryRequestProto defaultInstance;
    public static UpdateReplicaUnderRecoveryRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public UpdateReplicaUnderRecoveryRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private UpdateReplicaUnderRecoveryRequestProto(
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
            case 16: {
              bitField0_ |= 0x00000002;
              recoveryId_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              newLength_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<UpdateReplicaUnderRecoveryRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<UpdateReplicaUnderRecoveryRequestProto>() {
      public UpdateReplicaUnderRecoveryRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdateReplicaUnderRecoveryRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<UpdateReplicaUnderRecoveryRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.ExtendedBlockProto block = 1;
    public static final int BLOCK_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto block_;
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     *
     * <pre>
     * Block identifier
     * </pre>
     */
    public boolean hasBlock() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     *
     * <pre>
     * Block identifier
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto getBlock() {
      return block_;
    }
    /**
     * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
     *
     * <pre>
     * Block identifier
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProtoOrBuilder getBlockOrBuilder() {
      return block_;
    }

    // required uint64 recoveryId = 2;
    public static final int RECOVERYID_FIELD_NUMBER = 2;
    private long recoveryId_;
    /**
     * <code>required uint64 recoveryId = 2;</code>
     *
     * <pre>
     * New genstamp of the replica
     * </pre>
     */
    public boolean hasRecoveryId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint64 recoveryId = 2;</code>
     *
     * <pre>
     * New genstamp of the replica
     * </pre>
     */
    public long getRecoveryId() {
      return recoveryId_;
    }

    // required uint64 newLength = 3;
    public static final int NEWLENGTH_FIELD_NUMBER = 3;
    private long newLength_;
    /**
     * <code>required uint64 newLength = 3;</code>
     *
     * <pre>
     * New length of the replica
     * </pre>
     */
    public boolean hasNewLength() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required uint64 newLength = 3;</code>
     *
     * <pre>
     * New length of the replica
     * </pre>
     */
    public long getNewLength() {
      return newLength_;
    }

    private void initFields() {
      block_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.getDefaultInstance();
      recoveryId_ = 0L;
      newLength_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBlock()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRecoveryId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNewLength()) {
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
        output.writeUInt64(2, recoveryId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, newLength_);
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
          .computeUInt64Size(2, recoveryId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, newLength_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto) obj;

      boolean result = true;
      result = result && (hasBlock() == other.hasBlock());
      if (hasBlock()) {
        result = result && getBlock()
            .equals(other.getBlock());
      }
      result = result && (hasRecoveryId() == other.hasRecoveryId());
      if (hasRecoveryId()) {
        result = result && (getRecoveryId()
            == other.getRecoveryId());
      }
      result = result && (hasNewLength() == other.hasNewLength());
      if (hasNewLength()) {
        result = result && (getNewLength()
            == other.getNewLength());
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
      if (hasRecoveryId()) {
        hash = (37 * hash) + RECOVERYID_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getRecoveryId());
      }
      if (hasNewLength()) {
        hash = (37 * hash) + NEWLENGTH_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getNewLength());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto}
     *
     * <pre>
     **
     * Update replica with new generation stamp and length
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.newBuilder()
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
        recoveryId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        newLength_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto(this);
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
        result.recoveryId_ = recoveryId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.newLength_ = newLength_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.getDefaultInstance()) return this;
        if (other.hasBlock()) {
          mergeBlock(other.getBlock());
        }
        if (other.hasRecoveryId()) {
          setRecoveryId(other.getRecoveryId());
        }
        if (other.hasNewLength()) {
          setNewLength(other.getNewLength());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBlock()) {
          
          return false;
        }
        if (!hasRecoveryId()) {
          
          return false;
        }
        if (!hasNewLength()) {
          
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
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto) e.getUnfinishedMessage();
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
       *
       * <pre>
       * Block identifier
       * </pre>
       */
      public boolean hasBlock() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       *
       * <pre>
       * Block identifier
       * </pre>
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
       *
       * <pre>
       * Block identifier
       * </pre>
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
       *
       * <pre>
       * Block identifier
       * </pre>
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
       *
       * <pre>
       * Block identifier
       * </pre>
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
       *
       * <pre>
       * Block identifier
       * </pre>
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
       *
       * <pre>
       * Block identifier
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExtendedBlockProto.Builder getBlockBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ExtendedBlockProto block = 1;</code>
       *
       * <pre>
       * Block identifier
       * </pre>
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
       *
       * <pre>
       * Block identifier
       * </pre>
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

      // required uint64 recoveryId = 2;
      private long recoveryId_ ;
      /**
       * <code>required uint64 recoveryId = 2;</code>
       *
       * <pre>
       * New genstamp of the replica
       * </pre>
       */
      public boolean hasRecoveryId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint64 recoveryId = 2;</code>
       *
       * <pre>
       * New genstamp of the replica
       * </pre>
       */
      public long getRecoveryId() {
        return recoveryId_;
      }
      /**
       * <code>required uint64 recoveryId = 2;</code>
       *
       * <pre>
       * New genstamp of the replica
       * </pre>
       */
      public Builder setRecoveryId(long value) {
        bitField0_ |= 0x00000002;
        recoveryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 recoveryId = 2;</code>
       *
       * <pre>
       * New genstamp of the replica
       * </pre>
       */
      public Builder clearRecoveryId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        recoveryId_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 newLength = 3;
      private long newLength_ ;
      /**
       * <code>required uint64 newLength = 3;</code>
       *
       * <pre>
       * New length of the replica
       * </pre>
       */
      public boolean hasNewLength() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required uint64 newLength = 3;</code>
       *
       * <pre>
       * New length of the replica
       * </pre>
       */
      public long getNewLength() {
        return newLength_;
      }
      /**
       * <code>required uint64 newLength = 3;</code>
       *
       * <pre>
       * New length of the replica
       * </pre>
       */
      public Builder setNewLength(long value) {
        bitField0_ |= 0x00000004;
        newLength_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 newLength = 3;</code>
       *
       * <pre>
       * New length of the replica
       * </pre>
       */
      public Builder clearNewLength() {
        bitField0_ = (bitField0_ & ~0x00000004);
        newLength_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto)
    }

    static {
      defaultInstance = new UpdateReplicaUnderRecoveryRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto)
  }

  public interface UpdateReplicaUnderRecoveryResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional string storageUuid = 1;
    /**
     * <code>optional string storageUuid = 1;</code>
     *
     * <pre>
     * ID of the storage that stores replica
     * </pre>
     */
    boolean hasStorageUuid();
    /**
     * <code>optional string storageUuid = 1;</code>
     *
     * <pre>
     * ID of the storage that stores replica
     * </pre>
     */
    java.lang.String getStorageUuid();
    /**
     * <code>optional string storageUuid = 1;</code>
     *
     * <pre>
     * ID of the storage that stores replica
     * </pre>
     */
    com.google.protobuf.ByteString
        getStorageUuidBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto}
   *
   * <pre>
   **
   * Response returns updated block information
   * </pre>
   */
  public static final class UpdateReplicaUnderRecoveryResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements UpdateReplicaUnderRecoveryResponseProtoOrBuilder {
    // Use UpdateReplicaUnderRecoveryResponseProto.newBuilder() to construct.
    private UpdateReplicaUnderRecoveryResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private UpdateReplicaUnderRecoveryResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final UpdateReplicaUnderRecoveryResponseProto defaultInstance;
    public static UpdateReplicaUnderRecoveryResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public UpdateReplicaUnderRecoveryResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private UpdateReplicaUnderRecoveryResponseProto(
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
              storageUuid_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<UpdateReplicaUnderRecoveryResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<UpdateReplicaUnderRecoveryResponseProto>() {
      public UpdateReplicaUnderRecoveryResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdateReplicaUnderRecoveryResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<UpdateReplicaUnderRecoveryResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional string storageUuid = 1;
    public static final int STORAGEUUID_FIELD_NUMBER = 1;
    private java.lang.Object storageUuid_;
    /**
     * <code>optional string storageUuid = 1;</code>
     *
     * <pre>
     * ID of the storage that stores replica
     * </pre>
     */
    public boolean hasStorageUuid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string storageUuid = 1;</code>
     *
     * <pre>
     * ID of the storage that stores replica
     * </pre>
     */
    public java.lang.String getStorageUuid() {
      java.lang.Object ref = storageUuid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          storageUuid_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string storageUuid = 1;</code>
     *
     * <pre>
     * ID of the storage that stores replica
     * </pre>
     */
    public com.google.protobuf.ByteString
        getStorageUuidBytes() {
      java.lang.Object ref = storageUuid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        storageUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      storageUuid_ = "";
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getStorageUuidBytes());
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
          .computeBytesSize(1, getStorageUuidBytes());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto) obj;

      boolean result = true;
      result = result && (hasStorageUuid() == other.hasStorageUuid());
      if (hasStorageUuid()) {
        result = result && getStorageUuid()
            .equals(other.getStorageUuid());
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
      if (hasStorageUuid()) {
        hash = (37 * hash) + STORAGEUUID_FIELD_NUMBER;
        hash = (53 * hash) + getStorageUuid().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto}
     *
     * <pre>
     **
     * Response returns updated block information
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.newBuilder()
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
        storageUuid_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.storageUuid_ = storageUuid_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance()) return this;
        if (other.hasStorageUuid()) {
          bitField0_ |= 0x00000001;
          storageUuid_ = other.storageUuid_;
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
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional string storageUuid = 1;
      private java.lang.Object storageUuid_ = "";
      /**
       * <code>optional string storageUuid = 1;</code>
       *
       * <pre>
       * ID of the storage that stores replica
       * </pre>
       */
      public boolean hasStorageUuid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string storageUuid = 1;</code>
       *
       * <pre>
       * ID of the storage that stores replica
       * </pre>
       */
      public java.lang.String getStorageUuid() {
        java.lang.Object ref = storageUuid_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          storageUuid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string storageUuid = 1;</code>
       *
       * <pre>
       * ID of the storage that stores replica
       * </pre>
       */
      public com.google.protobuf.ByteString
          getStorageUuidBytes() {
        java.lang.Object ref = storageUuid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          storageUuid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string storageUuid = 1;</code>
       *
       * <pre>
       * ID of the storage that stores replica
       * </pre>
       */
      public Builder setStorageUuid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        storageUuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string storageUuid = 1;</code>
       *
       * <pre>
       * ID of the storage that stores replica
       * </pre>
       */
      public Builder clearStorageUuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        storageUuid_ = getDefaultInstance().getStorageUuid();
        onChanged();
        return this;
      }
      /**
       * <code>optional string storageUuid = 1;</code>
       *
       * <pre>
       * ID of the storage that stores replica
       * </pre>
       */
      public Builder setStorageUuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        storageUuid_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto)
    }

    static {
      defaultInstance = new UpdateReplicaUnderRecoveryResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto)
  }

  /**
   * Protobuf service {@code hadoop.hdfs.InterDatanodeProtocolService}
   *
   * <pre>
   **
   * Protocol used between datanodes for block recovery.
   *
   * See the request and response for details of rpc call.
   * </pre>
   */
  public static abstract class InterDatanodeProtocolService
      implements com.google.protobuf.Service {
    protected InterDatanodeProtocolService() {}

    public interface Interface {
      /**
       * <code>rpc initReplicaRecovery(.hadoop.hdfs.InitReplicaRecoveryRequestProto) returns (.hadoop.hdfs.InitReplicaRecoveryResponseProto);</code>
       *
       * <pre>
       **
       * Initialize recovery of a replica
       * </pre>
       */
      public abstract void initReplicaRecovery(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto> done);

      /**
       * <code>rpc updateReplicaUnderRecovery(.hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto) returns (.hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto);</code>
       *
       * <pre>
       **
       * Update a replica with new generation stamp and length
       * </pre>
       */
      public abstract void updateReplicaUnderRecovery(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new InterDatanodeProtocolService() {
        @java.lang.Override
        public  void initReplicaRecovery(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto> done) {
          impl.initReplicaRecovery(controller, request, done);
        }

        @java.lang.Override
        public  void updateReplicaUnderRecovery(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto> done) {
          impl.updateReplicaUnderRecovery(controller, request, done);
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
              return impl.initReplicaRecovery(controller, (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto)request);
            case 1:
              return impl.updateReplicaUnderRecovery(controller, (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto)request);
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
              return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.getDefaultInstance();
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
              return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc initReplicaRecovery(.hadoop.hdfs.InitReplicaRecoveryRequestProto) returns (.hadoop.hdfs.InitReplicaRecoveryResponseProto);</code>
     *
     * <pre>
     **
     * Initialize recovery of a replica
     * </pre>
     */
    public abstract void initReplicaRecovery(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto> done);

    /**
     * <code>rpc updateReplicaUnderRecovery(.hadoop.hdfs.UpdateReplicaUnderRecoveryRequestProto) returns (.hadoop.hdfs.UpdateReplicaUnderRecoveryResponseProto);</code>
     *
     * <pre>
     **
     * Update a replica with new generation stamp and length
     * </pre>
     */
    public abstract void updateReplicaUnderRecovery(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.getDescriptor().getServices().get(0);
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
          this.initReplicaRecovery(controller, (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.updateReplicaUnderRecovery(controller, (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto>specializeCallback(
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
          return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto.getDefaultInstance();
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
          return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InterDatanodeProtocolService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void initReplicaRecovery(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance()));
      }

      public  void updateReplicaUnderRecovery(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto initReplicaRecovery(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto updateReplicaUnderRecovery(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto initReplicaRecovery(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.InitReplicaRecoveryResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto updateReplicaUnderRecovery(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.InterDatanodeProtocolProtos.UpdateReplicaUnderRecoveryResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.InterDatanodeProtocolService)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033InterDatanodeProtocol.proto\022\013hadoop.hd" +
      "fs\032\nhdfs.proto\"S\n\037InitReplicaRecoveryReq" +
      "uestProto\0220\n\005block\030\001 \002(\0132!.hadoop.hdfs.R" +
      "ecoveringBlockProto\"\217\001\n InitReplicaRecov" +
      "eryResponseProto\022\024\n\014replicaFound\030\001 \002(\010\022-" +
      "\n\005state\030\002 \001(\0162\036.hadoop.hdfs.ReplicaState" +
      "Proto\022&\n\005block\030\003 \001(\0132\027.hadoop.hdfs.Block" +
      "Proto\"\177\n&UpdateReplicaUnderRecoveryReque" +
      "stProto\022.\n\005block\030\001 \002(\0132\037.hadoop.hdfs.Ext" +
      "endedBlockProto\022\022\n\nrecoveryId\030\002 \002(\004\022\021\n\tn",
      "ewLength\030\003 \002(\004\">\n\'UpdateReplicaUnderReco" +
      "veryResponseProto\022\023\n\013storageUuid\030\001 \001(\t2\234" +
      "\002\n\034InterDatanodeProtocolService\022r\n\023initR" +
      "eplicaRecovery\022,.hadoop.hdfs.InitReplica" +
      "RecoveryRequestProto\032-.hadoop.hdfs.InitR" +
      "eplicaRecoveryResponseProto\022\207\001\n\032updateRe" +
      "plicaUnderRecovery\0223.hadoop.hdfs.UpdateR" +
      "eplicaUnderRecoveryRequestProto\0324.hadoop" +
      ".hdfs.UpdateReplicaUnderRecoveryResponse" +
      "ProtoBJ\n%org.apache.hadoop.hdfs.protocol",
      ".protoB\033InterDatanodeProtocolProtos\210\001\001\240\001" +
      "\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_InitReplicaRecoveryRequestProto_descriptor,
              new java.lang.String[] { "Block", });
          internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_InitReplicaRecoveryResponseProto_descriptor,
              new java.lang.String[] { "ReplicaFound", "State", "Block", });
          internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryRequestProto_descriptor,
              new java.lang.String[] { "Block", "RecoveryId", "NewLength", });
          internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_UpdateReplicaUnderRecoveryResponseProto_descriptor,
              new java.lang.String[] { "StorageUuid", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
