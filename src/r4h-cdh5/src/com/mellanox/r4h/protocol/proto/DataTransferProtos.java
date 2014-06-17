package com.mellanox.r4h.protocol.proto;


public final class DataTransferProtos {
  private DataTransferProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code hadoop.hdfs.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SUCCESS = 0;</code>
     */
    SUCCESS(0, 0),
    /**
     * <code>ERROR = 1;</code>
     */
    ERROR(1, 1),
    /**
     * <code>ERROR_CHECKSUM = 2;</code>
     */
    ERROR_CHECKSUM(2, 2),
    /**
     * <code>ERROR_INVALID = 3;</code>
     */
    ERROR_INVALID(3, 3),
    /**
     * <code>ERROR_EXISTS = 4;</code>
     */
    ERROR_EXISTS(4, 4),
    /**
     * <code>ERROR_ACCESS_TOKEN = 5;</code>
     */
    ERROR_ACCESS_TOKEN(5, 5),
    /**
     * <code>CHECKSUM_OK = 6;</code>
     */
    CHECKSUM_OK(6, 6),
    /**
     * <code>ERROR_UNSUPPORTED = 7;</code>
     */
    ERROR_UNSUPPORTED(7, 7),
    /**
     * <code>OOB_RESTART = 8;</code>
     *
     * <pre>
     * Quick restart
     * </pre>
     */
    OOB_RESTART(8, 8),
    /**
     * <code>OOB_RESERVED1 = 9;</code>
     *
     * <pre>
     * Reserved
     * </pre>
     */
    OOB_RESERVED1(9, 9),
    /**
     * <code>OOB_RESERVED2 = 10;</code>
     *
     * <pre>
     * Reserved
     * </pre>
     */
    OOB_RESERVED2(10, 10),
    /**
     * <code>OOB_RESERVED3 = 11;</code>
     *
     * <pre>
     * Reserved
     * </pre>
     */
    OOB_RESERVED3(11, 11),
    ;

    /**
     * <code>SUCCESS = 0;</code>
     */
    public static final int SUCCESS_VALUE = 0;
    /**
     * <code>ERROR = 1;</code>
     */
    public static final int ERROR_VALUE = 1;
    /**
     * <code>ERROR_CHECKSUM = 2;</code>
     */
    public static final int ERROR_CHECKSUM_VALUE = 2;
    /**
     * <code>ERROR_INVALID = 3;</code>
     */
    public static final int ERROR_INVALID_VALUE = 3;
    /**
     * <code>ERROR_EXISTS = 4;</code>
     */
    public static final int ERROR_EXISTS_VALUE = 4;
    /**
     * <code>ERROR_ACCESS_TOKEN = 5;</code>
     */
    public static final int ERROR_ACCESS_TOKEN_VALUE = 5;
    /**
     * <code>CHECKSUM_OK = 6;</code>
     */
    public static final int CHECKSUM_OK_VALUE = 6;
    /**
     * <code>ERROR_UNSUPPORTED = 7;</code>
     */
    public static final int ERROR_UNSUPPORTED_VALUE = 7;
    /**
     * <code>OOB_RESTART = 8;</code>
     *
     * <pre>
     * Quick restart
     * </pre>
     */
    public static final int OOB_RESTART_VALUE = 8;
    /**
     * <code>OOB_RESERVED1 = 9;</code>
     *
     * <pre>
     * Reserved
     * </pre>
     */
    public static final int OOB_RESERVED1_VALUE = 9;
    /**
     * <code>OOB_RESERVED2 = 10;</code>
     *
     * <pre>
     * Reserved
     * </pre>
     */
    public static final int OOB_RESERVED2_VALUE = 10;
    /**
     * <code>OOB_RESERVED3 = 11;</code>
     *
     * <pre>
     * Reserved
     * </pre>
     */
    public static final int OOB_RESERVED3_VALUE = 11;


    public final int getNumber() { return value; }

    public static Status valueOf(int value) {
      switch (value) {
        case 0: return SUCCESS;
        case 1: return ERROR;
        case 2: return ERROR_CHECKSUM;
        case 3: return ERROR_INVALID;
        case 4: return ERROR_EXISTS;
        case 5: return ERROR_ACCESS_TOKEN;
        case 6: return CHECKSUM_OK;
        case 7: return ERROR_UNSUPPORTED;
        case 8: return OOB_RESTART;
        case 9: return OOB_RESERVED1;
        case 10: return OOB_RESERVED2;
        case 11: return OOB_RESERVED3;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Status(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:hadoop.hdfs.Status)
  }

  public interface DataTransferEncryptorMessageProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status = 1;
    /**
     * <code>required .hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>required .hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus getStatus();

    // optional bytes payload = 2;
    /**
     * <code>optional bytes payload = 2;</code>
     */
    boolean hasPayload();
    /**
     * <code>optional bytes payload = 2;</code>
     */
    com.google.protobuf.ByteString getPayload();

    // optional string message = 3;
    /**
     * <code>optional string message = 3;</code>
     */
    boolean hasMessage();
    /**
     * <code>optional string message = 3;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>optional string message = 3;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.DataTransferEncryptorMessageProto}
   */
  public static final class DataTransferEncryptorMessageProto extends
      com.google.protobuf.GeneratedMessage
      implements DataTransferEncryptorMessageProtoOrBuilder {
    // Use DataTransferEncryptorMessageProto.newBuilder() to construct.
    private DataTransferEncryptorMessageProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DataTransferEncryptorMessageProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DataTransferEncryptorMessageProto defaultInstance;
    public static DataTransferEncryptorMessageProto getDefaultInstance() {
      return defaultInstance;
    }

    public DataTransferEncryptorMessageProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DataTransferEncryptorMessageProto(
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
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus value = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                status_ = value;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              payload_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              message_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_DataTransferEncryptorMessageProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_DataTransferEncryptorMessageProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.Builder.class);
    }

    public static com.google.protobuf.Parser<DataTransferEncryptorMessageProto> PARSER =
        new com.google.protobuf.AbstractParser<DataTransferEncryptorMessageProto>() {
      public DataTransferEncryptorMessageProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DataTransferEncryptorMessageProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DataTransferEncryptorMessageProto> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus}
     */
    public enum DataTransferEncryptorStatus
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>SUCCESS = 0;</code>
       */
      SUCCESS(0, 0),
      /**
       * <code>ERROR_UNKNOWN_KEY = 1;</code>
       */
      ERROR_UNKNOWN_KEY(1, 1),
      /**
       * <code>ERROR = 2;</code>
       */
      ERROR(2, 2),
      ;

      /**
       * <code>SUCCESS = 0;</code>
       */
      public static final int SUCCESS_VALUE = 0;
      /**
       * <code>ERROR_UNKNOWN_KEY = 1;</code>
       */
      public static final int ERROR_UNKNOWN_KEY_VALUE = 1;
      /**
       * <code>ERROR = 2;</code>
       */
      public static final int ERROR_VALUE = 2;


      public final int getNumber() { return value; }

      public static DataTransferEncryptorStatus valueOf(int value) {
        switch (value) {
          case 0: return SUCCESS;
          case 1: return ERROR_UNKNOWN_KEY;
          case 2: return ERROR;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DataTransferEncryptorStatus>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<DataTransferEncryptorStatus>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DataTransferEncryptorStatus>() {
              public DataTransferEncryptorStatus findValueByNumber(int number) {
                return DataTransferEncryptorStatus.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final DataTransferEncryptorStatus[] VALUES = values();

      public static DataTransferEncryptorStatus valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private DataTransferEncryptorStatus(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus)
    }

    private int bitField0_;
    // required .hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status = 1;
    public static final int STATUS_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status_;
    /**
     * <code>required .hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus getStatus() {
      return status_;
    }

    // optional bytes payload = 2;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString payload_;
    /**
     * <code>optional bytes payload = 2;</code>
     */
    public boolean hasPayload() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes payload = 2;</code>
     */
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }

    // optional string message = 3;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    private java.lang.Object message_;
    /**
     * <code>optional string message = 3;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string message = 3;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string message = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus.SUCCESS;
      payload_ = com.google.protobuf.ByteString.EMPTY;
      message_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasStatus()) {
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
        output.writeEnum(1, status_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, payload_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMessageBytes());
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
          .computeEnumSize(1, status_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, payload_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMessageBytes());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto) obj;

      boolean result = true;
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result &&
            (getStatus() == other.getStatus());
      }
      result = result && (hasPayload() == other.hasPayload());
      if (hasPayload()) {
        result = result && getPayload()
            .equals(other.getPayload());
      }
      result = result && (hasMessage() == other.hasMessage());
      if (hasMessage()) {
        result = result && getMessage()
            .equals(other.getMessage());
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
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getStatus());
      }
      if (hasPayload()) {
        hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
        hash = (53 * hash) + getPayload().hashCode();
      }
      if (hasMessage()) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.DataTransferEncryptorMessageProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_DataTransferEncryptorMessageProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_DataTransferEncryptorMessageProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.newBuilder()
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
        status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus.SUCCESS;
        bitField0_ = (bitField0_ & ~0x00000001);
        payload_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_DataTransferEncryptorMessageProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.payload_ = payload_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasPayload()) {
          setPayload(other.getPayload());
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000004;
          message_ = other.message_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStatus()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus.SUCCESS;
      /**
       * <code>required .hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus getStatus() {
        return status_;
      }
      /**
       * <code>required .hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status = 1;</code>
       */
      public Builder setStatus(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DataTransferEncryptorMessageProto.DataTransferEncryptorStatus.SUCCESS;
        onChanged();
        return this;
      }

      // optional bytes payload = 2;
      private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes payload = 2;</code>
       */
      public boolean hasPayload() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bytes payload = 2;</code>
       */
      public com.google.protobuf.ByteString getPayload() {
        return payload_;
      }
      /**
       * <code>optional bytes payload = 2;</code>
       */
      public Builder setPayload(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        payload_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes payload = 2;</code>
       */
      public Builder clearPayload() {
        bitField0_ = (bitField0_ & ~0x00000002);
        payload_ = getDefaultInstance().getPayload();
        onChanged();
        return this;
      }

      // optional string message = 3;
      private java.lang.Object message_ = "";
      /**
       * <code>optional string message = 3;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000004);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.DataTransferEncryptorMessageProto)
    }

    static {
      defaultInstance = new DataTransferEncryptorMessageProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.DataTransferEncryptorMessageProto)
  }

  public interface BaseHeaderProtoOrBuilder
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

    // optional .hadoop.common.TokenProto token = 2;
    /**
     * <code>optional .hadoop.common.TokenProto token = 2;</code>
     */
    boolean hasToken();
    /**
     * <code>optional .hadoop.common.TokenProto token = 2;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken();
    /**
     * <code>optional .hadoop.common.TokenProto token = 2;</code>
     */
    org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.BaseHeaderProto}
   */
  public static final class BaseHeaderProto extends
      com.google.protobuf.GeneratedMessage
      implements BaseHeaderProtoOrBuilder {
    // Use BaseHeaderProto.newBuilder() to construct.
    private BaseHeaderProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BaseHeaderProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BaseHeaderProto defaultInstance;
    public static BaseHeaderProto getDefaultInstance() {
      return defaultInstance;
    }

    public BaseHeaderProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BaseHeaderProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_BaseHeaderProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_BaseHeaderProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder.class);
    }

    public static com.google.protobuf.Parser<BaseHeaderProto> PARSER =
        new com.google.protobuf.AbstractParser<BaseHeaderProto>() {
      public BaseHeaderProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BaseHeaderProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BaseHeaderProto> getParserForType() {
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

    // optional .hadoop.common.TokenProto token = 2;
    public static final int TOKEN_FIELD_NUMBER = 2;
    private org.apache.hadoop.security.proto.SecurityProtos.TokenProto token_;
    /**
     * <code>optional .hadoop.common.TokenProto token = 2;</code>
     */
    public boolean hasToken() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .hadoop.common.TokenProto token = 2;</code>
     */
    public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken() {
      return token_;
    }
    /**
     * <code>optional .hadoop.common.TokenProto token = 2;</code>
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
      if (!getBlock().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasToken()) {
        if (!getToken().isInitialized()) {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.BaseHeaderProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_BaseHeaderProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_BaseHeaderProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_BaseHeaderProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto(this);
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
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance()) return this;
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
        if (!getBlock().isInitialized()) {
          
          return false;
        }
        if (hasToken()) {
          if (!getToken().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto) e.getUnfinishedMessage();
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

      // optional .hadoop.common.TokenProto token = 2;
      private org.apache.hadoop.security.proto.SecurityProtos.TokenProto token_ = org.apache.hadoop.security.proto.SecurityProtos.TokenProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.security.proto.SecurityProtos.TokenProto, org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder, org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder> tokenBuilder_;
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      public boolean hasToken() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto getToken() {
        if (tokenBuilder_ == null) {
          return token_;
        } else {
          return tokenBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
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
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
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
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
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
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
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
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProto.Builder getTokenBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getTokenFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
       */
      public org.apache.hadoop.security.proto.SecurityProtos.TokenProtoOrBuilder getTokenOrBuilder() {
        if (tokenBuilder_ != null) {
          return tokenBuilder_.getMessageOrBuilder();
        } else {
          return token_;
        }
      }
      /**
       * <code>optional .hadoop.common.TokenProto token = 2;</code>
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

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.BaseHeaderProto)
    }

    static {
      defaultInstance = new BaseHeaderProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.BaseHeaderProto)
  }

  public interface ClientOperationHeaderProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
     */
    boolean hasBaseHeader();
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getBaseHeader();
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getBaseHeaderOrBuilder();

    // required string clientName = 2;
    /**
     * <code>required string clientName = 2;</code>
     */
    boolean hasClientName();
    /**
     * <code>required string clientName = 2;</code>
     */
    java.lang.String getClientName();
    /**
     * <code>required string clientName = 2;</code>
     */
    com.google.protobuf.ByteString
        getClientNameBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ClientOperationHeaderProto}
   */
  public static final class ClientOperationHeaderProto extends
      com.google.protobuf.GeneratedMessage
      implements ClientOperationHeaderProtoOrBuilder {
    // Use ClientOperationHeaderProto.newBuilder() to construct.
    private ClientOperationHeaderProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ClientOperationHeaderProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ClientOperationHeaderProto defaultInstance;
    public static ClientOperationHeaderProto getDefaultInstance() {
      return defaultInstance;
    }

    public ClientOperationHeaderProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ClientOperationHeaderProto(
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
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = baseHeader_.toBuilder();
              }
              baseHeader_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseHeader_);
                baseHeader_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              clientName_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ClientOperationHeaderProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ClientOperationHeaderProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ClientOperationHeaderProto> PARSER =
        new com.google.protobuf.AbstractParser<ClientOperationHeaderProto>() {
      public ClientOperationHeaderProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientOperationHeaderProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ClientOperationHeaderProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;
    public static final int BASEHEADER_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto baseHeader_;
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
     */
    public boolean hasBaseHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getBaseHeader() {
      return baseHeader_;
    }
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getBaseHeaderOrBuilder() {
      return baseHeader_;
    }

    // required string clientName = 2;
    public static final int CLIENTNAME_FIELD_NUMBER = 2;
    private java.lang.Object clientName_;
    /**
     * <code>required string clientName = 2;</code>
     */
    public boolean hasClientName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string clientName = 2;</code>
     */
    public java.lang.String getClientName() {
      java.lang.Object ref = clientName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string clientName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getClientNameBytes() {
      java.lang.Object ref = clientName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      baseHeader_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
      clientName_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBaseHeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasClientName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getBaseHeader().isInitialized()) {
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
        output.writeMessage(1, baseHeader_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getClientNameBytes());
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
          .computeMessageSize(1, baseHeader_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getClientNameBytes());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto) obj;

      boolean result = true;
      result = result && (hasBaseHeader() == other.hasBaseHeader());
      if (hasBaseHeader()) {
        result = result && getBaseHeader()
            .equals(other.getBaseHeader());
      }
      result = result && (hasClientName() == other.hasClientName());
      if (hasClientName()) {
        result = result && getClientName()
            .equals(other.getClientName());
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
      if (hasBaseHeader()) {
        hash = (37 * hash) + BASEHEADER_FIELD_NUMBER;
        hash = (53 * hash) + getBaseHeader().hashCode();
      }
      if (hasClientName()) {
        hash = (37 * hash) + CLIENTNAME_FIELD_NUMBER;
        hash = (53 * hash) + getClientName().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ClientOperationHeaderProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ClientOperationHeaderProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ClientOperationHeaderProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.newBuilder()
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
          getBaseHeaderFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (baseHeaderBuilder_ == null) {
          baseHeader_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
        } else {
          baseHeaderBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        clientName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ClientOperationHeaderProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (baseHeaderBuilder_ == null) {
          result.baseHeader_ = baseHeader_;
        } else {
          result.baseHeader_ = baseHeaderBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.clientName_ = clientName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance()) return this;
        if (other.hasBaseHeader()) {
          mergeBaseHeader(other.getBaseHeader());
        }
        if (other.hasClientName()) {
          bitField0_ |= 0x00000002;
          clientName_ = other.clientName_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBaseHeader()) {
          
          return false;
        }
        if (!hasClientName()) {
          
          return false;
        }
        if (!getBaseHeader().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto baseHeader_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder> baseHeaderBuilder_;
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
       */
      public boolean hasBaseHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getBaseHeader() {
        if (baseHeaderBuilder_ == null) {
          return baseHeader_;
        } else {
          return baseHeaderBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
       */
      public Builder setBaseHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto value) {
        if (baseHeaderBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseHeader_ = value;
          onChanged();
        } else {
          baseHeaderBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
       */
      public Builder setBaseHeader(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder builderForValue) {
        if (baseHeaderBuilder_ == null) {
          baseHeader_ = builderForValue.build();
          onChanged();
        } else {
          baseHeaderBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
       */
      public Builder mergeBaseHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto value) {
        if (baseHeaderBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              baseHeader_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance()) {
            baseHeader_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.newBuilder(baseHeader_).mergeFrom(value).buildPartial();
          } else {
            baseHeader_ = value;
          }
          onChanged();
        } else {
          baseHeaderBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
       */
      public Builder clearBaseHeader() {
        if (baseHeaderBuilder_ == null) {
          baseHeader_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
          onChanged();
        } else {
          baseHeaderBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder getBaseHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBaseHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getBaseHeaderOrBuilder() {
        if (baseHeaderBuilder_ != null) {
          return baseHeaderBuilder_.getMessageOrBuilder();
        } else {
          return baseHeader_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto baseHeader = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder> 
          getBaseHeaderFieldBuilder() {
        if (baseHeaderBuilder_ == null) {
          baseHeaderBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder>(
                  baseHeader_,
                  getParentForChildren(),
                  isClean());
          baseHeader_ = null;
        }
        return baseHeaderBuilder_;
      }

      // required string clientName = 2;
      private java.lang.Object clientName_ = "";
      /**
       * <code>required string clientName = 2;</code>
       */
      public boolean hasClientName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string clientName = 2;</code>
       */
      public java.lang.String getClientName() {
        java.lang.Object ref = clientName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          clientName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string clientName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getClientNameBytes() {
        java.lang.Object ref = clientName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string clientName = 2;</code>
       */
      public Builder setClientName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        clientName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string clientName = 2;</code>
       */
      public Builder clearClientName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        clientName_ = getDefaultInstance().getClientName();
        onChanged();
        return this;
      }
      /**
       * <code>required string clientName = 2;</code>
       */
      public Builder setClientNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        clientName_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ClientOperationHeaderProto)
    }

    static {
      defaultInstance = new ClientOperationHeaderProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ClientOperationHeaderProto)
  }

  public interface CachingStrategyProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional bool dropBehind = 1;
    /**
     * <code>optional bool dropBehind = 1;</code>
     */
    boolean hasDropBehind();
    /**
     * <code>optional bool dropBehind = 1;</code>
     */
    boolean getDropBehind();

    // optional int64 readahead = 2;
    /**
     * <code>optional int64 readahead = 2;</code>
     */
    boolean hasReadahead();
    /**
     * <code>optional int64 readahead = 2;</code>
     */
    long getReadahead();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.CachingStrategyProto}
   */
  public static final class CachingStrategyProto extends
      com.google.protobuf.GeneratedMessage
      implements CachingStrategyProtoOrBuilder {
    // Use CachingStrategyProto.newBuilder() to construct.
    private CachingStrategyProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CachingStrategyProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CachingStrategyProto defaultInstance;
    public static CachingStrategyProto getDefaultInstance() {
      return defaultInstance;
    }

    public CachingStrategyProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CachingStrategyProto(
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
              dropBehind_ = input.readBool();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              readahead_ = input.readInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_CachingStrategyProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_CachingStrategyProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder.class);
    }

    public static com.google.protobuf.Parser<CachingStrategyProto> PARSER =
        new com.google.protobuf.AbstractParser<CachingStrategyProto>() {
      public CachingStrategyProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CachingStrategyProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CachingStrategyProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional bool dropBehind = 1;
    public static final int DROPBEHIND_FIELD_NUMBER = 1;
    private boolean dropBehind_;
    /**
     * <code>optional bool dropBehind = 1;</code>
     */
    public boolean hasDropBehind() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional bool dropBehind = 1;</code>
     */
    public boolean getDropBehind() {
      return dropBehind_;
    }

    // optional int64 readahead = 2;
    public static final int READAHEAD_FIELD_NUMBER = 2;
    private long readahead_;
    /**
     * <code>optional int64 readahead = 2;</code>
     */
    public boolean hasReadahead() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 readahead = 2;</code>
     */
    public long getReadahead() {
      return readahead_;
    }

    private void initFields() {
      dropBehind_ = false;
      readahead_ = 0L;
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
        output.writeBool(1, dropBehind_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, readahead_);
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
          .computeBoolSize(1, dropBehind_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, readahead_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto) obj;

      boolean result = true;
      result = result && (hasDropBehind() == other.hasDropBehind());
      if (hasDropBehind()) {
        result = result && (getDropBehind()
            == other.getDropBehind());
      }
      result = result && (hasReadahead() == other.hasReadahead());
      if (hasReadahead()) {
        result = result && (getReadahead()
            == other.getReadahead());
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
      if (hasDropBehind()) {
        hash = (37 * hash) + DROPBEHIND_FIELD_NUMBER;
        hash = (53 * hash) + hashBoolean(getDropBehind());
      }
      if (hasReadahead()) {
        hash = (37 * hash) + READAHEAD_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getReadahead());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.CachingStrategyProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_CachingStrategyProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_CachingStrategyProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.newBuilder()
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
        dropBehind_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        readahead_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_CachingStrategyProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.dropBehind_ = dropBehind_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.readahead_ = readahead_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.getDefaultInstance()) return this;
        if (other.hasDropBehind()) {
          setDropBehind(other.getDropBehind());
        }
        if (other.hasReadahead()) {
          setReadahead(other.getReadahead());
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
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional bool dropBehind = 1;
      private boolean dropBehind_ ;
      /**
       * <code>optional bool dropBehind = 1;</code>
       */
      public boolean hasDropBehind() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional bool dropBehind = 1;</code>
       */
      public boolean getDropBehind() {
        return dropBehind_;
      }
      /**
       * <code>optional bool dropBehind = 1;</code>
       */
      public Builder setDropBehind(boolean value) {
        bitField0_ |= 0x00000001;
        dropBehind_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool dropBehind = 1;</code>
       */
      public Builder clearDropBehind() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dropBehind_ = false;
        onChanged();
        return this;
      }

      // optional int64 readahead = 2;
      private long readahead_ ;
      /**
       * <code>optional int64 readahead = 2;</code>
       */
      public boolean hasReadahead() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 readahead = 2;</code>
       */
      public long getReadahead() {
        return readahead_;
      }
      /**
       * <code>optional int64 readahead = 2;</code>
       */
      public Builder setReadahead(long value) {
        bitField0_ |= 0x00000002;
        readahead_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 readahead = 2;</code>
       */
      public Builder clearReadahead() {
        bitField0_ = (bitField0_ & ~0x00000002);
        readahead_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.CachingStrategyProto)
    }

    static {
      defaultInstance = new CachingStrategyProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.CachingStrategyProto)
  }

  public interface OpReadBlockProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.ClientOperationHeaderProto header = 1;
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    boolean hasHeader();
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto getHeader();
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder getHeaderOrBuilder();

    // required uint64 offset = 2;
    /**
     * <code>required uint64 offset = 2;</code>
     */
    boolean hasOffset();
    /**
     * <code>required uint64 offset = 2;</code>
     */
    long getOffset();

    // required uint64 len = 3;
    /**
     * <code>required uint64 len = 3;</code>
     */
    boolean hasLen();
    /**
     * <code>required uint64 len = 3;</code>
     */
    long getLen();

    // optional bool sendChecksums = 4 [default = true];
    /**
     * <code>optional bool sendChecksums = 4 [default = true];</code>
     */
    boolean hasSendChecksums();
    /**
     * <code>optional bool sendChecksums = 4 [default = true];</code>
     */
    boolean getSendChecksums();

    // optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;
    /**
     * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
     */
    boolean hasCachingStrategy();
    /**
     * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto getCachingStrategy();
    /**
     * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder getCachingStrategyOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.OpReadBlockProto}
   */
  public static final class OpReadBlockProto extends
      com.google.protobuf.GeneratedMessage
      implements OpReadBlockProtoOrBuilder {
    // Use OpReadBlockProto.newBuilder() to construct.
    private OpReadBlockProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OpReadBlockProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OpReadBlockProto defaultInstance;
    public static OpReadBlockProto getDefaultInstance() {
      return defaultInstance;
    }

    public OpReadBlockProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OpReadBlockProto(
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
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              offset_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              len_ = input.readUInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              sendChecksums_ = input.readBool();
              break;
            }
            case 42: {
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000010) == 0x00000010)) {
                subBuilder = cachingStrategy_.toBuilder();
              }
              cachingStrategy_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cachingStrategy_);
                cachingStrategy_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000010;
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpReadBlockProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpReadBlockProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto.Builder.class);
    }

    public static com.google.protobuf.Parser<OpReadBlockProto> PARSER =
        new com.google.protobuf.AbstractParser<OpReadBlockProto>() {
      public OpReadBlockProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpReadBlockProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OpReadBlockProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.ClientOperationHeaderProto header = 1;
    public static final int HEADER_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto header_;
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto getHeader() {
      return header_;
    }
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder getHeaderOrBuilder() {
      return header_;
    }

    // required uint64 offset = 2;
    public static final int OFFSET_FIELD_NUMBER = 2;
    private long offset_;
    /**
     * <code>required uint64 offset = 2;</code>
     */
    public boolean hasOffset() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint64 offset = 2;</code>
     */
    public long getOffset() {
      return offset_;
    }

    // required uint64 len = 3;
    public static final int LEN_FIELD_NUMBER = 3;
    private long len_;
    /**
     * <code>required uint64 len = 3;</code>
     */
    public boolean hasLen() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required uint64 len = 3;</code>
     */
    public long getLen() {
      return len_;
    }

    // optional bool sendChecksums = 4 [default = true];
    public static final int SENDCHECKSUMS_FIELD_NUMBER = 4;
    private boolean sendChecksums_;
    /**
     * <code>optional bool sendChecksums = 4 [default = true];</code>
     */
    public boolean hasSendChecksums() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bool sendChecksums = 4 [default = true];</code>
     */
    public boolean getSendChecksums() {
      return sendChecksums_;
    }

    // optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;
    public static final int CACHINGSTRATEGY_FIELD_NUMBER = 5;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto cachingStrategy_;
    /**
     * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
     */
    public boolean hasCachingStrategy() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto getCachingStrategy() {
      return cachingStrategy_;
    }
    /**
     * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder getCachingStrategyOrBuilder() {
      return cachingStrategy_;
    }

    private void initFields() {
      header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
      offset_ = 0L;
      len_ = 0L;
      sendChecksums_ = true;
      cachingStrategy_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasHeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOffset()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLen()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHeader().isInitialized()) {
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
        output.writeMessage(1, header_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, offset_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, len_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, sendChecksums_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, cachingStrategy_);
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
          .computeMessageSize(1, header_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, offset_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, len_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, sendChecksums_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, cachingStrategy_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto) obj;

      boolean result = true;
      result = result && (hasHeader() == other.hasHeader());
      if (hasHeader()) {
        result = result && getHeader()
            .equals(other.getHeader());
      }
      result = result && (hasOffset() == other.hasOffset());
      if (hasOffset()) {
        result = result && (getOffset()
            == other.getOffset());
      }
      result = result && (hasLen() == other.hasLen());
      if (hasLen()) {
        result = result && (getLen()
            == other.getLen());
      }
      result = result && (hasSendChecksums() == other.hasSendChecksums());
      if (hasSendChecksums()) {
        result = result && (getSendChecksums()
            == other.getSendChecksums());
      }
      result = result && (hasCachingStrategy() == other.hasCachingStrategy());
      if (hasCachingStrategy()) {
        result = result && getCachingStrategy()
            .equals(other.getCachingStrategy());
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
      if (hasHeader()) {
        hash = (37 * hash) + HEADER_FIELD_NUMBER;
        hash = (53 * hash) + getHeader().hashCode();
      }
      if (hasOffset()) {
        hash = (37 * hash) + OFFSET_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getOffset());
      }
      if (hasLen()) {
        hash = (37 * hash) + LEN_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getLen());
      }
      if (hasSendChecksums()) {
        hash = (37 * hash) + SENDCHECKSUMS_FIELD_NUMBER;
        hash = (53 * hash) + hashBoolean(getSendChecksums());
      }
      if (hasCachingStrategy()) {
        hash = (37 * hash) + CACHINGSTRATEGY_FIELD_NUMBER;
        hash = (53 * hash) + getCachingStrategy().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.OpReadBlockProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpReadBlockProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpReadBlockProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto.newBuilder()
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
          getHeaderFieldBuilder();
          getCachingStrategyFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        offset_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        len_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        sendChecksums_ = true;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (cachingStrategyBuilder_ == null) {
          cachingStrategy_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.getDefaultInstance();
        } else {
          cachingStrategyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpReadBlockProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (headerBuilder_ == null) {
          result.header_ = header_;
        } else {
          result.header_ = headerBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.offset_ = offset_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.len_ = len_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.sendChecksums_ = sendChecksums_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (cachingStrategyBuilder_ == null) {
          result.cachingStrategy_ = cachingStrategy_;
        } else {
          result.cachingStrategy_ = cachingStrategyBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        if (other.hasOffset()) {
          setOffset(other.getOffset());
        }
        if (other.hasLen()) {
          setLen(other.getLen());
        }
        if (other.hasSendChecksums()) {
          setSendChecksums(other.getSendChecksums());
        }
        if (other.hasCachingStrategy()) {
          mergeCachingStrategy(other.getCachingStrategy());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHeader()) {
          
          return false;
        }
        if (!hasOffset()) {
          
          return false;
        }
        if (!hasLen()) {
          
          return false;
        }
        if (!getHeader().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReadBlockProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.ClientOperationHeaderProto header = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder> headerBuilder_;
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto getHeader() {
        if (headerBuilder_ == null) {
          return header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public Builder setHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public Builder setHeader(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public Builder mergeHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              header_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance()) {
            header_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder> 
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder>(
                  header_,
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      // required uint64 offset = 2;
      private long offset_ ;
      /**
       * <code>required uint64 offset = 2;</code>
       */
      public boolean hasOffset() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint64 offset = 2;</code>
       */
      public long getOffset() {
        return offset_;
      }
      /**
       * <code>required uint64 offset = 2;</code>
       */
      public Builder setOffset(long value) {
        bitField0_ |= 0x00000002;
        offset_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 offset = 2;</code>
       */
      public Builder clearOffset() {
        bitField0_ = (bitField0_ & ~0x00000002);
        offset_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 len = 3;
      private long len_ ;
      /**
       * <code>required uint64 len = 3;</code>
       */
      public boolean hasLen() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required uint64 len = 3;</code>
       */
      public long getLen() {
        return len_;
      }
      /**
       * <code>required uint64 len = 3;</code>
       */
      public Builder setLen(long value) {
        bitField0_ |= 0x00000004;
        len_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 len = 3;</code>
       */
      public Builder clearLen() {
        bitField0_ = (bitField0_ & ~0x00000004);
        len_ = 0L;
        onChanged();
        return this;
      }

      // optional bool sendChecksums = 4 [default = true];
      private boolean sendChecksums_ = true;
      /**
       * <code>optional bool sendChecksums = 4 [default = true];</code>
       */
      public boolean hasSendChecksums() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bool sendChecksums = 4 [default = true];</code>
       */
      public boolean getSendChecksums() {
        return sendChecksums_;
      }
      /**
       * <code>optional bool sendChecksums = 4 [default = true];</code>
       */
      public Builder setSendChecksums(boolean value) {
        bitField0_ |= 0x00000008;
        sendChecksums_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool sendChecksums = 4 [default = true];</code>
       */
      public Builder clearSendChecksums() {
        bitField0_ = (bitField0_ & ~0x00000008);
        sendChecksums_ = true;
        onChanged();
        return this;
      }

      // optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto cachingStrategy_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder> cachingStrategyBuilder_;
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
       */
      public boolean hasCachingStrategy() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto getCachingStrategy() {
        if (cachingStrategyBuilder_ == null) {
          return cachingStrategy_;
        } else {
          return cachingStrategyBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
       */
      public Builder setCachingStrategy(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto value) {
        if (cachingStrategyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          cachingStrategy_ = value;
          onChanged();
        } else {
          cachingStrategyBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
       */
      public Builder setCachingStrategy(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder builderForValue) {
        if (cachingStrategyBuilder_ == null) {
          cachingStrategy_ = builderForValue.build();
          onChanged();
        } else {
          cachingStrategyBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
       */
      public Builder mergeCachingStrategy(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto value) {
        if (cachingStrategyBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010) &&
              cachingStrategy_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.getDefaultInstance()) {
            cachingStrategy_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.newBuilder(cachingStrategy_).mergeFrom(value).buildPartial();
          } else {
            cachingStrategy_ = value;
          }
          onChanged();
        } else {
          cachingStrategyBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
       */
      public Builder clearCachingStrategy() {
        if (cachingStrategyBuilder_ == null) {
          cachingStrategy_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.getDefaultInstance();
          onChanged();
        } else {
          cachingStrategyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder getCachingStrategyBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getCachingStrategyFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder getCachingStrategyOrBuilder() {
        if (cachingStrategyBuilder_ != null) {
          return cachingStrategyBuilder_.getMessageOrBuilder();
        } else {
          return cachingStrategy_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder> 
          getCachingStrategyFieldBuilder() {
        if (cachingStrategyBuilder_ == null) {
          cachingStrategyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder>(
                  cachingStrategy_,
                  getParentForChildren(),
                  isClean());
          cachingStrategy_ = null;
        }
        return cachingStrategyBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.OpReadBlockProto)
    }

    static {
      defaultInstance = new OpReadBlockProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.OpReadBlockProto)
  }

  public interface ChecksumProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.ChecksumTypeProto type = 1;
    /**
     * <code>required .hadoop.hdfs.ChecksumTypeProto type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required .hadoop.hdfs.ChecksumTypeProto type = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto getType();

    // required uint32 bytesPerChecksum = 2;
    /**
     * <code>required uint32 bytesPerChecksum = 2;</code>
     */
    boolean hasBytesPerChecksum();
    /**
     * <code>required uint32 bytesPerChecksum = 2;</code>
     */
    int getBytesPerChecksum();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ChecksumProto}
   */
  public static final class ChecksumProto extends
      com.google.protobuf.GeneratedMessage
      implements ChecksumProtoOrBuilder {
    // Use ChecksumProto.newBuilder() to construct.
    private ChecksumProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ChecksumProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ChecksumProto defaultInstance;
    public static ChecksumProto getDefaultInstance() {
      return defaultInstance;
    }

    public ChecksumProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ChecksumProto(
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
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto value = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              bytesPerChecksum_ = input.readUInt32();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ChecksumProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ChecksumProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ChecksumProto> PARSER =
        new com.google.protobuf.AbstractParser<ChecksumProto>() {
      public ChecksumProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChecksumProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ChecksumProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.ChecksumTypeProto type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto type_;
    /**
     * <code>required .hadoop.hdfs.ChecksumTypeProto type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.ChecksumTypeProto type = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto getType() {
      return type_;
    }

    // required uint32 bytesPerChecksum = 2;
    public static final int BYTESPERCHECKSUM_FIELD_NUMBER = 2;
    private int bytesPerChecksum_;
    /**
     * <code>required uint32 bytesPerChecksum = 2;</code>
     */
    public boolean hasBytesPerChecksum() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 bytesPerChecksum = 2;</code>
     */
    public int getBytesPerChecksum() {
      return bytesPerChecksum_;
    }

    private void initFields() {
      type_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto.CHECKSUM_NULL;
      bytesPerChecksum_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBytesPerChecksum()) {
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
        output.writeEnum(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, bytesPerChecksum_);
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
          .computeEnumSize(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, bytesPerChecksum_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result &&
            (getType() == other.getType());
      }
      result = result && (hasBytesPerChecksum() == other.hasBytesPerChecksum());
      if (hasBytesPerChecksum()) {
        result = result && (getBytesPerChecksum()
            == other.getBytesPerChecksum());
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
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getType());
      }
      if (hasBytesPerChecksum()) {
        hash = (37 * hash) + BYTESPERCHECKSUM_FIELD_NUMBER;
        hash = (53 * hash) + getBytesPerChecksum();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ChecksumProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ChecksumProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ChecksumProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.newBuilder()
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
        type_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto.CHECKSUM_NULL;
        bitField0_ = (bitField0_ & ~0x00000001);
        bytesPerChecksum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ChecksumProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.bytesPerChecksum_ = bytesPerChecksum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasBytesPerChecksum()) {
          setBytesPerChecksum(other.getBytesPerChecksum());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (!hasBytesPerChecksum()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.ChecksumTypeProto type = 1;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto type_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto.CHECKSUM_NULL;
      /**
       * <code>required .hadoop.hdfs.ChecksumTypeProto type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumTypeProto type = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto getType() {
        return type_;
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumTypeProto type = 1;</code>
       */
      public Builder setType(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumTypeProto type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto.CHECKSUM_NULL;
        onChanged();
        return this;
      }

      // required uint32 bytesPerChecksum = 2;
      private int bytesPerChecksum_ ;
      /**
       * <code>required uint32 bytesPerChecksum = 2;</code>
       */
      public boolean hasBytesPerChecksum() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint32 bytesPerChecksum = 2;</code>
       */
      public int getBytesPerChecksum() {
        return bytesPerChecksum_;
      }
      /**
       * <code>required uint32 bytesPerChecksum = 2;</code>
       */
      public Builder setBytesPerChecksum(int value) {
        bitField0_ |= 0x00000002;
        bytesPerChecksum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 bytesPerChecksum = 2;</code>
       */
      public Builder clearBytesPerChecksum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        bytesPerChecksum_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ChecksumProto)
    }

    static {
      defaultInstance = new ChecksumProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ChecksumProto)
  }

  public interface OpWriteBlockProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.ClientOperationHeaderProto header = 1;
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    boolean hasHeader();
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto getHeader();
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder getHeaderOrBuilder();

    // repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto> 
        getTargetsList();
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto getTargets(int index);
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    int getTargetsCount();
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> 
        getTargetsOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder getTargetsOrBuilder(
        int index);

    // optional .hadoop.hdfs.DatanodeInfoProto source = 3;
    /**
     * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
     */
    boolean hasSource();
    /**
     * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto getSource();
    /**
     * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder getSourceOrBuilder();

    // required .hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage stage = 4;
    /**
     * <code>required .hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage stage = 4;</code>
     */
    boolean hasStage();
    /**
     * <code>required .hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage stage = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.BlockConstructionStage getStage();

    // required uint32 pipelineSize = 5;
    /**
     * <code>required uint32 pipelineSize = 5;</code>
     */
    boolean hasPipelineSize();
    /**
     * <code>required uint32 pipelineSize = 5;</code>
     */
    int getPipelineSize();

    // required uint64 minBytesRcvd = 6;
    /**
     * <code>required uint64 minBytesRcvd = 6;</code>
     */
    boolean hasMinBytesRcvd();
    /**
     * <code>required uint64 minBytesRcvd = 6;</code>
     */
    long getMinBytesRcvd();

    // required uint64 maxBytesRcvd = 7;
    /**
     * <code>required uint64 maxBytesRcvd = 7;</code>
     */
    boolean hasMaxBytesRcvd();
    /**
     * <code>required uint64 maxBytesRcvd = 7;</code>
     */
    long getMaxBytesRcvd();

    // required uint64 latestGenerationStamp = 8;
    /**
     * <code>required uint64 latestGenerationStamp = 8;</code>
     */
    boolean hasLatestGenerationStamp();
    /**
     * <code>required uint64 latestGenerationStamp = 8;</code>
     */
    long getLatestGenerationStamp();

    // required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;
    /**
     * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
     *
     * <pre>
     **
     * The requested checksum mechanism for this block write.
     * </pre>
     */
    boolean hasRequestedChecksum();
    /**
     * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
     *
     * <pre>
     **
     * The requested checksum mechanism for this block write.
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto getRequestedChecksum();
    /**
     * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
     *
     * <pre>
     **
     * The requested checksum mechanism for this block write.
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder getRequestedChecksumOrBuilder();

    // optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;
    /**
     * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
     */
    boolean hasCachingStrategy();
    /**
     * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto getCachingStrategy();
    /**
     * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder getCachingStrategyOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.OpWriteBlockProto}
   */
  public static final class OpWriteBlockProto extends
      com.google.protobuf.GeneratedMessage
      implements OpWriteBlockProtoOrBuilder {
    // Use OpWriteBlockProto.newBuilder() to construct.
    private OpWriteBlockProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OpWriteBlockProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OpWriteBlockProto defaultInstance;
    public static OpWriteBlockProto getDefaultInstance() {
      return defaultInstance;
    }

    public OpWriteBlockProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OpWriteBlockProto(
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
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                targets_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              targets_.add(input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.PARSER, extensionRegistry));
              break;
            }
            case 26: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = source_.toBuilder();
              }
              source_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(source_);
                source_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.BlockConstructionStage value = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.BlockConstructionStage.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                stage_ = value;
              }
              break;
            }
            case 40: {
              bitField0_ |= 0x00000008;
              pipelineSize_ = input.readUInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000010;
              minBytesRcvd_ = input.readUInt64();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000020;
              maxBytesRcvd_ = input.readUInt64();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000040;
              latestGenerationStamp_ = input.readUInt64();
              break;
            }
            case 74: {
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000080) == 0x00000080)) {
                subBuilder = requestedChecksum_.toBuilder();
              }
              requestedChecksum_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(requestedChecksum_);
                requestedChecksum_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000080;
              break;
            }
            case 82: {
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000100) == 0x00000100)) {
                subBuilder = cachingStrategy_.toBuilder();
              }
              cachingStrategy_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cachingStrategy_);
                cachingStrategy_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000100;
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          targets_ = java.util.Collections.unmodifiableList(targets_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpWriteBlockProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpWriteBlockProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.Builder.class);
    }

    public static com.google.protobuf.Parser<OpWriteBlockProto> PARSER =
        new com.google.protobuf.AbstractParser<OpWriteBlockProto>() {
      public OpWriteBlockProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpWriteBlockProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OpWriteBlockProto> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage}
     */
    public enum BlockConstructionStage
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>PIPELINE_SETUP_APPEND = 0;</code>
       */
      PIPELINE_SETUP_APPEND(0, 0),
      /**
       * <code>PIPELINE_SETUP_APPEND_RECOVERY = 1;</code>
       *
       * <pre>
       * pipeline set up for failed PIPELINE_SETUP_APPEND recovery
       * </pre>
       */
      PIPELINE_SETUP_APPEND_RECOVERY(1, 1),
      /**
       * <code>DATA_STREAMING = 2;</code>
       *
       * <pre>
       * data streaming
       * </pre>
       */
      DATA_STREAMING(2, 2),
      /**
       * <code>PIPELINE_SETUP_STREAMING_RECOVERY = 3;</code>
       *
       * <pre>
       * pipeline setup for failed data streaming recovery
       * </pre>
       */
      PIPELINE_SETUP_STREAMING_RECOVERY(3, 3),
      /**
       * <code>PIPELINE_CLOSE = 4;</code>
       *
       * <pre>
       * close the block and pipeline
       * </pre>
       */
      PIPELINE_CLOSE(4, 4),
      /**
       * <code>PIPELINE_CLOSE_RECOVERY = 5;</code>
       *
       * <pre>
       * Recover a failed PIPELINE_CLOSE
       * </pre>
       */
      PIPELINE_CLOSE_RECOVERY(5, 5),
      /**
       * <code>PIPELINE_SETUP_CREATE = 6;</code>
       *
       * <pre>
       * pipeline set up for block creation
       * </pre>
       */
      PIPELINE_SETUP_CREATE(6, 6),
      /**
       * <code>TRANSFER_RBW = 7;</code>
       *
       * <pre>
       * transfer RBW for adding datanodes
       * </pre>
       */
      TRANSFER_RBW(7, 7),
      /**
       * <code>TRANSFER_FINALIZED = 8;</code>
       *
       * <pre>
       * transfer Finalized for adding datanodes
       * </pre>
       */
      TRANSFER_FINALIZED(8, 8),
      ;

      /**
       * <code>PIPELINE_SETUP_APPEND = 0;</code>
       */
      public static final int PIPELINE_SETUP_APPEND_VALUE = 0;
      /**
       * <code>PIPELINE_SETUP_APPEND_RECOVERY = 1;</code>
       *
       * <pre>
       * pipeline set up for failed PIPELINE_SETUP_APPEND recovery
       * </pre>
       */
      public static final int PIPELINE_SETUP_APPEND_RECOVERY_VALUE = 1;
      /**
       * <code>DATA_STREAMING = 2;</code>
       *
       * <pre>
       * data streaming
       * </pre>
       */
      public static final int DATA_STREAMING_VALUE = 2;
      /**
       * <code>PIPELINE_SETUP_STREAMING_RECOVERY = 3;</code>
       *
       * <pre>
       * pipeline setup for failed data streaming recovery
       * </pre>
       */
      public static final int PIPELINE_SETUP_STREAMING_RECOVERY_VALUE = 3;
      /**
       * <code>PIPELINE_CLOSE = 4;</code>
       *
       * <pre>
       * close the block and pipeline
       * </pre>
       */
      public static final int PIPELINE_CLOSE_VALUE = 4;
      /**
       * <code>PIPELINE_CLOSE_RECOVERY = 5;</code>
       *
       * <pre>
       * Recover a failed PIPELINE_CLOSE
       * </pre>
       */
      public static final int PIPELINE_CLOSE_RECOVERY_VALUE = 5;
      /**
       * <code>PIPELINE_SETUP_CREATE = 6;</code>
       *
       * <pre>
       * pipeline set up for block creation
       * </pre>
       */
      public static final int PIPELINE_SETUP_CREATE_VALUE = 6;
      /**
       * <code>TRANSFER_RBW = 7;</code>
       *
       * <pre>
       * transfer RBW for adding datanodes
       * </pre>
       */
      public static final int TRANSFER_RBW_VALUE = 7;
      /**
       * <code>TRANSFER_FINALIZED = 8;</code>
       *
       * <pre>
       * transfer Finalized for adding datanodes
       * </pre>
       */
      public static final int TRANSFER_FINALIZED_VALUE = 8;


      public final int getNumber() { return value; }

      public static BlockConstructionStage valueOf(int value) {
        switch (value) {
          case 0: return PIPELINE_SETUP_APPEND;
          case 1: return PIPELINE_SETUP_APPEND_RECOVERY;
          case 2: return DATA_STREAMING;
          case 3: return PIPELINE_SETUP_STREAMING_RECOVERY;
          case 4: return PIPELINE_CLOSE;
          case 5: return PIPELINE_CLOSE_RECOVERY;
          case 6: return PIPELINE_SETUP_CREATE;
          case 7: return TRANSFER_RBW;
          case 8: return TRANSFER_FINALIZED;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BlockConstructionStage>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<BlockConstructionStage>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BlockConstructionStage>() {
              public BlockConstructionStage findValueByNumber(int number) {
                return BlockConstructionStage.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final BlockConstructionStage[] VALUES = values();

      public static BlockConstructionStage valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private BlockConstructionStage(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage)
    }

    private int bitField0_;
    // required .hadoop.hdfs.ClientOperationHeaderProto header = 1;
    public static final int HEADER_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto header_;
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto getHeader() {
      return header_;
    }
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder getHeaderOrBuilder() {
      return header_;
    }

    // repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;
    public static final int TARGETS_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto> targets_;
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto> getTargetsList() {
      return targets_;
    }
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> 
        getTargetsOrBuilderList() {
      return targets_;
    }
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    public int getTargetsCount() {
      return targets_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto getTargets(int index) {
      return targets_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder getTargetsOrBuilder(
        int index) {
      return targets_.get(index);
    }

    // optional .hadoop.hdfs.DatanodeInfoProto source = 3;
    public static final int SOURCE_FIELD_NUMBER = 3;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto source_;
    /**
     * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
     */
    public boolean hasSource() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto getSource() {
      return source_;
    }
    /**
     * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder getSourceOrBuilder() {
      return source_;
    }

    // required .hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage stage = 4;
    public static final int STAGE_FIELD_NUMBER = 4;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.BlockConstructionStage stage_;
    /**
     * <code>required .hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage stage = 4;</code>
     */
    public boolean hasStage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage stage = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.BlockConstructionStage getStage() {
      return stage_;
    }

    // required uint32 pipelineSize = 5;
    public static final int PIPELINESIZE_FIELD_NUMBER = 5;
    private int pipelineSize_;
    /**
     * <code>required uint32 pipelineSize = 5;</code>
     */
    public boolean hasPipelineSize() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required uint32 pipelineSize = 5;</code>
     */
    public int getPipelineSize() {
      return pipelineSize_;
    }

    // required uint64 minBytesRcvd = 6;
    public static final int MINBYTESRCVD_FIELD_NUMBER = 6;
    private long minBytesRcvd_;
    /**
     * <code>required uint64 minBytesRcvd = 6;</code>
     */
    public boolean hasMinBytesRcvd() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required uint64 minBytesRcvd = 6;</code>
     */
    public long getMinBytesRcvd() {
      return minBytesRcvd_;
    }

    // required uint64 maxBytesRcvd = 7;
    public static final int MAXBYTESRCVD_FIELD_NUMBER = 7;
    private long maxBytesRcvd_;
    /**
     * <code>required uint64 maxBytesRcvd = 7;</code>
     */
    public boolean hasMaxBytesRcvd() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required uint64 maxBytesRcvd = 7;</code>
     */
    public long getMaxBytesRcvd() {
      return maxBytesRcvd_;
    }

    // required uint64 latestGenerationStamp = 8;
    public static final int LATESTGENERATIONSTAMP_FIELD_NUMBER = 8;
    private long latestGenerationStamp_;
    /**
     * <code>required uint64 latestGenerationStamp = 8;</code>
     */
    public boolean hasLatestGenerationStamp() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>required uint64 latestGenerationStamp = 8;</code>
     */
    public long getLatestGenerationStamp() {
      return latestGenerationStamp_;
    }

    // required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;
    public static final int REQUESTEDCHECKSUM_FIELD_NUMBER = 9;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto requestedChecksum_;
    /**
     * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
     *
     * <pre>
     **
     * The requested checksum mechanism for this block write.
     * </pre>
     */
    public boolean hasRequestedChecksum() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
     *
     * <pre>
     **
     * The requested checksum mechanism for this block write.
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto getRequestedChecksum() {
      return requestedChecksum_;
    }
    /**
     * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
     *
     * <pre>
     **
     * The requested checksum mechanism for this block write.
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder getRequestedChecksumOrBuilder() {
      return requestedChecksum_;
    }

    // optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;
    public static final int CACHINGSTRATEGY_FIELD_NUMBER = 10;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto cachingStrategy_;
    /**
     * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
     */
    public boolean hasCachingStrategy() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto getCachingStrategy() {
      return cachingStrategy_;
    }
    /**
     * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder getCachingStrategyOrBuilder() {
      return cachingStrategy_;
    }

    private void initFields() {
      header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
      targets_ = java.util.Collections.emptyList();
      source_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance();
      stage_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.BlockConstructionStage.PIPELINE_SETUP_APPEND;
      pipelineSize_ = 0;
      minBytesRcvd_ = 0L;
      maxBytesRcvd_ = 0L;
      latestGenerationStamp_ = 0L;
      requestedChecksum_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.getDefaultInstance();
      cachingStrategy_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasHeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPipelineSize()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMinBytesRcvd()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMaxBytesRcvd()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLatestGenerationStamp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRequestedChecksum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHeader().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getTargetsCount(); i++) {
        if (!getTargets(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasSource()) {
        if (!getSource().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (!getRequestedChecksum().isInitialized()) {
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
        output.writeMessage(1, header_);
      }
      for (int i = 0; i < targets_.size(); i++) {
        output.writeMessage(2, targets_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(3, source_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(4, stage_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(5, pipelineSize_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt64(6, minBytesRcvd_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeUInt64(7, maxBytesRcvd_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt64(8, latestGenerationStamp_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeMessage(9, requestedChecksum_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeMessage(10, cachingStrategy_);
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
          .computeMessageSize(1, header_);
      }
      for (int i = 0; i < targets_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, targets_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, source_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, stage_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, pipelineSize_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, minBytesRcvd_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, maxBytesRcvd_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, latestGenerationStamp_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, requestedChecksum_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, cachingStrategy_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto) obj;

      boolean result = true;
      result = result && (hasHeader() == other.hasHeader());
      if (hasHeader()) {
        result = result && getHeader()
            .equals(other.getHeader());
      }
      result = result && getTargetsList()
          .equals(other.getTargetsList());
      result = result && (hasSource() == other.hasSource());
      if (hasSource()) {
        result = result && getSource()
            .equals(other.getSource());
      }
      result = result && (hasStage() == other.hasStage());
      if (hasStage()) {
        result = result &&
            (getStage() == other.getStage());
      }
      result = result && (hasPipelineSize() == other.hasPipelineSize());
      if (hasPipelineSize()) {
        result = result && (getPipelineSize()
            == other.getPipelineSize());
      }
      result = result && (hasMinBytesRcvd() == other.hasMinBytesRcvd());
      if (hasMinBytesRcvd()) {
        result = result && (getMinBytesRcvd()
            == other.getMinBytesRcvd());
      }
      result = result && (hasMaxBytesRcvd() == other.hasMaxBytesRcvd());
      if (hasMaxBytesRcvd()) {
        result = result && (getMaxBytesRcvd()
            == other.getMaxBytesRcvd());
      }
      result = result && (hasLatestGenerationStamp() == other.hasLatestGenerationStamp());
      if (hasLatestGenerationStamp()) {
        result = result && (getLatestGenerationStamp()
            == other.getLatestGenerationStamp());
      }
      result = result && (hasRequestedChecksum() == other.hasRequestedChecksum());
      if (hasRequestedChecksum()) {
        result = result && getRequestedChecksum()
            .equals(other.getRequestedChecksum());
      }
      result = result && (hasCachingStrategy() == other.hasCachingStrategy());
      if (hasCachingStrategy()) {
        result = result && getCachingStrategy()
            .equals(other.getCachingStrategy());
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
      if (hasHeader()) {
        hash = (37 * hash) + HEADER_FIELD_NUMBER;
        hash = (53 * hash) + getHeader().hashCode();
      }
      if (getTargetsCount() > 0) {
        hash = (37 * hash) + TARGETS_FIELD_NUMBER;
        hash = (53 * hash) + getTargetsList().hashCode();
      }
      if (hasSource()) {
        hash = (37 * hash) + SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getSource().hashCode();
      }
      if (hasStage()) {
        hash = (37 * hash) + STAGE_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getStage());
      }
      if (hasPipelineSize()) {
        hash = (37 * hash) + PIPELINESIZE_FIELD_NUMBER;
        hash = (53 * hash) + getPipelineSize();
      }
      if (hasMinBytesRcvd()) {
        hash = (37 * hash) + MINBYTESRCVD_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getMinBytesRcvd());
      }
      if (hasMaxBytesRcvd()) {
        hash = (37 * hash) + MAXBYTESRCVD_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getMaxBytesRcvd());
      }
      if (hasLatestGenerationStamp()) {
        hash = (37 * hash) + LATESTGENERATIONSTAMP_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getLatestGenerationStamp());
      }
      if (hasRequestedChecksum()) {
        hash = (37 * hash) + REQUESTEDCHECKSUM_FIELD_NUMBER;
        hash = (53 * hash) + getRequestedChecksum().hashCode();
      }
      if (hasCachingStrategy()) {
        hash = (37 * hash) + CACHINGSTRATEGY_FIELD_NUMBER;
        hash = (53 * hash) + getCachingStrategy().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.OpWriteBlockProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpWriteBlockProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpWriteBlockProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.newBuilder()
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
          getHeaderFieldBuilder();
          getTargetsFieldBuilder();
          getSourceFieldBuilder();
          getRequestedChecksumFieldBuilder();
          getCachingStrategyFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (targetsBuilder_ == null) {
          targets_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          targetsBuilder_.clear();
        }
        if (sourceBuilder_ == null) {
          source_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance();
        } else {
          sourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        stage_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.BlockConstructionStage.PIPELINE_SETUP_APPEND;
        bitField0_ = (bitField0_ & ~0x00000008);
        pipelineSize_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        minBytesRcvd_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        maxBytesRcvd_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        latestGenerationStamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        if (requestedChecksumBuilder_ == null) {
          requestedChecksum_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.getDefaultInstance();
        } else {
          requestedChecksumBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000100);
        if (cachingStrategyBuilder_ == null) {
          cachingStrategy_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.getDefaultInstance();
        } else {
          cachingStrategyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpWriteBlockProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (headerBuilder_ == null) {
          result.header_ = header_;
        } else {
          result.header_ = headerBuilder_.build();
        }
        if (targetsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            targets_ = java.util.Collections.unmodifiableList(targets_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.targets_ = targets_;
        } else {
          result.targets_ = targetsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        if (sourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = sourceBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.stage_ = stage_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        result.pipelineSize_ = pipelineSize_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000010;
        }
        result.minBytesRcvd_ = minBytesRcvd_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000020;
        }
        result.maxBytesRcvd_ = maxBytesRcvd_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000040;
        }
        result.latestGenerationStamp_ = latestGenerationStamp_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000080;
        }
        if (requestedChecksumBuilder_ == null) {
          result.requestedChecksum_ = requestedChecksum_;
        } else {
          result.requestedChecksum_ = requestedChecksumBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000100;
        }
        if (cachingStrategyBuilder_ == null) {
          result.cachingStrategy_ = cachingStrategy_;
        } else {
          result.cachingStrategy_ = cachingStrategyBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        if (targetsBuilder_ == null) {
          if (!other.targets_.isEmpty()) {
            if (targets_.isEmpty()) {
              targets_ = other.targets_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureTargetsIsMutable();
              targets_.addAll(other.targets_);
            }
            onChanged();
          }
        } else {
          if (!other.targets_.isEmpty()) {
            if (targetsBuilder_.isEmpty()) {
              targetsBuilder_.dispose();
              targetsBuilder_ = null;
              targets_ = other.targets_;
              bitField0_ = (bitField0_ & ~0x00000002);
              targetsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getTargetsFieldBuilder() : null;
            } else {
              targetsBuilder_.addAllMessages(other.targets_);
            }
          }
        }
        if (other.hasSource()) {
          mergeSource(other.getSource());
        }
        if (other.hasStage()) {
          setStage(other.getStage());
        }
        if (other.hasPipelineSize()) {
          setPipelineSize(other.getPipelineSize());
        }
        if (other.hasMinBytesRcvd()) {
          setMinBytesRcvd(other.getMinBytesRcvd());
        }
        if (other.hasMaxBytesRcvd()) {
          setMaxBytesRcvd(other.getMaxBytesRcvd());
        }
        if (other.hasLatestGenerationStamp()) {
          setLatestGenerationStamp(other.getLatestGenerationStamp());
        }
        if (other.hasRequestedChecksum()) {
          mergeRequestedChecksum(other.getRequestedChecksum());
        }
        if (other.hasCachingStrategy()) {
          mergeCachingStrategy(other.getCachingStrategy());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHeader()) {
          
          return false;
        }
        if (!hasStage()) {
          
          return false;
        }
        if (!hasPipelineSize()) {
          
          return false;
        }
        if (!hasMinBytesRcvd()) {
          
          return false;
        }
        if (!hasMaxBytesRcvd()) {
          
          return false;
        }
        if (!hasLatestGenerationStamp()) {
          
          return false;
        }
        if (!hasRequestedChecksum()) {
          
          return false;
        }
        if (!getHeader().isInitialized()) {
          
          return false;
        }
        for (int i = 0; i < getTargetsCount(); i++) {
          if (!getTargets(i).isInitialized()) {
            
            return false;
          }
        }
        if (hasSource()) {
          if (!getSource().isInitialized()) {
            
            return false;
          }
        }
        if (!getRequestedChecksum().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.ClientOperationHeaderProto header = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder> headerBuilder_;
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto getHeader() {
        if (headerBuilder_ == null) {
          return header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public Builder setHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public Builder setHeader(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public Builder mergeHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              header_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance()) {
            header_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder> 
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder>(
                  header_,
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      // repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;
      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto> targets_ =
        java.util.Collections.emptyList();
      private void ensureTargetsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          targets_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto>(targets_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> targetsBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto> getTargetsList() {
        if (targetsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(targets_);
        } else {
          return targetsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public int getTargetsCount() {
        if (targetsBuilder_ == null) {
          return targets_.size();
        } else {
          return targetsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto getTargets(int index) {
        if (targetsBuilder_ == null) {
          return targets_.get(index);
        } else {
          return targetsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder setTargets(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.set(index, value);
          onChanged();
        } else {
          targetsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder setTargets(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.set(index, builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder addTargets(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.add(value);
          onChanged();
        } else {
          targetsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder addTargets(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.add(index, value);
          onChanged();
        } else {
          targetsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder addTargets(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.add(builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder addTargets(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.add(index, builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder addAllTargets(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto> values) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          super.addAll(values, targets_);
          onChanged();
        } else {
          targetsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder clearTargets() {
        if (targetsBuilder_ == null) {
          targets_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          targetsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder removeTargets(int index) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.remove(index);
          onChanged();
        } else {
          targetsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder getTargetsBuilder(
          int index) {
        return getTargetsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder getTargetsOrBuilder(
          int index) {
        if (targetsBuilder_ == null) {
          return targets_.get(index);  } else {
          return targetsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> 
           getTargetsOrBuilderList() {
        if (targetsBuilder_ != null) {
          return targetsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(targets_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder addTargetsBuilder() {
        return getTargetsFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder addTargetsBuilder(
          int index) {
        return getTargetsFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder> 
           getTargetsBuilderList() {
        return getTargetsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> 
          getTargetsFieldBuilder() {
        if (targetsBuilder_ == null) {
          targetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder>(
                  targets_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          targets_ = null;
        }
        return targetsBuilder_;
      }

      // optional .hadoop.hdfs.DatanodeInfoProto source = 3;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto source_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> sourceBuilder_;
      /**
       * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public boolean hasSource() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto getSource() {
        if (sourceBuilder_ == null) {
          return source_;
        } else {
          return sourceBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public Builder setSource(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto value) {
        if (sourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          source_ = value;
          onChanged();
        } else {
          sourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public Builder setSource(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder builderForValue) {
        if (sourceBuilder_ == null) {
          source_ = builderForValue.build();
          onChanged();
        } else {
          sourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public Builder mergeSource(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto value) {
        if (sourceBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              source_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance()) {
            source_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.newBuilder(source_).mergeFrom(value).buildPartial();
          } else {
            source_ = value;
          }
          onChanged();
        } else {
          sourceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public Builder clearSource() {
        if (sourceBuilder_ == null) {
          source_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance();
          onChanged();
        } else {
          sourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder getSourceBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getSourceFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder getSourceOrBuilder() {
        if (sourceBuilder_ != null) {
          return sourceBuilder_.getMessageOrBuilder();
        } else {
          return source_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> 
          getSourceFieldBuilder() {
        if (sourceBuilder_ == null) {
          sourceBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder>(
                  source_,
                  getParentForChildren(),
                  isClean());
          source_ = null;
        }
        return sourceBuilder_;
      }

      // required .hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage stage = 4;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.BlockConstructionStage stage_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.BlockConstructionStage.PIPELINE_SETUP_APPEND;
      /**
       * <code>required .hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage stage = 4;</code>
       */
      public boolean hasStage() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required .hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage stage = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.BlockConstructionStage getStage() {
        return stage_;
      }
      /**
       * <code>required .hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage stage = 4;</code>
       */
      public Builder setStage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.BlockConstructionStage value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        stage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.OpWriteBlockProto.BlockConstructionStage stage = 4;</code>
       */
      public Builder clearStage() {
        bitField0_ = (bitField0_ & ~0x00000008);
        stage_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpWriteBlockProto.BlockConstructionStage.PIPELINE_SETUP_APPEND;
        onChanged();
        return this;
      }

      // required uint32 pipelineSize = 5;
      private int pipelineSize_ ;
      /**
       * <code>required uint32 pipelineSize = 5;</code>
       */
      public boolean hasPipelineSize() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required uint32 pipelineSize = 5;</code>
       */
      public int getPipelineSize() {
        return pipelineSize_;
      }
      /**
       * <code>required uint32 pipelineSize = 5;</code>
       */
      public Builder setPipelineSize(int value) {
        bitField0_ |= 0x00000010;
        pipelineSize_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 pipelineSize = 5;</code>
       */
      public Builder clearPipelineSize() {
        bitField0_ = (bitField0_ & ~0x00000010);
        pipelineSize_ = 0;
        onChanged();
        return this;
      }

      // required uint64 minBytesRcvd = 6;
      private long minBytesRcvd_ ;
      /**
       * <code>required uint64 minBytesRcvd = 6;</code>
       */
      public boolean hasMinBytesRcvd() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required uint64 minBytesRcvd = 6;</code>
       */
      public long getMinBytesRcvd() {
        return minBytesRcvd_;
      }
      /**
       * <code>required uint64 minBytesRcvd = 6;</code>
       */
      public Builder setMinBytesRcvd(long value) {
        bitField0_ |= 0x00000020;
        minBytesRcvd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 minBytesRcvd = 6;</code>
       */
      public Builder clearMinBytesRcvd() {
        bitField0_ = (bitField0_ & ~0x00000020);
        minBytesRcvd_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 maxBytesRcvd = 7;
      private long maxBytesRcvd_ ;
      /**
       * <code>required uint64 maxBytesRcvd = 7;</code>
       */
      public boolean hasMaxBytesRcvd() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>required uint64 maxBytesRcvd = 7;</code>
       */
      public long getMaxBytesRcvd() {
        return maxBytesRcvd_;
      }
      /**
       * <code>required uint64 maxBytesRcvd = 7;</code>
       */
      public Builder setMaxBytesRcvd(long value) {
        bitField0_ |= 0x00000040;
        maxBytesRcvd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 maxBytesRcvd = 7;</code>
       */
      public Builder clearMaxBytesRcvd() {
        bitField0_ = (bitField0_ & ~0x00000040);
        maxBytesRcvd_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 latestGenerationStamp = 8;
      private long latestGenerationStamp_ ;
      /**
       * <code>required uint64 latestGenerationStamp = 8;</code>
       */
      public boolean hasLatestGenerationStamp() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>required uint64 latestGenerationStamp = 8;</code>
       */
      public long getLatestGenerationStamp() {
        return latestGenerationStamp_;
      }
      /**
       * <code>required uint64 latestGenerationStamp = 8;</code>
       */
      public Builder setLatestGenerationStamp(long value) {
        bitField0_ |= 0x00000080;
        latestGenerationStamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 latestGenerationStamp = 8;</code>
       */
      public Builder clearLatestGenerationStamp() {
        bitField0_ = (bitField0_ & ~0x00000080);
        latestGenerationStamp_ = 0L;
        onChanged();
        return this;
      }

      // required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto requestedChecksum_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder> requestedChecksumBuilder_;
      /**
       * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
       *
       * <pre>
       **
       * The requested checksum mechanism for this block write.
       * </pre>
       */
      public boolean hasRequestedChecksum() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
       *
       * <pre>
       **
       * The requested checksum mechanism for this block write.
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto getRequestedChecksum() {
        if (requestedChecksumBuilder_ == null) {
          return requestedChecksum_;
        } else {
          return requestedChecksumBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
       *
       * <pre>
       **
       * The requested checksum mechanism for this block write.
       * </pre>
       */
      public Builder setRequestedChecksum(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto value) {
        if (requestedChecksumBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          requestedChecksum_ = value;
          onChanged();
        } else {
          requestedChecksumBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000100;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
       *
       * <pre>
       **
       * The requested checksum mechanism for this block write.
       * </pre>
       */
      public Builder setRequestedChecksum(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder builderForValue) {
        if (requestedChecksumBuilder_ == null) {
          requestedChecksum_ = builderForValue.build();
          onChanged();
        } else {
          requestedChecksumBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000100;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
       *
       * <pre>
       **
       * The requested checksum mechanism for this block write.
       * </pre>
       */
      public Builder mergeRequestedChecksum(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto value) {
        if (requestedChecksumBuilder_ == null) {
          if (((bitField0_ & 0x00000100) == 0x00000100) &&
              requestedChecksum_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.getDefaultInstance()) {
            requestedChecksum_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.newBuilder(requestedChecksum_).mergeFrom(value).buildPartial();
          } else {
            requestedChecksum_ = value;
          }
          onChanged();
        } else {
          requestedChecksumBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000100;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
       *
       * <pre>
       **
       * The requested checksum mechanism for this block write.
       * </pre>
       */
      public Builder clearRequestedChecksum() {
        if (requestedChecksumBuilder_ == null) {
          requestedChecksum_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.getDefaultInstance();
          onChanged();
        } else {
          requestedChecksumBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
       *
       * <pre>
       **
       * The requested checksum mechanism for this block write.
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder getRequestedChecksumBuilder() {
        bitField0_ |= 0x00000100;
        onChanged();
        return getRequestedChecksumFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
       *
       * <pre>
       **
       * The requested checksum mechanism for this block write.
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder getRequestedChecksumOrBuilder() {
        if (requestedChecksumBuilder_ != null) {
          return requestedChecksumBuilder_.getMessageOrBuilder();
        } else {
          return requestedChecksum_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto requestedChecksum = 9;</code>
       *
       * <pre>
       **
       * The requested checksum mechanism for this block write.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder> 
          getRequestedChecksumFieldBuilder() {
        if (requestedChecksumBuilder_ == null) {
          requestedChecksumBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder>(
                  requestedChecksum_,
                  getParentForChildren(),
                  isClean());
          requestedChecksum_ = null;
        }
        return requestedChecksumBuilder_;
      }

      // optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto cachingStrategy_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder> cachingStrategyBuilder_;
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
       */
      public boolean hasCachingStrategy() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto getCachingStrategy() {
        if (cachingStrategyBuilder_ == null) {
          return cachingStrategy_;
        } else {
          return cachingStrategyBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
       */
      public Builder setCachingStrategy(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto value) {
        if (cachingStrategyBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          cachingStrategy_ = value;
          onChanged();
        } else {
          cachingStrategyBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000200;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
       */
      public Builder setCachingStrategy(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder builderForValue) {
        if (cachingStrategyBuilder_ == null) {
          cachingStrategy_ = builderForValue.build();
          onChanged();
        } else {
          cachingStrategyBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000200;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
       */
      public Builder mergeCachingStrategy(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto value) {
        if (cachingStrategyBuilder_ == null) {
          if (((bitField0_ & 0x00000200) == 0x00000200) &&
              cachingStrategy_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.getDefaultInstance()) {
            cachingStrategy_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.newBuilder(cachingStrategy_).mergeFrom(value).buildPartial();
          } else {
            cachingStrategy_ = value;
          }
          onChanged();
        } else {
          cachingStrategyBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000200;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
       */
      public Builder clearCachingStrategy() {
        if (cachingStrategyBuilder_ == null) {
          cachingStrategy_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.getDefaultInstance();
          onChanged();
        } else {
          cachingStrategyBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder getCachingStrategyBuilder() {
        bitField0_ |= 0x00000200;
        onChanged();
        return getCachingStrategyFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder getCachingStrategyOrBuilder() {
        if (cachingStrategyBuilder_ != null) {
          return cachingStrategyBuilder_.getMessageOrBuilder();
        } else {
          return cachingStrategy_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.CachingStrategyProto cachingStrategy = 10;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder> 
          getCachingStrategyFieldBuilder() {
        if (cachingStrategyBuilder_ == null) {
          cachingStrategyBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.CachingStrategyProtoOrBuilder>(
                  cachingStrategy_,
                  getParentForChildren(),
                  isClean());
          cachingStrategy_ = null;
        }
        return cachingStrategyBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.OpWriteBlockProto)
    }

    static {
      defaultInstance = new OpWriteBlockProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.OpWriteBlockProto)
  }

  public interface OpTransferBlockProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.ClientOperationHeaderProto header = 1;
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    boolean hasHeader();
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto getHeader();
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder getHeaderOrBuilder();

    // repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto> 
        getTargetsList();
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto getTargets(int index);
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    int getTargetsCount();
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> 
        getTargetsOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder getTargetsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.OpTransferBlockProto}
   */
  public static final class OpTransferBlockProto extends
      com.google.protobuf.GeneratedMessage
      implements OpTransferBlockProtoOrBuilder {
    // Use OpTransferBlockProto.newBuilder() to construct.
    private OpTransferBlockProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OpTransferBlockProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OpTransferBlockProto defaultInstance;
    public static OpTransferBlockProto getDefaultInstance() {
      return defaultInstance;
    }

    public OpTransferBlockProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OpTransferBlockProto(
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
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                targets_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              targets_.add(input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          targets_ = java.util.Collections.unmodifiableList(targets_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpTransferBlockProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpTransferBlockProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto.Builder.class);
    }

    public static com.google.protobuf.Parser<OpTransferBlockProto> PARSER =
        new com.google.protobuf.AbstractParser<OpTransferBlockProto>() {
      public OpTransferBlockProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpTransferBlockProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OpTransferBlockProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.ClientOperationHeaderProto header = 1;
    public static final int HEADER_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto header_;
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto getHeader() {
      return header_;
    }
    /**
     * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder getHeaderOrBuilder() {
      return header_;
    }

    // repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;
    public static final int TARGETS_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto> targets_;
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto> getTargetsList() {
      return targets_;
    }
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> 
        getTargetsOrBuilderList() {
      return targets_;
    }
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    public int getTargetsCount() {
      return targets_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto getTargets(int index) {
      return targets_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder getTargetsOrBuilder(
        int index) {
      return targets_.get(index);
    }

    private void initFields() {
      header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
      targets_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasHeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHeader().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getTargetsCount(); i++) {
        if (!getTargets(i).isInitialized()) {
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
        output.writeMessage(1, header_);
      }
      for (int i = 0; i < targets_.size(); i++) {
        output.writeMessage(2, targets_.get(i));
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
          .computeMessageSize(1, header_);
      }
      for (int i = 0; i < targets_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, targets_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto) obj;

      boolean result = true;
      result = result && (hasHeader() == other.hasHeader());
      if (hasHeader()) {
        result = result && getHeader()
            .equals(other.getHeader());
      }
      result = result && getTargetsList()
          .equals(other.getTargetsList());
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
      if (hasHeader()) {
        hash = (37 * hash) + HEADER_FIELD_NUMBER;
        hash = (53 * hash) + getHeader().hashCode();
      }
      if (getTargetsCount() > 0) {
        hash = (37 * hash) + TARGETS_FIELD_NUMBER;
        hash = (53 * hash) + getTargetsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.OpTransferBlockProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpTransferBlockProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpTransferBlockProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto.newBuilder()
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
          getHeaderFieldBuilder();
          getTargetsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (targetsBuilder_ == null) {
          targets_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          targetsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpTransferBlockProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (headerBuilder_ == null) {
          result.header_ = header_;
        } else {
          result.header_ = headerBuilder_.build();
        }
        if (targetsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            targets_ = java.util.Collections.unmodifiableList(targets_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.targets_ = targets_;
        } else {
          result.targets_ = targetsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        if (targetsBuilder_ == null) {
          if (!other.targets_.isEmpty()) {
            if (targets_.isEmpty()) {
              targets_ = other.targets_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureTargetsIsMutable();
              targets_.addAll(other.targets_);
            }
            onChanged();
          }
        } else {
          if (!other.targets_.isEmpty()) {
            if (targetsBuilder_.isEmpty()) {
              targetsBuilder_.dispose();
              targetsBuilder_ = null;
              targets_ = other.targets_;
              bitField0_ = (bitField0_ & ~0x00000002);
              targetsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getTargetsFieldBuilder() : null;
            } else {
              targetsBuilder_.addAllMessages(other.targets_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHeader()) {
          
          return false;
        }
        if (!getHeader().isInitialized()) {
          
          return false;
        }
        for (int i = 0; i < getTargetsCount(); i++) {
          if (!getTargets(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpTransferBlockProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.ClientOperationHeaderProto header = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder> headerBuilder_;
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto getHeader() {
        if (headerBuilder_ == null) {
          return header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public Builder setHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public Builder setHeader(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public Builder mergeHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              header_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance()) {
            header_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.getDefaultInstance();
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ClientOperationHeaderProto header = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder> 
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientOperationHeaderProtoOrBuilder>(
                  header_,
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      // repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;
      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto> targets_ =
        java.util.Collections.emptyList();
      private void ensureTargetsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          targets_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto>(targets_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> targetsBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto> getTargetsList() {
        if (targetsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(targets_);
        } else {
          return targetsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public int getTargetsCount() {
        if (targetsBuilder_ == null) {
          return targets_.size();
        } else {
          return targetsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto getTargets(int index) {
        if (targetsBuilder_ == null) {
          return targets_.get(index);
        } else {
          return targetsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder setTargets(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.set(index, value);
          onChanged();
        } else {
          targetsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder setTargets(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.set(index, builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder addTargets(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.add(value);
          onChanged();
        } else {
          targetsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder addTargets(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.add(index, value);
          onChanged();
        } else {
          targetsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder addTargets(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.add(builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder addTargets(
          int index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.add(index, builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder addAllTargets(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto> values) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          super.addAll(values, targets_);
          onChanged();
        } else {
          targetsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder clearTargets() {
        if (targetsBuilder_ == null) {
          targets_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          targetsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public Builder removeTargets(int index) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.remove(index);
          onChanged();
        } else {
          targetsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder getTargetsBuilder(
          int index) {
        return getTargetsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder getTargetsOrBuilder(
          int index) {
        if (targetsBuilder_ == null) {
          return targets_.get(index);  } else {
          return targetsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> 
           getTargetsOrBuilderList() {
        if (targetsBuilder_ != null) {
          return targetsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(targets_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder addTargetsBuilder() {
        return getTargetsFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder addTargetsBuilder(
          int index) {
        return getTargetsFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.DatanodeInfoProto targets = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder> 
           getTargetsBuilderList() {
        return getTargetsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> 
          getTargetsFieldBuilder() {
        if (targetsBuilder_ == null) {
          targetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder>(
                  targets_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          targets_ = null;
        }
        return targetsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.OpTransferBlockProto)
    }

    static {
      defaultInstance = new OpTransferBlockProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.OpTransferBlockProto)
  }

  public interface OpReplaceBlockProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.BaseHeaderProto header = 1;
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    boolean hasHeader();
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getHeader();
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getHeaderOrBuilder();

    // required string delHint = 2;
    /**
     * <code>required string delHint = 2;</code>
     */
    boolean hasDelHint();
    /**
     * <code>required string delHint = 2;</code>
     */
    java.lang.String getDelHint();
    /**
     * <code>required string delHint = 2;</code>
     */
    com.google.protobuf.ByteString
        getDelHintBytes();

    // required .hadoop.hdfs.DatanodeInfoProto source = 3;
    /**
     * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
     */
    boolean hasSource();
    /**
     * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto getSource();
    /**
     * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder getSourceOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.OpReplaceBlockProto}
   */
  public static final class OpReplaceBlockProto extends
      com.google.protobuf.GeneratedMessage
      implements OpReplaceBlockProtoOrBuilder {
    // Use OpReplaceBlockProto.newBuilder() to construct.
    private OpReplaceBlockProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OpReplaceBlockProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OpReplaceBlockProto defaultInstance;
    public static OpReplaceBlockProto getDefaultInstance() {
      return defaultInstance;
    }

    public OpReplaceBlockProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OpReplaceBlockProto(
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
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              delHint_ = input.readBytes();
              break;
            }
            case 26: {
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = source_.toBuilder();
              }
              source_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(source_);
                source_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpReplaceBlockProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpReplaceBlockProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto.Builder.class);
    }

    public static com.google.protobuf.Parser<OpReplaceBlockProto> PARSER =
        new com.google.protobuf.AbstractParser<OpReplaceBlockProto>() {
      public OpReplaceBlockProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpReplaceBlockProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OpReplaceBlockProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.BaseHeaderProto header = 1;
    public static final int HEADER_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto header_;
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getHeader() {
      return header_;
    }
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getHeaderOrBuilder() {
      return header_;
    }

    // required string delHint = 2;
    public static final int DELHINT_FIELD_NUMBER = 2;
    private java.lang.Object delHint_;
    /**
     * <code>required string delHint = 2;</code>
     */
    public boolean hasDelHint() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string delHint = 2;</code>
     */
    public java.lang.String getDelHint() {
      java.lang.Object ref = delHint_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          delHint_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string delHint = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDelHintBytes() {
      java.lang.Object ref = delHint_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        delHint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required .hadoop.hdfs.DatanodeInfoProto source = 3;
    public static final int SOURCE_FIELD_NUMBER = 3;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto source_;
    /**
     * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
     */
    public boolean hasSource() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto getSource() {
      return source_;
    }
    /**
     * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder getSourceOrBuilder() {
      return source_;
    }

    private void initFields() {
      header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
      delHint_ = "";
      source_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasHeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDelHint()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSource()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHeader().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSource().isInitialized()) {
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
        output.writeMessage(1, header_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getDelHintBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, source_);
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
          .computeMessageSize(1, header_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getDelHintBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, source_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto) obj;

      boolean result = true;
      result = result && (hasHeader() == other.hasHeader());
      if (hasHeader()) {
        result = result && getHeader()
            .equals(other.getHeader());
      }
      result = result && (hasDelHint() == other.hasDelHint());
      if (hasDelHint()) {
        result = result && getDelHint()
            .equals(other.getDelHint());
      }
      result = result && (hasSource() == other.hasSource());
      if (hasSource()) {
        result = result && getSource()
            .equals(other.getSource());
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
      if (hasHeader()) {
        hash = (37 * hash) + HEADER_FIELD_NUMBER;
        hash = (53 * hash) + getHeader().hashCode();
      }
      if (hasDelHint()) {
        hash = (37 * hash) + DELHINT_FIELD_NUMBER;
        hash = (53 * hash) + getDelHint().hashCode();
      }
      if (hasSource()) {
        hash = (37 * hash) + SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getSource().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.OpReplaceBlockProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpReplaceBlockProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpReplaceBlockProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto.newBuilder()
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
          getHeaderFieldBuilder();
          getSourceFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        delHint_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (sourceBuilder_ == null) {
          source_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance();
        } else {
          sourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpReplaceBlockProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (headerBuilder_ == null) {
          result.header_ = header_;
        } else {
          result.header_ = headerBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.delHint_ = delHint_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (sourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = sourceBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        if (other.hasDelHint()) {
          bitField0_ |= 0x00000002;
          delHint_ = other.delHint_;
          onChanged();
        }
        if (other.hasSource()) {
          mergeSource(other.getSource());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHeader()) {
          
          return false;
        }
        if (!hasDelHint()) {
          
          return false;
        }
        if (!hasSource()) {
          
          return false;
        }
        if (!getHeader().isInitialized()) {
          
          return false;
        }
        if (!getSource().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpReplaceBlockProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.BaseHeaderProto header = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder> headerBuilder_;
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getHeader() {
        if (headerBuilder_ == null) {
          return header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder setHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder setHeader(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder mergeHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              header_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance()) {
            header_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder> 
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder>(
                  header_,
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      // required string delHint = 2;
      private java.lang.Object delHint_ = "";
      /**
       * <code>required string delHint = 2;</code>
       */
      public boolean hasDelHint() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string delHint = 2;</code>
       */
      public java.lang.String getDelHint() {
        java.lang.Object ref = delHint_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          delHint_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string delHint = 2;</code>
       */
      public com.google.protobuf.ByteString
          getDelHintBytes() {
        java.lang.Object ref = delHint_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          delHint_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string delHint = 2;</code>
       */
      public Builder setDelHint(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        delHint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string delHint = 2;</code>
       */
      public Builder clearDelHint() {
        bitField0_ = (bitField0_ & ~0x00000002);
        delHint_ = getDefaultInstance().getDelHint();
        onChanged();
        return this;
      }
      /**
       * <code>required string delHint = 2;</code>
       */
      public Builder setDelHintBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        delHint_ = value;
        onChanged();
        return this;
      }

      // required .hadoop.hdfs.DatanodeInfoProto source = 3;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto source_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> sourceBuilder_;
      /**
       * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public boolean hasSource() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto getSource() {
        if (sourceBuilder_ == null) {
          return source_;
        } else {
          return sourceBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public Builder setSource(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto value) {
        if (sourceBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          source_ = value;
          onChanged();
        } else {
          sourceBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public Builder setSource(
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder builderForValue) {
        if (sourceBuilder_ == null) {
          source_ = builderForValue.build();
          onChanged();
        } else {
          sourceBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public Builder mergeSource(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto value) {
        if (sourceBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              source_ != org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance()) {
            source_ =
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.newBuilder(source_).mergeFrom(value).buildPartial();
          } else {
            source_ = value;
          }
          onChanged();
        } else {
          sourceBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public Builder clearSource() {
        if (sourceBuilder_ == null) {
          source_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.getDefaultInstance();
          onChanged();
        } else {
          sourceBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder getSourceBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getSourceFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder getSourceOrBuilder() {
        if (sourceBuilder_ != null) {
          return sourceBuilder_.getMessageOrBuilder();
        } else {
          return source_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.DatanodeInfoProto source = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder> 
          getSourceFieldBuilder() {
        if (sourceBuilder_ == null) {
          sourceBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.DatanodeInfoProtoOrBuilder>(
                  source_,
                  getParentForChildren(),
                  isClean());
          source_ = null;
        }
        return sourceBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.OpReplaceBlockProto)
    }

    static {
      defaultInstance = new OpReplaceBlockProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.OpReplaceBlockProto)
  }

  public interface OpCopyBlockProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.BaseHeaderProto header = 1;
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    boolean hasHeader();
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getHeader();
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getHeaderOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.OpCopyBlockProto}
   */
  public static final class OpCopyBlockProto extends
      com.google.protobuf.GeneratedMessage
      implements OpCopyBlockProtoOrBuilder {
    // Use OpCopyBlockProto.newBuilder() to construct.
    private OpCopyBlockProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OpCopyBlockProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OpCopyBlockProto defaultInstance;
    public static OpCopyBlockProto getDefaultInstance() {
      return defaultInstance;
    }

    public OpCopyBlockProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OpCopyBlockProto(
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
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpCopyBlockProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpCopyBlockProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto.Builder.class);
    }

    public static com.google.protobuf.Parser<OpCopyBlockProto> PARSER =
        new com.google.protobuf.AbstractParser<OpCopyBlockProto>() {
      public OpCopyBlockProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpCopyBlockProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OpCopyBlockProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.BaseHeaderProto header = 1;
    public static final int HEADER_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto header_;
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getHeader() {
      return header_;
    }
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getHeaderOrBuilder() {
      return header_;
    }

    private void initFields() {
      header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasHeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHeader().isInitialized()) {
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
        output.writeMessage(1, header_);
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
          .computeMessageSize(1, header_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto) obj;

      boolean result = true;
      result = result && (hasHeader() == other.hasHeader());
      if (hasHeader()) {
        result = result && getHeader()
            .equals(other.getHeader());
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
      if (hasHeader()) {
        hash = (37 * hash) + HEADER_FIELD_NUMBER;
        hash = (53 * hash) + getHeader().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.OpCopyBlockProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpCopyBlockProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpCopyBlockProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto.newBuilder()
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
          getHeaderFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpCopyBlockProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (headerBuilder_ == null) {
          result.header_ = header_;
        } else {
          result.header_ = headerBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHeader()) {
          
          return false;
        }
        if (!getHeader().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpCopyBlockProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.BaseHeaderProto header = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder> headerBuilder_;
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getHeader() {
        if (headerBuilder_ == null) {
          return header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder setHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder setHeader(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder mergeHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              header_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance()) {
            header_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder> 
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder>(
                  header_,
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.OpCopyBlockProto)
    }

    static {
      defaultInstance = new OpCopyBlockProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.OpCopyBlockProto)
  }

  public interface OpBlockChecksumProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.BaseHeaderProto header = 1;
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    boolean hasHeader();
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getHeader();
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getHeaderOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.OpBlockChecksumProto}
   */
  public static final class OpBlockChecksumProto extends
      com.google.protobuf.GeneratedMessage
      implements OpBlockChecksumProtoOrBuilder {
    // Use OpBlockChecksumProto.newBuilder() to construct.
    private OpBlockChecksumProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OpBlockChecksumProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OpBlockChecksumProto defaultInstance;
    public static OpBlockChecksumProto getDefaultInstance() {
      return defaultInstance;
    }

    public OpBlockChecksumProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OpBlockChecksumProto(
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
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpBlockChecksumProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpBlockChecksumProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto.Builder.class);
    }

    public static com.google.protobuf.Parser<OpBlockChecksumProto> PARSER =
        new com.google.protobuf.AbstractParser<OpBlockChecksumProto>() {
      public OpBlockChecksumProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpBlockChecksumProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OpBlockChecksumProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.BaseHeaderProto header = 1;
    public static final int HEADER_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto header_;
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getHeader() {
      return header_;
    }
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getHeaderOrBuilder() {
      return header_;
    }

    private void initFields() {
      header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasHeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHeader().isInitialized()) {
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
        output.writeMessage(1, header_);
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
          .computeMessageSize(1, header_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto) obj;

      boolean result = true;
      result = result && (hasHeader() == other.hasHeader());
      if (hasHeader()) {
        result = result && getHeader()
            .equals(other.getHeader());
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
      if (hasHeader()) {
        hash = (37 * hash) + HEADER_FIELD_NUMBER;
        hash = (53 * hash) + getHeader().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.OpBlockChecksumProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpBlockChecksumProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpBlockChecksumProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto.newBuilder()
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
          getHeaderFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpBlockChecksumProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (headerBuilder_ == null) {
          result.header_ = header_;
        } else {
          result.header_ = headerBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHeader()) {
          
          return false;
        }
        if (!getHeader().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.BaseHeaderProto header = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder> headerBuilder_;
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getHeader() {
        if (headerBuilder_ == null) {
          return header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder setHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder setHeader(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder mergeHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              header_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance()) {
            header_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder> 
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder>(
                  header_,
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.OpBlockChecksumProto)
    }

    static {
      defaultInstance = new OpBlockChecksumProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.OpBlockChecksumProto)
  }

  public interface ShortCircuitShmIdProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int64 hi = 1;
    /**
     * <code>required int64 hi = 1;</code>
     */
    boolean hasHi();
    /**
     * <code>required int64 hi = 1;</code>
     */
    long getHi();

    // required int64 lo = 2;
    /**
     * <code>required int64 lo = 2;</code>
     */
    boolean hasLo();
    /**
     * <code>required int64 lo = 2;</code>
     */
    long getLo();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ShortCircuitShmIdProto}
   *
   * <pre>
   **
   * An ID uniquely identifying a shared memory segment.
   * </pre>
   */
  public static final class ShortCircuitShmIdProto extends
      com.google.protobuf.GeneratedMessage
      implements ShortCircuitShmIdProtoOrBuilder {
    // Use ShortCircuitShmIdProto.newBuilder() to construct.
    private ShortCircuitShmIdProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ShortCircuitShmIdProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ShortCircuitShmIdProto defaultInstance;
    public static ShortCircuitShmIdProto getDefaultInstance() {
      return defaultInstance;
    }

    public ShortCircuitShmIdProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ShortCircuitShmIdProto(
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
              hi_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              lo_ = input.readInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmIdProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmIdProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ShortCircuitShmIdProto> PARSER =
        new com.google.protobuf.AbstractParser<ShortCircuitShmIdProto>() {
      public ShortCircuitShmIdProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShortCircuitShmIdProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ShortCircuitShmIdProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int64 hi = 1;
    public static final int HI_FIELD_NUMBER = 1;
    private long hi_;
    /**
     * <code>required int64 hi = 1;</code>
     */
    public boolean hasHi() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 hi = 1;</code>
     */
    public long getHi() {
      return hi_;
    }

    // required int64 lo = 2;
    public static final int LO_FIELD_NUMBER = 2;
    private long lo_;
    /**
     * <code>required int64 lo = 2;</code>
     */
    public boolean hasLo() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 lo = 2;</code>
     */
    public long getLo() {
      return lo_;
    }

    private void initFields() {
      hi_ = 0L;
      lo_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasHi()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLo()) {
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
        output.writeInt64(1, hi_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, lo_);
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
          .computeInt64Size(1, hi_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, lo_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto) obj;

      boolean result = true;
      result = result && (hasHi() == other.hasHi());
      if (hasHi()) {
        result = result && (getHi()
            == other.getHi());
      }
      result = result && (hasLo() == other.hasLo());
      if (hasLo()) {
        result = result && (getLo()
            == other.getLo());
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
      if (hasHi()) {
        hash = (37 * hash) + HI_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getHi());
      }
      if (hasLo()) {
        hash = (37 * hash) + LO_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getLo());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ShortCircuitShmIdProto}
     *
     * <pre>
     **
     * An ID uniquely identifying a shared memory segment.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmIdProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmIdProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.newBuilder()
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
        hi_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        lo_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmIdProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.hi_ = hi_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.lo_ = lo_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.getDefaultInstance()) return this;
        if (other.hasHi()) {
          setHi(other.getHi());
        }
        if (other.hasLo()) {
          setLo(other.getLo());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHi()) {
          
          return false;
        }
        if (!hasLo()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int64 hi = 1;
      private long hi_ ;
      /**
       * <code>required int64 hi = 1;</code>
       */
      public boolean hasHi() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 hi = 1;</code>
       */
      public long getHi() {
        return hi_;
      }
      /**
       * <code>required int64 hi = 1;</code>
       */
      public Builder setHi(long value) {
        bitField0_ |= 0x00000001;
        hi_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 hi = 1;</code>
       */
      public Builder clearHi() {
        bitField0_ = (bitField0_ & ~0x00000001);
        hi_ = 0L;
        onChanged();
        return this;
      }

      // required int64 lo = 2;
      private long lo_ ;
      /**
       * <code>required int64 lo = 2;</code>
       */
      public boolean hasLo() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 lo = 2;</code>
       */
      public long getLo() {
        return lo_;
      }
      /**
       * <code>required int64 lo = 2;</code>
       */
      public Builder setLo(long value) {
        bitField0_ |= 0x00000002;
        lo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 lo = 2;</code>
       */
      public Builder clearLo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        lo_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ShortCircuitShmIdProto)
    }

    static {
      defaultInstance = new ShortCircuitShmIdProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ShortCircuitShmIdProto)
  }

  public interface ShortCircuitShmSlotProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;
    /**
     * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
     */
    boolean hasShmId();
    /**
     * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto getShmId();
    /**
     * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder getShmIdOrBuilder();

    // required int32 slotIdx = 2;
    /**
     * <code>required int32 slotIdx = 2;</code>
     */
    boolean hasSlotIdx();
    /**
     * <code>required int32 slotIdx = 2;</code>
     */
    int getSlotIdx();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ShortCircuitShmSlotProto}
   *
   * <pre>
   **
   * An ID uniquely identifying a slot within a shared memory segment.
   * </pre>
   */
  public static final class ShortCircuitShmSlotProto extends
      com.google.protobuf.GeneratedMessage
      implements ShortCircuitShmSlotProtoOrBuilder {
    // Use ShortCircuitShmSlotProto.newBuilder() to construct.
    private ShortCircuitShmSlotProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ShortCircuitShmSlotProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ShortCircuitShmSlotProto defaultInstance;
    public static ShortCircuitShmSlotProto getDefaultInstance() {
      return defaultInstance;
    }

    public ShortCircuitShmSlotProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ShortCircuitShmSlotProto(
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
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = shmId_.toBuilder();
              }
              shmId_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(shmId_);
                shmId_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              slotIdx_ = input.readInt32();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmSlotProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmSlotProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ShortCircuitShmSlotProto> PARSER =
        new com.google.protobuf.AbstractParser<ShortCircuitShmSlotProto>() {
      public ShortCircuitShmSlotProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShortCircuitShmSlotProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ShortCircuitShmSlotProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;
    public static final int SHMID_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto shmId_;
    /**
     * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
     */
    public boolean hasShmId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto getShmId() {
      return shmId_;
    }
    /**
     * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder getShmIdOrBuilder() {
      return shmId_;
    }

    // required int32 slotIdx = 2;
    public static final int SLOTIDX_FIELD_NUMBER = 2;
    private int slotIdx_;
    /**
     * <code>required int32 slotIdx = 2;</code>
     */
    public boolean hasSlotIdx() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 slotIdx = 2;</code>
     */
    public int getSlotIdx() {
      return slotIdx_;
    }

    private void initFields() {
      shmId_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.getDefaultInstance();
      slotIdx_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasShmId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSlotIdx()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getShmId().isInitialized()) {
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
        output.writeMessage(1, shmId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, slotIdx_);
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
          .computeMessageSize(1, shmId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, slotIdx_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto) obj;

      boolean result = true;
      result = result && (hasShmId() == other.hasShmId());
      if (hasShmId()) {
        result = result && getShmId()
            .equals(other.getShmId());
      }
      result = result && (hasSlotIdx() == other.hasSlotIdx());
      if (hasSlotIdx()) {
        result = result && (getSlotIdx()
            == other.getSlotIdx());
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
      if (hasShmId()) {
        hash = (37 * hash) + SHMID_FIELD_NUMBER;
        hash = (53 * hash) + getShmId().hashCode();
      }
      if (hasSlotIdx()) {
        hash = (37 * hash) + SLOTIDX_FIELD_NUMBER;
        hash = (53 * hash) + getSlotIdx();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ShortCircuitShmSlotProto}
     *
     * <pre>
     **
     * An ID uniquely identifying a slot within a shared memory segment.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmSlotProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmSlotProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.newBuilder()
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
          getShmIdFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (shmIdBuilder_ == null) {
          shmId_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.getDefaultInstance();
        } else {
          shmIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        slotIdx_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmSlotProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (shmIdBuilder_ == null) {
          result.shmId_ = shmId_;
        } else {
          result.shmId_ = shmIdBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.slotIdx_ = slotIdx_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.getDefaultInstance()) return this;
        if (other.hasShmId()) {
          mergeShmId(other.getShmId());
        }
        if (other.hasSlotIdx()) {
          setSlotIdx(other.getSlotIdx());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasShmId()) {
          
          return false;
        }
        if (!hasSlotIdx()) {
          
          return false;
        }
        if (!getShmId().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto shmId_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder> shmIdBuilder_;
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
       */
      public boolean hasShmId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto getShmId() {
        if (shmIdBuilder_ == null) {
          return shmId_;
        } else {
          return shmIdBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
       */
      public Builder setShmId(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto value) {
        if (shmIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          shmId_ = value;
          onChanged();
        } else {
          shmIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
       */
      public Builder setShmId(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder builderForValue) {
        if (shmIdBuilder_ == null) {
          shmId_ = builderForValue.build();
          onChanged();
        } else {
          shmIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
       */
      public Builder mergeShmId(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto value) {
        if (shmIdBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              shmId_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.getDefaultInstance()) {
            shmId_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.newBuilder(shmId_).mergeFrom(value).buildPartial();
          } else {
            shmId_ = value;
          }
          onChanged();
        } else {
          shmIdBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
       */
      public Builder clearShmId() {
        if (shmIdBuilder_ == null) {
          shmId_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.getDefaultInstance();
          onChanged();
        } else {
          shmIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder getShmIdBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getShmIdFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder getShmIdOrBuilder() {
        if (shmIdBuilder_ != null) {
          return shmIdBuilder_.getMessageOrBuilder();
        } else {
          return shmId_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmIdProto shmId = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder> 
          getShmIdFieldBuilder() {
        if (shmIdBuilder_ == null) {
          shmIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder>(
                  shmId_,
                  getParentForChildren(),
                  isClean());
          shmId_ = null;
        }
        return shmIdBuilder_;
      }

      // required int32 slotIdx = 2;
      private int slotIdx_ ;
      /**
       * <code>required int32 slotIdx = 2;</code>
       */
      public boolean hasSlotIdx() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 slotIdx = 2;</code>
       */
      public int getSlotIdx() {
        return slotIdx_;
      }
      /**
       * <code>required int32 slotIdx = 2;</code>
       */
      public Builder setSlotIdx(int value) {
        bitField0_ |= 0x00000002;
        slotIdx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 slotIdx = 2;</code>
       */
      public Builder clearSlotIdx() {
        bitField0_ = (bitField0_ & ~0x00000002);
        slotIdx_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ShortCircuitShmSlotProto)
    }

    static {
      defaultInstance = new ShortCircuitShmSlotProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ShortCircuitShmSlotProto)
  }

  public interface OpRequestShortCircuitAccessProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.BaseHeaderProto header = 1;
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    boolean hasHeader();
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getHeader();
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getHeaderOrBuilder();

    // required uint32 maxVersion = 2;
    /**
     * <code>required uint32 maxVersion = 2;</code>
     *
     * <pre>
     ** In order to get short-circuit access to block data, clients must set this
     * to the highest version of the block data that they can understand.
     * Currently 1 is the only version, but more versions may exist in the future
     * if the on-disk format changes.
     * </pre>
     */
    boolean hasMaxVersion();
    /**
     * <code>required uint32 maxVersion = 2;</code>
     *
     * <pre>
     ** In order to get short-circuit access to block data, clients must set this
     * to the highest version of the block data that they can understand.
     * Currently 1 is the only version, but more versions may exist in the future
     * if the on-disk format changes.
     * </pre>
     */
    int getMaxVersion();

    // optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;
    /**
     * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
     *
     * <pre>
     **
     * The shared memory slot to use, if we are using one.
     * </pre>
     */
    boolean hasSlotId();
    /**
     * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
     *
     * <pre>
     **
     * The shared memory slot to use, if we are using one.
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto getSlotId();
    /**
     * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
     *
     * <pre>
     **
     * The shared memory slot to use, if we are using one.
     * </pre>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder getSlotIdOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.OpRequestShortCircuitAccessProto}
   */
  public static final class OpRequestShortCircuitAccessProto extends
      com.google.protobuf.GeneratedMessage
      implements OpRequestShortCircuitAccessProtoOrBuilder {
    // Use OpRequestShortCircuitAccessProto.newBuilder() to construct.
    private OpRequestShortCircuitAccessProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OpRequestShortCircuitAccessProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OpRequestShortCircuitAccessProto defaultInstance;
    public static OpRequestShortCircuitAccessProto getDefaultInstance() {
      return defaultInstance;
    }

    public OpRequestShortCircuitAccessProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OpRequestShortCircuitAccessProto(
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
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              maxVersion_ = input.readUInt32();
              break;
            }
            case 26: {
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = slotId_.toBuilder();
              }
              slotId_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(slotId_);
                slotId_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpRequestShortCircuitAccessProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpRequestShortCircuitAccessProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto.Builder.class);
    }

    public static com.google.protobuf.Parser<OpRequestShortCircuitAccessProto> PARSER =
        new com.google.protobuf.AbstractParser<OpRequestShortCircuitAccessProto>() {
      public OpRequestShortCircuitAccessProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpRequestShortCircuitAccessProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OpRequestShortCircuitAccessProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.BaseHeaderProto header = 1;
    public static final int HEADER_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto header_;
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getHeader() {
      return header_;
    }
    /**
     * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getHeaderOrBuilder() {
      return header_;
    }

    // required uint32 maxVersion = 2;
    public static final int MAXVERSION_FIELD_NUMBER = 2;
    private int maxVersion_;
    /**
     * <code>required uint32 maxVersion = 2;</code>
     *
     * <pre>
     ** In order to get short-circuit access to block data, clients must set this
     * to the highest version of the block data that they can understand.
     * Currently 1 is the only version, but more versions may exist in the future
     * if the on-disk format changes.
     * </pre>
     */
    public boolean hasMaxVersion() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 maxVersion = 2;</code>
     *
     * <pre>
     ** In order to get short-circuit access to block data, clients must set this
     * to the highest version of the block data that they can understand.
     * Currently 1 is the only version, but more versions may exist in the future
     * if the on-disk format changes.
     * </pre>
     */
    public int getMaxVersion() {
      return maxVersion_;
    }

    // optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;
    public static final int SLOTID_FIELD_NUMBER = 3;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto slotId_;
    /**
     * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
     *
     * <pre>
     **
     * The shared memory slot to use, if we are using one.
     * </pre>
     */
    public boolean hasSlotId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
     *
     * <pre>
     **
     * The shared memory slot to use, if we are using one.
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto getSlotId() {
      return slotId_;
    }
    /**
     * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
     *
     * <pre>
     **
     * The shared memory slot to use, if we are using one.
     * </pre>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder getSlotIdOrBuilder() {
      return slotId_;
    }

    private void initFields() {
      header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
      maxVersion_ = 0;
      slotId_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasHeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMaxVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHeader().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasSlotId()) {
        if (!getSlotId().isInitialized()) {
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
        output.writeMessage(1, header_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, maxVersion_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, slotId_);
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
          .computeMessageSize(1, header_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, maxVersion_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, slotId_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto) obj;

      boolean result = true;
      result = result && (hasHeader() == other.hasHeader());
      if (hasHeader()) {
        result = result && getHeader()
            .equals(other.getHeader());
      }
      result = result && (hasMaxVersion() == other.hasMaxVersion());
      if (hasMaxVersion()) {
        result = result && (getMaxVersion()
            == other.getMaxVersion());
      }
      result = result && (hasSlotId() == other.hasSlotId());
      if (hasSlotId()) {
        result = result && getSlotId()
            .equals(other.getSlotId());
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
      if (hasHeader()) {
        hash = (37 * hash) + HEADER_FIELD_NUMBER;
        hash = (53 * hash) + getHeader().hashCode();
      }
      if (hasMaxVersion()) {
        hash = (37 * hash) + MAXVERSION_FIELD_NUMBER;
        hash = (53 * hash) + getMaxVersion();
      }
      if (hasSlotId()) {
        hash = (37 * hash) + SLOTID_FIELD_NUMBER;
        hash = (53 * hash) + getSlotId().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.OpRequestShortCircuitAccessProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpRequestShortCircuitAccessProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpRequestShortCircuitAccessProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto.newBuilder()
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
          getHeaderFieldBuilder();
          getSlotIdFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        maxVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (slotIdBuilder_ == null) {
          slotId_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.getDefaultInstance();
        } else {
          slotIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpRequestShortCircuitAccessProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (headerBuilder_ == null) {
          result.header_ = header_;
        } else {
          result.header_ = headerBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.maxVersion_ = maxVersion_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (slotIdBuilder_ == null) {
          result.slotId_ = slotId_;
        } else {
          result.slotId_ = slotIdBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto.getDefaultInstance()) return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        if (other.hasMaxVersion()) {
          setMaxVersion(other.getMaxVersion());
        }
        if (other.hasSlotId()) {
          mergeSlotId(other.getSlotId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasHeader()) {
          
          return false;
        }
        if (!hasMaxVersion()) {
          
          return false;
        }
        if (!getHeader().isInitialized()) {
          
          return false;
        }
        if (hasSlotId()) {
          if (!getSlotId().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpRequestShortCircuitAccessProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.BaseHeaderProto header = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder> headerBuilder_;
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto getHeader() {
        if (headerBuilder_ == null) {
          return header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder setHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder setHeader(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder mergeHeader(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              header_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance()) {
            header_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.newBuilder(header_).mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.getDefaultInstance();
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.BaseHeaderProto header = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder> 
          getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BaseHeaderProtoOrBuilder>(
                  header_,
                  getParentForChildren(),
                  isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      // required uint32 maxVersion = 2;
      private int maxVersion_ ;
      /**
       * <code>required uint32 maxVersion = 2;</code>
       *
       * <pre>
       ** In order to get short-circuit access to block data, clients must set this
       * to the highest version of the block data that they can understand.
       * Currently 1 is the only version, but more versions may exist in the future
       * if the on-disk format changes.
       * </pre>
       */
      public boolean hasMaxVersion() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint32 maxVersion = 2;</code>
       *
       * <pre>
       ** In order to get short-circuit access to block data, clients must set this
       * to the highest version of the block data that they can understand.
       * Currently 1 is the only version, but more versions may exist in the future
       * if the on-disk format changes.
       * </pre>
       */
      public int getMaxVersion() {
        return maxVersion_;
      }
      /**
       * <code>required uint32 maxVersion = 2;</code>
       *
       * <pre>
       ** In order to get short-circuit access to block data, clients must set this
       * to the highest version of the block data that they can understand.
       * Currently 1 is the only version, but more versions may exist in the future
       * if the on-disk format changes.
       * </pre>
       */
      public Builder setMaxVersion(int value) {
        bitField0_ |= 0x00000002;
        maxVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 maxVersion = 2;</code>
       *
       * <pre>
       ** In order to get short-circuit access to block data, clients must set this
       * to the highest version of the block data that they can understand.
       * Currently 1 is the only version, but more versions may exist in the future
       * if the on-disk format changes.
       * </pre>
       */
      public Builder clearMaxVersion() {
        bitField0_ = (bitField0_ & ~0x00000002);
        maxVersion_ = 0;
        onChanged();
        return this;
      }

      // optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto slotId_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder> slotIdBuilder_;
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
       *
       * <pre>
       **
       * The shared memory slot to use, if we are using one.
       * </pre>
       */
      public boolean hasSlotId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
       *
       * <pre>
       **
       * The shared memory slot to use, if we are using one.
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto getSlotId() {
        if (slotIdBuilder_ == null) {
          return slotId_;
        } else {
          return slotIdBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
       *
       * <pre>
       **
       * The shared memory slot to use, if we are using one.
       * </pre>
       */
      public Builder setSlotId(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto value) {
        if (slotIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          slotId_ = value;
          onChanged();
        } else {
          slotIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
       *
       * <pre>
       **
       * The shared memory slot to use, if we are using one.
       * </pre>
       */
      public Builder setSlotId(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder builderForValue) {
        if (slotIdBuilder_ == null) {
          slotId_ = builderForValue.build();
          onChanged();
        } else {
          slotIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
       *
       * <pre>
       **
       * The shared memory slot to use, if we are using one.
       * </pre>
       */
      public Builder mergeSlotId(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto value) {
        if (slotIdBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              slotId_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.getDefaultInstance()) {
            slotId_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.newBuilder(slotId_).mergeFrom(value).buildPartial();
          } else {
            slotId_ = value;
          }
          onChanged();
        } else {
          slotIdBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
       *
       * <pre>
       **
       * The shared memory slot to use, if we are using one.
       * </pre>
       */
      public Builder clearSlotId() {
        if (slotIdBuilder_ == null) {
          slotId_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.getDefaultInstance();
          onChanged();
        } else {
          slotIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
       *
       * <pre>
       **
       * The shared memory slot to use, if we are using one.
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder getSlotIdBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getSlotIdFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
       *
       * <pre>
       **
       * The shared memory slot to use, if we are using one.
       * </pre>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder getSlotIdOrBuilder() {
        if (slotIdBuilder_ != null) {
          return slotIdBuilder_.getMessageOrBuilder();
        } else {
          return slotId_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 3;</code>
       *
       * <pre>
       **
       * The shared memory slot to use, if we are using one.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder> 
          getSlotIdFieldBuilder() {
        if (slotIdBuilder_ == null) {
          slotIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder>(
                  slotId_,
                  getParentForChildren(),
                  isClean());
          slotId_ = null;
        }
        return slotIdBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.OpRequestShortCircuitAccessProto)
    }

    static {
      defaultInstance = new OpRequestShortCircuitAccessProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.OpRequestShortCircuitAccessProto)
  }

  public interface ReleaseShortCircuitAccessRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;
    /**
     * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
     */
    boolean hasSlotId();
    /**
     * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto getSlotId();
    /**
     * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder getSlotIdOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ReleaseShortCircuitAccessRequestProto}
   */
  public static final class ReleaseShortCircuitAccessRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements ReleaseShortCircuitAccessRequestProtoOrBuilder {
    // Use ReleaseShortCircuitAccessRequestProto.newBuilder() to construct.
    private ReleaseShortCircuitAccessRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReleaseShortCircuitAccessRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReleaseShortCircuitAccessRequestProto defaultInstance;
    public static ReleaseShortCircuitAccessRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public ReleaseShortCircuitAccessRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReleaseShortCircuitAccessRequestProto(
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
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = slotId_.toBuilder();
              }
              slotId_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(slotId_);
                slotId_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReleaseShortCircuitAccessRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReleaseShortCircuitAccessRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ReleaseShortCircuitAccessRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<ReleaseShortCircuitAccessRequestProto>() {
      public ReleaseShortCircuitAccessRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReleaseShortCircuitAccessRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReleaseShortCircuitAccessRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;
    public static final int SLOTID_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto slotId_;
    /**
     * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
     */
    public boolean hasSlotId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto getSlotId() {
      return slotId_;
    }
    /**
     * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder getSlotIdOrBuilder() {
      return slotId_;
    }

    private void initFields() {
      slotId_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSlotId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSlotId().isInitialized()) {
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
        output.writeMessage(1, slotId_);
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
          .computeMessageSize(1, slotId_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto) obj;

      boolean result = true;
      result = result && (hasSlotId() == other.hasSlotId());
      if (hasSlotId()) {
        result = result && getSlotId()
            .equals(other.getSlotId());
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
      if (hasSlotId()) {
        hash = (37 * hash) + SLOTID_FIELD_NUMBER;
        hash = (53 * hash) + getSlotId().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ReleaseShortCircuitAccessRequestProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReleaseShortCircuitAccessRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReleaseShortCircuitAccessRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto.newBuilder()
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
          getSlotIdFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (slotIdBuilder_ == null) {
          slotId_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.getDefaultInstance();
        } else {
          slotIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReleaseShortCircuitAccessRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (slotIdBuilder_ == null) {
          result.slotId_ = slotId_;
        } else {
          result.slotId_ = slotIdBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto.getDefaultInstance()) return this;
        if (other.hasSlotId()) {
          mergeSlotId(other.getSlotId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSlotId()) {
          
          return false;
        }
        if (!getSlotId().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto slotId_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder> slotIdBuilder_;
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
       */
      public boolean hasSlotId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto getSlotId() {
        if (slotIdBuilder_ == null) {
          return slotId_;
        } else {
          return slotIdBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
       */
      public Builder setSlotId(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto value) {
        if (slotIdBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          slotId_ = value;
          onChanged();
        } else {
          slotIdBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
       */
      public Builder setSlotId(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder builderForValue) {
        if (slotIdBuilder_ == null) {
          slotId_ = builderForValue.build();
          onChanged();
        } else {
          slotIdBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
       */
      public Builder mergeSlotId(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto value) {
        if (slotIdBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              slotId_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.getDefaultInstance()) {
            slotId_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.newBuilder(slotId_).mergeFrom(value).buildPartial();
          } else {
            slotId_ = value;
          }
          onChanged();
        } else {
          slotIdBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
       */
      public Builder clearSlotId() {
        if (slotIdBuilder_ == null) {
          slotId_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.getDefaultInstance();
          onChanged();
        } else {
          slotIdBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder getSlotIdBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSlotIdFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder getSlotIdOrBuilder() {
        if (slotIdBuilder_ != null) {
          return slotIdBuilder_.getMessageOrBuilder();
        } else {
          return slotId_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ShortCircuitShmSlotProto slotId = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder> 
          getSlotIdFieldBuilder() {
        if (slotIdBuilder_ == null) {
          slotIdBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmSlotProtoOrBuilder>(
                  slotId_,
                  getParentForChildren(),
                  isClean());
          slotId_ = null;
        }
        return slotIdBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ReleaseShortCircuitAccessRequestProto)
    }

    static {
      defaultInstance = new ReleaseShortCircuitAccessRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ReleaseShortCircuitAccessRequestProto)
  }

  public interface ReleaseShortCircuitAccessResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.Status status = 1;
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus();

    // optional string error = 2;
    /**
     * <code>optional string error = 2;</code>
     */
    boolean hasError();
    /**
     * <code>optional string error = 2;</code>
     */
    java.lang.String getError();
    /**
     * <code>optional string error = 2;</code>
     */
    com.google.protobuf.ByteString
        getErrorBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ReleaseShortCircuitAccessResponseProto}
   */
  public static final class ReleaseShortCircuitAccessResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements ReleaseShortCircuitAccessResponseProtoOrBuilder {
    // Use ReleaseShortCircuitAccessResponseProto.newBuilder() to construct.
    private ReleaseShortCircuitAccessResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReleaseShortCircuitAccessResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReleaseShortCircuitAccessResponseProto defaultInstance;
    public static ReleaseShortCircuitAccessResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public ReleaseShortCircuitAccessResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReleaseShortCircuitAccessResponseProto(
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
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                status_ = value;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              error_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReleaseShortCircuitAccessResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReleaseShortCircuitAccessResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ReleaseShortCircuitAccessResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<ReleaseShortCircuitAccessResponseProto>() {
      public ReleaseShortCircuitAccessResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReleaseShortCircuitAccessResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReleaseShortCircuitAccessResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.Status status = 1;
    public static final int STATUS_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status status_;
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus() {
      return status_;
    }

    // optional string error = 2;
    public static final int ERROR_FIELD_NUMBER = 2;
    private java.lang.Object error_;
    /**
     * <code>optional string error = 2;</code>
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string error = 2;</code>
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          error_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string error = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
      error_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasStatus()) {
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
        output.writeEnum(1, status_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getErrorBytes());
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
          .computeEnumSize(1, status_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getErrorBytes());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto) obj;

      boolean result = true;
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result &&
            (getStatus() == other.getStatus());
      }
      result = result && (hasError() == other.hasError());
      if (hasError()) {
        result = result && getError()
            .equals(other.getError());
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
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getStatus());
      }
      if (hasError()) {
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getError().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ReleaseShortCircuitAccessResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReleaseShortCircuitAccessResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReleaseShortCircuitAccessResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto.newBuilder()
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
        status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
        bitField0_ = (bitField0_ & ~0x00000001);
        error_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReleaseShortCircuitAccessResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.error_ = error_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasError()) {
          bitField0_ |= 0x00000002;
          error_ = other.error_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStatus()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReleaseShortCircuitAccessResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.Status status = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus() {
        return status_;
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public Builder setStatus(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
        onChanged();
        return this;
      }

      // optional string error = 2;
      private java.lang.Object error_ = "";
      /**
       * <code>optional string error = 2;</code>
       */
      public boolean hasError() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string error = 2;</code>
       */
      public java.lang.String getError() {
        java.lang.Object ref = error_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          error_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string error = 2;</code>
       */
      public com.google.protobuf.ByteString
          getErrorBytes() {
        java.lang.Object ref = error_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          error_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string error = 2;</code>
       */
      public Builder setError(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        error_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string error = 2;</code>
       */
      public Builder clearError() {
        bitField0_ = (bitField0_ & ~0x00000002);
        error_ = getDefaultInstance().getError();
        onChanged();
        return this;
      }
      /**
       * <code>optional string error = 2;</code>
       */
      public Builder setErrorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        error_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ReleaseShortCircuitAccessResponseProto)
    }

    static {
      defaultInstance = new ReleaseShortCircuitAccessResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ReleaseShortCircuitAccessResponseProto)
  }

  public interface ShortCircuitShmRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string clientName = 1;
    /**
     * <code>required string clientName = 1;</code>
     *
     * <pre>
     * The name of the client requesting the shared memory segment.  This is
     * purely for logging / debugging purposes.
     * </pre>
     */
    boolean hasClientName();
    /**
     * <code>required string clientName = 1;</code>
     *
     * <pre>
     * The name of the client requesting the shared memory segment.  This is
     * purely for logging / debugging purposes.
     * </pre>
     */
    java.lang.String getClientName();
    /**
     * <code>required string clientName = 1;</code>
     *
     * <pre>
     * The name of the client requesting the shared memory segment.  This is
     * purely for logging / debugging purposes.
     * </pre>
     */
    com.google.protobuf.ByteString
        getClientNameBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ShortCircuitShmRequestProto}
   */
  public static final class ShortCircuitShmRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements ShortCircuitShmRequestProtoOrBuilder {
    // Use ShortCircuitShmRequestProto.newBuilder() to construct.
    private ShortCircuitShmRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ShortCircuitShmRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ShortCircuitShmRequestProto defaultInstance;
    public static ShortCircuitShmRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public ShortCircuitShmRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ShortCircuitShmRequestProto(
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
              clientName_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ShortCircuitShmRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<ShortCircuitShmRequestProto>() {
      public ShortCircuitShmRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShortCircuitShmRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ShortCircuitShmRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string clientName = 1;
    public static final int CLIENTNAME_FIELD_NUMBER = 1;
    private java.lang.Object clientName_;
    /**
     * <code>required string clientName = 1;</code>
     *
     * <pre>
     * The name of the client requesting the shared memory segment.  This is
     * purely for logging / debugging purposes.
     * </pre>
     */
    public boolean hasClientName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string clientName = 1;</code>
     *
     * <pre>
     * The name of the client requesting the shared memory segment.  This is
     * purely for logging / debugging purposes.
     * </pre>
     */
    public java.lang.String getClientName() {
      java.lang.Object ref = clientName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          clientName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string clientName = 1;</code>
     *
     * <pre>
     * The name of the client requesting the shared memory segment.  This is
     * purely for logging / debugging purposes.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getClientNameBytes() {
      java.lang.Object ref = clientName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      clientName_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasClientName()) {
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
        output.writeBytes(1, getClientNameBytes());
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
          .computeBytesSize(1, getClientNameBytes());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto) obj;

      boolean result = true;
      result = result && (hasClientName() == other.hasClientName());
      if (hasClientName()) {
        result = result && getClientName()
            .equals(other.getClientName());
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
      if (hasClientName()) {
        hash = (37 * hash) + CLIENTNAME_FIELD_NUMBER;
        hash = (53 * hash) + getClientName().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ShortCircuitShmRequestProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto.newBuilder()
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
        clientName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.clientName_ = clientName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto.getDefaultInstance()) return this;
        if (other.hasClientName()) {
          bitField0_ |= 0x00000001;
          clientName_ = other.clientName_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasClientName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string clientName = 1;
      private java.lang.Object clientName_ = "";
      /**
       * <code>required string clientName = 1;</code>
       *
       * <pre>
       * The name of the client requesting the shared memory segment.  This is
       * purely for logging / debugging purposes.
       * </pre>
       */
      public boolean hasClientName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string clientName = 1;</code>
       *
       * <pre>
       * The name of the client requesting the shared memory segment.  This is
       * purely for logging / debugging purposes.
       * </pre>
       */
      public java.lang.String getClientName() {
        java.lang.Object ref = clientName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          clientName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string clientName = 1;</code>
       *
       * <pre>
       * The name of the client requesting the shared memory segment.  This is
       * purely for logging / debugging purposes.
       * </pre>
       */
      public com.google.protobuf.ByteString
          getClientNameBytes() {
        java.lang.Object ref = clientName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string clientName = 1;</code>
       *
       * <pre>
       * The name of the client requesting the shared memory segment.  This is
       * purely for logging / debugging purposes.
       * </pre>
       */
      public Builder setClientName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        clientName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string clientName = 1;</code>
       *
       * <pre>
       * The name of the client requesting the shared memory segment.  This is
       * purely for logging / debugging purposes.
       * </pre>
       */
      public Builder clearClientName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        clientName_ = getDefaultInstance().getClientName();
        onChanged();
        return this;
      }
      /**
       * <code>required string clientName = 1;</code>
       *
       * <pre>
       * The name of the client requesting the shared memory segment.  This is
       * purely for logging / debugging purposes.
       * </pre>
       */
      public Builder setClientNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        clientName_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ShortCircuitShmRequestProto)
    }

    static {
      defaultInstance = new ShortCircuitShmRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ShortCircuitShmRequestProto)
  }

  public interface ShortCircuitShmResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.Status status = 1;
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus();

    // optional string error = 2;
    /**
     * <code>optional string error = 2;</code>
     */
    boolean hasError();
    /**
     * <code>optional string error = 2;</code>
     */
    java.lang.String getError();
    /**
     * <code>optional string error = 2;</code>
     */
    com.google.protobuf.ByteString
        getErrorBytes();

    // optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;
    /**
     * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
     */
    boolean hasId();
    /**
     * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto getId();
    /**
     * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder getIdOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ShortCircuitShmResponseProto}
   */
  public static final class ShortCircuitShmResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements ShortCircuitShmResponseProtoOrBuilder {
    // Use ShortCircuitShmResponseProto.newBuilder() to construct.
    private ShortCircuitShmResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ShortCircuitShmResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ShortCircuitShmResponseProto defaultInstance;
    public static ShortCircuitShmResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public ShortCircuitShmResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ShortCircuitShmResponseProto(
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
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                status_ = value;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              error_ = input.readBytes();
              break;
            }
            case 26: {
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = id_.toBuilder();
              }
              id_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(id_);
                id_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ShortCircuitShmResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<ShortCircuitShmResponseProto>() {
      public ShortCircuitShmResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ShortCircuitShmResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ShortCircuitShmResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.Status status = 1;
    public static final int STATUS_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status status_;
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus() {
      return status_;
    }

    // optional string error = 2;
    public static final int ERROR_FIELD_NUMBER = 2;
    private java.lang.Object error_;
    /**
     * <code>optional string error = 2;</code>
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string error = 2;</code>
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          error_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string error = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;
    public static final int ID_FIELD_NUMBER = 3;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto id_;
    /**
     * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto getId() {
      return id_;
    }
    /**
     * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder getIdOrBuilder() {
      return id_;
    }

    private void initFields() {
      status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
      error_ = "";
      id_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasId()) {
        if (!getId().isInitialized()) {
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
        output.writeEnum(1, status_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getErrorBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, id_);
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
          .computeEnumSize(1, status_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getErrorBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, id_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto) obj;

      boolean result = true;
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result &&
            (getStatus() == other.getStatus());
      }
      result = result && (hasError() == other.hasError());
      if (hasError()) {
        result = result && getError()
            .equals(other.getError());
      }
      result = result && (hasId() == other.hasId());
      if (hasId()) {
        result = result && getId()
            .equals(other.getId());
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
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getStatus());
      }
      if (hasError()) {
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getError().hashCode();
      }
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ShortCircuitShmResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto.newBuilder()
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
          getIdFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
        bitField0_ = (bitField0_ & ~0x00000001);
        error_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (idBuilder_ == null) {
          id_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.getDefaultInstance();
        } else {
          idBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ShortCircuitShmResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.error_ = error_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (idBuilder_ == null) {
          result.id_ = id_;
        } else {
          result.id_ = idBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasError()) {
          bitField0_ |= 0x00000002;
          error_ = other.error_;
          onChanged();
        }
        if (other.hasId()) {
          mergeId(other.getId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStatus()) {
          
          return false;
        }
        if (hasId()) {
          if (!getId().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.Status status = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus() {
        return status_;
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public Builder setStatus(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
        onChanged();
        return this;
      }

      // optional string error = 2;
      private java.lang.Object error_ = "";
      /**
       * <code>optional string error = 2;</code>
       */
      public boolean hasError() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string error = 2;</code>
       */
      public java.lang.String getError() {
        java.lang.Object ref = error_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          error_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string error = 2;</code>
       */
      public com.google.protobuf.ByteString
          getErrorBytes() {
        java.lang.Object ref = error_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          error_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string error = 2;</code>
       */
      public Builder setError(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        error_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string error = 2;</code>
       */
      public Builder clearError() {
        bitField0_ = (bitField0_ & ~0x00000002);
        error_ = getDefaultInstance().getError();
        onChanged();
        return this;
      }
      /**
       * <code>optional string error = 2;</code>
       */
      public Builder setErrorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        error_ = value;
        onChanged();
        return this;
      }

      // optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto id_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder> idBuilder_;
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto getId() {
        if (idBuilder_ == null) {
          return id_;
        } else {
          return idBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
       */
      public Builder setId(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto value) {
        if (idBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          id_ = value;
          onChanged();
        } else {
          idBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
       */
      public Builder setId(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder builderForValue) {
        if (idBuilder_ == null) {
          id_ = builderForValue.build();
          onChanged();
        } else {
          idBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
       */
      public Builder mergeId(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto value) {
        if (idBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              id_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.getDefaultInstance()) {
            id_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.newBuilder(id_).mergeFrom(value).buildPartial();
          } else {
            id_ = value;
          }
          onChanged();
        } else {
          idBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
       */
      public Builder clearId() {
        if (idBuilder_ == null) {
          id_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.getDefaultInstance();
          onChanged();
        } else {
          idBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder getIdBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getIdFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder getIdOrBuilder() {
        if (idBuilder_ != null) {
          return idBuilder_.getMessageOrBuilder();
        } else {
          return id_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ShortCircuitShmIdProto id = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder> 
          getIdFieldBuilder() {
        if (idBuilder_ == null) {
          idBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ShortCircuitShmIdProtoOrBuilder>(
                  id_,
                  getParentForChildren(),
                  isClean());
          id_ = null;
        }
        return idBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ShortCircuitShmResponseProto)
    }

    static {
      defaultInstance = new ShortCircuitShmResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ShortCircuitShmResponseProto)
  }

  public interface PacketHeaderProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required sfixed64 offsetInBlock = 1;
    /**
     * <code>required sfixed64 offsetInBlock = 1;</code>
     *
     * <pre>
     * All fields must be fixed-length!
     * </pre>
     */
    boolean hasOffsetInBlock();
    /**
     * <code>required sfixed64 offsetInBlock = 1;</code>
     *
     * <pre>
     * All fields must be fixed-length!
     * </pre>
     */
    long getOffsetInBlock();

    // required sfixed64 seqno = 2;
    /**
     * <code>required sfixed64 seqno = 2;</code>
     */
    boolean hasSeqno();
    /**
     * <code>required sfixed64 seqno = 2;</code>
     */
    long getSeqno();

    // required bool lastPacketInBlock = 3;
    /**
     * <code>required bool lastPacketInBlock = 3;</code>
     */
    boolean hasLastPacketInBlock();
    /**
     * <code>required bool lastPacketInBlock = 3;</code>
     */
    boolean getLastPacketInBlock();

    // required sfixed32 dataLen = 4;
    /**
     * <code>required sfixed32 dataLen = 4;</code>
     */
    boolean hasDataLen();
    /**
     * <code>required sfixed32 dataLen = 4;</code>
     */
    int getDataLen();

    // optional bool syncBlock = 5 [default = false];
    /**
     * <code>optional bool syncBlock = 5 [default = false];</code>
     */
    boolean hasSyncBlock();
    /**
     * <code>optional bool syncBlock = 5 [default = false];</code>
     */
    boolean getSyncBlock();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.PacketHeaderProto}
   */
  public static final class PacketHeaderProto extends
      com.google.protobuf.GeneratedMessage
      implements PacketHeaderProtoOrBuilder {
    // Use PacketHeaderProto.newBuilder() to construct.
    private PacketHeaderProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PacketHeaderProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PacketHeaderProto defaultInstance;
    public static PacketHeaderProto getDefaultInstance() {
      return defaultInstance;
    }

    public PacketHeaderProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PacketHeaderProto(
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
            case 9: {
              bitField0_ |= 0x00000001;
              offsetInBlock_ = input.readSFixed64();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              seqno_ = input.readSFixed64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              lastPacketInBlock_ = input.readBool();
              break;
            }
            case 37: {
              bitField0_ |= 0x00000008;
              dataLen_ = input.readSFixed32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              syncBlock_ = input.readBool();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_PacketHeaderProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_PacketHeaderProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto.Builder.class);
    }

    public static com.google.protobuf.Parser<PacketHeaderProto> PARSER =
        new com.google.protobuf.AbstractParser<PacketHeaderProto>() {
      public PacketHeaderProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PacketHeaderProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PacketHeaderProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required sfixed64 offsetInBlock = 1;
    public static final int OFFSETINBLOCK_FIELD_NUMBER = 1;
    private long offsetInBlock_;
    /**
     * <code>required sfixed64 offsetInBlock = 1;</code>
     *
     * <pre>
     * All fields must be fixed-length!
     * </pre>
     */
    public boolean hasOffsetInBlock() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required sfixed64 offsetInBlock = 1;</code>
     *
     * <pre>
     * All fields must be fixed-length!
     * </pre>
     */
    public long getOffsetInBlock() {
      return offsetInBlock_;
    }

    // required sfixed64 seqno = 2;
    public static final int SEQNO_FIELD_NUMBER = 2;
    private long seqno_;
    /**
     * <code>required sfixed64 seqno = 2;</code>
     */
    public boolean hasSeqno() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required sfixed64 seqno = 2;</code>
     */
    public long getSeqno() {
      return seqno_;
    }

    // required bool lastPacketInBlock = 3;
    public static final int LASTPACKETINBLOCK_FIELD_NUMBER = 3;
    private boolean lastPacketInBlock_;
    /**
     * <code>required bool lastPacketInBlock = 3;</code>
     */
    public boolean hasLastPacketInBlock() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required bool lastPacketInBlock = 3;</code>
     */
    public boolean getLastPacketInBlock() {
      return lastPacketInBlock_;
    }

    // required sfixed32 dataLen = 4;
    public static final int DATALEN_FIELD_NUMBER = 4;
    private int dataLen_;
    /**
     * <code>required sfixed32 dataLen = 4;</code>
     */
    public boolean hasDataLen() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required sfixed32 dataLen = 4;</code>
     */
    public int getDataLen() {
      return dataLen_;
    }

    // optional bool syncBlock = 5 [default = false];
    public static final int SYNCBLOCK_FIELD_NUMBER = 5;
    private boolean syncBlock_;
    /**
     * <code>optional bool syncBlock = 5 [default = false];</code>
     */
    public boolean hasSyncBlock() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bool syncBlock = 5 [default = false];</code>
     */
    public boolean getSyncBlock() {
      return syncBlock_;
    }

    private void initFields() {
      offsetInBlock_ = 0L;
      seqno_ = 0L;
      lastPacketInBlock_ = false;
      dataLen_ = 0;
      syncBlock_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasOffsetInBlock()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSeqno()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLastPacketInBlock()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDataLen()) {
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
        output.writeSFixed64(1, offsetInBlock_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeSFixed64(2, seqno_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, lastPacketInBlock_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeSFixed32(4, dataLen_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, syncBlock_);
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
          .computeSFixed64Size(1, offsetInBlock_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSFixed64Size(2, seqno_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, lastPacketInBlock_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSFixed32Size(4, dataLen_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, syncBlock_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto) obj;

      boolean result = true;
      result = result && (hasOffsetInBlock() == other.hasOffsetInBlock());
      if (hasOffsetInBlock()) {
        result = result && (getOffsetInBlock()
            == other.getOffsetInBlock());
      }
      result = result && (hasSeqno() == other.hasSeqno());
      if (hasSeqno()) {
        result = result && (getSeqno()
            == other.getSeqno());
      }
      result = result && (hasLastPacketInBlock() == other.hasLastPacketInBlock());
      if (hasLastPacketInBlock()) {
        result = result && (getLastPacketInBlock()
            == other.getLastPacketInBlock());
      }
      result = result && (hasDataLen() == other.hasDataLen());
      if (hasDataLen()) {
        result = result && (getDataLen()
            == other.getDataLen());
      }
      result = result && (hasSyncBlock() == other.hasSyncBlock());
      if (hasSyncBlock()) {
        result = result && (getSyncBlock()
            == other.getSyncBlock());
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
      if (hasOffsetInBlock()) {
        hash = (37 * hash) + OFFSETINBLOCK_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getOffsetInBlock());
      }
      if (hasSeqno()) {
        hash = (37 * hash) + SEQNO_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getSeqno());
      }
      if (hasLastPacketInBlock()) {
        hash = (37 * hash) + LASTPACKETINBLOCK_FIELD_NUMBER;
        hash = (53 * hash) + hashBoolean(getLastPacketInBlock());
      }
      if (hasDataLen()) {
        hash = (37 * hash) + DATALEN_FIELD_NUMBER;
        hash = (53 * hash) + getDataLen();
      }
      if (hasSyncBlock()) {
        hash = (37 * hash) + SYNCBLOCK_FIELD_NUMBER;
        hash = (53 * hash) + hashBoolean(getSyncBlock());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.PacketHeaderProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_PacketHeaderProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_PacketHeaderProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto.newBuilder()
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
        offsetInBlock_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        seqno_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        lastPacketInBlock_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        dataLen_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        syncBlock_ = false;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_PacketHeaderProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.offsetInBlock_ = offsetInBlock_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.seqno_ = seqno_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.lastPacketInBlock_ = lastPacketInBlock_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.dataLen_ = dataLen_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.syncBlock_ = syncBlock_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto.getDefaultInstance()) return this;
        if (other.hasOffsetInBlock()) {
          setOffsetInBlock(other.getOffsetInBlock());
        }
        if (other.hasSeqno()) {
          setSeqno(other.getSeqno());
        }
        if (other.hasLastPacketInBlock()) {
          setLastPacketInBlock(other.getLastPacketInBlock());
        }
        if (other.hasDataLen()) {
          setDataLen(other.getDataLen());
        }
        if (other.hasSyncBlock()) {
          setSyncBlock(other.getSyncBlock());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasOffsetInBlock()) {
          
          return false;
        }
        if (!hasSeqno()) {
          
          return false;
        }
        if (!hasLastPacketInBlock()) {
          
          return false;
        }
        if (!hasDataLen()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PacketHeaderProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required sfixed64 offsetInBlock = 1;
      private long offsetInBlock_ ;
      /**
       * <code>required sfixed64 offsetInBlock = 1;</code>
       *
       * <pre>
       * All fields must be fixed-length!
       * </pre>
       */
      public boolean hasOffsetInBlock() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required sfixed64 offsetInBlock = 1;</code>
       *
       * <pre>
       * All fields must be fixed-length!
       * </pre>
       */
      public long getOffsetInBlock() {
        return offsetInBlock_;
      }
      /**
       * <code>required sfixed64 offsetInBlock = 1;</code>
       *
       * <pre>
       * All fields must be fixed-length!
       * </pre>
       */
      public Builder setOffsetInBlock(long value) {
        bitField0_ |= 0x00000001;
        offsetInBlock_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required sfixed64 offsetInBlock = 1;</code>
       *
       * <pre>
       * All fields must be fixed-length!
       * </pre>
       */
      public Builder clearOffsetInBlock() {
        bitField0_ = (bitField0_ & ~0x00000001);
        offsetInBlock_ = 0L;
        onChanged();
        return this;
      }

      // required sfixed64 seqno = 2;
      private long seqno_ ;
      /**
       * <code>required sfixed64 seqno = 2;</code>
       */
      public boolean hasSeqno() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required sfixed64 seqno = 2;</code>
       */
      public long getSeqno() {
        return seqno_;
      }
      /**
       * <code>required sfixed64 seqno = 2;</code>
       */
      public Builder setSeqno(long value) {
        bitField0_ |= 0x00000002;
        seqno_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required sfixed64 seqno = 2;</code>
       */
      public Builder clearSeqno() {
        bitField0_ = (bitField0_ & ~0x00000002);
        seqno_ = 0L;
        onChanged();
        return this;
      }

      // required bool lastPacketInBlock = 3;
      private boolean lastPacketInBlock_ ;
      /**
       * <code>required bool lastPacketInBlock = 3;</code>
       */
      public boolean hasLastPacketInBlock() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required bool lastPacketInBlock = 3;</code>
       */
      public boolean getLastPacketInBlock() {
        return lastPacketInBlock_;
      }
      /**
       * <code>required bool lastPacketInBlock = 3;</code>
       */
      public Builder setLastPacketInBlock(boolean value) {
        bitField0_ |= 0x00000004;
        lastPacketInBlock_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool lastPacketInBlock = 3;</code>
       */
      public Builder clearLastPacketInBlock() {
        bitField0_ = (bitField0_ & ~0x00000004);
        lastPacketInBlock_ = false;
        onChanged();
        return this;
      }

      // required sfixed32 dataLen = 4;
      private int dataLen_ ;
      /**
       * <code>required sfixed32 dataLen = 4;</code>
       */
      public boolean hasDataLen() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required sfixed32 dataLen = 4;</code>
       */
      public int getDataLen() {
        return dataLen_;
      }
      /**
       * <code>required sfixed32 dataLen = 4;</code>
       */
      public Builder setDataLen(int value) {
        bitField0_ |= 0x00000008;
        dataLen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required sfixed32 dataLen = 4;</code>
       */
      public Builder clearDataLen() {
        bitField0_ = (bitField0_ & ~0x00000008);
        dataLen_ = 0;
        onChanged();
        return this;
      }

      // optional bool syncBlock = 5 [default = false];
      private boolean syncBlock_ ;
      /**
       * <code>optional bool syncBlock = 5 [default = false];</code>
       */
      public boolean hasSyncBlock() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bool syncBlock = 5 [default = false];</code>
       */
      public boolean getSyncBlock() {
        return syncBlock_;
      }
      /**
       * <code>optional bool syncBlock = 5 [default = false];</code>
       */
      public Builder setSyncBlock(boolean value) {
        bitField0_ |= 0x00000010;
        syncBlock_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool syncBlock = 5 [default = false];</code>
       */
      public Builder clearSyncBlock() {
        bitField0_ = (bitField0_ & ~0x00000010);
        syncBlock_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.PacketHeaderProto)
    }

    static {
      defaultInstance = new PacketHeaderProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.PacketHeaderProto)
  }

  public interface PipelineAckProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required sint64 seqno = 1;
    /**
     * <code>required sint64 seqno = 1;</code>
     */
    boolean hasSeqno();
    /**
     * <code>required sint64 seqno = 1;</code>
     */
    long getSeqno();

    // repeated .hadoop.hdfs.Status status = 2;
    /**
     * <code>repeated .hadoop.hdfs.Status status = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status> getStatusList();
    /**
     * <code>repeated .hadoop.hdfs.Status status = 2;</code>
     */
    int getStatusCount();
    /**
     * <code>repeated .hadoop.hdfs.Status status = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus(int index);

    // optional uint64 downstreamAckTimeNanos = 3 [default = 0];
    /**
     * <code>optional uint64 downstreamAckTimeNanos = 3 [default = 0];</code>
     */
    boolean hasDownstreamAckTimeNanos();
    /**
     * <code>optional uint64 downstreamAckTimeNanos = 3 [default = 0];</code>
     */
    long getDownstreamAckTimeNanos();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.PipelineAckProto}
   */
  public static final class PipelineAckProto extends
      com.google.protobuf.GeneratedMessage
      implements PipelineAckProtoOrBuilder {
    // Use PipelineAckProto.newBuilder() to construct.
    private PipelineAckProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PipelineAckProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PipelineAckProto defaultInstance;
    public static PipelineAckProto getDefaultInstance() {
      return defaultInstance;
    }

    public PipelineAckProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PipelineAckProto(
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
              seqno_ = input.readSInt64();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  status_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status>();
                  mutable_bitField0_ |= 0x00000002;
                }
                status_.add(value);
              }
              break;
            }
            case 18: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(2, rawValue);
                } else {
                  if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                    status_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status>();
                    mutable_bitField0_ |= 0x00000002;
                  }
                  status_.add(value);
                }
              }
              input.popLimit(oldLimit);
              break;
            }
            case 24: {
              bitField0_ |= 0x00000002;
              downstreamAckTimeNanos_ = input.readUInt64();
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
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          status_ = java.util.Collections.unmodifiableList(status_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_PipelineAckProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_PipelineAckProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto.Builder.class);
    }

    public static com.google.protobuf.Parser<PipelineAckProto> PARSER =
        new com.google.protobuf.AbstractParser<PipelineAckProto>() {
      public PipelineAckProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PipelineAckProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PipelineAckProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required sint64 seqno = 1;
    public static final int SEQNO_FIELD_NUMBER = 1;
    private long seqno_;
    /**
     * <code>required sint64 seqno = 1;</code>
     */
    public boolean hasSeqno() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required sint64 seqno = 1;</code>
     */
    public long getSeqno() {
      return seqno_;
    }

    // repeated .hadoop.hdfs.Status status = 2;
    public static final int STATUS_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status> status_;
    /**
     * <code>repeated .hadoop.hdfs.Status status = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status> getStatusList() {
      return status_;
    }
    /**
     * <code>repeated .hadoop.hdfs.Status status = 2;</code>
     */
    public int getStatusCount() {
      return status_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.Status status = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus(int index) {
      return status_.get(index);
    }

    // optional uint64 downstreamAckTimeNanos = 3 [default = 0];
    public static final int DOWNSTREAMACKTIMENANOS_FIELD_NUMBER = 3;
    private long downstreamAckTimeNanos_;
    /**
     * <code>optional uint64 downstreamAckTimeNanos = 3 [default = 0];</code>
     */
    public boolean hasDownstreamAckTimeNanos() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 downstreamAckTimeNanos = 3 [default = 0];</code>
     */
    public long getDownstreamAckTimeNanos() {
      return downstreamAckTimeNanos_;
    }

    private void initFields() {
      seqno_ = 0L;
      status_ = java.util.Collections.emptyList();
      downstreamAckTimeNanos_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSeqno()) {
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
        output.writeSInt64(1, seqno_);
      }
      for (int i = 0; i < status_.size(); i++) {
        output.writeEnum(2, status_.get(i).getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(3, downstreamAckTimeNanos_);
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
          .computeSInt64Size(1, seqno_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < status_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(status_.get(i).getNumber());
        }
        size += dataSize;
        size += 1 * status_.size();
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, downstreamAckTimeNanos_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto) obj;

      boolean result = true;
      result = result && (hasSeqno() == other.hasSeqno());
      if (hasSeqno()) {
        result = result && (getSeqno()
            == other.getSeqno());
      }
      result = result && getStatusList()
          .equals(other.getStatusList());
      result = result && (hasDownstreamAckTimeNanos() == other.hasDownstreamAckTimeNanos());
      if (hasDownstreamAckTimeNanos()) {
        result = result && (getDownstreamAckTimeNanos()
            == other.getDownstreamAckTimeNanos());
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
      if (hasSeqno()) {
        hash = (37 * hash) + SEQNO_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getSeqno());
      }
      if (getStatusCount() > 0) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + hashEnumList(getStatusList());
      }
      if (hasDownstreamAckTimeNanos()) {
        hash = (37 * hash) + DOWNSTREAMACKTIMENANOS_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getDownstreamAckTimeNanos());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.PipelineAckProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_PipelineAckProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_PipelineAckProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto.newBuilder()
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
        seqno_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        downstreamAckTimeNanos_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_PipelineAckProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.seqno_ = seqno_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          status_ = java.util.Collections.unmodifiableList(status_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        result.downstreamAckTimeNanos_ = downstreamAckTimeNanos_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto.getDefaultInstance()) return this;
        if (other.hasSeqno()) {
          setSeqno(other.getSeqno());
        }
        if (!other.status_.isEmpty()) {
          if (status_.isEmpty()) {
            status_ = other.status_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureStatusIsMutable();
            status_.addAll(other.status_);
          }
          onChanged();
        }
        if (other.hasDownstreamAckTimeNanos()) {
          setDownstreamAckTimeNanos(other.getDownstreamAckTimeNanos());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSeqno()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.PipelineAckProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required sint64 seqno = 1;
      private long seqno_ ;
      /**
       * <code>required sint64 seqno = 1;</code>
       */
      public boolean hasSeqno() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required sint64 seqno = 1;</code>
       */
      public long getSeqno() {
        return seqno_;
      }
      /**
       * <code>required sint64 seqno = 1;</code>
       */
      public Builder setSeqno(long value) {
        bitField0_ |= 0x00000001;
        seqno_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required sint64 seqno = 1;</code>
       */
      public Builder clearSeqno() {
        bitField0_ = (bitField0_ & ~0x00000001);
        seqno_ = 0L;
        onChanged();
        return this;
      }

      // repeated .hadoop.hdfs.Status status = 2;
      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status> status_ =
        java.util.Collections.emptyList();
      private void ensureStatusIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          status_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status>(status_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.Status status = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status> getStatusList() {
        return java.util.Collections.unmodifiableList(status_);
      }
      /**
       * <code>repeated .hadoop.hdfs.Status status = 2;</code>
       */
      public int getStatusCount() {
        return status_.size();
      }
      /**
       * <code>repeated .hadoop.hdfs.Status status = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus(int index) {
        return status_.get(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.Status status = 2;</code>
       */
      public Builder setStatus(
          int index, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatusIsMutable();
        status_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.Status status = 2;</code>
       */
      public Builder addStatus(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatusIsMutable();
        status_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.Status status = 2;</code>
       */
      public Builder addAllStatus(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status> values) {
        ensureStatusIsMutable();
        super.addAll(values, status_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.Status status = 2;</code>
       */
      public Builder clearStatus() {
        status_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      // optional uint64 downstreamAckTimeNanos = 3 [default = 0];
      private long downstreamAckTimeNanos_ ;
      /**
       * <code>optional uint64 downstreamAckTimeNanos = 3 [default = 0];</code>
       */
      public boolean hasDownstreamAckTimeNanos() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint64 downstreamAckTimeNanos = 3 [default = 0];</code>
       */
      public long getDownstreamAckTimeNanos() {
        return downstreamAckTimeNanos_;
      }
      /**
       * <code>optional uint64 downstreamAckTimeNanos = 3 [default = 0];</code>
       */
      public Builder setDownstreamAckTimeNanos(long value) {
        bitField0_ |= 0x00000004;
        downstreamAckTimeNanos_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 downstreamAckTimeNanos = 3 [default = 0];</code>
       */
      public Builder clearDownstreamAckTimeNanos() {
        bitField0_ = (bitField0_ & ~0x00000004);
        downstreamAckTimeNanos_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.PipelineAckProto)
    }

    static {
      defaultInstance = new PipelineAckProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.PipelineAckProto)
  }

  public interface ReadOpChecksumInfoProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.ChecksumProto checksum = 1;
    /**
     * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
     */
    boolean hasChecksum();
    /**
     * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto getChecksum();
    /**
     * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder getChecksumOrBuilder();

    // required uint64 chunkOffset = 2;
    /**
     * <code>required uint64 chunkOffset = 2;</code>
     *
     * <pre>
     **
     * The offset into the block at which the first packet
     * will start. This is necessary since reads will align
     * backwards to a checksum chunk boundary.
     * </pre>
     */
    boolean hasChunkOffset();
    /**
     * <code>required uint64 chunkOffset = 2;</code>
     *
     * <pre>
     **
     * The offset into the block at which the first packet
     * will start. This is necessary since reads will align
     * backwards to a checksum chunk boundary.
     * </pre>
     */
    long getChunkOffset();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ReadOpChecksumInfoProto}
   *
   * <pre>
   **
   * Sent as part of the BlockOpResponseProto
   * for READ_BLOCK and COPY_BLOCK operations.
   * </pre>
   */
  public static final class ReadOpChecksumInfoProto extends
      com.google.protobuf.GeneratedMessage
      implements ReadOpChecksumInfoProtoOrBuilder {
    // Use ReadOpChecksumInfoProto.newBuilder() to construct.
    private ReadOpChecksumInfoProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReadOpChecksumInfoProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReadOpChecksumInfoProto defaultInstance;
    public static ReadOpChecksumInfoProto getDefaultInstance() {
      return defaultInstance;
    }

    public ReadOpChecksumInfoProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReadOpChecksumInfoProto(
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
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = checksum_.toBuilder();
              }
              checksum_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(checksum_);
                checksum_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              chunkOffset_ = input.readUInt64();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReadOpChecksumInfoProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReadOpChecksumInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ReadOpChecksumInfoProto> PARSER =
        new com.google.protobuf.AbstractParser<ReadOpChecksumInfoProto>() {
      public ReadOpChecksumInfoProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadOpChecksumInfoProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReadOpChecksumInfoProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.ChecksumProto checksum = 1;
    public static final int CHECKSUM_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto checksum_;
    /**
     * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
     */
    public boolean hasChecksum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto getChecksum() {
      return checksum_;
    }
    /**
     * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder getChecksumOrBuilder() {
      return checksum_;
    }

    // required uint64 chunkOffset = 2;
    public static final int CHUNKOFFSET_FIELD_NUMBER = 2;
    private long chunkOffset_;
    /**
     * <code>required uint64 chunkOffset = 2;</code>
     *
     * <pre>
     **
     * The offset into the block at which the first packet
     * will start. This is necessary since reads will align
     * backwards to a checksum chunk boundary.
     * </pre>
     */
    public boolean hasChunkOffset() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint64 chunkOffset = 2;</code>
     *
     * <pre>
     **
     * The offset into the block at which the first packet
     * will start. This is necessary since reads will align
     * backwards to a checksum chunk boundary.
     * </pre>
     */
    public long getChunkOffset() {
      return chunkOffset_;
    }

    private void initFields() {
      checksum_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.getDefaultInstance();
      chunkOffset_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasChecksum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasChunkOffset()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getChecksum().isInitialized()) {
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
        output.writeMessage(1, checksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, chunkOffset_);
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
          .computeMessageSize(1, checksum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, chunkOffset_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto) obj;

      boolean result = true;
      result = result && (hasChecksum() == other.hasChecksum());
      if (hasChecksum()) {
        result = result && getChecksum()
            .equals(other.getChecksum());
      }
      result = result && (hasChunkOffset() == other.hasChunkOffset());
      if (hasChunkOffset()) {
        result = result && (getChunkOffset()
            == other.getChunkOffset());
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
      if (hasChecksum()) {
        hash = (37 * hash) + CHECKSUM_FIELD_NUMBER;
        hash = (53 * hash) + getChecksum().hashCode();
      }
      if (hasChunkOffset()) {
        hash = (37 * hash) + CHUNKOFFSET_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getChunkOffset());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ReadOpChecksumInfoProto}
     *
     * <pre>
     **
     * Sent as part of the BlockOpResponseProto
     * for READ_BLOCK and COPY_BLOCK operations.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReadOpChecksumInfoProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReadOpChecksumInfoProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.newBuilder()
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
          getChecksumFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (checksumBuilder_ == null) {
          checksum_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.getDefaultInstance();
        } else {
          checksumBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        chunkOffset_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ReadOpChecksumInfoProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (checksumBuilder_ == null) {
          result.checksum_ = checksum_;
        } else {
          result.checksum_ = checksumBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.chunkOffset_ = chunkOffset_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.getDefaultInstance()) return this;
        if (other.hasChecksum()) {
          mergeChecksum(other.getChecksum());
        }
        if (other.hasChunkOffset()) {
          setChunkOffset(other.getChunkOffset());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasChecksum()) {
          
          return false;
        }
        if (!hasChunkOffset()) {
          
          return false;
        }
        if (!getChecksum().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.ChecksumProto checksum = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto checksum_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder> checksumBuilder_;
      /**
       * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
       */
      public boolean hasChecksum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto getChecksum() {
        if (checksumBuilder_ == null) {
          return checksum_;
        } else {
          return checksumBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
       */
      public Builder setChecksum(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto value) {
        if (checksumBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          checksum_ = value;
          onChanged();
        } else {
          checksumBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
       */
      public Builder setChecksum(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder builderForValue) {
        if (checksumBuilder_ == null) {
          checksum_ = builderForValue.build();
          onChanged();
        } else {
          checksumBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
       */
      public Builder mergeChecksum(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto value) {
        if (checksumBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              checksum_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.getDefaultInstance()) {
            checksum_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.newBuilder(checksum_).mergeFrom(value).buildPartial();
          } else {
            checksum_ = value;
          }
          onChanged();
        } else {
          checksumBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
       */
      public Builder clearChecksum() {
        if (checksumBuilder_ == null) {
          checksum_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.getDefaultInstance();
          onChanged();
        } else {
          checksumBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder getChecksumBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getChecksumFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder getChecksumOrBuilder() {
        if (checksumBuilder_ != null) {
          return checksumBuilder_.getMessageOrBuilder();
        } else {
          return checksum_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.ChecksumProto checksum = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder> 
          getChecksumFieldBuilder() {
        if (checksumBuilder_ == null) {
          checksumBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ChecksumProtoOrBuilder>(
                  checksum_,
                  getParentForChildren(),
                  isClean());
          checksum_ = null;
        }
        return checksumBuilder_;
      }

      // required uint64 chunkOffset = 2;
      private long chunkOffset_ ;
      /**
       * <code>required uint64 chunkOffset = 2;</code>
       *
       * <pre>
       **
       * The offset into the block at which the first packet
       * will start. This is necessary since reads will align
       * backwards to a checksum chunk boundary.
       * </pre>
       */
      public boolean hasChunkOffset() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint64 chunkOffset = 2;</code>
       *
       * <pre>
       **
       * The offset into the block at which the first packet
       * will start. This is necessary since reads will align
       * backwards to a checksum chunk boundary.
       * </pre>
       */
      public long getChunkOffset() {
        return chunkOffset_;
      }
      /**
       * <code>required uint64 chunkOffset = 2;</code>
       *
       * <pre>
       **
       * The offset into the block at which the first packet
       * will start. This is necessary since reads will align
       * backwards to a checksum chunk boundary.
       * </pre>
       */
      public Builder setChunkOffset(long value) {
        bitField0_ |= 0x00000002;
        chunkOffset_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 chunkOffset = 2;</code>
       *
       * <pre>
       **
       * The offset into the block at which the first packet
       * will start. This is necessary since reads will align
       * backwards to a checksum chunk boundary.
       * </pre>
       */
      public Builder clearChunkOffset() {
        bitField0_ = (bitField0_ & ~0x00000002);
        chunkOffset_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ReadOpChecksumInfoProto)
    }

    static {
      defaultInstance = new ReadOpChecksumInfoProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ReadOpChecksumInfoProto)
  }

  public interface BlockOpResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.Status status = 1;
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus();

    // optional string firstBadLink = 2;
    /**
     * <code>optional string firstBadLink = 2;</code>
     */
    boolean hasFirstBadLink();
    /**
     * <code>optional string firstBadLink = 2;</code>
     */
    java.lang.String getFirstBadLink();
    /**
     * <code>optional string firstBadLink = 2;</code>
     */
    com.google.protobuf.ByteString
        getFirstBadLinkBytes();

    // optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;
    /**
     * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
     */
    boolean hasChecksumResponse();
    /**
     * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto getChecksumResponse();
    /**
     * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProtoOrBuilder getChecksumResponseOrBuilder();

    // optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;
    /**
     * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
     */
    boolean hasReadOpChecksumInfo();
    /**
     * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto getReadOpChecksumInfo();
    /**
     * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProtoOrBuilder getReadOpChecksumInfoOrBuilder();

    // optional string message = 5;
    /**
     * <code>optional string message = 5;</code>
     *
     * <pre>
     ** explanatory text which may be useful to log on the client side 
     * </pre>
     */
    boolean hasMessage();
    /**
     * <code>optional string message = 5;</code>
     *
     * <pre>
     ** explanatory text which may be useful to log on the client side 
     * </pre>
     */
    java.lang.String getMessage();
    /**
     * <code>optional string message = 5;</code>
     *
     * <pre>
     ** explanatory text which may be useful to log on the client side 
     * </pre>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    // optional uint32 shortCircuitAccessVersion = 6;
    /**
     * <code>optional uint32 shortCircuitAccessVersion = 6;</code>
     *
     * <pre>
     ** If the server chooses to agree to the request of a client for
     * short-circuit access, it will send a response message with the relevant
     * file descriptors attached.
     *
     * In the body of the message, this version number will be set to the
     * specific version number of the block data that the client is about to
     * read.
     * </pre>
     */
    boolean hasShortCircuitAccessVersion();
    /**
     * <code>optional uint32 shortCircuitAccessVersion = 6;</code>
     *
     * <pre>
     ** If the server chooses to agree to the request of a client for
     * short-circuit access, it will send a response message with the relevant
     * file descriptors attached.
     *
     * In the body of the message, this version number will be set to the
     * specific version number of the block data that the client is about to
     * read.
     * </pre>
     */
    int getShortCircuitAccessVersion();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.BlockOpResponseProto}
   */
  public static final class BlockOpResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements BlockOpResponseProtoOrBuilder {
    // Use BlockOpResponseProto.newBuilder() to construct.
    private BlockOpResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BlockOpResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BlockOpResponseProto defaultInstance;
    public static BlockOpResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public BlockOpResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BlockOpResponseProto(
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
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                status_ = value;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              firstBadLink_ = input.readBytes();
              break;
            }
            case 26: {
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = checksumResponse_.toBuilder();
              }
              checksumResponse_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(checksumResponse_);
                checksumResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = readOpChecksumInfo_.toBuilder();
              }
              readOpChecksumInfo_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(readOpChecksumInfo_);
                readOpChecksumInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              message_ = input.readBytes();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              shortCircuitAccessVersion_ = input.readUInt32();
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_BlockOpResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_BlockOpResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<BlockOpResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<BlockOpResponseProto>() {
      public BlockOpResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlockOpResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BlockOpResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.Status status = 1;
    public static final int STATUS_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status status_;
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus() {
      return status_;
    }

    // optional string firstBadLink = 2;
    public static final int FIRSTBADLINK_FIELD_NUMBER = 2;
    private java.lang.Object firstBadLink_;
    /**
     * <code>optional string firstBadLink = 2;</code>
     */
    public boolean hasFirstBadLink() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string firstBadLink = 2;</code>
     */
    public java.lang.String getFirstBadLink() {
      java.lang.Object ref = firstBadLink_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          firstBadLink_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string firstBadLink = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFirstBadLinkBytes() {
      java.lang.Object ref = firstBadLink_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstBadLink_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;
    public static final int CHECKSUMRESPONSE_FIELD_NUMBER = 3;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto checksumResponse_;
    /**
     * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
     */
    public boolean hasChecksumResponse() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto getChecksumResponse() {
      return checksumResponse_;
    }
    /**
     * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProtoOrBuilder getChecksumResponseOrBuilder() {
      return checksumResponse_;
    }

    // optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;
    public static final int READOPCHECKSUMINFO_FIELD_NUMBER = 4;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto readOpChecksumInfo_;
    /**
     * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
     */
    public boolean hasReadOpChecksumInfo() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto getReadOpChecksumInfo() {
      return readOpChecksumInfo_;
    }
    /**
     * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProtoOrBuilder getReadOpChecksumInfoOrBuilder() {
      return readOpChecksumInfo_;
    }

    // optional string message = 5;
    public static final int MESSAGE_FIELD_NUMBER = 5;
    private java.lang.Object message_;
    /**
     * <code>optional string message = 5;</code>
     *
     * <pre>
     ** explanatory text which may be useful to log on the client side 
     * </pre>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string message = 5;</code>
     *
     * <pre>
     ** explanatory text which may be useful to log on the client side 
     * </pre>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string message = 5;</code>
     *
     * <pre>
     ** explanatory text which may be useful to log on the client side 
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional uint32 shortCircuitAccessVersion = 6;
    public static final int SHORTCIRCUITACCESSVERSION_FIELD_NUMBER = 6;
    private int shortCircuitAccessVersion_;
    /**
     * <code>optional uint32 shortCircuitAccessVersion = 6;</code>
     *
     * <pre>
     ** If the server chooses to agree to the request of a client for
     * short-circuit access, it will send a response message with the relevant
     * file descriptors attached.
     *
     * In the body of the message, this version number will be set to the
     * specific version number of the block data that the client is about to
     * read.
     * </pre>
     */
    public boolean hasShortCircuitAccessVersion() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional uint32 shortCircuitAccessVersion = 6;</code>
     *
     * <pre>
     ** If the server chooses to agree to the request of a client for
     * short-circuit access, it will send a response message with the relevant
     * file descriptors attached.
     *
     * In the body of the message, this version number will be set to the
     * specific version number of the block data that the client is about to
     * read.
     * </pre>
     */
    public int getShortCircuitAccessVersion() {
      return shortCircuitAccessVersion_;
    }

    private void initFields() {
      status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
      firstBadLink_ = "";
      checksumResponse_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.getDefaultInstance();
      readOpChecksumInfo_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.getDefaultInstance();
      message_ = "";
      shortCircuitAccessVersion_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasStatus()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasChecksumResponse()) {
        if (!getChecksumResponse().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasReadOpChecksumInfo()) {
        if (!getReadOpChecksumInfo().isInitialized()) {
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
        output.writeEnum(1, status_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getFirstBadLinkBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, checksumResponse_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, readOpChecksumInfo_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getMessageBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeUInt32(6, shortCircuitAccessVersion_);
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
          .computeEnumSize(1, status_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getFirstBadLinkBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, checksumResponse_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, readOpChecksumInfo_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getMessageBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, shortCircuitAccessVersion_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto) obj;

      boolean result = true;
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result &&
            (getStatus() == other.getStatus());
      }
      result = result && (hasFirstBadLink() == other.hasFirstBadLink());
      if (hasFirstBadLink()) {
        result = result && getFirstBadLink()
            .equals(other.getFirstBadLink());
      }
      result = result && (hasChecksumResponse() == other.hasChecksumResponse());
      if (hasChecksumResponse()) {
        result = result && getChecksumResponse()
            .equals(other.getChecksumResponse());
      }
      result = result && (hasReadOpChecksumInfo() == other.hasReadOpChecksumInfo());
      if (hasReadOpChecksumInfo()) {
        result = result && getReadOpChecksumInfo()
            .equals(other.getReadOpChecksumInfo());
      }
      result = result && (hasMessage() == other.hasMessage());
      if (hasMessage()) {
        result = result && getMessage()
            .equals(other.getMessage());
      }
      result = result && (hasShortCircuitAccessVersion() == other.hasShortCircuitAccessVersion());
      if (hasShortCircuitAccessVersion()) {
        result = result && (getShortCircuitAccessVersion()
            == other.getShortCircuitAccessVersion());
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
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getStatus());
      }
      if (hasFirstBadLink()) {
        hash = (37 * hash) + FIRSTBADLINK_FIELD_NUMBER;
        hash = (53 * hash) + getFirstBadLink().hashCode();
      }
      if (hasChecksumResponse()) {
        hash = (37 * hash) + CHECKSUMRESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getChecksumResponse().hashCode();
      }
      if (hasReadOpChecksumInfo()) {
        hash = (37 * hash) + READOPCHECKSUMINFO_FIELD_NUMBER;
        hash = (53 * hash) + getReadOpChecksumInfo().hashCode();
      }
      if (hasMessage()) {
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
      }
      if (hasShortCircuitAccessVersion()) {
        hash = (37 * hash) + SHORTCIRCUITACCESSVERSION_FIELD_NUMBER;
        hash = (53 * hash) + getShortCircuitAccessVersion();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.BlockOpResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_BlockOpResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_BlockOpResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto.newBuilder()
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
          getChecksumResponseFieldBuilder();
          getReadOpChecksumInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
        bitField0_ = (bitField0_ & ~0x00000001);
        firstBadLink_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (checksumResponseBuilder_ == null) {
          checksumResponse_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.getDefaultInstance();
        } else {
          checksumResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (readOpChecksumInfoBuilder_ == null) {
          readOpChecksumInfo_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.getDefaultInstance();
        } else {
          readOpChecksumInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        shortCircuitAccessVersion_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_BlockOpResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.firstBadLink_ = firstBadLink_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (checksumResponseBuilder_ == null) {
          result.checksumResponse_ = checksumResponse_;
        } else {
          result.checksumResponse_ = checksumResponseBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (readOpChecksumInfoBuilder_ == null) {
          result.readOpChecksumInfo_ = readOpChecksumInfo_;
        } else {
          result.readOpChecksumInfo_ = readOpChecksumInfoBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.shortCircuitAccessVersion_ = shortCircuitAccessVersion_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasFirstBadLink()) {
          bitField0_ |= 0x00000002;
          firstBadLink_ = other.firstBadLink_;
          onChanged();
        }
        if (other.hasChecksumResponse()) {
          mergeChecksumResponse(other.getChecksumResponse());
        }
        if (other.hasReadOpChecksumInfo()) {
          mergeReadOpChecksumInfo(other.getReadOpChecksumInfo());
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000010;
          message_ = other.message_;
          onChanged();
        }
        if (other.hasShortCircuitAccessVersion()) {
          setShortCircuitAccessVersion(other.getShortCircuitAccessVersion());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStatus()) {
          
          return false;
        }
        if (hasChecksumResponse()) {
          if (!getChecksumResponse().isInitialized()) {
            
            return false;
          }
        }
        if (hasReadOpChecksumInfo()) {
          if (!getReadOpChecksumInfo().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.Status status = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus() {
        return status_;
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public Builder setStatus(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
        onChanged();
        return this;
      }

      // optional string firstBadLink = 2;
      private java.lang.Object firstBadLink_ = "";
      /**
       * <code>optional string firstBadLink = 2;</code>
       */
      public boolean hasFirstBadLink() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string firstBadLink = 2;</code>
       */
      public java.lang.String getFirstBadLink() {
        java.lang.Object ref = firstBadLink_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          firstBadLink_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string firstBadLink = 2;</code>
       */
      public com.google.protobuf.ByteString
          getFirstBadLinkBytes() {
        java.lang.Object ref = firstBadLink_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          firstBadLink_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string firstBadLink = 2;</code>
       */
      public Builder setFirstBadLink(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        firstBadLink_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string firstBadLink = 2;</code>
       */
      public Builder clearFirstBadLink() {
        bitField0_ = (bitField0_ & ~0x00000002);
        firstBadLink_ = getDefaultInstance().getFirstBadLink();
        onChanged();
        return this;
      }
      /**
       * <code>optional string firstBadLink = 2;</code>
       */
      public Builder setFirstBadLinkBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        firstBadLink_ = value;
        onChanged();
        return this;
      }

      // optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto checksumResponse_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProtoOrBuilder> checksumResponseBuilder_;
      /**
       * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
       */
      public boolean hasChecksumResponse() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto getChecksumResponse() {
        if (checksumResponseBuilder_ == null) {
          return checksumResponse_;
        } else {
          return checksumResponseBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
       */
      public Builder setChecksumResponse(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto value) {
        if (checksumResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          checksumResponse_ = value;
          onChanged();
        } else {
          checksumResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
       */
      public Builder setChecksumResponse(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.Builder builderForValue) {
        if (checksumResponseBuilder_ == null) {
          checksumResponse_ = builderForValue.build();
          onChanged();
        } else {
          checksumResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
       */
      public Builder mergeChecksumResponse(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto value) {
        if (checksumResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              checksumResponse_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.getDefaultInstance()) {
            checksumResponse_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.newBuilder(checksumResponse_).mergeFrom(value).buildPartial();
          } else {
            checksumResponse_ = value;
          }
          onChanged();
        } else {
          checksumResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
       */
      public Builder clearChecksumResponse() {
        if (checksumResponseBuilder_ == null) {
          checksumResponse_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.getDefaultInstance();
          onChanged();
        } else {
          checksumResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.Builder getChecksumResponseBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getChecksumResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProtoOrBuilder getChecksumResponseOrBuilder() {
        if (checksumResponseBuilder_ != null) {
          return checksumResponseBuilder_.getMessageOrBuilder();
        } else {
          return checksumResponse_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.OpBlockChecksumResponseProto checksumResponse = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProtoOrBuilder> 
          getChecksumResponseFieldBuilder() {
        if (checksumResponseBuilder_ == null) {
          checksumResponseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProtoOrBuilder>(
                  checksumResponse_,
                  getParentForChildren(),
                  isClean());
          checksumResponse_ = null;
        }
        return checksumResponseBuilder_;
      }

      // optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto readOpChecksumInfo_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProtoOrBuilder> readOpChecksumInfoBuilder_;
      /**
       * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
       */
      public boolean hasReadOpChecksumInfo() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto getReadOpChecksumInfo() {
        if (readOpChecksumInfoBuilder_ == null) {
          return readOpChecksumInfo_;
        } else {
          return readOpChecksumInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
       */
      public Builder setReadOpChecksumInfo(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto value) {
        if (readOpChecksumInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          readOpChecksumInfo_ = value;
          onChanged();
        } else {
          readOpChecksumInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
       */
      public Builder setReadOpChecksumInfo(
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.Builder builderForValue) {
        if (readOpChecksumInfoBuilder_ == null) {
          readOpChecksumInfo_ = builderForValue.build();
          onChanged();
        } else {
          readOpChecksumInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
       */
      public Builder mergeReadOpChecksumInfo(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto value) {
        if (readOpChecksumInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
              readOpChecksumInfo_ != org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.getDefaultInstance()) {
            readOpChecksumInfo_ =
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.newBuilder(readOpChecksumInfo_).mergeFrom(value).buildPartial();
          } else {
            readOpChecksumInfo_ = value;
          }
          onChanged();
        } else {
          readOpChecksumInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
       */
      public Builder clearReadOpChecksumInfo() {
        if (readOpChecksumInfoBuilder_ == null) {
          readOpChecksumInfo_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.getDefaultInstance();
          onChanged();
        } else {
          readOpChecksumInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.Builder getReadOpChecksumInfoBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getReadOpChecksumInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProtoOrBuilder getReadOpChecksumInfoOrBuilder() {
        if (readOpChecksumInfoBuilder_ != null) {
          return readOpChecksumInfoBuilder_.getMessageOrBuilder();
        } else {
          return readOpChecksumInfo_;
        }
      }
      /**
       * <code>optional .hadoop.hdfs.ReadOpChecksumInfoProto readOpChecksumInfo = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProtoOrBuilder> 
          getReadOpChecksumInfoFieldBuilder() {
        if (readOpChecksumInfoBuilder_ == null) {
          readOpChecksumInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProto.Builder, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ReadOpChecksumInfoProtoOrBuilder>(
                  readOpChecksumInfo_,
                  getParentForChildren(),
                  isClean());
          readOpChecksumInfo_ = null;
        }
        return readOpChecksumInfoBuilder_;
      }

      // optional string message = 5;
      private java.lang.Object message_ = "";
      /**
       * <code>optional string message = 5;</code>
       *
       * <pre>
       ** explanatory text which may be useful to log on the client side 
       * </pre>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string message = 5;</code>
       *
       * <pre>
       ** explanatory text which may be useful to log on the client side 
       * </pre>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string message = 5;</code>
       *
       * <pre>
       ** explanatory text which may be useful to log on the client side 
       * </pre>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string message = 5;</code>
       *
       * <pre>
       ** explanatory text which may be useful to log on the client side 
       * </pre>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 5;</code>
       *
       * <pre>
       ** explanatory text which may be useful to log on the client side 
       * </pre>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000010);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 5;</code>
       *
       * <pre>
       ** explanatory text which may be useful to log on the client side 
       * </pre>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        message_ = value;
        onChanged();
        return this;
      }

      // optional uint32 shortCircuitAccessVersion = 6;
      private int shortCircuitAccessVersion_ ;
      /**
       * <code>optional uint32 shortCircuitAccessVersion = 6;</code>
       *
       * <pre>
       ** If the server chooses to agree to the request of a client for
       * short-circuit access, it will send a response message with the relevant
       * file descriptors attached.
       *
       * In the body of the message, this version number will be set to the
       * specific version number of the block data that the client is about to
       * read.
       * </pre>
       */
      public boolean hasShortCircuitAccessVersion() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional uint32 shortCircuitAccessVersion = 6;</code>
       *
       * <pre>
       ** If the server chooses to agree to the request of a client for
       * short-circuit access, it will send a response message with the relevant
       * file descriptors attached.
       *
       * In the body of the message, this version number will be set to the
       * specific version number of the block data that the client is about to
       * read.
       * </pre>
       */
      public int getShortCircuitAccessVersion() {
        return shortCircuitAccessVersion_;
      }
      /**
       * <code>optional uint32 shortCircuitAccessVersion = 6;</code>
       *
       * <pre>
       ** If the server chooses to agree to the request of a client for
       * short-circuit access, it will send a response message with the relevant
       * file descriptors attached.
       *
       * In the body of the message, this version number will be set to the
       * specific version number of the block data that the client is about to
       * read.
       * </pre>
       */
      public Builder setShortCircuitAccessVersion(int value) {
        bitField0_ |= 0x00000020;
        shortCircuitAccessVersion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 shortCircuitAccessVersion = 6;</code>
       *
       * <pre>
       ** If the server chooses to agree to the request of a client for
       * short-circuit access, it will send a response message with the relevant
       * file descriptors attached.
       *
       * In the body of the message, this version number will be set to the
       * specific version number of the block data that the client is about to
       * read.
       * </pre>
       */
      public Builder clearShortCircuitAccessVersion() {
        bitField0_ = (bitField0_ & ~0x00000020);
        shortCircuitAccessVersion_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.BlockOpResponseProto)
    }

    static {
      defaultInstance = new BlockOpResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.BlockOpResponseProto)
  }

  public interface ClientReadStatusProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.Status status = 1;
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ClientReadStatusProto}
   *
   * <pre>
   **
   * Message sent from the client to the DN after reading the entire
   * read request.
   * </pre>
   */
  public static final class ClientReadStatusProto extends
      com.google.protobuf.GeneratedMessage
      implements ClientReadStatusProtoOrBuilder {
    // Use ClientReadStatusProto.newBuilder() to construct.
    private ClientReadStatusProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ClientReadStatusProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ClientReadStatusProto defaultInstance;
    public static ClientReadStatusProto getDefaultInstance() {
      return defaultInstance;
    }

    public ClientReadStatusProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ClientReadStatusProto(
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
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                status_ = value;
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ClientReadStatusProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ClientReadStatusProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ClientReadStatusProto> PARSER =
        new com.google.protobuf.AbstractParser<ClientReadStatusProto>() {
      public ClientReadStatusProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientReadStatusProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ClientReadStatusProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.Status status = 1;
    public static final int STATUS_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status status_;
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus() {
      return status_;
    }

    private void initFields() {
      status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasStatus()) {
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
        output.writeEnum(1, status_.getNumber());
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
          .computeEnumSize(1, status_.getNumber());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto) obj;

      boolean result = true;
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result &&
            (getStatus() == other.getStatus());
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
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getStatus());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ClientReadStatusProto}
     *
     * <pre>
     **
     * Message sent from the client to the DN after reading the entire
     * read request.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ClientReadStatusProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ClientReadStatusProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto.newBuilder()
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
        status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_ClientReadStatusProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStatus()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.ClientReadStatusProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.Status status = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus() {
        return status_;
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public Builder setStatus(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ClientReadStatusProto)
    }

    static {
      defaultInstance = new ClientReadStatusProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ClientReadStatusProto)
  }

  public interface DNTransferAckProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.Status status = 1;
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.DNTransferAckProto}
   */
  public static final class DNTransferAckProto extends
      com.google.protobuf.GeneratedMessage
      implements DNTransferAckProtoOrBuilder {
    // Use DNTransferAckProto.newBuilder() to construct.
    private DNTransferAckProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DNTransferAckProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DNTransferAckProto defaultInstance;
    public static DNTransferAckProto getDefaultInstance() {
      return defaultInstance;
    }

    public DNTransferAckProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DNTransferAckProto(
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
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                status_ = value;
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_DNTransferAckProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_DNTransferAckProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto.Builder.class);
    }

    public static com.google.protobuf.Parser<DNTransferAckProto> PARSER =
        new com.google.protobuf.AbstractParser<DNTransferAckProto>() {
      public DNTransferAckProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DNTransferAckProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DNTransferAckProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.Status status = 1;
    public static final int STATUS_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status status_;
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.Status status = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus() {
      return status_;
    }

    private void initFields() {
      status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasStatus()) {
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
        output.writeEnum(1, status_.getNumber());
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
          .computeEnumSize(1, status_.getNumber());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto) obj;

      boolean result = true;
      result = result && (hasStatus() == other.hasStatus());
      if (hasStatus()) {
        result = result &&
            (getStatus() == other.getStatus());
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
      if (hasStatus()) {
        hash = (37 * hash) + STATUS_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getStatus());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.DNTransferAckProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_DNTransferAckProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_DNTransferAckProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto.newBuilder()
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
        status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_DNTransferAckProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasStatus()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.DNTransferAckProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.Status status = 1;
      private org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status getStatus() {
        return status_;
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public Builder setStatus(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.Status status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.Status.SUCCESS;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.DNTransferAckProto)
    }

    static {
      defaultInstance = new DNTransferAckProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.DNTransferAckProto)
  }

  public interface OpBlockChecksumResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required uint32 bytesPerCrc = 1;
    /**
     * <code>required uint32 bytesPerCrc = 1;</code>
     */
    boolean hasBytesPerCrc();
    /**
     * <code>required uint32 bytesPerCrc = 1;</code>
     */
    int getBytesPerCrc();

    // required uint64 crcPerBlock = 2;
    /**
     * <code>required uint64 crcPerBlock = 2;</code>
     */
    boolean hasCrcPerBlock();
    /**
     * <code>required uint64 crcPerBlock = 2;</code>
     */
    long getCrcPerBlock();

    // required bytes md5 = 3;
    /**
     * <code>required bytes md5 = 3;</code>
     */
    boolean hasMd5();
    /**
     * <code>required bytes md5 = 3;</code>
     */
    com.google.protobuf.ByteString getMd5();

    // optional .hadoop.hdfs.ChecksumTypeProto crcType = 4;
    /**
     * <code>optional .hadoop.hdfs.ChecksumTypeProto crcType = 4;</code>
     */
    boolean hasCrcType();
    /**
     * <code>optional .hadoop.hdfs.ChecksumTypeProto crcType = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto getCrcType();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.OpBlockChecksumResponseProto}
   */
  public static final class OpBlockChecksumResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements OpBlockChecksumResponseProtoOrBuilder {
    // Use OpBlockChecksumResponseProto.newBuilder() to construct.
    private OpBlockChecksumResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OpBlockChecksumResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OpBlockChecksumResponseProto defaultInstance;
    public static OpBlockChecksumResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public OpBlockChecksumResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OpBlockChecksumResponseProto(
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
              bytesPerCrc_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              crcPerBlock_ = input.readUInt64();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              md5_ = input.readBytes();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto value = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                crcType_ = value;
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
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpBlockChecksumResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpBlockChecksumResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<OpBlockChecksumResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<OpBlockChecksumResponseProto>() {
      public OpBlockChecksumResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpBlockChecksumResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OpBlockChecksumResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required uint32 bytesPerCrc = 1;
    public static final int BYTESPERCRC_FIELD_NUMBER = 1;
    private int bytesPerCrc_;
    /**
     * <code>required uint32 bytesPerCrc = 1;</code>
     */
    public boolean hasBytesPerCrc() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint32 bytesPerCrc = 1;</code>
     */
    public int getBytesPerCrc() {
      return bytesPerCrc_;
    }

    // required uint64 crcPerBlock = 2;
    public static final int CRCPERBLOCK_FIELD_NUMBER = 2;
    private long crcPerBlock_;
    /**
     * <code>required uint64 crcPerBlock = 2;</code>
     */
    public boolean hasCrcPerBlock() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint64 crcPerBlock = 2;</code>
     */
    public long getCrcPerBlock() {
      return crcPerBlock_;
    }

    // required bytes md5 = 3;
    public static final int MD5_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString md5_;
    /**
     * <code>required bytes md5 = 3;</code>
     */
    public boolean hasMd5() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required bytes md5 = 3;</code>
     */
    public com.google.protobuf.ByteString getMd5() {
      return md5_;
    }

    // optional .hadoop.hdfs.ChecksumTypeProto crcType = 4;
    public static final int CRCTYPE_FIELD_NUMBER = 4;
    private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto crcType_;
    /**
     * <code>optional .hadoop.hdfs.ChecksumTypeProto crcType = 4;</code>
     */
    public boolean hasCrcType() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .hadoop.hdfs.ChecksumTypeProto crcType = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto getCrcType() {
      return crcType_;
    }

    private void initFields() {
      bytesPerCrc_ = 0;
      crcPerBlock_ = 0L;
      md5_ = com.google.protobuf.ByteString.EMPTY;
      crcType_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto.CHECKSUM_NULL;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasBytesPerCrc()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCrcPerBlock()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMd5()) {
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
        output.writeUInt32(1, bytesPerCrc_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, crcPerBlock_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, md5_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, crcType_.getNumber());
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
          .computeUInt32Size(1, bytesPerCrc_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, crcPerBlock_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, md5_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, crcType_.getNumber());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto) obj;

      boolean result = true;
      result = result && (hasBytesPerCrc() == other.hasBytesPerCrc());
      if (hasBytesPerCrc()) {
        result = result && (getBytesPerCrc()
            == other.getBytesPerCrc());
      }
      result = result && (hasCrcPerBlock() == other.hasCrcPerBlock());
      if (hasCrcPerBlock()) {
        result = result && (getCrcPerBlock()
            == other.getCrcPerBlock());
      }
      result = result && (hasMd5() == other.hasMd5());
      if (hasMd5()) {
        result = result && getMd5()
            .equals(other.getMd5());
      }
      result = result && (hasCrcType() == other.hasCrcType());
      if (hasCrcType()) {
        result = result &&
            (getCrcType() == other.getCrcType());
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
      if (hasBytesPerCrc()) {
        hash = (37 * hash) + BYTESPERCRC_FIELD_NUMBER;
        hash = (53 * hash) + getBytesPerCrc();
      }
      if (hasCrcPerBlock()) {
        hash = (37 * hash) + CRCPERBLOCK_FIELD_NUMBER;
        hash = (53 * hash) + hashLong(getCrcPerBlock());
      }
      if (hasMd5()) {
        hash = (37 * hash) + MD5_FIELD_NUMBER;
        hash = (53 * hash) + getMd5().hashCode();
      }
      if (hasCrcType()) {
        hash = (37 * hash) + CRCTYPE_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getCrcType());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.OpBlockChecksumResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpBlockChecksumResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpBlockChecksumResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.newBuilder()
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
        bytesPerCrc_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        crcPerBlock_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        md5_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        crcType_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto.CHECKSUM_NULL;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.internal_static_hadoop_hdfs_OpBlockChecksumResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.bytesPerCrc_ = bytesPerCrc_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.crcPerBlock_ = crcPerBlock_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.md5_ = md5_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.crcType_ = crcType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto.getDefaultInstance()) return this;
        if (other.hasBytesPerCrc()) {
          setBytesPerCrc(other.getBytesPerCrc());
        }
        if (other.hasCrcPerBlock()) {
          setCrcPerBlock(other.getCrcPerBlock());
        }
        if (other.hasMd5()) {
          setMd5(other.getMd5());
        }
        if (other.hasCrcType()) {
          setCrcType(other.getCrcType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasBytesPerCrc()) {
          
          return false;
        }
        if (!hasCrcPerBlock()) {
          
          return false;
        }
        if (!hasMd5()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required uint32 bytesPerCrc = 1;
      private int bytesPerCrc_ ;
      /**
       * <code>required uint32 bytesPerCrc = 1;</code>
       */
      public boolean hasBytesPerCrc() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required uint32 bytesPerCrc = 1;</code>
       */
      public int getBytesPerCrc() {
        return bytesPerCrc_;
      }
      /**
       * <code>required uint32 bytesPerCrc = 1;</code>
       */
      public Builder setBytesPerCrc(int value) {
        bitField0_ |= 0x00000001;
        bytesPerCrc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 bytesPerCrc = 1;</code>
       */
      public Builder clearBytesPerCrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        bytesPerCrc_ = 0;
        onChanged();
        return this;
      }

      // required uint64 crcPerBlock = 2;
      private long crcPerBlock_ ;
      /**
       * <code>required uint64 crcPerBlock = 2;</code>
       */
      public boolean hasCrcPerBlock() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint64 crcPerBlock = 2;</code>
       */
      public long getCrcPerBlock() {
        return crcPerBlock_;
      }
      /**
       * <code>required uint64 crcPerBlock = 2;</code>
       */
      public Builder setCrcPerBlock(long value) {
        bitField0_ |= 0x00000002;
        crcPerBlock_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 crcPerBlock = 2;</code>
       */
      public Builder clearCrcPerBlock() {
        bitField0_ = (bitField0_ & ~0x00000002);
        crcPerBlock_ = 0L;
        onChanged();
        return this;
      }

      // required bytes md5 = 3;
      private com.google.protobuf.ByteString md5_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes md5 = 3;</code>
       */
      public boolean hasMd5() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required bytes md5 = 3;</code>
       */
      public com.google.protobuf.ByteString getMd5() {
        return md5_;
      }
      /**
       * <code>required bytes md5 = 3;</code>
       */
      public Builder setMd5(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        md5_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes md5 = 3;</code>
       */
      public Builder clearMd5() {
        bitField0_ = (bitField0_ & ~0x00000004);
        md5_ = getDefaultInstance().getMd5();
        onChanged();
        return this;
      }

      // optional .hadoop.hdfs.ChecksumTypeProto crcType = 4;
      private org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto crcType_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto.CHECKSUM_NULL;
      /**
       * <code>optional .hadoop.hdfs.ChecksumTypeProto crcType = 4;</code>
       */
      public boolean hasCrcType() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .hadoop.hdfs.ChecksumTypeProto crcType = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto getCrcType() {
        return crcType_;
      }
      /**
       * <code>optional .hadoop.hdfs.ChecksumTypeProto crcType = 4;</code>
       */
      public Builder setCrcType(org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        crcType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .hadoop.hdfs.ChecksumTypeProto crcType = 4;</code>
       */
      public Builder clearCrcType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        crcType_ = org.apache.hadoop.hdfs.protocol.proto.HdfsProtos.ChecksumTypeProto.CHECKSUM_NULL;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.OpBlockChecksumResponseProto)
    }

    static {
      defaultInstance = new OpBlockChecksumResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.OpBlockChecksumResponseProto)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_DataTransferEncryptorMessageProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_DataTransferEncryptorMessageProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_BaseHeaderProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_BaseHeaderProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ClientOperationHeaderProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ClientOperationHeaderProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_CachingStrategyProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_CachingStrategyProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_OpReadBlockProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_OpReadBlockProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ChecksumProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ChecksumProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_OpWriteBlockProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_OpWriteBlockProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_OpTransferBlockProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_OpTransferBlockProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_OpReplaceBlockProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_OpReplaceBlockProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_OpCopyBlockProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_OpCopyBlockProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_OpBlockChecksumProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_OpBlockChecksumProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ShortCircuitShmIdProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ShortCircuitShmIdProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ShortCircuitShmSlotProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ShortCircuitShmSlotProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_OpRequestShortCircuitAccessProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_OpRequestShortCircuitAccessProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ReleaseShortCircuitAccessRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ReleaseShortCircuitAccessRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ReleaseShortCircuitAccessResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ReleaseShortCircuitAccessResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ShortCircuitShmRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ShortCircuitShmRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ShortCircuitShmResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ShortCircuitShmResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_PacketHeaderProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_PacketHeaderProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_PipelineAckProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_PipelineAckProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ReadOpChecksumInfoProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ReadOpChecksumInfoProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_BlockOpResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_BlockOpResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ClientReadStatusProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ClientReadStatusProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_DNTransferAckProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_DNTransferAckProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_OpBlockChecksumResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_OpBlockChecksumResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022datatransfer.proto\022\013hadoop.hdfs\032\016Secur" +
      "ity.proto\032\nhdfs.proto\"\357\001\n!DataTransferEn" +
      "cryptorMessageProto\022Z\n\006status\030\001 \002(\0162J.ha" +
      "doop.hdfs.DataTransferEncryptorMessagePr" +
      "oto.DataTransferEncryptorStatus\022\017\n\007paylo" +
      "ad\030\002 \001(\014\022\017\n\007message\030\003 \001(\t\"L\n\033DataTransfe" +
      "rEncryptorStatus\022\013\n\007SUCCESS\020\000\022\025\n\021ERROR_U" +
      "NKNOWN_KEY\020\001\022\t\n\005ERROR\020\002\"k\n\017BaseHeaderPro" +
      "to\022.\n\005block\030\001 \002(\0132\037.hadoop.hdfs.Extended" +
      "BlockProto\022(\n\005token\030\002 \001(\0132\031.hadoop.commo",
      "n.TokenProto\"b\n\032ClientOperationHeaderPro" +
      "to\0220\n\nbaseHeader\030\001 \002(\0132\034.hadoop.hdfs.Bas" +
      "eHeaderProto\022\022\n\nclientName\030\002 \002(\t\"=\n\024Cach" +
      "ingStrategyProto\022\022\n\ndropBehind\030\001 \001(\010\022\021\n\t" +
      "readahead\030\002 \001(\003\"\301\001\n\020OpReadBlockProto\0227\n\006" +
      "header\030\001 \002(\0132\'.hadoop.hdfs.ClientOperati" +
      "onHeaderProto\022\016\n\006offset\030\002 \002(\004\022\013\n\003len\030\003 \002" +
      "(\004\022\033\n\rsendChecksums\030\004 \001(\010:\004true\022:\n\017cachi" +
      "ngStrategy\030\005 \001(\0132!.hadoop.hdfs.CachingSt" +
      "rategyProto\"W\n\rChecksumProto\022,\n\004type\030\001 \002",
      "(\0162\036.hadoop.hdfs.ChecksumTypeProto\022\030\n\020by" +
      "tesPerChecksum\030\002 \002(\r\"\322\005\n\021OpWriteBlockPro" +
      "to\0227\n\006header\030\001 \002(\0132\'.hadoop.hdfs.ClientO" +
      "perationHeaderProto\022/\n\007targets\030\002 \003(\0132\036.h" +
      "adoop.hdfs.DatanodeInfoProto\022.\n\006source\030\003" +
      " \001(\0132\036.hadoop.hdfs.DatanodeInfoProto\022D\n\005" +
      "stage\030\004 \002(\01625.hadoop.hdfs.OpWriteBlockPr" +
      "oto.BlockConstructionStage\022\024\n\014pipelineSi" +
      "ze\030\005 \002(\r\022\024\n\014minBytesRcvd\030\006 \002(\004\022\024\n\014maxByt" +
      "esRcvd\030\007 \002(\004\022\035\n\025latestGenerationStamp\030\010 ",
      "\002(\004\0225\n\021requestedChecksum\030\t \002(\0132\032.hadoop." +
      "hdfs.ChecksumProto\022:\n\017cachingStrategy\030\n " +
      "\001(\0132!.hadoop.hdfs.CachingStrategyProto\"\210" +
      "\002\n\026BlockConstructionStage\022\031\n\025PIPELINE_SE" +
      "TUP_APPEND\020\000\022\"\n\036PIPELINE_SETUP_APPEND_RE" +
      "COVERY\020\001\022\022\n\016DATA_STREAMING\020\002\022%\n!PIPELINE" +
      "_SETUP_STREAMING_RECOVERY\020\003\022\022\n\016PIPELINE_" +
      "CLOSE\020\004\022\033\n\027PIPELINE_CLOSE_RECOVERY\020\005\022\031\n\025" +
      "PIPELINE_SETUP_CREATE\020\006\022\020\n\014TRANSFER_RBW\020" +
      "\007\022\026\n\022TRANSFER_FINALIZED\020\010\"\200\001\n\024OpTransfer",
      "BlockProto\0227\n\006header\030\001 \002(\0132\'.hadoop.hdfs" +
      ".ClientOperationHeaderProto\022/\n\007targets\030\002" +
      " \003(\0132\036.hadoop.hdfs.DatanodeInfoProto\"\204\001\n" +
      "\023OpReplaceBlockProto\022,\n\006header\030\001 \002(\0132\034.h" +
      "adoop.hdfs.BaseHeaderProto\022\017\n\007delHint\030\002 " +
      "\002(\t\022.\n\006source\030\003 \002(\0132\036.hadoop.hdfs.Datano" +
      "deInfoProto\"@\n\020OpCopyBlockProto\022,\n\006heade" +
      "r\030\001 \002(\0132\034.hadoop.hdfs.BaseHeaderProto\"D\n" +
      "\024OpBlockChecksumProto\022,\n\006header\030\001 \002(\0132\034." +
      "hadoop.hdfs.BaseHeaderProto\"0\n\026ShortCirc",
      "uitShmIdProto\022\n\n\002hi\030\001 \002(\003\022\n\n\002lo\030\002 \002(\003\"_\n" +
      "\030ShortCircuitShmSlotProto\0222\n\005shmId\030\001 \002(\013" +
      "2#.hadoop.hdfs.ShortCircuitShmIdProto\022\017\n" +
      "\007slotIdx\030\002 \002(\005\"\233\001\n OpRequestShortCircuit" +
      "AccessProto\022,\n\006header\030\001 \002(\0132\034.hadoop.hdf" +
      "s.BaseHeaderProto\022\022\n\nmaxVersion\030\002 \002(\r\0225\n" +
      "\006slotId\030\003 \001(\0132%.hadoop.hdfs.ShortCircuit" +
      "ShmSlotProto\"^\n%ReleaseShortCircuitAcces" +
      "sRequestProto\0225\n\006slotId\030\001 \002(\0132%.hadoop.h" +
      "dfs.ShortCircuitShmSlotProto\"\\\n&ReleaseS",
      "hortCircuitAccessResponseProto\022#\n\006status" +
      "\030\001 \002(\0162\023.hadoop.hdfs.Status\022\r\n\005error\030\002 \001" +
      "(\t\"1\n\033ShortCircuitShmRequestProto\022\022\n\ncli" +
      "entName\030\001 \002(\t\"\203\001\n\034ShortCircuitShmRespons" +
      "eProto\022#\n\006status\030\001 \002(\0162\023.hadoop.hdfs.Sta" +
      "tus\022\r\n\005error\030\002 \001(\t\022/\n\002id\030\003 \001(\0132#.hadoop." +
      "hdfs.ShortCircuitShmIdProto\"\177\n\021PacketHea" +
      "derProto\022\025\n\roffsetInBlock\030\001 \002(\020\022\r\n\005seqno" +
      "\030\002 \002(\020\022\031\n\021lastPacketInBlock\030\003 \002(\010\022\017\n\007dat" +
      "aLen\030\004 \002(\017\022\030\n\tsyncBlock\030\005 \001(\010:\005false\"i\n\020",
      "PipelineAckProto\022\r\n\005seqno\030\001 \002(\022\022#\n\006statu" +
      "s\030\002 \003(\0162\023.hadoop.hdfs.Status\022!\n\026downstre" +
      "amAckTimeNanos\030\003 \001(\004:\0010\"\\\n\027ReadOpChecksu" +
      "mInfoProto\022,\n\010checksum\030\001 \002(\0132\032.hadoop.hd" +
      "fs.ChecksumProto\022\023\n\013chunkOffset\030\002 \002(\004\"\214\002" +
      "\n\024BlockOpResponseProto\022#\n\006status\030\001 \002(\0162\023" +
      ".hadoop.hdfs.Status\022\024\n\014firstBadLink\030\002 \001(" +
      "\t\022C\n\020checksumResponse\030\003 \001(\0132).hadoop.hdf" +
      "s.OpBlockChecksumResponseProto\022@\n\022readOp" +
      "ChecksumInfo\030\004 \001(\0132$.hadoop.hdfs.ReadOpC",
      "hecksumInfoProto\022\017\n\007message\030\005 \001(\t\022!\n\031sho" +
      "rtCircuitAccessVersion\030\006 \001(\r\"<\n\025ClientRe" +
      "adStatusProto\022#\n\006status\030\001 \002(\0162\023.hadoop.h" +
      "dfs.Status\"9\n\022DNTransferAckProto\022#\n\006stat" +
      "us\030\001 \002(\0162\023.hadoop.hdfs.Status\"\206\001\n\034OpBloc" +
      "kChecksumResponseProto\022\023\n\013bytesPerCrc\030\001 " +
      "\002(\r\022\023\n\013crcPerBlock\030\002 \002(\004\022\013\n\003md5\030\003 \002(\014\022/\n" +
      "\007crcType\030\004 \001(\0162\036.hadoop.hdfs.ChecksumTyp" +
      "eProto*\343\001\n\006Status\022\013\n\007SUCCESS\020\000\022\t\n\005ERROR\020" +
      "\001\022\022\n\016ERROR_CHECKSUM\020\002\022\021\n\rERROR_INVALID\020\003",
      "\022\020\n\014ERROR_EXISTS\020\004\022\026\n\022ERROR_ACCESS_TOKEN" +
      "\020\005\022\017\n\013CHECKSUM_OK\020\006\022\025\n\021ERROR_UNSUPPORTED" +
      "\020\007\022\017\n\013OOB_RESTART\020\010\022\021\n\rOOB_RESERVED1\020\t\022\021" +
      "\n\rOOB_RESERVED2\020\n\022\021\n\rOOB_RESERVED3\020\013B>\n%" +
      "org.apache.hadoop.hdfs.protocol.protoB\022D" +
      "ataTransferProtos\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hadoop_hdfs_DataTransferEncryptorMessageProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hadoop_hdfs_DataTransferEncryptorMessageProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_DataTransferEncryptorMessageProto_descriptor,
              new java.lang.String[] { "Status", "Payload", "Message", });
          internal_static_hadoop_hdfs_BaseHeaderProto_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_hadoop_hdfs_BaseHeaderProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_BaseHeaderProto_descriptor,
              new java.lang.String[] { "Block", "Token", });
          internal_static_hadoop_hdfs_ClientOperationHeaderProto_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_hadoop_hdfs_ClientOperationHeaderProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ClientOperationHeaderProto_descriptor,
              new java.lang.String[] { "BaseHeader", "ClientName", });
          internal_static_hadoop_hdfs_CachingStrategyProto_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_hadoop_hdfs_CachingStrategyProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_CachingStrategyProto_descriptor,
              new java.lang.String[] { "DropBehind", "Readahead", });
          internal_static_hadoop_hdfs_OpReadBlockProto_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_hadoop_hdfs_OpReadBlockProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_OpReadBlockProto_descriptor,
              new java.lang.String[] { "Header", "Offset", "Len", "SendChecksums", "CachingStrategy", });
          internal_static_hadoop_hdfs_ChecksumProto_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_hadoop_hdfs_ChecksumProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ChecksumProto_descriptor,
              new java.lang.String[] { "Type", "BytesPerChecksum", });
          internal_static_hadoop_hdfs_OpWriteBlockProto_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_hadoop_hdfs_OpWriteBlockProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_OpWriteBlockProto_descriptor,
              new java.lang.String[] { "Header", "Targets", "Source", "Stage", "PipelineSize", "MinBytesRcvd", "MaxBytesRcvd", "LatestGenerationStamp", "RequestedChecksum", "CachingStrategy", });
          internal_static_hadoop_hdfs_OpTransferBlockProto_descriptor =
            getDescriptor().getMessageTypes().get(7);
          internal_static_hadoop_hdfs_OpTransferBlockProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_OpTransferBlockProto_descriptor,
              new java.lang.String[] { "Header", "Targets", });
          internal_static_hadoop_hdfs_OpReplaceBlockProto_descriptor =
            getDescriptor().getMessageTypes().get(8);
          internal_static_hadoop_hdfs_OpReplaceBlockProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_OpReplaceBlockProto_descriptor,
              new java.lang.String[] { "Header", "DelHint", "Source", });
          internal_static_hadoop_hdfs_OpCopyBlockProto_descriptor =
            getDescriptor().getMessageTypes().get(9);
          internal_static_hadoop_hdfs_OpCopyBlockProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_OpCopyBlockProto_descriptor,
              new java.lang.String[] { "Header", });
          internal_static_hadoop_hdfs_OpBlockChecksumProto_descriptor =
            getDescriptor().getMessageTypes().get(10);
          internal_static_hadoop_hdfs_OpBlockChecksumProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_OpBlockChecksumProto_descriptor,
              new java.lang.String[] { "Header", });
          internal_static_hadoop_hdfs_ShortCircuitShmIdProto_descriptor =
            getDescriptor().getMessageTypes().get(11);
          internal_static_hadoop_hdfs_ShortCircuitShmIdProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ShortCircuitShmIdProto_descriptor,
              new java.lang.String[] { "Hi", "Lo", });
          internal_static_hadoop_hdfs_ShortCircuitShmSlotProto_descriptor =
            getDescriptor().getMessageTypes().get(12);
          internal_static_hadoop_hdfs_ShortCircuitShmSlotProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ShortCircuitShmSlotProto_descriptor,
              new java.lang.String[] { "ShmId", "SlotIdx", });
          internal_static_hadoop_hdfs_OpRequestShortCircuitAccessProto_descriptor =
            getDescriptor().getMessageTypes().get(13);
          internal_static_hadoop_hdfs_OpRequestShortCircuitAccessProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_OpRequestShortCircuitAccessProto_descriptor,
              new java.lang.String[] { "Header", "MaxVersion", "SlotId", });
          internal_static_hadoop_hdfs_ReleaseShortCircuitAccessRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(14);
          internal_static_hadoop_hdfs_ReleaseShortCircuitAccessRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ReleaseShortCircuitAccessRequestProto_descriptor,
              new java.lang.String[] { "SlotId", });
          internal_static_hadoop_hdfs_ReleaseShortCircuitAccessResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(15);
          internal_static_hadoop_hdfs_ReleaseShortCircuitAccessResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ReleaseShortCircuitAccessResponseProto_descriptor,
              new java.lang.String[] { "Status", "Error", });
          internal_static_hadoop_hdfs_ShortCircuitShmRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(16);
          internal_static_hadoop_hdfs_ShortCircuitShmRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ShortCircuitShmRequestProto_descriptor,
              new java.lang.String[] { "ClientName", });
          internal_static_hadoop_hdfs_ShortCircuitShmResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(17);
          internal_static_hadoop_hdfs_ShortCircuitShmResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ShortCircuitShmResponseProto_descriptor,
              new java.lang.String[] { "Status", "Error", "Id", });
          internal_static_hadoop_hdfs_PacketHeaderProto_descriptor =
            getDescriptor().getMessageTypes().get(18);
          internal_static_hadoop_hdfs_PacketHeaderProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_PacketHeaderProto_descriptor,
              new java.lang.String[] { "OffsetInBlock", "Seqno", "LastPacketInBlock", "DataLen", "SyncBlock", });
          internal_static_hadoop_hdfs_PipelineAckProto_descriptor =
            getDescriptor().getMessageTypes().get(19);
          internal_static_hadoop_hdfs_PipelineAckProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_PipelineAckProto_descriptor,
              new java.lang.String[] { "Seqno", "Status", "DownstreamAckTimeNanos", });
          internal_static_hadoop_hdfs_ReadOpChecksumInfoProto_descriptor =
            getDescriptor().getMessageTypes().get(20);
          internal_static_hadoop_hdfs_ReadOpChecksumInfoProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ReadOpChecksumInfoProto_descriptor,
              new java.lang.String[] { "Checksum", "ChunkOffset", });
          internal_static_hadoop_hdfs_BlockOpResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(21);
          internal_static_hadoop_hdfs_BlockOpResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_BlockOpResponseProto_descriptor,
              new java.lang.String[] { "Status", "FirstBadLink", "ChecksumResponse", "ReadOpChecksumInfo", "Message", "ShortCircuitAccessVersion", });
          internal_static_hadoop_hdfs_ClientReadStatusProto_descriptor =
            getDescriptor().getMessageTypes().get(22);
          internal_static_hadoop_hdfs_ClientReadStatusProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ClientReadStatusProto_descriptor,
              new java.lang.String[] { "Status", });
          internal_static_hadoop_hdfs_DNTransferAckProto_descriptor =
            getDescriptor().getMessageTypes().get(23);
          internal_static_hadoop_hdfs_DNTransferAckProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_DNTransferAckProto_descriptor,
              new java.lang.String[] { "Status", });
          internal_static_hadoop_hdfs_OpBlockChecksumResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(24);
          internal_static_hadoop_hdfs_OpBlockChecksumResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_OpBlockChecksumResponseProto_descriptor,
              new java.lang.String[] { "BytesPerCrc", "CrcPerBlock", "Md5", "CrcType", });
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
