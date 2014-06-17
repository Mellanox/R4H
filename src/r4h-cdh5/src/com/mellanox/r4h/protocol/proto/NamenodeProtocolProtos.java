package com.mellanox.r4h.protocol.proto;


public final class NamenodeProtocolProtos {
  private NamenodeProtocolProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetBlocksRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.DatanodeIDProto datanode = 1;
    /**
     * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
     *
     * <pre>
     * Datanode ID
     * </pre>
     */
    boolean hasDatanode();
    /**
     * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
     *
     * <pre>
     * Datanode ID
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto getDatanode();
    /**
     * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
     *
     * <pre>
     * Datanode ID
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProtoOrBuilder getDatanodeOrBuilder();

    // required uint64 size = 2;
    /**
     * <code>required uint64 size = 2;</code>
     *
     * <pre>
     * Size in bytes
     * </pre>
     */
    boolean hasSize();
    /**
     * <code>required uint64 size = 2;</code>
     *
     * <pre>
     * Size in bytes
     * </pre>
     */
    long getSize();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetBlocksRequestProto}
   *
   * <pre>
   **
   * Get list of blocks for a given datanode with the total length 
   * of adding up to given size
   * datanode - Datanode ID to get list of block from
   * size - size to which the block lengths must add up to
   * </pre>
   */
  public static final class GetBlocksRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements GetBlocksRequestProtoOrBuilder {
    // Use GetBlocksRequestProto.newBuilder() to construct.
    private GetBlocksRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetBlocksRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetBlocksRequestProto defaultInstance;
    public static GetBlocksRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetBlocksRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetBlocksRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = datanode_.toBuilder();
              }
              datanode_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(datanode_);
                datanode_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              size_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlocksRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlocksRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetBlocksRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<GetBlocksRequestProto>() {
      public GetBlocksRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetBlocksRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetBlocksRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.DatanodeIDProto datanode = 1;
    public static final int DATANODE_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto datanode_;
    /**
     * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
     *
     * <pre>
     * Datanode ID
     * </pre>
     */
    public boolean hasDatanode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
     *
     * <pre>
     * Datanode ID
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto getDatanode() {
      return datanode_;
    }
    /**
     * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
     *
     * <pre>
     * Datanode ID
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProtoOrBuilder getDatanodeOrBuilder() {
      return datanode_;
    }

    // required uint64 size = 2;
    public static final int SIZE_FIELD_NUMBER = 2;
    private long size_;
    /**
     * <code>required uint64 size = 2;</code>
     *
     * <pre>
     * Size in bytes
     * </pre>
     */
    public boolean hasSize() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint64 size = 2;</code>
     *
     * <pre>
     * Size in bytes
     * </pre>
     */
    public long getSize() {
      return size_;
    }

    private void initFields() {
      datanode_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.getDefaultInstance();
      size_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasDatanode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSize()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getDatanode().isInitialized()) {
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
        output.writeMessage(1, datanode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, size_);
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
          .computeMessageSize(1, datanode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, size_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto) obj;

      boolean result = true;
      result = result && (hasDatanode() == other.hasDatanode());
      if (hasDatanode()) {
        result = result && getDatanode()
            .equals(other.getDatanode());
      }
      result = result && (hasSize() == other.hasSize());
      if (hasSize()) {
        result = result && (getSize()
            == other.getSize());
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
      if (hasDatanode()) {
        hash = (37 * hash) + DATANODE_FIELD_NUMBER;
        hash = (53 * hash) + getDatanode().hashCode();
      }
      if (hasSize()) {
        hash = (37 * hash) + SIZE_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getSize());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetBlocksRequestProto}
     *
     * <pre>
     **
     * Get list of blocks for a given datanode with the total length 
     * of adding up to given size
     * datanode - Datanode ID to get list of block from
     * size - size to which the block lengths must add up to
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlocksRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlocksRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto.newBuilder()
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
          getDatanodeFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (datanodeBuilder_ == null) {
          datanode_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.getDefaultInstance();
        } else {
          datanodeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        size_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlocksRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (datanodeBuilder_ == null) {
          result.datanode_ = datanode_;
        } else {
          result.datanode_ = datanodeBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.size_ = size_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto.getDefaultInstance()) return this;
        if (other.hasDatanode()) {
          mergeDatanode(other.getDatanode());
        }
        if (other.hasSize()) {
          setSize(other.getSize());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasDatanode()) {
          
          return false;
        }
        if (!hasSize()) {
          
          return false;
        }
        if (!getDatanode().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.DatanodeIDProto datanode = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto datanode_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProtoOrBuilder> datanodeBuilder_;
      /**
       * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
       *
       * <pre>
       * Datanode ID
       * </pre>
       */
      public boolean hasDatanode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
       *
       * <pre>
       * Datanode ID
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto getDatanode() {
        if (datanodeBuilder_ == null) {
          return datanode_;
        } else {
          return datanodeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
       *
       * <pre>
       * Datanode ID
       * </pre>
       */
      public Builder setDatanode(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto value) {
        if (datanodeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          datanode_ = value;
          onChanged();
        } else {
          datanodeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
       *
       * <pre>
       * Datanode ID
       * </pre>
       */
      public Builder setDatanode(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.Builder builderForValue) {
        if (datanodeBuilder_ == null) {
          datanode_ = builderForValue.build();
          onChanged();
        } else {
          datanodeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
       *
       * <pre>
       * Datanode ID
       * </pre>
       */
      public Builder mergeDatanode(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto value) {
        if (datanodeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              datanode_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.getDefaultInstance()) {
            datanode_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.newBuilder(datanode_).mergeFrom(value).buildPartial();
          } else {
            datanode_ = value;
          }
          onChanged();
        } else {
          datanodeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
       *
       * <pre>
       * Datanode ID
       * </pre>
       */
      public Builder clearDatanode() {
        if (datanodeBuilder_ == null) {
          datanode_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.getDefaultInstance();
          onChanged();
        } else {
          datanodeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
       *
       * <pre>
       * Datanode ID
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.Builder getDatanodeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getDatanodeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
       *
       * <pre>
       * Datanode ID
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProtoOrBuilder getDatanodeOrBuilder() {
        if (datanodeBuilder_ != null) {
          return datanodeBuilder_.getMessageOrBuilder();
        } else {
          return datanode_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeIDProto datanode = 1;</code>
       *
       * <pre>
       * Datanode ID
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProtoOrBuilder> 
          getDatanodeFieldBuilder() {
        if (datanodeBuilder_ == null) {
          datanodeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeIDProtoOrBuilder>(
                  datanode_,
                  getParentForChildren(),
                  isClean());
          datanode_ = null;
        }
        return datanodeBuilder_;
      }

      // required uint64 size = 2;
      private long size_ ;
      /**
       * <code>required uint64 size = 2;</code>
       *
       * <pre>
       * Size in bytes
       * </pre>
       */
      public boolean hasSize() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint64 size = 2;</code>
       *
       * <pre>
       * Size in bytes
       * </pre>
       */
      public long getSize() {
        return size_;
      }
      /**
       * <code>required uint64 size = 2;</code>
       *
       * <pre>
       * Size in bytes
       * </pre>
       */
      public Builder setSize(long value) {
        bitField0_ |= 0x00000002;
        size_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 size = 2;</code>
       *
       * <pre>
       * Size in bytes
       * </pre>
       */
      public Builder clearSize() {
        bitField0_ = (bitField0_ & ~0x00000002);
        size_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetBlocksRequestProto)
    }

    static {
      defaultInstance = new GetBlocksRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetBlocksRequestProto)
  }

  public interface GetBlocksResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;
    /**
     * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
     *
     * <pre>
     * List of blocks
     * </pre>
     */
    boolean hasBlocks();
    /**
     * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
     *
     * <pre>
     * List of blocks
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto getBlocks();
    /**
     * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
     *
     * <pre>
     * List of blocks
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProtoOrBuilder getBlocksOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetBlocksResponseProto}
   *
   * <pre>
   **
   * blocks - List of returned blocks
   * </pre>
   */
  public static final class GetBlocksResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements GetBlocksResponseProtoOrBuilder {
    // Use GetBlocksResponseProto.newBuilder() to construct.
    private GetBlocksResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetBlocksResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetBlocksResponseProto defaultInstance;
    public static GetBlocksResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetBlocksResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetBlocksResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = blocks_.toBuilder();
              }
              blocks_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(blocks_);
                blocks_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlocksResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlocksResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetBlocksResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<GetBlocksResponseProto>() {
      public GetBlocksResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetBlocksResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetBlocksResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;
    public static final int BLOCKS_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto blocks_;
    /**
     * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
     *
     * <pre>
     * List of blocks
     * </pre>
     */
    public boolean hasBlocks() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
     *
     * <pre>
     * List of blocks
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto getBlocks() {
      return blocks_;
    }
    /**
     * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
     *
     * <pre>
     * List of blocks
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProtoOrBuilder getBlocksOrBuilder() {
      return blocks_;
    }

    private void initFields() {
      blocks_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBlocks()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getBlocks().isInitialized()) {
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
        output.writeMessage(1, blocks_);
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
          .computeMessageSize(1, blocks_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto) obj;

      boolean result = true;
      result = result && (hasBlocks() == other.hasBlocks());
      if (hasBlocks()) {
        result = result && getBlocks()
            .equals(other.getBlocks());
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
      if (hasBlocks()) {
        hash = (37 * hash) + BLOCKS_FIELD_NUMBER;
        hash = (53 * hash) + getBlocks().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetBlocksResponseProto}
     *
     * <pre>
     **
     * blocks - List of returned blocks
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlocksResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlocksResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.newBuilder()
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
          getBlocksFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (blocksBuilder_ == null) {
          blocks_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.getDefaultInstance();
        } else {
          blocksBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlocksResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (blocksBuilder_ == null) {
          result.blocks_ = blocks_;
        } else {
          result.blocks_ = blocksBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.getDefaultInstance()) return this;
        if (other.hasBlocks()) {
          mergeBlocks(other.getBlocks());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBlocks()) {
          
          return false;
        }
        if (!getBlocks().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto blocks_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProtoOrBuilder> blocksBuilder_;
      /**
       * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
       *
       * <pre>
       * List of blocks
       * </pre>
       */
      public boolean hasBlocks() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
       *
       * <pre>
       * List of blocks
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto getBlocks() {
        if (blocksBuilder_ == null) {
          return blocks_;
        } else {
          return blocksBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
       *
       * <pre>
       * List of blocks
       * </pre>
       */
      public Builder setBlocks(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto value) {
        if (blocksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          blocks_ = value;
          onChanged();
        } else {
          blocksBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
       *
       * <pre>
       * List of blocks
       * </pre>
       */
      public Builder setBlocks(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.Builder builderForValue) {
        if (blocksBuilder_ == null) {
          blocks_ = builderForValue.build();
          onChanged();
        } else {
          blocksBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
       *
       * <pre>
       * List of blocks
       * </pre>
       */
      public Builder mergeBlocks(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto value) {
        if (blocksBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              blocks_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.getDefaultInstance()) {
            blocks_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.newBuilder(blocks_).mergeFrom(value).buildPartial();
          } else {
            blocks_ = value;
          }
          onChanged();
        } else {
          blocksBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
       *
       * <pre>
       * List of blocks
       * </pre>
       */
      public Builder clearBlocks() {
        if (blocksBuilder_ == null) {
          blocks_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.getDefaultInstance();
          onChanged();
        } else {
          blocksBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
       *
       * <pre>
       * List of blocks
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.Builder getBlocksBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBlocksFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
       *
       * <pre>
       * List of blocks
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProtoOrBuilder getBlocksOrBuilder() {
        if (blocksBuilder_ != null) {
          return blocksBuilder_.getMessageOrBuilder();
        } else {
          return blocks_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.BlocksWithLocationsProto blocks = 1;</code>
       *
       * <pre>
       * List of blocks
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProtoOrBuilder> 
          getBlocksFieldBuilder() {
        if (blocksBuilder_ == null) {
          blocksBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.BlocksWithLocationsProtoOrBuilder>(
                  blocks_,
                  getParentForChildren(),
                  isClean());
          blocks_ = null;
        }
        return blocksBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetBlocksResponseProto)
    }

    static {
      defaultInstance = new GetBlocksResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetBlocksResponseProto)
  }

  public interface GetBlockKeysRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetBlockKeysRequestProto}
   *
   * <pre>
   **
   * void request
   * </pre>
   */
  public static final class GetBlockKeysRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements GetBlockKeysRequestProtoOrBuilder {
    // Use GetBlockKeysRequestProto.newBuilder() to construct.
    private GetBlockKeysRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetBlockKeysRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetBlockKeysRequestProto defaultInstance;
    public static GetBlockKeysRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetBlockKeysRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetBlockKeysRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockKeysRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockKeysRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetBlockKeysRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<GetBlockKeysRequestProto>() {
      public GetBlockKeysRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetBlockKeysRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetBlockKeysRequestProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetBlockKeysRequestProto}
     *
     * <pre>
     **
     * void request
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockKeysRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockKeysRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockKeysRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetBlockKeysRequestProto)
    }

    static {
      defaultInstance = new GetBlockKeysRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetBlockKeysRequestProto)
  }

  public interface GetBlockKeysResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;
    /**
     * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
     */
    boolean hasKeys();
    /**
     * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto getKeys();
    /**
     * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProtoOrBuilder getKeysOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetBlockKeysResponseProto}
   *
   * <pre>
   **
   * keys - Information about block keys at the active namenode
   * </pre>
   */
  public static final class GetBlockKeysResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements GetBlockKeysResponseProtoOrBuilder {
    // Use GetBlockKeysResponseProto.newBuilder() to construct.
    private GetBlockKeysResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetBlockKeysResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetBlockKeysResponseProto defaultInstance;
    public static GetBlockKeysResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetBlockKeysResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetBlockKeysResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = keys_.toBuilder();
              }
              keys_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(keys_);
                keys_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockKeysResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockKeysResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetBlockKeysResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<GetBlockKeysResponseProto>() {
      public GetBlockKeysResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetBlockKeysResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetBlockKeysResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;
    public static final int KEYS_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto keys_;
    /**
     * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
     */
    public boolean hasKeys() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto getKeys() {
      return keys_;
    }
    /**
     * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProtoOrBuilder getKeysOrBuilder() {
      return keys_;
    }

    private void initFields() {
      keys_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (hasKeys()) {
        if (!getKeys().isInitialized()) {
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
        output.writeMessage(1, keys_);
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
          .computeMessageSize(1, keys_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto) obj;

      boolean result = true;
      result = result && (hasKeys() == other.hasKeys());
      if (hasKeys()) {
        result = result && getKeys()
            .equals(other.getKeys());
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
      if (hasKeys()) {
        hash = (37 * hash) + KEYS_FIELD_NUMBER;
        hash = (53 * hash) + getKeys().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetBlockKeysResponseProto}
     *
     * <pre>
     **
     * keys - Information about block keys at the active namenode
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockKeysResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockKeysResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.newBuilder()
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
          getKeysFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (keysBuilder_ == null) {
          keys_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.getDefaultInstance();
        } else {
          keysBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetBlockKeysResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (keysBuilder_ == null) {
          result.keys_ = keys_;
        } else {
          result.keys_ = keysBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.getDefaultInstance()) return this;
        if (other.hasKeys()) {
          mergeKeys(other.getKeys());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (hasKeys()) {
          if (!getKeys().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto keys_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProtoOrBuilder> keysBuilder_;
      /**
       * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
       */
      public boolean hasKeys() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto getKeys() {
        if (keysBuilder_ == null) {
          return keys_;
        } else {
          return keysBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
       */
      public Builder setKeys(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto value) {
        if (keysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          keys_ = value;
          onChanged();
        } else {
          keysBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
       */
      public Builder setKeys(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.Builder builderForValue) {
        if (keysBuilder_ == null) {
          keys_ = builderForValue.build();
          onChanged();
        } else {
          keysBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
       */
      public Builder mergeKeys(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto value) {
        if (keysBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              keys_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.getDefaultInstance()) {
            keys_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.newBuilder(keys_).mergeFrom(value).buildPartial();
          } else {
            keys_ = value;
          }
          onChanged();
        } else {
          keysBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
       */
      public Builder clearKeys() {
        if (keysBuilder_ == null) {
          keys_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.getDefaultInstance();
          onChanged();
        } else {
          keysBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.Builder getKeysBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getKeysFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProtoOrBuilder getKeysOrBuilder() {
        if (keysBuilder_ != null) {
          return keysBuilder_.getMessageOrBuilder();
        } else {
          return keys_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ExportedBlockKeysProto keys = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProtoOrBuilder> 
          getKeysFieldBuilder() {
        if (keysBuilder_ == null) {
          keysBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ExportedBlockKeysProtoOrBuilder>(
                  keys_,
                  getParentForChildren(),
                  isClean());
          keys_ = null;
        }
        return keysBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetBlockKeysResponseProto)
    }

    static {
      defaultInstance = new GetBlockKeysResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetBlockKeysResponseProto)
  }

  public interface GetTransactionIdRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetTransactionIdRequestProto}
   *
   * <pre>
   **
   * void request
   * </pre>
   */
  public static final class GetTransactionIdRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements GetTransactionIdRequestProtoOrBuilder {
    // Use GetTransactionIdRequestProto.newBuilder() to construct.
    private GetTransactionIdRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetTransactionIdRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetTransactionIdRequestProto defaultInstance;
    public static GetTransactionIdRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetTransactionIdRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetTransactionIdRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetTransactionIdRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetTransactionIdRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetTransactionIdRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<GetTransactionIdRequestProto>() {
      public GetTransactionIdRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetTransactionIdRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetTransactionIdRequestProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetTransactionIdRequestProto}
     *
     * <pre>
     **
     * void request
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetTransactionIdRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetTransactionIdRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetTransactionIdRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetTransactionIdRequestProto)
    }

    static {
      defaultInstance = new GetTransactionIdRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetTransactionIdRequestProto)
  }

  public interface GetTransactionIdResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required uint64 txId = 1;
    /**
     * <code>required uint64 txId = 1;</code>
     *
     * <pre>
     * Transaction ID
     * </pre>
     */
    boolean hasTxId();
    /**
     * <code>required uint64 txId = 1;</code>
     *
     * <pre>
     * Transaction ID
     * </pre>
     */
    long getTxId();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetTransactionIdResponseProto}
   *
   * <pre>
   **
   * txId - Transaction ID of the most recently persisted edit log record
   * </pre>
   */
  public static final class GetTransactionIdResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements GetTransactionIdResponseProtoOrBuilder {
    // Use GetTransactionIdResponseProto.newBuilder() to construct.
    private GetTransactionIdResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetTransactionIdResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetTransactionIdResponseProto defaultInstance;
    public static GetTransactionIdResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetTransactionIdResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetTransactionIdResponseProto(
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
              txId_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetTransactionIdResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetTransactionIdResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetTransactionIdResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<GetTransactionIdResponseProto>() {
      public GetTransactionIdResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetTransactionIdResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetTransactionIdResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required uint64 txId = 1;
    public static final int TXID_FIELD_NUMBER = 1;
    private long txId_;
    /**
     * <code>required uint64 txId = 1;</code>
     *
     * <pre>
     * Transaction ID
     * </pre>
     */
    public boolean hasTxId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint64 txId = 1;</code>
     *
     * <pre>
     * Transaction ID
     * </pre>
     */
    public long getTxId() {
      return txId_;
    }

    private void initFields() {
      txId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTxId()) {
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
        output.writeUInt64(1, txId_);
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
          .computeUInt64Size(1, txId_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto) obj;

      boolean result = true;
      result = result && (hasTxId() == other.hasTxId());
      if (hasTxId()) {
        result = result && (getTxId()
            == other.getTxId());
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
      if (hasTxId()) {
        hash = (37 * hash) + TXID_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getTxId());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetTransactionIdResponseProto}
     *
     * <pre>
     **
     * txId - Transaction ID of the most recently persisted edit log record
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetTransactionIdResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetTransactionIdResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.newBuilder()
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
        txId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetTransactionIdResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.txId_ = txId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.getDefaultInstance()) return this;
        if (other.hasTxId()) {
          setTxId(other.getTxId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTxId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required uint64 txId = 1;
      private long txId_ ;
      /**
       * <code>required uint64 txId = 1;</code>
       *
       * <pre>
       * Transaction ID
       * </pre>
       */
      public boolean hasTxId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required uint64 txId = 1;</code>
       *
       * <pre>
       * Transaction ID
       * </pre>
       */
      public long getTxId() {
        return txId_;
      }
      /**
       * <code>required uint64 txId = 1;</code>
       *
       * <pre>
       * Transaction ID
       * </pre>
       */
      public Builder setTxId(long value) {
        bitField0_ |= 0x00000001;
        txId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 txId = 1;</code>
       *
       * <pre>
       * Transaction ID
       * </pre>
       */
      public Builder clearTxId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        txId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetTransactionIdResponseProto)
    }

    static {
      defaultInstance = new GetTransactionIdResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetTransactionIdResponseProto)
  }

  public interface RollEditLogRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RollEditLogRequestProto}
   *
   * <pre>
   **
   * void request
   * </pre>
   */
  public static final class RollEditLogRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements RollEditLogRequestProtoOrBuilder {
    // Use RollEditLogRequestProto.newBuilder() to construct.
    private RollEditLogRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RollEditLogRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RollEditLogRequestProto defaultInstance;
    public static RollEditLogRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public RollEditLogRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RollEditLogRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RollEditLogRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RollEditLogRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RollEditLogRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<RollEditLogRequestProto>() {
      public RollEditLogRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RollEditLogRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RollEditLogRequestProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RollEditLogRequestProto}
     *
     * <pre>
     **
     * void request
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RollEditLogRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RollEditLogRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RollEditLogRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RollEditLogRequestProto)
    }

    static {
      defaultInstance = new RollEditLogRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RollEditLogRequestProto)
  }

  public interface RollEditLogResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.CheckpointSignatureProto signature = 1;
    /**
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
     */
    boolean hasSignature();
    /**
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto getSignature();
    /**
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProtoOrBuilder getSignatureOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RollEditLogResponseProto}
   *
   * <pre>
   **
   * signature - A unique token to identify checkpoint transaction
   * </pre>
   */
  public static final class RollEditLogResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements RollEditLogResponseProtoOrBuilder {
    // Use RollEditLogResponseProto.newBuilder() to construct.
    private RollEditLogResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RollEditLogResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RollEditLogResponseProto defaultInstance;
    public static RollEditLogResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public RollEditLogResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RollEditLogResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = signature_.toBuilder();
              }
              signature_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(signature_);
                signature_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RollEditLogResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RollEditLogResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RollEditLogResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<RollEditLogResponseProto>() {
      public RollEditLogResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RollEditLogResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RollEditLogResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.CheckpointSignatureProto signature = 1;
    public static final int SIGNATURE_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto signature_;
    /**
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
     */
    public boolean hasSignature() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto getSignature() {
      return signature_;
    }
    /**
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProtoOrBuilder getSignatureOrBuilder() {
      return signature_;
    }

    private void initFields() {
      signature_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSignature()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSignature().isInitialized()) {
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
        output.writeMessage(1, signature_);
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
          .computeMessageSize(1, signature_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto) obj;

      boolean result = true;
      result = result && (hasSignature() == other.hasSignature());
      if (hasSignature()) {
        result = result && getSignature()
            .equals(other.getSignature());
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
      if (hasSignature()) {
        hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
        hash = (53 * hash) + getSignature().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RollEditLogResponseProto}
     *
     * <pre>
     **
     * signature - A unique token to identify checkpoint transaction
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RollEditLogResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RollEditLogResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.newBuilder()
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
          getSignatureFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (signatureBuilder_ == null) {
          signature_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.getDefaultInstance();
        } else {
          signatureBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RollEditLogResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (signatureBuilder_ == null) {
          result.signature_ = signature_;
        } else {
          result.signature_ = signatureBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.getDefaultInstance()) return this;
        if (other.hasSignature()) {
          mergeSignature(other.getSignature());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSignature()) {
          
          return false;
        }
        if (!getSignature().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.CheckpointSignatureProto signature = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto signature_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProtoOrBuilder> signatureBuilder_;
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public boolean hasSignature() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto getSignature() {
        if (signatureBuilder_ == null) {
          return signature_;
        } else {
          return signatureBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public Builder setSignature(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto value) {
        if (signatureBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          signature_ = value;
          onChanged();
        } else {
          signatureBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public Builder setSignature(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.Builder builderForValue) {
        if (signatureBuilder_ == null) {
          signature_ = builderForValue.build();
          onChanged();
        } else {
          signatureBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public Builder mergeSignature(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto value) {
        if (signatureBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              signature_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.getDefaultInstance()) {
            signature_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.newBuilder(signature_).mergeFrom(value).buildPartial();
          } else {
            signature_ = value;
          }
          onChanged();
        } else {
          signatureBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public Builder clearSignature() {
        if (signatureBuilder_ == null) {
          signature_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.getDefaultInstance();
          onChanged();
        } else {
          signatureBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.Builder getSignatureBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSignatureFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProtoOrBuilder getSignatureOrBuilder() {
        if (signatureBuilder_ != null) {
          return signatureBuilder_.getMessageOrBuilder();
        } else {
          return signature_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProtoOrBuilder> 
          getSignatureFieldBuilder() {
        if (signatureBuilder_ == null) {
          signatureBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProtoOrBuilder>(
                  signature_,
                  getParentForChildren(),
                  isClean());
          signature_ = null;
        }
        return signatureBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RollEditLogResponseProto)
    }

    static {
      defaultInstance = new RollEditLogResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RollEditLogResponseProto)
  }

  public interface GetMostRecentCheckpointTxIdRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetMostRecentCheckpointTxIdRequestProto}
   *
   * <pre>
   **
   * void request
   * </pre>
   */
  public static final class GetMostRecentCheckpointTxIdRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements GetMostRecentCheckpointTxIdRequestProtoOrBuilder {
    // Use GetMostRecentCheckpointTxIdRequestProto.newBuilder() to construct.
    private GetMostRecentCheckpointTxIdRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetMostRecentCheckpointTxIdRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetMostRecentCheckpointTxIdRequestProto defaultInstance;
    public static GetMostRecentCheckpointTxIdRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetMostRecentCheckpointTxIdRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetMostRecentCheckpointTxIdRequestProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetMostRecentCheckpointTxIdRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<GetMostRecentCheckpointTxIdRequestProto>() {
      public GetMostRecentCheckpointTxIdRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetMostRecentCheckpointTxIdRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetMostRecentCheckpointTxIdRequestProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetMostRecentCheckpointTxIdRequestProto}
     *
     * <pre>
     **
     * void request
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetMostRecentCheckpointTxIdRequestProto)
    }

    static {
      defaultInstance = new GetMostRecentCheckpointTxIdRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetMostRecentCheckpointTxIdRequestProto)
  }

  public interface GetMostRecentCheckpointTxIdResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required uint64 txId = 1;
    /**
     * <code>required uint64 txId = 1;</code>
     */
    boolean hasTxId();
    /**
     * <code>required uint64 txId = 1;</code>
     */
    long getTxId();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetMostRecentCheckpointTxIdResponseProto}
   */
  public static final class GetMostRecentCheckpointTxIdResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements GetMostRecentCheckpointTxIdResponseProtoOrBuilder {
    // Use GetMostRecentCheckpointTxIdResponseProto.newBuilder() to construct.
    private GetMostRecentCheckpointTxIdResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetMostRecentCheckpointTxIdResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetMostRecentCheckpointTxIdResponseProto defaultInstance;
    public static GetMostRecentCheckpointTxIdResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetMostRecentCheckpointTxIdResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetMostRecentCheckpointTxIdResponseProto(
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
              txId_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetMostRecentCheckpointTxIdResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<GetMostRecentCheckpointTxIdResponseProto>() {
      public GetMostRecentCheckpointTxIdResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetMostRecentCheckpointTxIdResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetMostRecentCheckpointTxIdResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required uint64 txId = 1;
    public static final int TXID_FIELD_NUMBER = 1;
    private long txId_;
    /**
     * <code>required uint64 txId = 1;</code>
     */
    public boolean hasTxId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint64 txId = 1;</code>
     */
    public long getTxId() {
      return txId_;
    }

    private void initFields() {
      txId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasTxId()) {
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
        output.writeUInt64(1, txId_);
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
          .computeUInt64Size(1, txId_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto) obj;

      boolean result = true;
      result = result && (hasTxId() == other.hasTxId());
      if (hasTxId()) {
        result = result && (getTxId()
            == other.getTxId());
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
      if (hasTxId()) {
        hash = (37 * hash) + TXID_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getTxId());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetMostRecentCheckpointTxIdResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.newBuilder()
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
        txId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.txId_ = txId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.getDefaultInstance()) return this;
        if (other.hasTxId()) {
          setTxId(other.getTxId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTxId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required uint64 txId = 1;
      private long txId_ ;
      /**
       * <code>required uint64 txId = 1;</code>
       */
      public boolean hasTxId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required uint64 txId = 1;</code>
       */
      public long getTxId() {
        return txId_;
      }
      /**
       * <code>required uint64 txId = 1;</code>
       */
      public Builder setTxId(long value) {
        bitField0_ |= 0x00000001;
        txId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 txId = 1;</code>
       */
      public Builder clearTxId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        txId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetMostRecentCheckpointTxIdResponseProto)
    }

    static {
      defaultInstance = new GetMostRecentCheckpointTxIdResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetMostRecentCheckpointTxIdResponseProto)
  }

  public interface ErrorReportRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    boolean hasRegistration();
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration();
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder();

    // required uint32 errorCode = 2;
    /**
     * <code>required uint32 errorCode = 2;</code>
     *
     * <pre>
     * Error code
     * </pre>
     */
    boolean hasErrorCode();
    /**
     * <code>required uint32 errorCode = 2;</code>
     *
     * <pre>
     * Error code
     * </pre>
     */
    int getErrorCode();

    // required string msg = 3;
    /**
     * <code>required string msg = 3;</code>
     *
     * <pre>
     * Error message
     * </pre>
     */
    boolean hasMsg();
    /**
     * <code>required string msg = 3;</code>
     *
     * <pre>
     * Error message
     * </pre>
     */
    java.lang.String getMsg();
    /**
     * <code>required string msg = 3;</code>
     *
     * <pre>
     * Error message
     * </pre>
     */
    com.google.protobuf.ByteString
        getMsgBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ErrorReportRequestProto}
   *
   * <pre>
   **
   * registration - Namenode reporting the error
   * errorCode - error code indicating the error
   * msg - Free text description of the error
   * </pre>
   */
  public static final class ErrorReportRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements ErrorReportRequestProtoOrBuilder {
    // Use ErrorReportRequestProto.newBuilder() to construct.
    private ErrorReportRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ErrorReportRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ErrorReportRequestProto defaultInstance;
    public static ErrorReportRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public ErrorReportRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ErrorReportRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = registration_.toBuilder();
              }
              registration_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(registration_);
                registration_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              errorCode_ = input.readUInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              msg_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_ErrorReportRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_ErrorReportRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ErrorReportRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<ErrorReportRequestProto>() {
      public ErrorReportRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ErrorReportRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ErrorReportRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
    public static final int REGISTRATION_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto registration_;
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public boolean hasRegistration() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration() {
      return registration_;
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder() {
      return registration_;
    }

    // required uint32 errorCode = 2;
    public static final int ERRORCODE_FIELD_NUMBER = 2;
    private int errorCode_;
    /**
     * <code>required uint32 errorCode = 2;</code>
     *
     * <pre>
     * Error code
     * </pre>
     */
    public boolean hasErrorCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 errorCode = 2;</code>
     *
     * <pre>
     * Error code
     * </pre>
     */
    public int getErrorCode() {
      return errorCode_;
    }

    // required string msg = 3;
    public static final int MSG_FIELD_NUMBER = 3;
    private java.lang.Object msg_;
    /**
     * <code>required string msg = 3;</code>
     *
     * <pre>
     * Error message
     * </pre>
     */
    public boolean hasMsg() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string msg = 3;</code>
     *
     * <pre>
     * Error message
     * </pre>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          msg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string msg = 3;</code>
     *
     * <pre>
     * Error message
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
      errorCode_ = 0;
      msg_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasRegistration()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasErrorCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMsg()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getRegistration().isInitialized()) {
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
        output.writeMessage(1, registration_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, errorCode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMsgBytes());
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
          .computeMessageSize(1, registration_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, errorCode_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMsgBytes());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto) obj;

      boolean result = true;
      result = result && (hasRegistration() == other.hasRegistration());
      if (hasRegistration()) {
        result = result && getRegistration()
            .equals(other.getRegistration());
      }
      result = result && (hasErrorCode() == other.hasErrorCode());
      if (hasErrorCode()) {
        result = result && (getErrorCode()
            == other.getErrorCode());
      }
      result = result && (hasMsg() == other.hasMsg());
      if (hasMsg()) {
        result = result && getMsg()
            .equals(other.getMsg());
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
      if (hasRegistration()) {
        hash = (37 * hash) + REGISTRATION_FIELD_NUMBER;
        hash = (53 * hash) + getRegistration().hashCode();
      }
      if (hasErrorCode()) {
        hash = (37 * hash) + ERRORCODE_FIELD_NUMBER;
        hash = (53 * hash) + getErrorCode();
      }
      if (hasMsg()) {
        hash = (37 * hash) + MSG_FIELD_NUMBER;
        hash = (53 * hash) + getMsg().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ErrorReportRequestProto}
     *
     * <pre>
     **
     * registration - Namenode reporting the error
     * errorCode - error code indicating the error
     * msg - Free text description of the error
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_ErrorReportRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_ErrorReportRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto.newBuilder()
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
          getRegistrationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (registrationBuilder_ == null) {
          registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
        } else {
          registrationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        errorCode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        msg_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_ErrorReportRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (registrationBuilder_ == null) {
          result.registration_ = registration_;
        } else {
          result.registration_ = registrationBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.errorCode_ = errorCode_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.msg_ = msg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto.getDefaultInstance()) return this;
        if (other.hasRegistration()) {
          mergeRegistration(other.getRegistration());
        }
        if (other.hasErrorCode()) {
          setErrorCode(other.getErrorCode());
        }
        if (other.hasMsg()) {
          bitField0_ |= 0x00000004;
          msg_ = other.msg_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRegistration()) {
          
          return false;
        }
        if (!hasErrorCode()) {
          
          return false;
        }
        if (!hasMsg()) {
          
          return false;
        }
        if (!getRegistration().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder> registrationBuilder_;
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public boolean hasRegistration() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration() {
        if (registrationBuilder_ == null) {
          return registration_;
        } else {
          return registrationBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder setRegistration(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto value) {
        if (registrationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          registration_ = value;
          onChanged();
        } else {
          registrationBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder setRegistration(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder builderForValue) {
        if (registrationBuilder_ == null) {
          registration_ = builderForValue.build();
          onChanged();
        } else {
          registrationBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder mergeRegistration(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto value) {
        if (registrationBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              registration_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance()) {
            registration_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.newBuilder(registration_).mergeFrom(value).buildPartial();
          } else {
            registration_ = value;
          }
          onChanged();
        } else {
          registrationBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder clearRegistration() {
        if (registrationBuilder_ == null) {
          registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
          onChanged();
        } else {
          registrationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder getRegistrationBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRegistrationFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder() {
        if (registrationBuilder_ != null) {
          return registrationBuilder_.getMessageOrBuilder();
        } else {
          return registration_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder> 
          getRegistrationFieldBuilder() {
        if (registrationBuilder_ == null) {
          registrationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder>(
                  registration_,
                  getParentForChildren(),
                  isClean());
          registration_ = null;
        }
        return registrationBuilder_;
      }

      // required uint32 errorCode = 2;
      private int errorCode_ ;
      /**
       * <code>required uint32 errorCode = 2;</code>
       *
       * <pre>
       * Error code
       * </pre>
       */
      public boolean hasErrorCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint32 errorCode = 2;</code>
       *
       * <pre>
       * Error code
       * </pre>
       */
      public int getErrorCode() {
        return errorCode_;
      }
      /**
       * <code>required uint32 errorCode = 2;</code>
       *
       * <pre>
       * Error code
       * </pre>
       */
      public Builder setErrorCode(int value) {
        bitField0_ |= 0x00000002;
        errorCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 errorCode = 2;</code>
       *
       * <pre>
       * Error code
       * </pre>
       */
      public Builder clearErrorCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        errorCode_ = 0;
        onChanged();
        return this;
      }

      // required string msg = 3;
      private java.lang.Object msg_ = "";
      /**
       * <code>required string msg = 3;</code>
       *
       * <pre>
       * Error message
       * </pre>
       */
      public boolean hasMsg() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string msg = 3;</code>
       *
       * <pre>
       * Error message
       * </pre>
       */
      public java.lang.String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string msg = 3;</code>
       *
       * <pre>
       * Error message
       * </pre>
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        java.lang.Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string msg = 3;</code>
       *
       * <pre>
       * Error message
       * </pre>
       */
      public Builder setMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string msg = 3;</code>
       *
       * <pre>
       * Error message
       * </pre>
       */
      public Builder clearMsg() {
        bitField0_ = (bitField0_ & ~0x00000004);
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <code>required string msg = 3;</code>
       *
       * <pre>
       * Error message
       * </pre>
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        msg_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ErrorReportRequestProto)
    }

    static {
      defaultInstance = new ErrorReportRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ErrorReportRequestProto)
  }

  public interface ErrorReportResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ErrorReportResponseProto}
   *
   * <pre>
   **
   * void response
   * </pre>
   */
  public static final class ErrorReportResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements ErrorReportResponseProtoOrBuilder {
    // Use ErrorReportResponseProto.newBuilder() to construct.
    private ErrorReportResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ErrorReportResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ErrorReportResponseProto defaultInstance;
    public static ErrorReportResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public ErrorReportResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ErrorReportResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_ErrorReportResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_ErrorReportResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ErrorReportResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<ErrorReportResponseProto>() {
      public ErrorReportResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ErrorReportResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ErrorReportResponseProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ErrorReportResponseProto}
     *
     * <pre>
     **
     * void response
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_ErrorReportResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_ErrorReportResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_ErrorReportResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ErrorReportResponseProto)
    }

    static {
      defaultInstance = new ErrorReportResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ErrorReportResponseProto)
  }

  public interface RegisterRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    boolean hasRegistration();
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration();
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RegisterRequestProto}
   *
   * <pre>
   **
   * registration - Information of the namenode registering with primary namenode
   * </pre>
   */
  public static final class RegisterRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements RegisterRequestProtoOrBuilder {
    // Use RegisterRequestProto.newBuilder() to construct.
    private RegisterRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RegisterRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RegisterRequestProto defaultInstance;
    public static RegisterRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public RegisterRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RegisterRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = registration_.toBuilder();
              }
              registration_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(registration_);
                registration_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RegisterRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RegisterRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RegisterRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<RegisterRequestProto>() {
      public RegisterRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RegisterRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RegisterRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
    public static final int REGISTRATION_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto registration_;
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public boolean hasRegistration() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration() {
      return registration_;
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder() {
      return registration_;
    }

    private void initFields() {
      registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasRegistration()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getRegistration().isInitialized()) {
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
        output.writeMessage(1, registration_);
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
          .computeMessageSize(1, registration_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto) obj;

      boolean result = true;
      result = result && (hasRegistration() == other.hasRegistration());
      if (hasRegistration()) {
        result = result && getRegistration()
            .equals(other.getRegistration());
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
      if (hasRegistration()) {
        hash = (37 * hash) + REGISTRATION_FIELD_NUMBER;
        hash = (53 * hash) + getRegistration().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RegisterRequestProto}
     *
     * <pre>
     **
     * registration - Information of the namenode registering with primary namenode
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RegisterRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RegisterRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto.newBuilder()
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
          getRegistrationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (registrationBuilder_ == null) {
          registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
        } else {
          registrationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RegisterRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (registrationBuilder_ == null) {
          result.registration_ = registration_;
        } else {
          result.registration_ = registrationBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto.getDefaultInstance()) return this;
        if (other.hasRegistration()) {
          mergeRegistration(other.getRegistration());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRegistration()) {
          
          return false;
        }
        if (!getRegistration().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder> registrationBuilder_;
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public boolean hasRegistration() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration() {
        if (registrationBuilder_ == null) {
          return registration_;
        } else {
          return registrationBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder setRegistration(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto value) {
        if (registrationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          registration_ = value;
          onChanged();
        } else {
          registrationBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder setRegistration(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder builderForValue) {
        if (registrationBuilder_ == null) {
          registration_ = builderForValue.build();
          onChanged();
        } else {
          registrationBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder mergeRegistration(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto value) {
        if (registrationBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              registration_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance()) {
            registration_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.newBuilder(registration_).mergeFrom(value).buildPartial();
          } else {
            registration_ = value;
          }
          onChanged();
        } else {
          registrationBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder clearRegistration() {
        if (registrationBuilder_ == null) {
          registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
          onChanged();
        } else {
          registrationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder getRegistrationBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRegistrationFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder() {
        if (registrationBuilder_ != null) {
          return registrationBuilder_.getMessageOrBuilder();
        } else {
          return registration_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder> 
          getRegistrationFieldBuilder() {
        if (registrationBuilder_ == null) {
          registrationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder>(
                  registration_,
                  getParentForChildren(),
                  isClean());
          registration_ = null;
        }
        return registrationBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RegisterRequestProto)
    }

    static {
      defaultInstance = new RegisterRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RegisterRequestProto)
  }

  public interface RegisterResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    boolean hasRegistration();
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration();
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RegisterResponseProto}
   *
   * <pre>
   **
   * registration - Updated registration information of the newly registered
   *                datanode.
   * </pre>
   */
  public static final class RegisterResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements RegisterResponseProtoOrBuilder {
    // Use RegisterResponseProto.newBuilder() to construct.
    private RegisterResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RegisterResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RegisterResponseProto defaultInstance;
    public static RegisterResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public RegisterResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RegisterResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = registration_.toBuilder();
              }
              registration_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(registration_);
                registration_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RegisterResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RegisterResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RegisterResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<RegisterResponseProto>() {
      public RegisterResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RegisterResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RegisterResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
    public static final int REGISTRATION_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto registration_;
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public boolean hasRegistration() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration() {
      return registration_;
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder() {
      return registration_;
    }

    private void initFields() {
      registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasRegistration()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getRegistration().isInitialized()) {
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
        output.writeMessage(1, registration_);
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
          .computeMessageSize(1, registration_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto) obj;

      boolean result = true;
      result = result && (hasRegistration() == other.hasRegistration());
      if (hasRegistration()) {
        result = result && getRegistration()
            .equals(other.getRegistration());
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
      if (hasRegistration()) {
        hash = (37 * hash) + REGISTRATION_FIELD_NUMBER;
        hash = (53 * hash) + getRegistration().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RegisterResponseProto}
     *
     * <pre>
     **
     * registration - Updated registration information of the newly registered
     *                datanode.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RegisterResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RegisterResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.newBuilder()
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
          getRegistrationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (registrationBuilder_ == null) {
          registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
        } else {
          registrationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_RegisterResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (registrationBuilder_ == null) {
          result.registration_ = registration_;
        } else {
          result.registration_ = registrationBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.getDefaultInstance()) return this;
        if (other.hasRegistration()) {
          mergeRegistration(other.getRegistration());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRegistration()) {
          
          return false;
        }
        if (!getRegistration().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder> registrationBuilder_;
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public boolean hasRegistration() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration() {
        if (registrationBuilder_ == null) {
          return registration_;
        } else {
          return registrationBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder setRegistration(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto value) {
        if (registrationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          registration_ = value;
          onChanged();
        } else {
          registrationBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder setRegistration(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder builderForValue) {
        if (registrationBuilder_ == null) {
          registration_ = builderForValue.build();
          onChanged();
        } else {
          registrationBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder mergeRegistration(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto value) {
        if (registrationBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              registration_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance()) {
            registration_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.newBuilder(registration_).mergeFrom(value).buildPartial();
          } else {
            registration_ = value;
          }
          onChanged();
        } else {
          registrationBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder clearRegistration() {
        if (registrationBuilder_ == null) {
          registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
          onChanged();
        } else {
          registrationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder getRegistrationBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRegistrationFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder() {
        if (registrationBuilder_ != null) {
          return registrationBuilder_.getMessageOrBuilder();
        } else {
          return registration_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder> 
          getRegistrationFieldBuilder() {
        if (registrationBuilder_ == null) {
          registrationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder>(
                  registration_,
                  getParentForChildren(),
                  isClean());
          registration_ = null;
        }
        return registrationBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RegisterResponseProto)
    }

    static {
      defaultInstance = new RegisterResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RegisterResponseProto)
  }

  public interface StartCheckpointRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    boolean hasRegistration();
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration();
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.StartCheckpointRequestProto}
   *
   * <pre>
   **
   * Start checkpoint request
   * registration - Namenode that is starting the checkpoint
   * </pre>
   */
  public static final class StartCheckpointRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements StartCheckpointRequestProtoOrBuilder {
    // Use StartCheckpointRequestProto.newBuilder() to construct.
    private StartCheckpointRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StartCheckpointRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StartCheckpointRequestProto defaultInstance;
    public static StartCheckpointRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public StartCheckpointRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StartCheckpointRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = registration_.toBuilder();
              }
              registration_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(registration_);
                registration_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_StartCheckpointRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_StartCheckpointRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<StartCheckpointRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<StartCheckpointRequestProto>() {
      public StartCheckpointRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StartCheckpointRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StartCheckpointRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
    public static final int REGISTRATION_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto registration_;
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public boolean hasRegistration() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration() {
      return registration_;
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder() {
      return registration_;
    }

    private void initFields() {
      registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasRegistration()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getRegistration().isInitialized()) {
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
        output.writeMessage(1, registration_);
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
          .computeMessageSize(1, registration_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto) obj;

      boolean result = true;
      result = result && (hasRegistration() == other.hasRegistration());
      if (hasRegistration()) {
        result = result && getRegistration()
            .equals(other.getRegistration());
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
      if (hasRegistration()) {
        hash = (37 * hash) + REGISTRATION_FIELD_NUMBER;
        hash = (53 * hash) + getRegistration().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.StartCheckpointRequestProto}
     *
     * <pre>
     **
     * Start checkpoint request
     * registration - Namenode that is starting the checkpoint
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_StartCheckpointRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_StartCheckpointRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto.newBuilder()
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
          getRegistrationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (registrationBuilder_ == null) {
          registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
        } else {
          registrationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_StartCheckpointRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (registrationBuilder_ == null) {
          result.registration_ = registration_;
        } else {
          result.registration_ = registrationBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto.getDefaultInstance()) return this;
        if (other.hasRegistration()) {
          mergeRegistration(other.getRegistration());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRegistration()) {
          
          return false;
        }
        if (!getRegistration().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder> registrationBuilder_;
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public boolean hasRegistration() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration() {
        if (registrationBuilder_ == null) {
          return registration_;
        } else {
          return registrationBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder setRegistration(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto value) {
        if (registrationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          registration_ = value;
          onChanged();
        } else {
          registrationBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder setRegistration(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder builderForValue) {
        if (registrationBuilder_ == null) {
          registration_ = builderForValue.build();
          onChanged();
        } else {
          registrationBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder mergeRegistration(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto value) {
        if (registrationBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              registration_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance()) {
            registration_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.newBuilder(registration_).mergeFrom(value).buildPartial();
          } else {
            registration_ = value;
          }
          onChanged();
        } else {
          registrationBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder clearRegistration() {
        if (registrationBuilder_ == null) {
          registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
          onChanged();
        } else {
          registrationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder getRegistrationBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRegistrationFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder() {
        if (registrationBuilder_ != null) {
          return registrationBuilder_.getMessageOrBuilder();
        } else {
          return registration_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder> 
          getRegistrationFieldBuilder() {
        if (registrationBuilder_ == null) {
          registrationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder>(
                  registration_,
                  getParentForChildren(),
                  isClean());
          registration_ = null;
        }
        return registrationBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.StartCheckpointRequestProto)
    }

    static {
      defaultInstance = new StartCheckpointRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.StartCheckpointRequestProto)
  }

  public interface StartCheckpointResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.NamenodeCommandProto command = 1;
    /**
     * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
     */
    boolean hasCommand();
    /**
     * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto getCommand();
    /**
     * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProtoOrBuilder getCommandOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.StartCheckpointResponseProto}
   *
   * <pre>
   **
   * command - Command returned by the active namenode to be
   *           be handled by the caller.
   * </pre>
   */
  public static final class StartCheckpointResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements StartCheckpointResponseProtoOrBuilder {
    // Use StartCheckpointResponseProto.newBuilder() to construct.
    private StartCheckpointResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StartCheckpointResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StartCheckpointResponseProto defaultInstance;
    public static StartCheckpointResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public StartCheckpointResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StartCheckpointResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = command_.toBuilder();
              }
              command_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(command_);
                command_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_StartCheckpointResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_StartCheckpointResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<StartCheckpointResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<StartCheckpointResponseProto>() {
      public StartCheckpointResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StartCheckpointResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StartCheckpointResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.NamenodeCommandProto command = 1;
    public static final int COMMAND_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto command_;
    /**
     * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
     */
    public boolean hasCommand() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto getCommand() {
      return command_;
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProtoOrBuilder getCommandOrBuilder() {
      return command_;
    }

    private void initFields() {
      command_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasCommand()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getCommand().isInitialized()) {
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
        output.writeMessage(1, command_);
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
          .computeMessageSize(1, command_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto) obj;

      boolean result = true;
      result = result && (hasCommand() == other.hasCommand());
      if (hasCommand()) {
        result = result && getCommand()
            .equals(other.getCommand());
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
      if (hasCommand()) {
        hash = (37 * hash) + COMMAND_FIELD_NUMBER;
        hash = (53 * hash) + getCommand().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.StartCheckpointResponseProto}
     *
     * <pre>
     **
     * command - Command returned by the active namenode to be
     *           be handled by the caller.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_StartCheckpointResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_StartCheckpointResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.newBuilder()
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
          getCommandFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (commandBuilder_ == null) {
          command_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.getDefaultInstance();
        } else {
          commandBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_StartCheckpointResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (commandBuilder_ == null) {
          result.command_ = command_;
        } else {
          result.command_ = commandBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.getDefaultInstance()) return this;
        if (other.hasCommand()) {
          mergeCommand(other.getCommand());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasCommand()) {
          
          return false;
        }
        if (!getCommand().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.NamenodeCommandProto command = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto command_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProtoOrBuilder> commandBuilder_;
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
       */
      public boolean hasCommand() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto getCommand() {
        if (commandBuilder_ == null) {
          return command_;
        } else {
          return commandBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
       */
      public Builder setCommand(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto value) {
        if (commandBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          command_ = value;
          onChanged();
        } else {
          commandBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
       */
      public Builder setCommand(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.Builder builderForValue) {
        if (commandBuilder_ == null) {
          command_ = builderForValue.build();
          onChanged();
        } else {
          commandBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
       */
      public Builder mergeCommand(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto value) {
        if (commandBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              command_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.getDefaultInstance()) {
            command_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.newBuilder(command_).mergeFrom(value).buildPartial();
          } else {
            command_ = value;
          }
          onChanged();
        } else {
          commandBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
       */
      public Builder clearCommand() {
        if (commandBuilder_ == null) {
          command_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.getDefaultInstance();
          onChanged();
        } else {
          commandBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.Builder getCommandBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCommandFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProtoOrBuilder getCommandOrBuilder() {
        if (commandBuilder_ != null) {
          return commandBuilder_.getMessageOrBuilder();
        } else {
          return command_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeCommandProto command = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProtoOrBuilder> 
          getCommandFieldBuilder() {
        if (commandBuilder_ == null) {
          commandBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeCommandProtoOrBuilder>(
                  command_,
                  getParentForChildren(),
                  isClean());
          command_ = null;
        }
        return commandBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.StartCheckpointResponseProto)
    }

    static {
      defaultInstance = new StartCheckpointResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.StartCheckpointResponseProto)
  }

  public interface EndCheckpointRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    boolean hasRegistration();
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration();
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder();

    // required .hadoop.hdfs.CheckpointSignatureProto signature = 2;
    /**
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
     */
    boolean hasSignature();
    /**
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto getSignature();
    /**
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProtoOrBuilder getSignatureOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.EndCheckpointRequestProto}
   *
   * <pre>
   **
   * End or finalize the previously started checkpoint
   * registration - Namenode that is ending the checkpoint
   * signature - unique token to identify checkpoint transaction,
   *             that was received when checkpoint was started.
   * </pre>
   */
  public static final class EndCheckpointRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements EndCheckpointRequestProtoOrBuilder {
    // Use EndCheckpointRequestProto.newBuilder() to construct.
    private EndCheckpointRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private EndCheckpointRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final EndCheckpointRequestProto defaultInstance;
    public static EndCheckpointRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public EndCheckpointRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private EndCheckpointRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = registration_.toBuilder();
              }
              registration_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(registration_);
                registration_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = signature_.toBuilder();
              }
              signature_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(signature_);
                signature_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_EndCheckpointRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_EndCheckpointRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<EndCheckpointRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<EndCheckpointRequestProto>() {
      public EndCheckpointRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EndCheckpointRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<EndCheckpointRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
    public static final int REGISTRATION_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto registration_;
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public boolean hasRegistration() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration() {
      return registration_;
    }
    /**
     * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
     *
     * <pre>
     * Registration info
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder() {
      return registration_;
    }

    // required .hadoop.hdfs.CheckpointSignatureProto signature = 2;
    public static final int SIGNATURE_FIELD_NUMBER = 2;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto signature_;
    /**
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
     */
    public boolean hasSignature() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto getSignature() {
      return signature_;
    }
    /**
     * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProtoOrBuilder getSignatureOrBuilder() {
      return signature_;
    }

    private void initFields() {
      registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
      signature_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasRegistration()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSignature()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getRegistration().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSignature().isInitialized()) {
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
        output.writeMessage(1, registration_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, signature_);
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
          .computeMessageSize(1, registration_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, signature_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto) obj;

      boolean result = true;
      result = result && (hasRegistration() == other.hasRegistration());
      if (hasRegistration()) {
        result = result && getRegistration()
            .equals(other.getRegistration());
      }
      result = result && (hasSignature() == other.hasSignature());
      if (hasSignature()) {
        result = result && getSignature()
            .equals(other.getSignature());
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
      if (hasRegistration()) {
        hash = (37 * hash) + REGISTRATION_FIELD_NUMBER;
        hash = (53 * hash) + getRegistration().hashCode();
      }
      if (hasSignature()) {
        hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
        hash = (53 * hash) + getSignature().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.EndCheckpointRequestProto}
     *
     * <pre>
     **
     * End or finalize the previously started checkpoint
     * registration - Namenode that is ending the checkpoint
     * signature - unique token to identify checkpoint transaction,
     *             that was received when checkpoint was started.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_EndCheckpointRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_EndCheckpointRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto.newBuilder()
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
          getRegistrationFieldBuilder();
          getSignatureFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (registrationBuilder_ == null) {
          registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
        } else {
          registrationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (signatureBuilder_ == null) {
          signature_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.getDefaultInstance();
        } else {
          signatureBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_EndCheckpointRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (registrationBuilder_ == null) {
          result.registration_ = registration_;
        } else {
          result.registration_ = registrationBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (signatureBuilder_ == null) {
          result.signature_ = signature_;
        } else {
          result.signature_ = signatureBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto.getDefaultInstance()) return this;
        if (other.hasRegistration()) {
          mergeRegistration(other.getRegistration());
        }
        if (other.hasSignature()) {
          mergeSignature(other.getSignature());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRegistration()) {
          
          return false;
        }
        if (!hasSignature()) {
          
          return false;
        }
        if (!getRegistration().isInitialized()) {
          
          return false;
        }
        if (!getSignature().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder> registrationBuilder_;
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public boolean hasRegistration() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto getRegistration() {
        if (registrationBuilder_ == null) {
          return registration_;
        } else {
          return registrationBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder setRegistration(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto value) {
        if (registrationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          registration_ = value;
          onChanged();
        } else {
          registrationBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder setRegistration(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder builderForValue) {
        if (registrationBuilder_ == null) {
          registration_ = builderForValue.build();
          onChanged();
        } else {
          registrationBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder mergeRegistration(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto value) {
        if (registrationBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              registration_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance()) {
            registration_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.newBuilder(registration_).mergeFrom(value).buildPartial();
          } else {
            registration_ = value;
          }
          onChanged();
        } else {
          registrationBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public Builder clearRegistration() {
        if (registrationBuilder_ == null) {
          registration_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.getDefaultInstance();
          onChanged();
        } else {
          registrationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder getRegistrationBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getRegistrationFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder getRegistrationOrBuilder() {
        if (registrationBuilder_ != null) {
          return registrationBuilder_.getMessageOrBuilder();
        } else {
          return registration_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.NamenodeRegistrationProto registration = 1;</code>
       *
       * <pre>
       * Registration info
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder> 
          getRegistrationFieldBuilder() {
        if (registrationBuilder_ == null) {
          registrationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.NamenodeRegistrationProtoOrBuilder>(
                  registration_,
                  getParentForChildren(),
                  isClean());
          registration_ = null;
        }
        return registrationBuilder_;
      }

      // required .hadoop.hdfs.CheckpointSignatureProto signature = 2;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto signature_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProtoOrBuilder> signatureBuilder_;
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
       */
      public boolean hasSignature() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto getSignature() {
        if (signatureBuilder_ == null) {
          return signature_;
        } else {
          return signatureBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
       */
      public Builder setSignature(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto value) {
        if (signatureBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          signature_ = value;
          onChanged();
        } else {
          signatureBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
       */
      public Builder setSignature(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.Builder builderForValue) {
        if (signatureBuilder_ == null) {
          signature_ = builderForValue.build();
          onChanged();
        } else {
          signatureBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
       */
      public Builder mergeSignature(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto value) {
        if (signatureBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              signature_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.getDefaultInstance()) {
            signature_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.newBuilder(signature_).mergeFrom(value).buildPartial();
          } else {
            signature_ = value;
          }
          onChanged();
        } else {
          signatureBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
       */
      public Builder clearSignature() {
        if (signatureBuilder_ == null) {
          signature_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.getDefaultInstance();
          onChanged();
        } else {
          signatureBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.Builder getSignatureBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSignatureFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProtoOrBuilder getSignatureOrBuilder() {
        if (signatureBuilder_ != null) {
          return signatureBuilder_.getMessageOrBuilder();
        } else {
          return signature_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.CheckpointSignatureProto signature = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProtoOrBuilder> 
          getSignatureFieldBuilder() {
        if (signatureBuilder_ == null) {
          signatureBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.CheckpointSignatureProtoOrBuilder>(
                  signature_,
                  getParentForChildren(),
                  isClean());
          signature_ = null;
        }
        return signatureBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.EndCheckpointRequestProto)
    }

    static {
      defaultInstance = new EndCheckpointRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.EndCheckpointRequestProto)
  }

  public interface EndCheckpointResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.EndCheckpointResponseProto}
   *
   * <pre>
   **
   * void response
   * </pre>
   */
  public static final class EndCheckpointResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements EndCheckpointResponseProtoOrBuilder {
    // Use EndCheckpointResponseProto.newBuilder() to construct.
    private EndCheckpointResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private EndCheckpointResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final EndCheckpointResponseProto defaultInstance;
    public static EndCheckpointResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public EndCheckpointResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private EndCheckpointResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_EndCheckpointResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_EndCheckpointResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<EndCheckpointResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<EndCheckpointResponseProto>() {
      public EndCheckpointResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EndCheckpointResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<EndCheckpointResponseProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.EndCheckpointResponseProto}
     *
     * <pre>
     **
     * void response
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_EndCheckpointResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_EndCheckpointResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_EndCheckpointResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.EndCheckpointResponseProto)
    }

    static {
      defaultInstance = new EndCheckpointResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.EndCheckpointResponseProto)
  }

  public interface GetEditLogManifestRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required uint64 sinceTxId = 1;
    /**
     * <code>required uint64 sinceTxId = 1;</code>
     *
     * <pre>
     * Transaction ID
     * </pre>
     */
    boolean hasSinceTxId();
    /**
     * <code>required uint64 sinceTxId = 1;</code>
     *
     * <pre>
     * Transaction ID
     * </pre>
     */
    long getSinceTxId();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetEditLogManifestRequestProto}
   *
   * <pre>
   **
   * sinceTxId - return the editlog information for transactions &gt;= sinceTxId
   * </pre>
   */
  public static final class GetEditLogManifestRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements GetEditLogManifestRequestProtoOrBuilder {
    // Use GetEditLogManifestRequestProto.newBuilder() to construct.
    private GetEditLogManifestRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetEditLogManifestRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetEditLogManifestRequestProto defaultInstance;
    public static GetEditLogManifestRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetEditLogManifestRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetEditLogManifestRequestProto(
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
              sinceTxId_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetEditLogManifestRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetEditLogManifestRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetEditLogManifestRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<GetEditLogManifestRequestProto>() {
      public GetEditLogManifestRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetEditLogManifestRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetEditLogManifestRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required uint64 sinceTxId = 1;
    public static final int SINCETXID_FIELD_NUMBER = 1;
    private long sinceTxId_;
    /**
     * <code>required uint64 sinceTxId = 1;</code>
     *
     * <pre>
     * Transaction ID
     * </pre>
     */
    public boolean hasSinceTxId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint64 sinceTxId = 1;</code>
     *
     * <pre>
     * Transaction ID
     * </pre>
     */
    public long getSinceTxId() {
      return sinceTxId_;
    }

    private void initFields() {
      sinceTxId_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSinceTxId()) {
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
        output.writeUInt64(1, sinceTxId_);
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
          .computeUInt64Size(1, sinceTxId_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto) obj;

      boolean result = true;
      result = result && (hasSinceTxId() == other.hasSinceTxId());
      if (hasSinceTxId()) {
        result = result && (getSinceTxId()
            == other.getSinceTxId());
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
      if (hasSinceTxId()) {
        hash = (37 * hash) + SINCETXID_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getSinceTxId());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetEditLogManifestRequestProto}
     *
     * <pre>
     **
     * sinceTxId - return the editlog information for transactions &gt;= sinceTxId
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetEditLogManifestRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetEditLogManifestRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto.newBuilder()
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
        sinceTxId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetEditLogManifestRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sinceTxId_ = sinceTxId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto.getDefaultInstance()) return this;
        if (other.hasSinceTxId()) {
          setSinceTxId(other.getSinceTxId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSinceTxId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required uint64 sinceTxId = 1;
      private long sinceTxId_ ;
      /**
       * <code>required uint64 sinceTxId = 1;</code>
       *
       * <pre>
       * Transaction ID
       * </pre>
       */
      public boolean hasSinceTxId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required uint64 sinceTxId = 1;</code>
       *
       * <pre>
       * Transaction ID
       * </pre>
       */
      public long getSinceTxId() {
        return sinceTxId_;
      }
      /**
       * <code>required uint64 sinceTxId = 1;</code>
       *
       * <pre>
       * Transaction ID
       * </pre>
       */
      public Builder setSinceTxId(long value) {
        bitField0_ |= 0x00000001;
        sinceTxId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 sinceTxId = 1;</code>
       *
       * <pre>
       * Transaction ID
       * </pre>
       */
      public Builder clearSinceTxId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sinceTxId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetEditLogManifestRequestProto)
    }

    static {
      defaultInstance = new GetEditLogManifestRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetEditLogManifestRequestProto)
  }

  public interface GetEditLogManifestResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;
    /**
     * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
     */
    boolean hasManifest();
    /**
     * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto getManifest();
    /**
     * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProtoOrBuilder getManifestOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetEditLogManifestResponseProto}
   *
   * <pre>
   **
   * manifest - Enumeration of editlogs from namenode for 
   *            logs &gt;= sinceTxId in the request
   * </pre>
   */
  public static final class GetEditLogManifestResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements GetEditLogManifestResponseProtoOrBuilder {
    // Use GetEditLogManifestResponseProto.newBuilder() to construct.
    private GetEditLogManifestResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetEditLogManifestResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetEditLogManifestResponseProto defaultInstance;
    public static GetEditLogManifestResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetEditLogManifestResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetEditLogManifestResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = manifest_.toBuilder();
              }
              manifest_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(manifest_);
                manifest_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetEditLogManifestResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetEditLogManifestResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetEditLogManifestResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<GetEditLogManifestResponseProto>() {
      public GetEditLogManifestResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetEditLogManifestResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetEditLogManifestResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;
    public static final int MANIFEST_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto manifest_;
    /**
     * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
     */
    public boolean hasManifest() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto getManifest() {
      return manifest_;
    }
    /**
     * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProtoOrBuilder getManifestOrBuilder() {
      return manifest_;
    }

    private void initFields() {
      manifest_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasManifest()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getManifest().isInitialized()) {
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
        output.writeMessage(1, manifest_);
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
          .computeMessageSize(1, manifest_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto) obj;

      boolean result = true;
      result = result && (hasManifest() == other.hasManifest());
      if (hasManifest()) {
        result = result && getManifest()
            .equals(other.getManifest());
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
      if (hasManifest()) {
        hash = (37 * hash) + MANIFEST_FIELD_NUMBER;
        hash = (53 * hash) + getManifest().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetEditLogManifestResponseProto}
     *
     * <pre>
     **
     * manifest - Enumeration of editlogs from namenode for 
     *            logs &gt;= sinceTxId in the request
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetEditLogManifestResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetEditLogManifestResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.newBuilder()
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
          getManifestFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (manifestBuilder_ == null) {
          manifest_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.getDefaultInstance();
        } else {
          manifestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.internal_static_hadoop_hdfs_GetEditLogManifestResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (manifestBuilder_ == null) {
          result.manifest_ = manifest_;
        } else {
          result.manifest_ = manifestBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.getDefaultInstance()) return this;
        if (other.hasManifest()) {
          mergeManifest(other.getManifest());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasManifest()) {
          
          return false;
        }
        if (!getManifest().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto manifest_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProtoOrBuilder> manifestBuilder_;
      /**
       * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
       */
      public boolean hasManifest() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto getManifest() {
        if (manifestBuilder_ == null) {
          return manifest_;
        } else {
          return manifestBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
       */
      public Builder setManifest(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto value) {
        if (manifestBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          manifest_ = value;
          onChanged();
        } else {
          manifestBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
       */
      public Builder setManifest(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.Builder builderForValue) {
        if (manifestBuilder_ == null) {
          manifest_ = builderForValue.build();
          onChanged();
        } else {
          manifestBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
       */
      public Builder mergeManifest(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto value) {
        if (manifestBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              manifest_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.getDefaultInstance()) {
            manifest_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.newBuilder(manifest_).mergeFrom(value).buildPartial();
          } else {
            manifest_ = value;
          }
          onChanged();
        } else {
          manifestBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
       */
      public Builder clearManifest() {
        if (manifestBuilder_ == null) {
          manifest_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.getDefaultInstance();
          onChanged();
        } else {
          manifestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.Builder getManifestBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getManifestFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProtoOrBuilder getManifestOrBuilder() {
        if (manifestBuilder_ != null) {
          return manifestBuilder_.getMessageOrBuilder();
        } else {
          return manifest_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.RemoteEditLogManifestProto manifest = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProtoOrBuilder> 
          getManifestFieldBuilder() {
        if (manifestBuilder_ == null) {
          manifestBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.RemoteEditLogManifestProtoOrBuilder>(
                  manifest_,
                  getParentForChildren(),
                  isClean());
          manifest_ = null;
        }
        return manifestBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetEditLogManifestResponseProto)
    }

    static {
      defaultInstance = new GetEditLogManifestResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetEditLogManifestResponseProto)
  }

  /**
   * Protobuf service {@code hadoop.hdfs.NamenodeProtocolService}
   *
   * <pre>
   **
   * Protocol used by the sub-ordinate namenode to send requests
   * the active/primary namenode.
   *
   * See the request and response for details of rpc call.
   * </pre>
   */
  public static abstract class NamenodeProtocolService
      implements com.google.protobuf.Service {
    protected NamenodeProtocolService() {}

    public interface Interface {
      /**
       * <code>rpc getBlocks(.hadoop.hdfs.GetBlocksRequestProto) returns (.hadoop.hdfs.GetBlocksResponseProto);</code>
       *
       * <pre>
       **
       * Get list of blocks for a given datanode with length
       * of blocks adding up to given size.
       * </pre>
       */
      public abstract void getBlocks(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto> done);

      /**
       * <code>rpc getBlockKeys(.hadoop.hdfs.GetBlockKeysRequestProto) returns (.hadoop.hdfs.GetBlockKeysResponseProto);</code>
       *
       * <pre>
       **
       * Get the current block keys
       * </pre>
       */
      public abstract void getBlockKeys(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto> done);

      /**
       * <code>rpc getTransactionId(.hadoop.hdfs.GetTransactionIdRequestProto) returns (.hadoop.hdfs.GetTransactionIdResponseProto);</code>
       *
       * <pre>
       **
       * Get the transaction ID of the most recently persisted editlog record
       * </pre>
       */
      public abstract void getTransactionId(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto> done);

      /**
       * <code>rpc getMostRecentCheckpointTxId(.hadoop.hdfs.GetMostRecentCheckpointTxIdRequestProto) returns (.hadoop.hdfs.GetMostRecentCheckpointTxIdResponseProto);</code>
       *
       * <pre>
       **
       * Get the transaction ID of the most recently persisted editlog record
       * </pre>
       */
      public abstract void getMostRecentCheckpointTxId(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto> done);

      /**
       * <code>rpc rollEditLog(.hadoop.hdfs.RollEditLogRequestProto) returns (.hadoop.hdfs.RollEditLogResponseProto);</code>
       *
       * <pre>
       **
       * Close the current editlog and open a new one for checkpointing purposes
       * </pre>
       */
      public abstract void rollEditLog(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto> done);

      /**
       * <code>rpc versionRequest(.hadoop.hdfs.VersionRequestProto) returns (.hadoop.hdfs.VersionResponseProto);</code>
       *
       * <pre>
       **
       * Request info about the version running on this NameNode
       * </pre>
       */
      public abstract void versionRequest(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto> done);

      /**
       * <code>rpc errorReport(.hadoop.hdfs.ErrorReportRequestProto) returns (.hadoop.hdfs.ErrorReportResponseProto);</code>
       *
       * <pre>
       **
       * Report from a sub-ordinate namenode of an error to the active namenode.
       * Active namenode may decide to unregister the reporting namenode 
       * depending on the error.
       * </pre>
       */
      public abstract void errorReport(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto> done);

      /**
       * <code>rpc registerSubordinateNamenode(.hadoop.hdfs.RegisterRequestProto) returns (.hadoop.hdfs.RegisterResponseProto);</code>
       *
       * <pre>
       **
       * Request to register a sub-ordinate namenode
       * </pre>
       */
      public abstract void registerSubordinateNamenode(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto> done);

      /**
       * <code>rpc startCheckpoint(.hadoop.hdfs.StartCheckpointRequestProto) returns (.hadoop.hdfs.StartCheckpointResponseProto);</code>
       *
       * <pre>
       **
       * Request to start a checkpoint. 
       * </pre>
       */
      public abstract void startCheckpoint(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto> done);

      /**
       * <code>rpc endCheckpoint(.hadoop.hdfs.EndCheckpointRequestProto) returns (.hadoop.hdfs.EndCheckpointResponseProto);</code>
       *
       * <pre>
       **
       * End of finalize the previously started checkpoint
       * </pre>
       */
      public abstract void endCheckpoint(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto> done);

      /**
       * <code>rpc getEditLogManifest(.hadoop.hdfs.GetEditLogManifestRequestProto) returns (.hadoop.hdfs.GetEditLogManifestResponseProto);</code>
       *
       * <pre>
       **
       * Get editlog manifests from the active namenode for all the editlogs
       * </pre>
       */
      public abstract void getEditLogManifest(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new NamenodeProtocolService() {
        @java.lang.Override
        public  void getBlocks(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto> done) {
          impl.getBlocks(controller, request, done);
        }

        @java.lang.Override
        public  void getBlockKeys(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto> done) {
          impl.getBlockKeys(controller, request, done);
        }

        @java.lang.Override
        public  void getTransactionId(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto> done) {
          impl.getTransactionId(controller, request, done);
        }

        @java.lang.Override
        public  void getMostRecentCheckpointTxId(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto> done) {
          impl.getMostRecentCheckpointTxId(controller, request, done);
        }

        @java.lang.Override
        public  void rollEditLog(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto> done) {
          impl.rollEditLog(controller, request, done);
        }

        @java.lang.Override
        public  void versionRequest(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto> done) {
          impl.versionRequest(controller, request, done);
        }

        @java.lang.Override
        public  void errorReport(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto> done) {
          impl.errorReport(controller, request, done);
        }

        @java.lang.Override
        public  void registerSubordinateNamenode(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto> done) {
          impl.registerSubordinateNamenode(controller, request, done);
        }

        @java.lang.Override
        public  void startCheckpoint(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto> done) {
          impl.startCheckpoint(controller, request, done);
        }

        @java.lang.Override
        public  void endCheckpoint(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto> done) {
          impl.endCheckpoint(controller, request, done);
        }

        @java.lang.Override
        public  void getEditLogManifest(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto> done) {
          impl.getEditLogManifest(controller, request, done);
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
              return impl.getBlocks(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto)request);
            case 1:
              return impl.getBlockKeys(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto)request);
            case 2:
              return impl.getTransactionId(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto)request);
            case 3:
              return impl.getMostRecentCheckpointTxId(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto)request);
            case 4:
              return impl.rollEditLog(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto)request);
            case 5:
              return impl.versionRequest(controller, (org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionRequestProto)request);
            case 6:
              return impl.errorReport(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto)request);
            case 7:
              return impl.registerSubordinateNamenode(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto)request);
            case 8:
              return impl.startCheckpoint(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto)request);
            case 9:
              return impl.endCheckpoint(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto)request);
            case 10:
              return impl.getEditLogManifest(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto)request);
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
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto.getDefaultInstance();
            case 3:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto.getDefaultInstance();
            case 4:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto.getDefaultInstance();
            case 5:
              return org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionRequestProto.getDefaultInstance();
            case 6:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto.getDefaultInstance();
            case 7:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto.getDefaultInstance();
            case 8:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto.getDefaultInstance();
            case 9:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto.getDefaultInstance();
            case 10:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto.getDefaultInstance();
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
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.getDefaultInstance();
            case 3:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.getDefaultInstance();
            case 4:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.getDefaultInstance();
            case 5:
              return org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto.getDefaultInstance();
            case 6:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.getDefaultInstance();
            case 7:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.getDefaultInstance();
            case 8:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.getDefaultInstance();
            case 9:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.getDefaultInstance();
            case 10:
              return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc getBlocks(.hadoop.hdfs.GetBlocksRequestProto) returns (.hadoop.hdfs.GetBlocksResponseProto);</code>
     *
     * <pre>
     **
     * Get list of blocks for a given datanode with length
     * of blocks adding up to given size.
     * </pre>
     */
    public abstract void getBlocks(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto> done);

    /**
     * <code>rpc getBlockKeys(.hadoop.hdfs.GetBlockKeysRequestProto) returns (.hadoop.hdfs.GetBlockKeysResponseProto);</code>
     *
     * <pre>
     **
     * Get the current block keys
     * </pre>
     */
    public abstract void getBlockKeys(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto> done);

    /**
     * <code>rpc getTransactionId(.hadoop.hdfs.GetTransactionIdRequestProto) returns (.hadoop.hdfs.GetTransactionIdResponseProto);</code>
     *
     * <pre>
     **
     * Get the transaction ID of the most recently persisted editlog record
     * </pre>
     */
    public abstract void getTransactionId(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto> done);

    /**
     * <code>rpc getMostRecentCheckpointTxId(.hadoop.hdfs.GetMostRecentCheckpointTxIdRequestProto) returns (.hadoop.hdfs.GetMostRecentCheckpointTxIdResponseProto);</code>
     *
     * <pre>
     **
     * Get the transaction ID of the most recently persisted editlog record
     * </pre>
     */
    public abstract void getMostRecentCheckpointTxId(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto> done);

    /**
     * <code>rpc rollEditLog(.hadoop.hdfs.RollEditLogRequestProto) returns (.hadoop.hdfs.RollEditLogResponseProto);</code>
     *
     * <pre>
     **
     * Close the current editlog and open a new one for checkpointing purposes
     * </pre>
     */
    public abstract void rollEditLog(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto> done);

    /**
     * <code>rpc versionRequest(.hadoop.hdfs.VersionRequestProto) returns (.hadoop.hdfs.VersionResponseProto);</code>
     *
     * <pre>
     **
     * Request info about the version running on this NameNode
     * </pre>
     */
    public abstract void versionRequest(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto> done);

    /**
     * <code>rpc errorReport(.hadoop.hdfs.ErrorReportRequestProto) returns (.hadoop.hdfs.ErrorReportResponseProto);</code>
     *
     * <pre>
     **
     * Report from a sub-ordinate namenode of an error to the active namenode.
     * Active namenode may decide to unregister the reporting namenode 
     * depending on the error.
     * </pre>
     */
    public abstract void errorReport(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto> done);

    /**
     * <code>rpc registerSubordinateNamenode(.hadoop.hdfs.RegisterRequestProto) returns (.hadoop.hdfs.RegisterResponseProto);</code>
     *
     * <pre>
     **
     * Request to register a sub-ordinate namenode
     * </pre>
     */
    public abstract void registerSubordinateNamenode(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto> done);

    /**
     * <code>rpc startCheckpoint(.hadoop.hdfs.StartCheckpointRequestProto) returns (.hadoop.hdfs.StartCheckpointResponseProto);</code>
     *
     * <pre>
     **
     * Request to start a checkpoint. 
     * </pre>
     */
    public abstract void startCheckpoint(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto> done);

    /**
     * <code>rpc endCheckpoint(.hadoop.hdfs.EndCheckpointRequestProto) returns (.hadoop.hdfs.EndCheckpointResponseProto);</code>
     *
     * <pre>
     **
     * End of finalize the previously started checkpoint
     * </pre>
     */
    public abstract void endCheckpoint(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto> done);

    /**
     * <code>rpc getEditLogManifest(.hadoop.hdfs.GetEditLogManifestRequestProto) returns (.hadoop.hdfs.GetEditLogManifestResponseProto);</code>
     *
     * <pre>
     **
     * Get editlog manifests from the active namenode for all the editlogs
     * </pre>
     */
    public abstract void getEditLogManifest(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.getDescriptor().getServices().get(0);
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
          this.getBlocks(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.getBlockKeys(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto>specializeCallback(
              done));
          return;
        case 2:
          this.getTransactionId(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto>specializeCallback(
              done));
          return;
        case 3:
          this.getMostRecentCheckpointTxId(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto>specializeCallback(
              done));
          return;
        case 4:
          this.rollEditLog(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto>specializeCallback(
              done));
          return;
        case 5:
          this.versionRequest(controller, (org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto>specializeCallback(
              done));
          return;
        case 6:
          this.errorReport(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto>specializeCallback(
              done));
          return;
        case 7:
          this.registerSubordinateNamenode(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto>specializeCallback(
              done));
          return;
        case 8:
          this.startCheckpoint(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto>specializeCallback(
              done));
          return;
        case 9:
          this.endCheckpoint(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto>specializeCallback(
              done));
          return;
        case 10:
          this.getEditLogManifest(controller, (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto>specializeCallback(
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
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto.getDefaultInstance();
        case 3:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto.getDefaultInstance();
        case 4:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto.getDefaultInstance();
        case 5:
          return org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionRequestProto.getDefaultInstance();
        case 6:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto.getDefaultInstance();
        case 7:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto.getDefaultInstance();
        case 8:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto.getDefaultInstance();
        case 9:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto.getDefaultInstance();
        case 10:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto.getDefaultInstance();
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
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.getDefaultInstance();
        case 3:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.getDefaultInstance();
        case 4:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.getDefaultInstance();
        case 5:
          return org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto.getDefaultInstance();
        case 6:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.getDefaultInstance();
        case 7:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.getDefaultInstance();
        case 8:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.getDefaultInstance();
        case 9:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.getDefaultInstance();
        case 10:
          return org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.NamenodeProtocolService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void getBlocks(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.getDefaultInstance()));
      }

      public  void getBlockKeys(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.getDefaultInstance()));
      }

      public  void getTransactionId(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.getDefaultInstance()));
      }

      public  void getMostRecentCheckpointTxId(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.getDefaultInstance()));
      }

      public  void rollEditLog(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.getDefaultInstance()));
      }

      public  void versionRequest(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(5),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto.getDefaultInstance()));
      }

      public  void errorReport(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(6),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.getDefaultInstance()));
      }

      public  void registerSubordinateNamenode(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(7),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.getDefaultInstance()));
      }

      public  void startCheckpoint(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(8),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.getDefaultInstance()));
      }

      public  void endCheckpoint(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(9),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.getDefaultInstance()));
      }

      public  void getEditLogManifest(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(10),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto getBlocks(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto getBlockKeys(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto getTransactionId(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto getMostRecentCheckpointTxId(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto rollEditLog(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto versionRequest(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto errorReport(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto registerSubordinateNamenode(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto startCheckpoint(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto endCheckpoint(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto getEditLogManifest(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto getBlocks(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlocksResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto getBlockKeys(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetBlockKeysResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto getTransactionId(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetTransactionIdResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto getMostRecentCheckpointTxId(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(3),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetMostRecentCheckpointTxIdResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto rollEditLog(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(4),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RollEditLogResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto versionRequest(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(5),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.VersionResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto errorReport(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(6),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.ErrorReportResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto registerSubordinateNamenode(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(7),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.RegisterResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto startCheckpoint(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(8),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.StartCheckpointResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto endCheckpoint(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(9),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.EndCheckpointResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto getEditLogManifest(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(10),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.NamenodeProtocolProtos.GetEditLogManifestResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.NamenodeProtocolService)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetBlocksRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetBlocksRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetBlocksResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetBlocksResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetBlockKeysRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetBlockKeysRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetBlockKeysResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetBlockKeysResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetTransactionIdRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetTransactionIdRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetTransactionIdResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetTransactionIdResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RollEditLogRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_RollEditLogRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RollEditLogResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_RollEditLogResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ErrorReportRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ErrorReportRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ErrorReportResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ErrorReportResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RegisterRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_RegisterRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RegisterResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_RegisterResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_StartCheckpointRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_StartCheckpointRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_StartCheckpointResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_StartCheckpointResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_EndCheckpointRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_EndCheckpointRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_EndCheckpointResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_EndCheckpointResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetEditLogManifestRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetEditLogManifestRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetEditLogManifestResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetEditLogManifestResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026NamenodeProtocol.proto\022\013hadoop.hdfs\032\nh" +
      "dfs.proto\"U\n\025GetBlocksRequestProto\022.\n\010da" +
      "tanode\030\001 \002(\0132\034.hadoop.hdfs.DatanodeIDPro" +
      "to\022\014\n\004size\030\002 \002(\004\"O\n\026GetBlocksResponsePro" +
      "to\0225\n\006blocks\030\001 \002(\0132%.hadoop.hdfs.BlocksW" +
      "ithLocationsProto\"\032\n\030GetBlockKeysRequest" +
      "Proto\"N\n\031GetBlockKeysResponseProto\0221\n\004ke" +
      "ys\030\001 \001(\0132#.hadoop.hdfs.ExportedBlockKeys" +
      "Proto\"\036\n\034GetTransactionIdRequestProto\"-\n" +
      "\035GetTransactionIdResponseProto\022\014\n\004txId\030\001",
      " \002(\004\"\031\n\027RollEditLogRequestProto\"T\n\030RollE" +
      "ditLogResponseProto\0228\n\tsignature\030\001 \002(\0132%" +
      ".hadoop.hdfs.CheckpointSignatureProto\")\n" +
      "\'GetMostRecentCheckpointTxIdRequestProto" +
      "\"8\n(GetMostRecentCheckpointTxIdResponseP" +
      "roto\022\014\n\004txId\030\001 \002(\004\"w\n\027ErrorReportRequest" +
      "Proto\022<\n\014registration\030\001 \002(\0132&.hadoop.hdf" +
      "s.NamenodeRegistrationProto\022\021\n\terrorCode" +
      "\030\002 \002(\r\022\013\n\003msg\030\003 \002(\t\"\032\n\030ErrorReportRespon" +
      "seProto\"T\n\024RegisterRequestProto\022<\n\014regis",
      "tration\030\001 \002(\0132&.hadoop.hdfs.NamenodeRegi" +
      "strationProto\"U\n\025RegisterResponseProto\022<" +
      "\n\014registration\030\001 \002(\0132&.hadoop.hdfs.Namen" +
      "odeRegistrationProto\"[\n\033StartCheckpointR" +
      "equestProto\022<\n\014registration\030\001 \002(\0132&.hado" +
      "op.hdfs.NamenodeRegistrationProto\"R\n\034Sta" +
      "rtCheckpointResponseProto\0222\n\007command\030\001 \002" +
      "(\0132!.hadoop.hdfs.NamenodeCommandProto\"\223\001" +
      "\n\031EndCheckpointRequestProto\022<\n\014registrat" +
      "ion\030\001 \002(\0132&.hadoop.hdfs.NamenodeRegistra",
      "tionProto\0228\n\tsignature\030\002 \002(\0132%.hadoop.hd" +
      "fs.CheckpointSignatureProto\"\034\n\032EndCheckp" +
      "ointResponseProto\"3\n\036GetEditLogManifestR" +
      "equestProto\022\021\n\tsinceTxId\030\001 \002(\004\"\\\n\037GetEdi" +
      "tLogManifestResponseProto\0229\n\010manifest\030\001 " +
      "\002(\0132\'.hadoop.hdfs.RemoteEditLogManifestP" +
      "roto2\366\010\n\027NamenodeProtocolService\022T\n\tgetB" +
      "locks\022\".hadoop.hdfs.GetBlocksRequestProt" +
      "o\032#.hadoop.hdfs.GetBlocksResponseProto\022]" +
      "\n\014getBlockKeys\022%.hadoop.hdfs.GetBlockKey",
      "sRequestProto\032&.hadoop.hdfs.GetBlockKeys" +
      "ResponseProto\022i\n\020getTransactionId\022).hado" +
      "op.hdfs.GetTransactionIdRequestProto\032*.h" +
      "adoop.hdfs.GetTransactionIdResponseProto" +
      "\022\212\001\n\033getMostRecentCheckpointTxId\0224.hadoo" +
      "p.hdfs.GetMostRecentCheckpointTxIdReques" +
      "tProto\0325.hadoop.hdfs.GetMostRecentCheckp" +
      "ointTxIdResponseProto\022Z\n\013rollEditLog\022$.h" +
      "adoop.hdfs.RollEditLogRequestProto\032%.had" +
      "oop.hdfs.RollEditLogResponseProto\022U\n\016ver",
      "sionRequest\022 .hadoop.hdfs.VersionRequest" +
      "Proto\032!.hadoop.hdfs.VersionResponseProto" +
      "\022Z\n\013errorReport\022$.hadoop.hdfs.ErrorRepor" +
      "tRequestProto\032%.hadoop.hdfs.ErrorReportR" +
      "esponseProto\022d\n\033registerSubordinateNamen" +
      "ode\022!.hadoop.hdfs.RegisterRequestProto\032\"" +
      ".hadoop.hdfs.RegisterResponseProto\022f\n\017st" +
      "artCheckpoint\022(.hadoop.hdfs.StartCheckpo" +
      "intRequestProto\032).hadoop.hdfs.StartCheck" +
      "pointResponseProto\022`\n\rendCheckpoint\022&.ha",
      "doop.hdfs.EndCheckpointRequestProto\032\'.ha" +
      "doop.hdfs.EndCheckpointResponseProto\022o\n\022" +
      "getEditLogManifest\022+.hadoop.hdfs.GetEdit" +
      "LogManifestRequestProto\032,.hadoop.hdfs.Ge" +
      "tEditLogManifestResponseProtoBE\n%org.apa" +
      "che.hadoop.hdfs.protocol.protoB\026Namenode" +
      "ProtocolProtos\210\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hadoop_hdfs_GetBlocksRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hadoop_hdfs_GetBlocksRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetBlocksRequestProto_descriptor,
              new java.lang.String[] { "Datanode", "Size", });
          internal_static_hadoop_hdfs_GetBlocksResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_hadoop_hdfs_GetBlocksResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetBlocksResponseProto_descriptor,
              new java.lang.String[] { "Blocks", });
          internal_static_hadoop_hdfs_GetBlockKeysRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_hadoop_hdfs_GetBlockKeysRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetBlockKeysRequestProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_GetBlockKeysResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_hadoop_hdfs_GetBlockKeysResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetBlockKeysResponseProto_descriptor,
              new java.lang.String[] { "Keys", });
          internal_static_hadoop_hdfs_GetTransactionIdRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_hadoop_hdfs_GetTransactionIdRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetTransactionIdRequestProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_GetTransactionIdResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_hadoop_hdfs_GetTransactionIdResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetTransactionIdResponseProto_descriptor,
              new java.lang.String[] { "TxId", });
          internal_static_hadoop_hdfs_RollEditLogRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_hadoop_hdfs_RollEditLogRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_RollEditLogRequestProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_RollEditLogResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(7);
          internal_static_hadoop_hdfs_RollEditLogResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_RollEditLogResponseProto_descriptor,
              new java.lang.String[] { "Signature", });
          internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(8);
          internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdRequestProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(9);
          internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetMostRecentCheckpointTxIdResponseProto_descriptor,
              new java.lang.String[] { "TxId", });
          internal_static_hadoop_hdfs_ErrorReportRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(10);
          internal_static_hadoop_hdfs_ErrorReportRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ErrorReportRequestProto_descriptor,
              new java.lang.String[] { "Registration", "ErrorCode", "Msg", });
          internal_static_hadoop_hdfs_ErrorReportResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(11);
          internal_static_hadoop_hdfs_ErrorReportResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ErrorReportResponseProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_RegisterRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(12);
          internal_static_hadoop_hdfs_RegisterRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_RegisterRequestProto_descriptor,
              new java.lang.String[] { "Registration", });
          internal_static_hadoop_hdfs_RegisterResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(13);
          internal_static_hadoop_hdfs_RegisterResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_RegisterResponseProto_descriptor,
              new java.lang.String[] { "Registration", });
          internal_static_hadoop_hdfs_StartCheckpointRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(14);
          internal_static_hadoop_hdfs_StartCheckpointRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_StartCheckpointRequestProto_descriptor,
              new java.lang.String[] { "Registration", });
          internal_static_hadoop_hdfs_StartCheckpointResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(15);
          internal_static_hadoop_hdfs_StartCheckpointResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_StartCheckpointResponseProto_descriptor,
              new java.lang.String[] { "Command", });
          internal_static_hadoop_hdfs_EndCheckpointRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(16);
          internal_static_hadoop_hdfs_EndCheckpointRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_EndCheckpointRequestProto_descriptor,
              new java.lang.String[] { "Registration", "Signature", });
          internal_static_hadoop_hdfs_EndCheckpointResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(17);
          internal_static_hadoop_hdfs_EndCheckpointResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_EndCheckpointResponseProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_GetEditLogManifestRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(18);
          internal_static_hadoop_hdfs_GetEditLogManifestRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetEditLogManifestRequestProto_descriptor,
              new java.lang.String[] { "SinceTxId", });
          internal_static_hadoop_hdfs_GetEditLogManifestResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(19);
          internal_static_hadoop_hdfs_GetEditLogManifestResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetEditLogManifestResponseProto_descriptor,
              new java.lang.String[] { "Manifest", });
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
