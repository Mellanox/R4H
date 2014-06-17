package com.mellanox.r4h.protocol.proto;


public final class JournalProtocolProtos {
  private JournalProtocolProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface JournalInfoProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string clusterID = 1;
    /**
     * <code>required string clusterID = 1;</code>
     *
     * <pre>
     * ID of the cluster
     * </pre>
     */
    boolean hasClusterID();
    /**
     * <code>required string clusterID = 1;</code>
     *
     * <pre>
     * ID of the cluster
     * </pre>
     */
    java.lang.String getClusterID();
    /**
     * <code>required string clusterID = 1;</code>
     *
     * <pre>
     * ID of the cluster
     * </pre>
     */
    com.google.protobuf.ByteString
        getClusterIDBytes();

    // optional uint32 layoutVersion = 2;
    /**
     * <code>optional uint32 layoutVersion = 2;</code>
     *
     * <pre>
     * Layout version
     * </pre>
     */
    boolean hasLayoutVersion();
    /**
     * <code>optional uint32 layoutVersion = 2;</code>
     *
     * <pre>
     * Layout version
     * </pre>
     */
    int getLayoutVersion();

    // optional uint32 namespaceID = 3;
    /**
     * <code>optional uint32 namespaceID = 3;</code>
     *
     * <pre>
     * Namespace ID
     * </pre>
     */
    boolean hasNamespaceID();
    /**
     * <code>optional uint32 namespaceID = 3;</code>
     *
     * <pre>
     * Namespace ID
     * </pre>
     */
    int getNamespaceID();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.JournalInfoProto}
   *
   * <pre>
   **
   * Journal information used by the journal receiver to identify a journal.
   * </pre>
   */
  public static final class JournalInfoProto extends
      com.google.protobuf.GeneratedMessage
      implements JournalInfoProtoOrBuilder {
    // Use JournalInfoProto.newBuilder() to construct.
    private JournalInfoProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private JournalInfoProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final JournalInfoProto defaultInstance;
    public static JournalInfoProto getDefaultInstance() {
      return defaultInstance;
    }

    public JournalInfoProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private JournalInfoProto(
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
              clusterID_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              layoutVersion_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              namespaceID_ = input.readUInt32();
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalInfoProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder.class);
    }

    public static com.google.protobuf.Parser<JournalInfoProto> PARSER =
        new com.google.protobuf.AbstractParser<JournalInfoProto>() {
      public JournalInfoProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JournalInfoProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<JournalInfoProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string clusterID = 1;
    public static final int CLUSTERID_FIELD_NUMBER = 1;
    private java.lang.Object clusterID_;
    /**
     * <code>required string clusterID = 1;</code>
     *
     * <pre>
     * ID of the cluster
     * </pre>
     */
    public boolean hasClusterID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string clusterID = 1;</code>
     *
     * <pre>
     * ID of the cluster
     * </pre>
     */
    public java.lang.String getClusterID() {
      java.lang.Object ref = clusterID_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clusterID_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string clusterID = 1;</code>
     *
     * <pre>
     * ID of the cluster
     * </pre>
     */
    public com.google.protobuf.ByteString
        getClusterIDBytes() {
      java.lang.Object ref = clusterID_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional uint32 layoutVersion = 2;
    public static final int LAYOUTVERSION_FIELD_NUMBER = 2;
    private int layoutVersion_;
    /**
     * <code>optional uint32 layoutVersion = 2;</code>
     *
     * <pre>
     * Layout version
     * </pre>
     */
    public boolean hasLayoutVersion() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 layoutVersion = 2;</code>
     *
     * <pre>
     * Layout version
     * </pre>
     */
    public int getLayoutVersion() {
      return layoutVersion_;
    }

    // optional uint32 namespaceID = 3;
    public static final int NAMESPACEID_FIELD_NUMBER = 3;
    private int namespaceID_;
    /**
     * <code>optional uint32 namespaceID = 3;</code>
     *
     * <pre>
     * Namespace ID
     * </pre>
     */
    public boolean hasNamespaceID() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 namespaceID = 3;</code>
     *
     * <pre>
     * Namespace ID
     * </pre>
     */
    public int getNamespaceID() {
      return namespaceID_;
    }

    private void initFields() {
      clusterID_ = "";
      layoutVersion_ = 0;
      namespaceID_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasClusterID()) {
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
        output.writeBytes(1, getClusterIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, layoutVersion_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, namespaceID_);
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
          .computeBytesSize(1, getClusterIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, layoutVersion_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, namespaceID_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto) obj;

      boolean result = true;
      result = result && (hasClusterID() == other.hasClusterID());
      if (hasClusterID()) {
        result = result && getClusterID()
            .equals(other.getClusterID());
      }
      result = result && (hasLayoutVersion() == other.hasLayoutVersion());
      if (hasLayoutVersion()) {
        result = result && (getLayoutVersion()
            == other.getLayoutVersion());
      }
      result = result && (hasNamespaceID() == other.hasNamespaceID());
      if (hasNamespaceID()) {
        result = result && (getNamespaceID()
            == other.getNamespaceID());
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
      if (hasClusterID()) {
        hash = (37 * hash) + CLUSTERID_FIELD_NUMBER;
        hash = (53 * hash) + getClusterID().hashCode();
      }
      if (hasLayoutVersion()) {
        hash = (37 * hash) + LAYOUTVERSION_FIELD_NUMBER;
        hash = (53 * hash) + getLayoutVersion();
      }
      if (hasNamespaceID()) {
        hash = (37 * hash) + NAMESPACEID_FIELD_NUMBER;
        hash = (53 * hash) + getNamespaceID();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.JournalInfoProto}
     *
     * <pre>
     **
     * Journal information used by the journal receiver to identify a journal.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalInfoProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalInfoProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.newBuilder()
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
        clusterID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        layoutVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        namespaceID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalInfoProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.clusterID_ = clusterID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.layoutVersion_ = layoutVersion_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.namespaceID_ = namespaceID_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance()) return this;
        if (other.hasClusterID()) {
          bitField0_ |= 0x00000001;
          clusterID_ = other.clusterID_;
          onChanged();
        }
        if (other.hasLayoutVersion()) {
          setLayoutVersion(other.getLayoutVersion());
        }
        if (other.hasNamespaceID()) {
          setNamespaceID(other.getNamespaceID());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasClusterID()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string clusterID = 1;
      private java.lang.Object clusterID_ = "";
      /**
       * <code>required string clusterID = 1;</code>
       *
       * <pre>
       * ID of the cluster
       * </pre>
       */
      public boolean hasClusterID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string clusterID = 1;</code>
       *
       * <pre>
       * ID of the cluster
       * </pre>
       */
      public java.lang.String getClusterID() {
        java.lang.Object ref = clusterID_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          clusterID_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string clusterID = 1;</code>
       *
       * <pre>
       * ID of the cluster
       * </pre>
       */
      public com.google.protobuf.ByteString
          getClusterIDBytes() {
        java.lang.Object ref = clusterID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clusterID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string clusterID = 1;</code>
       *
       * <pre>
       * ID of the cluster
       * </pre>
       */
      public Builder setClusterID(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        clusterID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string clusterID = 1;</code>
       *
       * <pre>
       * ID of the cluster
       * </pre>
       */
      public Builder clearClusterID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        clusterID_ = getDefaultInstance().getClusterID();
        onChanged();
        return this;
      }
      /**
       * <code>required string clusterID = 1;</code>
       *
       * <pre>
       * ID of the cluster
       * </pre>
       */
      public Builder setClusterIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        clusterID_ = value;
        onChanged();
        return this;
      }

      // optional uint32 layoutVersion = 2;
      private int layoutVersion_ ;
      /**
       * <code>optional uint32 layoutVersion = 2;</code>
       *
       * <pre>
       * Layout version
       * </pre>
       */
      public boolean hasLayoutVersion() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 layoutVersion = 2;</code>
       *
       * <pre>
       * Layout version
       * </pre>
       */
      public int getLayoutVersion() {
        return layoutVersion_;
      }
      /**
       * <code>optional uint32 layoutVersion = 2;</code>
       *
       * <pre>
       * Layout version
       * </pre>
       */
      public Builder setLayoutVersion(int value) {
        bitField0_ |= 0x00000002;
        layoutVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 layoutVersion = 2;</code>
       *
       * <pre>
       * Layout version
       * </pre>
       */
      public Builder clearLayoutVersion() {
        bitField0_ = (bitField0_ & ~0x00000002);
        layoutVersion_ = 0;
        onChanged();
        return this;
      }

      // optional uint32 namespaceID = 3;
      private int namespaceID_ ;
      /**
       * <code>optional uint32 namespaceID = 3;</code>
       *
       * <pre>
       * Namespace ID
       * </pre>
       */
      public boolean hasNamespaceID() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint32 namespaceID = 3;</code>
       *
       * <pre>
       * Namespace ID
       * </pre>
       */
      public int getNamespaceID() {
        return namespaceID_;
      }
      /**
       * <code>optional uint32 namespaceID = 3;</code>
       *
       * <pre>
       * Namespace ID
       * </pre>
       */
      public Builder setNamespaceID(int value) {
        bitField0_ |= 0x00000004;
        namespaceID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 namespaceID = 3;</code>
       *
       * <pre>
       * Namespace ID
       * </pre>
       */
      public Builder clearNamespaceID() {
        bitField0_ = (bitField0_ & ~0x00000004);
        namespaceID_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.JournalInfoProto)
    }

    static {
      defaultInstance = new JournalInfoProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.JournalInfoProto)
  }

  public interface JournalRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.JournalInfoProto journalInfo = 1;
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    boolean hasJournalInfo();
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo();
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder();

    // required uint64 firstTxnId = 2;
    /**
     * <code>required uint64 firstTxnId = 2;</code>
     */
    boolean hasFirstTxnId();
    /**
     * <code>required uint64 firstTxnId = 2;</code>
     */
    long getFirstTxnId();

    // required uint32 numTxns = 3;
    /**
     * <code>required uint32 numTxns = 3;</code>
     */
    boolean hasNumTxns();
    /**
     * <code>required uint32 numTxns = 3;</code>
     */
    int getNumTxns();

    // required bytes records = 4;
    /**
     * <code>required bytes records = 4;</code>
     */
    boolean hasRecords();
    /**
     * <code>required bytes records = 4;</code>
     */
    com.google.protobuf.ByteString getRecords();

    // required uint64 epoch = 5;
    /**
     * <code>required uint64 epoch = 5;</code>
     */
    boolean hasEpoch();
    /**
     * <code>required uint64 epoch = 5;</code>
     */
    long getEpoch();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.JournalRequestProto}
   *
   * <pre>
   **
   * journalInfo - the information about the journal
   * firstTxnId - the first txid in the journal records
   * numTxns - Number of transactions in editlog
   * records - bytes containing serialized journal records
   * epoch - change to this represents change of journal writer
   * </pre>
   */
  public static final class JournalRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements JournalRequestProtoOrBuilder {
    // Use JournalRequestProto.newBuilder() to construct.
    private JournalRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private JournalRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final JournalRequestProto defaultInstance;
    public static JournalRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public JournalRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private JournalRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = journalInfo_.toBuilder();
              }
              journalInfo_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(journalInfo_);
                journalInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              firstTxnId_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              numTxns_ = input.readUInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              records_ = input.readBytes();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              epoch_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<JournalRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<JournalRequestProto>() {
      public JournalRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JournalRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<JournalRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.JournalInfoProto journalInfo = 1;
    public static final int JOURNALINFO_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto journalInfo_;
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    public boolean hasJournalInfo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo() {
      return journalInfo_;
    }
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder() {
      return journalInfo_;
    }

    // required uint64 firstTxnId = 2;
    public static final int FIRSTTXNID_FIELD_NUMBER = 2;
    private long firstTxnId_;
    /**
     * <code>required uint64 firstTxnId = 2;</code>
     */
    public boolean hasFirstTxnId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint64 firstTxnId = 2;</code>
     */
    public long getFirstTxnId() {
      return firstTxnId_;
    }

    // required uint32 numTxns = 3;
    public static final int NUMTXNS_FIELD_NUMBER = 3;
    private int numTxns_;
    /**
     * <code>required uint32 numTxns = 3;</code>
     */
    public boolean hasNumTxns() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required uint32 numTxns = 3;</code>
     */
    public int getNumTxns() {
      return numTxns_;
    }

    // required bytes records = 4;
    public static final int RECORDS_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString records_;
    /**
     * <code>required bytes records = 4;</code>
     */
    public boolean hasRecords() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required bytes records = 4;</code>
     */
    public com.google.protobuf.ByteString getRecords() {
      return records_;
    }

    // required uint64 epoch = 5;
    public static final int EPOCH_FIELD_NUMBER = 5;
    private long epoch_;
    /**
     * <code>required uint64 epoch = 5;</code>
     */
    public boolean hasEpoch() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required uint64 epoch = 5;</code>
     */
    public long getEpoch() {
      return epoch_;
    }

    private void initFields() {
      journalInfo_ = org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
      firstTxnId_ = 0L;
      numTxns_ = 0;
      records_ = com.google.protobuf.ByteString.EMPTY;
      epoch_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasJournalInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasFirstTxnId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNumTxns()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRecords()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEpoch()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getJournalInfo().isInitialized()) {
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
        output.writeMessage(1, journalInfo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, firstTxnId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, numTxns_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, records_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt64(5, epoch_);
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
          .computeMessageSize(1, journalInfo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, firstTxnId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, numTxns_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, records_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, epoch_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto) obj;

      boolean result = true;
      result = result && (hasJournalInfo() == other.hasJournalInfo());
      if (hasJournalInfo()) {
        result = result && getJournalInfo()
            .equals(other.getJournalInfo());
      }
      result = result && (hasFirstTxnId() == other.hasFirstTxnId());
      if (hasFirstTxnId()) {
        result = result && (getFirstTxnId()
            == other.getFirstTxnId());
      }
      result = result && (hasNumTxns() == other.hasNumTxns());
      if (hasNumTxns()) {
        result = result && (getNumTxns()
            == other.getNumTxns());
      }
      result = result && (hasRecords() == other.hasRecords());
      if (hasRecords()) {
        result = result && getRecords()
            .equals(other.getRecords());
      }
      result = result && (hasEpoch() == other.hasEpoch());
      if (hasEpoch()) {
        result = result && (getEpoch()
            == other.getEpoch());
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
      if (hasJournalInfo()) {
        hash = (37 * hash) + JOURNALINFO_FIELD_NUMBER;
        hash = (53 * hash) + getJournalInfo().hashCode();
      }
      if (hasFirstTxnId()) {
        hash = (37 * hash) + FIRSTTXNID_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getFirstTxnId());
      }
      if (hasNumTxns()) {
        hash = (37 * hash) + NUMTXNS_FIELD_NUMBER;
        hash = (53 * hash) + getNumTxns();
      }
      if (hasRecords()) {
        hash = (37 * hash) + RECORDS_FIELD_NUMBER;
        hash = (53 * hash) + getRecords().hashCode();
      }
      if (hasEpoch()) {
        hash = (37 * hash) + EPOCH_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getEpoch());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.JournalRequestProto}
     *
     * <pre>
     **
     * journalInfo - the information about the journal
     * firstTxnId - the first txid in the journal records
     * numTxns - Number of transactions in editlog
     * records - bytes containing serialized journal records
     * epoch - change to this represents change of journal writer
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.newBuilder()
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
          getJournalInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (journalInfoBuilder_ == null) {
          journalInfo_ = org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
        } else {
          journalInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        firstTxnId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        numTxns_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        records_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        epoch_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (journalInfoBuilder_ == null) {
          result.journalInfo_ = journalInfo_;
        } else {
          result.journalInfo_ = journalInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.firstTxnId_ = firstTxnId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.numTxns_ = numTxns_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.records_ = records_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.epoch_ = epoch_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.getDefaultInstance()) return this;
        if (other.hasJournalInfo()) {
          mergeJournalInfo(other.getJournalInfo());
        }
        if (other.hasFirstTxnId()) {
          setFirstTxnId(other.getFirstTxnId());
        }
        if (other.hasNumTxns()) {
          setNumTxns(other.getNumTxns());
        }
        if (other.hasRecords()) {
          setRecords(other.getRecords());
        }
        if (other.hasEpoch()) {
          setEpoch(other.getEpoch());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasJournalInfo()) {
          
          return false;
        }
        if (!hasFirstTxnId()) {
          
          return false;
        }
        if (!hasNumTxns()) {
          
          return false;
        }
        if (!hasRecords()) {
          
          return false;
        }
        if (!hasEpoch()) {
          
          return false;
        }
        if (!getJournalInfo().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.JournalInfoProto journalInfo = 1;
      private org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto journalInfo_ = org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder> journalInfoBuilder_;
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public boolean hasJournalInfo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo() {
        if (journalInfoBuilder_ == null) {
          return journalInfo_;
        } else {
          return journalInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder setJournalInfo(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto value) {
        if (journalInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          journalInfo_ = value;
          onChanged();
        } else {
          journalInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder setJournalInfo(
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder builderForValue) {
        if (journalInfoBuilder_ == null) {
          journalInfo_ = builderForValue.build();
          onChanged();
        } else {
          journalInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder mergeJournalInfo(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto value) {
        if (journalInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              journalInfo_ != org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance()) {
            journalInfo_ =
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.newBuilder(journalInfo_).mergeFrom(value).buildPartial();
          } else {
            journalInfo_ = value;
          }
          onChanged();
        } else {
          journalInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public Builder clearJournalInfo() {
        if (journalInfoBuilder_ == null) {
          journalInfo_ = org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
          onChanged();
        } else {
          journalInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder getJournalInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getJournalInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder() {
        if (journalInfoBuilder_ != null) {
          return journalInfoBuilder_.getMessageOrBuilder();
        } else {
          return journalInfo_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder> 
          getJournalInfoFieldBuilder() {
        if (journalInfoBuilder_ == null) {
          journalInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder>(
                  journalInfo_,
                  getParentForChildren(),
                  isClean());
          journalInfo_ = null;
        }
        return journalInfoBuilder_;
      }

      // required uint64 firstTxnId = 2;
      private long firstTxnId_ ;
      /**
       * <code>required uint64 firstTxnId = 2;</code>
       */
      public boolean hasFirstTxnId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint64 firstTxnId = 2;</code>
       */
      public long getFirstTxnId() {
        return firstTxnId_;
      }
      /**
       * <code>required uint64 firstTxnId = 2;</code>
       */
      public Builder setFirstTxnId(long value) {
        bitField0_ |= 0x00000002;
        firstTxnId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 firstTxnId = 2;</code>
       */
      public Builder clearFirstTxnId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        firstTxnId_ = 0L;
        onChanged();
        return this;
      }

      // required uint32 numTxns = 3;
      private int numTxns_ ;
      /**
       * <code>required uint32 numTxns = 3;</code>
       */
      public boolean hasNumTxns() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required uint32 numTxns = 3;</code>
       */
      public int getNumTxns() {
        return numTxns_;
      }
      /**
       * <code>required uint32 numTxns = 3;</code>
       */
      public Builder setNumTxns(int value) {
        bitField0_ |= 0x00000004;
        numTxns_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 numTxns = 3;</code>
       */
      public Builder clearNumTxns() {
        bitField0_ = (bitField0_ & ~0x00000004);
        numTxns_ = 0;
        onChanged();
        return this;
      }

      // required bytes records = 4;
      private com.google.protobuf.ByteString records_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes records = 4;</code>
       */
      public boolean hasRecords() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required bytes records = 4;</code>
       */
      public com.google.protobuf.ByteString getRecords() {
        return records_;
      }
      /**
       * <code>required bytes records = 4;</code>
       */
      public Builder setRecords(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        records_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes records = 4;</code>
       */
      public Builder clearRecords() {
        bitField0_ = (bitField0_ & ~0x00000008);
        records_ = getDefaultInstance().getRecords();
        onChanged();
        return this;
      }

      // required uint64 epoch = 5;
      private long epoch_ ;
      /**
       * <code>required uint64 epoch = 5;</code>
       */
      public boolean hasEpoch() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required uint64 epoch = 5;</code>
       */
      public long getEpoch() {
        return epoch_;
      }
      /**
       * <code>required uint64 epoch = 5;</code>
       */
      public Builder setEpoch(long value) {
        bitField0_ |= 0x00000010;
        epoch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 epoch = 5;</code>
       */
      public Builder clearEpoch() {
        bitField0_ = (bitField0_ & ~0x00000010);
        epoch_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.JournalRequestProto)
    }

    static {
      defaultInstance = new JournalRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.JournalRequestProto)
  }

  public interface JournalResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.JournalResponseProto}
   *
   * <pre>
   **
   * void response
   * </pre>
   */
  public static final class JournalResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements JournalResponseProtoOrBuilder {
    // Use JournalResponseProto.newBuilder() to construct.
    private JournalResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private JournalResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final JournalResponseProto defaultInstance;
    public static JournalResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public JournalResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private JournalResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<JournalResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<JournalResponseProto>() {
      public JournalResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JournalResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<JournalResponseProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.JournalResponseProto}
     *
     * <pre>
     **
     * void response
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_JournalResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.JournalResponseProto)
    }

    static {
      defaultInstance = new JournalResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.JournalResponseProto)
  }

  public interface StartLogSegmentRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.JournalInfoProto journalInfo = 1;
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     *
     * <pre>
     * Info about the journal
     * </pre>
     */
    boolean hasJournalInfo();
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     *
     * <pre>
     * Info about the journal
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo();
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     *
     * <pre>
     * Info about the journal
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder();

    // required uint64 txid = 2;
    /**
     * <code>required uint64 txid = 2;</code>
     *
     * <pre>
     * Transaction ID
     * </pre>
     */
    boolean hasTxid();
    /**
     * <code>required uint64 txid = 2;</code>
     *
     * <pre>
     * Transaction ID
     * </pre>
     */
    long getTxid();

    // required uint64 epoch = 3;
    /**
     * <code>required uint64 epoch = 3;</code>
     */
    boolean hasEpoch();
    /**
     * <code>required uint64 epoch = 3;</code>
     */
    long getEpoch();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.StartLogSegmentRequestProto}
   *
   * <pre>
   **
   * journalInfo - the information about the journal
   * txid - first txid in the new log
   * </pre>
   */
  public static final class StartLogSegmentRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements StartLogSegmentRequestProtoOrBuilder {
    // Use StartLogSegmentRequestProto.newBuilder() to construct.
    private StartLogSegmentRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StartLogSegmentRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StartLogSegmentRequestProto defaultInstance;
    public static StartLogSegmentRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public StartLogSegmentRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StartLogSegmentRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = journalInfo_.toBuilder();
              }
              journalInfo_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(journalInfo_);
                journalInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              txid_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              epoch_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<StartLogSegmentRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<StartLogSegmentRequestProto>() {
      public StartLogSegmentRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StartLogSegmentRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StartLogSegmentRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.JournalInfoProto journalInfo = 1;
    public static final int JOURNALINFO_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto journalInfo_;
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     *
     * <pre>
     * Info about the journal
     * </pre>
     */
    public boolean hasJournalInfo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     *
     * <pre>
     * Info about the journal
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo() {
      return journalInfo_;
    }
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     *
     * <pre>
     * Info about the journal
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder() {
      return journalInfo_;
    }

    // required uint64 txid = 2;
    public static final int TXID_FIELD_NUMBER = 2;
    private long txid_;
    /**
     * <code>required uint64 txid = 2;</code>
     *
     * <pre>
     * Transaction ID
     * </pre>
     */
    public boolean hasTxid() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint64 txid = 2;</code>
     *
     * <pre>
     * Transaction ID
     * </pre>
     */
    public long getTxid() {
      return txid_;
    }

    // required uint64 epoch = 3;
    public static final int EPOCH_FIELD_NUMBER = 3;
    private long epoch_;
    /**
     * <code>required uint64 epoch = 3;</code>
     */
    public boolean hasEpoch() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required uint64 epoch = 3;</code>
     */
    public long getEpoch() {
      return epoch_;
    }

    private void initFields() {
      journalInfo_ = org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
      txid_ = 0L;
      epoch_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasJournalInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTxid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEpoch()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getJournalInfo().isInitialized()) {
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
        output.writeMessage(1, journalInfo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, txid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, epoch_);
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
          .computeMessageSize(1, journalInfo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, txid_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, epoch_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto) obj;

      boolean result = true;
      result = result && (hasJournalInfo() == other.hasJournalInfo());
      if (hasJournalInfo()) {
        result = result && getJournalInfo()
            .equals(other.getJournalInfo());
      }
      result = result && (hasTxid() == other.hasTxid());
      if (hasTxid()) {
        result = result && (getTxid()
            == other.getTxid());
      }
      result = result && (hasEpoch() == other.hasEpoch());
      if (hasEpoch()) {
        result = result && (getEpoch()
            == other.getEpoch());
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
      if (hasJournalInfo()) {
        hash = (37 * hash) + JOURNALINFO_FIELD_NUMBER;
        hash = (53 * hash) + getJournalInfo().hashCode();
      }
      if (hasTxid()) {
        hash = (37 * hash) + TXID_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getTxid());
      }
      if (hasEpoch()) {
        hash = (37 * hash) + EPOCH_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getEpoch());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.StartLogSegmentRequestProto}
     *
     * <pre>
     **
     * journalInfo - the information about the journal
     * txid - first txid in the new log
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.newBuilder()
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
          getJournalInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (journalInfoBuilder_ == null) {
          journalInfo_ = org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
        } else {
          journalInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        txid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        epoch_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (journalInfoBuilder_ == null) {
          result.journalInfo_ = journalInfo_;
        } else {
          result.journalInfo_ = journalInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.txid_ = txid_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.epoch_ = epoch_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.getDefaultInstance()) return this;
        if (other.hasJournalInfo()) {
          mergeJournalInfo(other.getJournalInfo());
        }
        if (other.hasTxid()) {
          setTxid(other.getTxid());
        }
        if (other.hasEpoch()) {
          setEpoch(other.getEpoch());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasJournalInfo()) {
          
          return false;
        }
        if (!hasTxid()) {
          
          return false;
        }
        if (!hasEpoch()) {
          
          return false;
        }
        if (!getJournalInfo().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.JournalInfoProto journalInfo = 1;
      private org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto journalInfo_ = org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder> journalInfoBuilder_;
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public boolean hasJournalInfo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo() {
        if (journalInfoBuilder_ == null) {
          return journalInfo_;
        } else {
          return journalInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public Builder setJournalInfo(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto value) {
        if (journalInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          journalInfo_ = value;
          onChanged();
        } else {
          journalInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public Builder setJournalInfo(
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder builderForValue) {
        if (journalInfoBuilder_ == null) {
          journalInfo_ = builderForValue.build();
          onChanged();
        } else {
          journalInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public Builder mergeJournalInfo(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto value) {
        if (journalInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              journalInfo_ != org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance()) {
            journalInfo_ =
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.newBuilder(journalInfo_).mergeFrom(value).buildPartial();
          } else {
            journalInfo_ = value;
          }
          onChanged();
        } else {
          journalInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public Builder clearJournalInfo() {
        if (journalInfoBuilder_ == null) {
          journalInfo_ = org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
          onChanged();
        } else {
          journalInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder getJournalInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getJournalInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder() {
        if (journalInfoBuilder_ != null) {
          return journalInfoBuilder_.getMessageOrBuilder();
        } else {
          return journalInfo_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder> 
          getJournalInfoFieldBuilder() {
        if (journalInfoBuilder_ == null) {
          journalInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder>(
                  journalInfo_,
                  getParentForChildren(),
                  isClean());
          journalInfo_ = null;
        }
        return journalInfoBuilder_;
      }

      // required uint64 txid = 2;
      private long txid_ ;
      /**
       * <code>required uint64 txid = 2;</code>
       *
       * <pre>
       * Transaction ID
       * </pre>
       */
      public boolean hasTxid() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint64 txid = 2;</code>
       *
       * <pre>
       * Transaction ID
       * </pre>
       */
      public long getTxid() {
        return txid_;
      }
      /**
       * <code>required uint64 txid = 2;</code>
       *
       * <pre>
       * Transaction ID
       * </pre>
       */
      public Builder setTxid(long value) {
        bitField0_ |= 0x00000002;
        txid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 txid = 2;</code>
       *
       * <pre>
       * Transaction ID
       * </pre>
       */
      public Builder clearTxid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        txid_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 epoch = 3;
      private long epoch_ ;
      /**
       * <code>required uint64 epoch = 3;</code>
       */
      public boolean hasEpoch() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required uint64 epoch = 3;</code>
       */
      public long getEpoch() {
        return epoch_;
      }
      /**
       * <code>required uint64 epoch = 3;</code>
       */
      public Builder setEpoch(long value) {
        bitField0_ |= 0x00000004;
        epoch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 epoch = 3;</code>
       */
      public Builder clearEpoch() {
        bitField0_ = (bitField0_ & ~0x00000004);
        epoch_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.StartLogSegmentRequestProto)
    }

    static {
      defaultInstance = new StartLogSegmentRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.StartLogSegmentRequestProto)
  }

  public interface StartLogSegmentResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.StartLogSegmentResponseProto}
   *
   * <pre>
   **
   * void response
   * </pre>
   */
  public static final class StartLogSegmentResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements StartLogSegmentResponseProtoOrBuilder {
    // Use StartLogSegmentResponseProto.newBuilder() to construct.
    private StartLogSegmentResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StartLogSegmentResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StartLogSegmentResponseProto defaultInstance;
    public static StartLogSegmentResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public StartLogSegmentResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StartLogSegmentResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<StartLogSegmentResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<StartLogSegmentResponseProto>() {
      public StartLogSegmentResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StartLogSegmentResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StartLogSegmentResponseProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.StartLogSegmentResponseProto}
     *
     * <pre>
     **
     * void response
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_StartLogSegmentResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.StartLogSegmentResponseProto)
    }

    static {
      defaultInstance = new StartLogSegmentResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.StartLogSegmentResponseProto)
  }

  public interface FenceRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.JournalInfoProto journalInfo = 1;
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     *
     * <pre>
     * Info about the journal
     * </pre>
     */
    boolean hasJournalInfo();
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     *
     * <pre>
     * Info about the journal
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo();
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     *
     * <pre>
     * Info about the journal
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder();

    // required uint64 epoch = 2;
    /**
     * <code>required uint64 epoch = 2;</code>
     *
     * <pre>
     * Epoch - change indicates change in writer
     * </pre>
     */
    boolean hasEpoch();
    /**
     * <code>required uint64 epoch = 2;</code>
     *
     * <pre>
     * Epoch - change indicates change in writer
     * </pre>
     */
    long getEpoch();

    // optional string fencerInfo = 3;
    /**
     * <code>optional string fencerInfo = 3;</code>
     *
     * <pre>
     * Info about fencer for debugging
     * </pre>
     */
    boolean hasFencerInfo();
    /**
     * <code>optional string fencerInfo = 3;</code>
     *
     * <pre>
     * Info about fencer for debugging
     * </pre>
     */
    java.lang.String getFencerInfo();
    /**
     * <code>optional string fencerInfo = 3;</code>
     *
     * <pre>
     * Info about fencer for debugging
     * </pre>
     */
    com.google.protobuf.ByteString
        getFencerInfoBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.FenceRequestProto}
   *
   * <pre>
   **
   * journalInfo - the information about the journal
   * txid - first txid in the new log
   * </pre>
   */
  public static final class FenceRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements FenceRequestProtoOrBuilder {
    // Use FenceRequestProto.newBuilder() to construct.
    private FenceRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FenceRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FenceRequestProto defaultInstance;
    public static FenceRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public FenceRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FenceRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = journalInfo_.toBuilder();
              }
              journalInfo_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(journalInfo_);
                journalInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              epoch_ = input.readUInt64();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              fencerInfo_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<FenceRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<FenceRequestProto>() {
      public FenceRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FenceRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FenceRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.JournalInfoProto journalInfo = 1;
    public static final int JOURNALINFO_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto journalInfo_;
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     *
     * <pre>
     * Info about the journal
     * </pre>
     */
    public boolean hasJournalInfo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     *
     * <pre>
     * Info about the journal
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo() {
      return journalInfo_;
    }
    /**
     * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
     *
     * <pre>
     * Info about the journal
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder() {
      return journalInfo_;
    }

    // required uint64 epoch = 2;
    public static final int EPOCH_FIELD_NUMBER = 2;
    private long epoch_;
    /**
     * <code>required uint64 epoch = 2;</code>
     *
     * <pre>
     * Epoch - change indicates change in writer
     * </pre>
     */
    public boolean hasEpoch() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint64 epoch = 2;</code>
     *
     * <pre>
     * Epoch - change indicates change in writer
     * </pre>
     */
    public long getEpoch() {
      return epoch_;
    }

    // optional string fencerInfo = 3;
    public static final int FENCERINFO_FIELD_NUMBER = 3;
    private java.lang.Object fencerInfo_;
    /**
     * <code>optional string fencerInfo = 3;</code>
     *
     * <pre>
     * Info about fencer for debugging
     * </pre>
     */
    public boolean hasFencerInfo() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string fencerInfo = 3;</code>
     *
     * <pre>
     * Info about fencer for debugging
     * </pre>
     */
    public java.lang.String getFencerInfo() {
      java.lang.Object ref = fencerInfo_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          fencerInfo_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string fencerInfo = 3;</code>
     *
     * <pre>
     * Info about fencer for debugging
     * </pre>
     */
    public com.google.protobuf.ByteString
        getFencerInfoBytes() {
      java.lang.Object ref = fencerInfo_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fencerInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      journalInfo_ = org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
      epoch_ = 0L;
      fencerInfo_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasJournalInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEpoch()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getJournalInfo().isInitialized()) {
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
        output.writeMessage(1, journalInfo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, epoch_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getFencerInfoBytes());
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
          .computeMessageSize(1, journalInfo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, epoch_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getFencerInfoBytes());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto) obj;

      boolean result = true;
      result = result && (hasJournalInfo() == other.hasJournalInfo());
      if (hasJournalInfo()) {
        result = result && getJournalInfo()
            .equals(other.getJournalInfo());
      }
      result = result && (hasEpoch() == other.hasEpoch());
      if (hasEpoch()) {
        result = result && (getEpoch()
            == other.getEpoch());
      }
      result = result && (hasFencerInfo() == other.hasFencerInfo());
      if (hasFencerInfo()) {
        result = result && getFencerInfo()
            .equals(other.getFencerInfo());
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
      if (hasJournalInfo()) {
        hash = (37 * hash) + JOURNALINFO_FIELD_NUMBER;
        hash = (53 * hash) + getJournalInfo().hashCode();
      }
      if (hasEpoch()) {
        hash = (37 * hash) + EPOCH_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getEpoch());
      }
      if (hasFencerInfo()) {
        hash = (37 * hash) + FENCERINFO_FIELD_NUMBER;
        hash = (53 * hash) + getFencerInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.FenceRequestProto}
     *
     * <pre>
     **
     * journalInfo - the information about the journal
     * txid - first txid in the new log
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.newBuilder()
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
          getJournalInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (journalInfoBuilder_ == null) {
          journalInfo_ = org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
        } else {
          journalInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        epoch_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        fencerInfo_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (journalInfoBuilder_ == null) {
          result.journalInfo_ = journalInfo_;
        } else {
          result.journalInfo_ = journalInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.epoch_ = epoch_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.fencerInfo_ = fencerInfo_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.getDefaultInstance()) return this;
        if (other.hasJournalInfo()) {
          mergeJournalInfo(other.getJournalInfo());
        }
        if (other.hasEpoch()) {
          setEpoch(other.getEpoch());
        }
        if (other.hasFencerInfo()) {
          bitField0_ |= 0x00000004;
          fencerInfo_ = other.fencerInfo_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasJournalInfo()) {
          
          return false;
        }
        if (!hasEpoch()) {
          
          return false;
        }
        if (!getJournalInfo().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.JournalInfoProto journalInfo = 1;
      private org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto journalInfo_ = org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder> journalInfoBuilder_;
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public boolean hasJournalInfo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto getJournalInfo() {
        if (journalInfoBuilder_ == null) {
          return journalInfo_;
        } else {
          return journalInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public Builder setJournalInfo(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto value) {
        if (journalInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          journalInfo_ = value;
          onChanged();
        } else {
          journalInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public Builder setJournalInfo(
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder builderForValue) {
        if (journalInfoBuilder_ == null) {
          journalInfo_ = builderForValue.build();
          onChanged();
        } else {
          journalInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public Builder mergeJournalInfo(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto value) {
        if (journalInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              journalInfo_ != org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance()) {
            journalInfo_ =
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.newBuilder(journalInfo_).mergeFrom(value).buildPartial();
          } else {
            journalInfo_ = value;
          }
          onChanged();
        } else {
          journalInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public Builder clearJournalInfo() {
        if (journalInfoBuilder_ == null) {
          journalInfo_ = org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.getDefaultInstance();
          onChanged();
        } else {
          journalInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder getJournalInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getJournalInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder getJournalInfoOrBuilder() {
        if (journalInfoBuilder_ != null) {
          return journalInfoBuilder_.getMessageOrBuilder();
        } else {
          return journalInfo_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.JournalInfoProto journalInfo = 1;</code>
       *
       * <pre>
       * Info about the journal
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder> 
          getJournalInfoFieldBuilder() {
        if (journalInfoBuilder_ == null) {
          journalInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalInfoProtoOrBuilder>(
                  journalInfo_,
                  getParentForChildren(),
                  isClean());
          journalInfo_ = null;
        }
        return journalInfoBuilder_;
      }

      // required uint64 epoch = 2;
      private long epoch_ ;
      /**
       * <code>required uint64 epoch = 2;</code>
       *
       * <pre>
       * Epoch - change indicates change in writer
       * </pre>
       */
      public boolean hasEpoch() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint64 epoch = 2;</code>
       *
       * <pre>
       * Epoch - change indicates change in writer
       * </pre>
       */
      public long getEpoch() {
        return epoch_;
      }
      /**
       * <code>required uint64 epoch = 2;</code>
       *
       * <pre>
       * Epoch - change indicates change in writer
       * </pre>
       */
      public Builder setEpoch(long value) {
        bitField0_ |= 0x00000002;
        epoch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 epoch = 2;</code>
       *
       * <pre>
       * Epoch - change indicates change in writer
       * </pre>
       */
      public Builder clearEpoch() {
        bitField0_ = (bitField0_ & ~0x00000002);
        epoch_ = 0L;
        onChanged();
        return this;
      }

      // optional string fencerInfo = 3;
      private java.lang.Object fencerInfo_ = "";
      /**
       * <code>optional string fencerInfo = 3;</code>
       *
       * <pre>
       * Info about fencer for debugging
       * </pre>
       */
      public boolean hasFencerInfo() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string fencerInfo = 3;</code>
       *
       * <pre>
       * Info about fencer for debugging
       * </pre>
       */
      public java.lang.String getFencerInfo() {
        java.lang.Object ref = fencerInfo_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          fencerInfo_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string fencerInfo = 3;</code>
       *
       * <pre>
       * Info about fencer for debugging
       * </pre>
       */
      public com.google.protobuf.ByteString
          getFencerInfoBytes() {
        java.lang.Object ref = fencerInfo_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fencerInfo_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string fencerInfo = 3;</code>
       *
       * <pre>
       * Info about fencer for debugging
       * </pre>
       */
      public Builder setFencerInfo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        fencerInfo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string fencerInfo = 3;</code>
       *
       * <pre>
       * Info about fencer for debugging
       * </pre>
       */
      public Builder clearFencerInfo() {
        bitField0_ = (bitField0_ & ~0x00000004);
        fencerInfo_ = getDefaultInstance().getFencerInfo();
        onChanged();
        return this;
      }
      /**
       * <code>optional string fencerInfo = 3;</code>
       *
       * <pre>
       * Info about fencer for debugging
       * </pre>
       */
      public Builder setFencerInfoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        fencerInfo_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.FenceRequestProto)
    }

    static {
      defaultInstance = new FenceRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.FenceRequestProto)
  }

  public interface FenceResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional uint64 previousEpoch = 1;
    /**
     * <code>optional uint64 previousEpoch = 1;</code>
     */
    boolean hasPreviousEpoch();
    /**
     * <code>optional uint64 previousEpoch = 1;</code>
     */
    long getPreviousEpoch();

    // optional uint64 lastTransactionId = 2;
    /**
     * <code>optional uint64 lastTransactionId = 2;</code>
     */
    boolean hasLastTransactionId();
    /**
     * <code>optional uint64 lastTransactionId = 2;</code>
     */
    long getLastTransactionId();

    // optional bool inSync = 3;
    /**
     * <code>optional bool inSync = 3;</code>
     */
    boolean hasInSync();
    /**
     * <code>optional bool inSync = 3;</code>
     */
    boolean getInSync();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.FenceResponseProto}
   *
   * <pre>
   **
   * previousEpoch - previous epoch if any or zero
   * lastTransactionId - last valid transaction Id in the journal
   * inSync - if all journal segments are available and in sync
   * </pre>
   */
  public static final class FenceResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements FenceResponseProtoOrBuilder {
    // Use FenceResponseProto.newBuilder() to construct.
    private FenceResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FenceResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FenceResponseProto defaultInstance;
    public static FenceResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public FenceResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FenceResponseProto(
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
              previousEpoch_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              lastTransactionId_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              inSync_ = input.readBool();
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
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<FenceResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<FenceResponseProto>() {
      public FenceResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FenceResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FenceResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional uint64 previousEpoch = 1;
    public static final int PREVIOUSEPOCH_FIELD_NUMBER = 1;
    private long previousEpoch_;
    /**
     * <code>optional uint64 previousEpoch = 1;</code>
     */
    public boolean hasPreviousEpoch() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 previousEpoch = 1;</code>
     */
    public long getPreviousEpoch() {
      return previousEpoch_;
    }

    // optional uint64 lastTransactionId = 2;
    public static final int LASTTRANSACTIONID_FIELD_NUMBER = 2;
    private long lastTransactionId_;
    /**
     * <code>optional uint64 lastTransactionId = 2;</code>
     */
    public boolean hasLastTransactionId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 lastTransactionId = 2;</code>
     */
    public long getLastTransactionId() {
      return lastTransactionId_;
    }

    // optional bool inSync = 3;
    public static final int INSYNC_FIELD_NUMBER = 3;
    private boolean inSync_;
    /**
     * <code>optional bool inSync = 3;</code>
     */
    public boolean hasInSync() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool inSync = 3;</code>
     */
    public boolean getInSync() {
      return inSync_;
    }

    private void initFields() {
      previousEpoch_ = 0L;
      lastTransactionId_ = 0L;
      inSync_ = false;
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
        output.writeUInt64(1, previousEpoch_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, lastTransactionId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, inSync_);
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
          .computeUInt64Size(1, previousEpoch_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, lastTransactionId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, inSync_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto) obj;

      boolean result = true;
      result = result && (hasPreviousEpoch() == other.hasPreviousEpoch());
      if (hasPreviousEpoch()) {
        result = result && (getPreviousEpoch()
            == other.getPreviousEpoch());
      }
      result = result && (hasLastTransactionId() == other.hasLastTransactionId());
      if (hasLastTransactionId()) {
        result = result && (getLastTransactionId()
            == other.getLastTransactionId());
      }
      result = result && (hasInSync() == other.hasInSync());
      if (hasInSync()) {
        result = result && (getInSync()
            == other.getInSync());
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
      if (hasPreviousEpoch()) {
        hash = (37 * hash) + PREVIOUSEPOCH_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getPreviousEpoch());
      }
      if (hasLastTransactionId()) {
        hash = (37 * hash) + LASTTRANSACTIONID_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getLastTransactionId());
      }
      if (hasInSync()) {
        hash = (37 * hash) + INSYNC_FIELD_NUMBER;
        hash = (53 * hash) + hashBoolean(getInSync());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.FenceResponseProto}
     *
     * <pre>
     **
     * previousEpoch - previous epoch if any or zero
     * lastTransactionId - last valid transaction Id in the journal
     * inSync - if all journal segments are available and in sync
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.newBuilder()
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
        previousEpoch_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        lastTransactionId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        inSync_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.internal_static_hadoop_hdfs_FenceResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.previousEpoch_ = previousEpoch_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.lastTransactionId_ = lastTransactionId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.inSync_ = inSync_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance()) return this;
        if (other.hasPreviousEpoch()) {
          setPreviousEpoch(other.getPreviousEpoch());
        }
        if (other.hasLastTransactionId()) {
          setLastTransactionId(other.getLastTransactionId());
        }
        if (other.hasInSync()) {
          setInSync(other.getInSync());
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
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional uint64 previousEpoch = 1;
      private long previousEpoch_ ;
      /**
       * <code>optional uint64 previousEpoch = 1;</code>
       */
      public boolean hasPreviousEpoch() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint64 previousEpoch = 1;</code>
       */
      public long getPreviousEpoch() {
        return previousEpoch_;
      }
      /**
       * <code>optional uint64 previousEpoch = 1;</code>
       */
      public Builder setPreviousEpoch(long value) {
        bitField0_ |= 0x00000001;
        previousEpoch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 previousEpoch = 1;</code>
       */
      public Builder clearPreviousEpoch() {
        bitField0_ = (bitField0_ & ~0x00000001);
        previousEpoch_ = 0L;
        onChanged();
        return this;
      }

      // optional uint64 lastTransactionId = 2;
      private long lastTransactionId_ ;
      /**
       * <code>optional uint64 lastTransactionId = 2;</code>
       */
      public boolean hasLastTransactionId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint64 lastTransactionId = 2;</code>
       */
      public long getLastTransactionId() {
        return lastTransactionId_;
      }
      /**
       * <code>optional uint64 lastTransactionId = 2;</code>
       */
      public Builder setLastTransactionId(long value) {
        bitField0_ |= 0x00000002;
        lastTransactionId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 lastTransactionId = 2;</code>
       */
      public Builder clearLastTransactionId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        lastTransactionId_ = 0L;
        onChanged();
        return this;
      }

      // optional bool inSync = 3;
      private boolean inSync_ ;
      /**
       * <code>optional bool inSync = 3;</code>
       */
      public boolean hasInSync() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bool inSync = 3;</code>
       */
      public boolean getInSync() {
        return inSync_;
      }
      /**
       * <code>optional bool inSync = 3;</code>
       */
      public Builder setInSync(boolean value) {
        bitField0_ |= 0x00000004;
        inSync_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool inSync = 3;</code>
       */
      public Builder clearInSync() {
        bitField0_ = (bitField0_ & ~0x00000004);
        inSync_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.FenceResponseProto)
    }

    static {
      defaultInstance = new FenceResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.FenceResponseProto)
  }

  /**
   * Protobuf service {@code hadoop.hdfs.JournalProtocolService}
   *
   * <pre>
   **
   * Protocol used to journal edits to a remote node. Currently,
   * this is used to publish edits from the NameNode to a BackupNode.
   *
   * See the request and response for details of rpc call.
   * </pre>
   */
  public static abstract class JournalProtocolService
      implements com.google.protobuf.Service {
    protected JournalProtocolService() {}

    public interface Interface {
      /**
       * <code>rpc journal(.hadoop.hdfs.JournalRequestProto) returns (.hadoop.hdfs.JournalResponseProto);</code>
       *
       * <pre>
       **
       * Request sent by active namenode to backup node via 
       * EditLogBackupOutputStream to stream editlog records.
       * </pre>
       */
      public abstract void journal(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto> done);

      /**
       * <code>rpc startLogSegment(.hadoop.hdfs.StartLogSegmentRequestProto) returns (.hadoop.hdfs.StartLogSegmentResponseProto);</code>
       *
       * <pre>
       **
       * Request sent by active namenode to backup node to notify 
       * that the NameNode has rolled its edit logs and is now writing a 
       * new log segment.
       * </pre>
       */
      public abstract void startLogSegment(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto> done);

      /**
       * <code>rpc fence(.hadoop.hdfs.FenceRequestProto) returns (.hadoop.hdfs.FenceResponseProto);</code>
       *
       * <pre>
       **
       * Request to fence a journal receiver.
       * </pre>
       */
      public abstract void fence(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new JournalProtocolService() {
        @java.lang.Override
        public  void journal(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto> done) {
          impl.journal(controller, request, done);
        }

        @java.lang.Override
        public  void startLogSegment(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto> done) {
          impl.startLogSegment(controller, request, done);
        }

        @java.lang.Override
        public  void fence(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto> done) {
          impl.fence(controller, request, done);
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
              return impl.journal(controller, (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto)request);
            case 1:
              return impl.startLogSegment(controller, (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto)request);
            case 2:
              return impl.fence(controller, (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto)request);
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
              return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.getDefaultInstance();
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
              return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc journal(.hadoop.hdfs.JournalRequestProto) returns (.hadoop.hdfs.JournalResponseProto);</code>
     *
     * <pre>
     **
     * Request sent by active namenode to backup node via 
     * EditLogBackupOutputStream to stream editlog records.
     * </pre>
     */
    public abstract void journal(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto> done);

    /**
     * <code>rpc startLogSegment(.hadoop.hdfs.StartLogSegmentRequestProto) returns (.hadoop.hdfs.StartLogSegmentResponseProto);</code>
     *
     * <pre>
     **
     * Request sent by active namenode to backup node to notify 
     * that the NameNode has rolled its edit logs and is now writing a 
     * new log segment.
     * </pre>
     */
    public abstract void startLogSegment(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto> done);

    /**
     * <code>rpc fence(.hadoop.hdfs.FenceRequestProto) returns (.hadoop.hdfs.FenceResponseProto);</code>
     *
     * <pre>
     **
     * Request to fence a journal receiver.
     * </pre>
     */
    public abstract void fence(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.getDescriptor().getServices().get(0);
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
          this.journal(controller, (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.startLogSegment(controller, (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto>specializeCallback(
              done));
          return;
        case 2:
          this.fence(controller, (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto>specializeCallback(
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
          return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto.getDefaultInstance();
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
          return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalProtocolService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void journal(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance()));
      }

      public  void startLogSegment(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance()));
      }

      public  void fence(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.class,
            org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto journal(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto startLogSegment(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto fence(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto journal(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.JournalResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto startLogSegment(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.StartLogSegmentResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto fence(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.hdfs.protocol.proto.JournalProtocolProtos.FenceResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.JournalProtocolService)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_JournalInfoProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_JournalInfoProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_JournalRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_JournalRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_JournalResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_JournalResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_StartLogSegmentRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_StartLogSegmentRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_StartLogSegmentResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_StartLogSegmentResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_FenceRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_FenceRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_FenceResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_FenceResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025JournalProtocol.proto\022\013hadoop.hdfs\032\nhd" +
      "fs.proto\"Q\n\020JournalInfoProto\022\021\n\tclusterI" +
      "D\030\001 \002(\t\022\025\n\rlayoutVersion\030\002 \001(\r\022\023\n\013namesp" +
      "aceID\030\003 \001(\r\"\216\001\n\023JournalRequestProto\0222\n\013j" +
      "ournalInfo\030\001 \002(\0132\035.hadoop.hdfs.JournalIn" +
      "foProto\022\022\n\nfirstTxnId\030\002 \002(\004\022\017\n\007numTxns\030\003" +
      " \002(\r\022\017\n\007records\030\004 \002(\014\022\r\n\005epoch\030\005 \002(\004\"\026\n\024" +
      "JournalResponseProto\"n\n\033StartLogSegmentR" +
      "equestProto\0222\n\013journalInfo\030\001 \002(\0132\035.hadoo" +
      "p.hdfs.JournalInfoProto\022\014\n\004txid\030\002 \002(\004\022\r\n",
      "\005epoch\030\003 \002(\004\"\036\n\034StartLogSegmentResponseP" +
      "roto\"j\n\021FenceRequestProto\0222\n\013journalInfo" +
      "\030\001 \002(\0132\035.hadoop.hdfs.JournalInfoProto\022\r\n" +
      "\005epoch\030\002 \002(\004\022\022\n\nfencerInfo\030\003 \001(\t\"V\n\022Fenc" +
      "eResponseProto\022\025\n\rpreviousEpoch\030\001 \001(\004\022\031\n" +
      "\021lastTransactionId\030\002 \001(\004\022\016\n\006inSync\030\003 \001(\010" +
      "2\232\002\n\026JournalProtocolService\022N\n\007journal\022 " +
      ".hadoop.hdfs.JournalRequestProto\032!.hadoo" +
      "p.hdfs.JournalResponseProto\022f\n\017startLogS" +
      "egment\022(.hadoop.hdfs.StartLogSegmentRequ",
      "estProto\032).hadoop.hdfs.StartLogSegmentRe" +
      "sponseProto\022H\n\005fence\022\036.hadoop.hdfs.Fence" +
      "RequestProto\032\037.hadoop.hdfs.FenceResponse" +
      "ProtoBD\n%org.apache.hadoop.hdfs.protocol" +
      ".protoB\025JournalProtocolProtos\210\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hadoop_hdfs_JournalInfoProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hadoop_hdfs_JournalInfoProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_JournalInfoProto_descriptor,
              new java.lang.String[] { "ClusterID", "LayoutVersion", "NamespaceID", });
          internal_static_hadoop_hdfs_JournalRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_hadoop_hdfs_JournalRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_JournalRequestProto_descriptor,
              new java.lang.String[] { "JournalInfo", "FirstTxnId", "NumTxns", "Records", "Epoch", });
          internal_static_hadoop_hdfs_JournalResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_hadoop_hdfs_JournalResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_JournalResponseProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_StartLogSegmentRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_hadoop_hdfs_StartLogSegmentRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_StartLogSegmentRequestProto_descriptor,
              new java.lang.String[] { "JournalInfo", "Txid", "Epoch", });
          internal_static_hadoop_hdfs_StartLogSegmentResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_hadoop_hdfs_StartLogSegmentResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_StartLogSegmentResponseProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_FenceRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_hadoop_hdfs_FenceRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_FenceRequestProto_descriptor,
              new java.lang.String[] { "JournalInfo", "Epoch", "FencerInfo", });
          internal_static_hadoop_hdfs_FenceResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_hadoop_hdfs_FenceResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_FenceResponseProto_descriptor,
              new java.lang.String[] { "PreviousEpoch", "LastTransactionId", "InSync", });
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
