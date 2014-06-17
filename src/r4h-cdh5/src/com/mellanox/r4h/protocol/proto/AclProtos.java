package com.mellanox.r4h.protocol.proto;

public final class AclProtos {
  private AclProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AclEntryProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto getType();

    // required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
     */
    boolean hasScope();
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto getScope();

    // required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
     */
    boolean hasPermissions();
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto getPermissions();

    // optional string name = 4;
    /**
     * <code>optional string name = 4;</code>
     */
    boolean hasName();
    /**
     * <code>optional string name = 4;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 4;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.AclEntryProto}
   */
  public static final class AclEntryProto extends
      com.google.protobuf.GeneratedMessage
      implements AclEntryProtoOrBuilder {
    // Use AclEntryProto.newBuilder() to construct.
    private AclEntryProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AclEntryProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AclEntryProto defaultInstance;
    public static AclEntryProto getDefaultInstance() {
      return defaultInstance;
    }

    public AclEntryProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AclEntryProto(
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
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto value = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto value = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                scope_ = value;
              }
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto value = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                permissions_ = value;
              }
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              name_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEntryProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEntryProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder.class);
    }

    public static com.google.protobuf.Parser<AclEntryProto> PARSER =
        new com.google.protobuf.AbstractParser<AclEntryProto>() {
      public AclEntryProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AclEntryProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AclEntryProto> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code hadoop.hdfs.AclEntryProto.AclEntryScopeProto}
     */
    public enum AclEntryScopeProto
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>ACCESS = 0;</code>
       */
      ACCESS(0, 0),
      /**
       * <code>DEFAULT = 1;</code>
       */
      DEFAULT(1, 1),
      ;

      /**
       * <code>ACCESS = 0;</code>
       */
      public static final int ACCESS_VALUE = 0;
      /**
       * <code>DEFAULT = 1;</code>
       */
      public static final int DEFAULT_VALUE = 1;


      public final int getNumber() { return value; }

      public static AclEntryScopeProto valueOf(int value) {
        switch (value) {
          case 0: return ACCESS;
          case 1: return DEFAULT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<AclEntryScopeProto>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<AclEntryScopeProto>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AclEntryScopeProto>() {
              public AclEntryScopeProto findValueByNumber(int number) {
                return AclEntryScopeProto.valueOf(number);
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDescriptor().getEnumTypes().get(0);
      }

      private static final AclEntryScopeProto[] VALUES = values();

      public static AclEntryScopeProto valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private AclEntryScopeProto(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.hdfs.AclEntryProto.AclEntryScopeProto)
    }

    /**
     * Protobuf enum {@code hadoop.hdfs.AclEntryProto.AclEntryTypeProto}
     */
    public enum AclEntryTypeProto
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>USER = 0;</code>
       */
      USER(0, 0),
      /**
       * <code>GROUP = 1;</code>
       */
      GROUP(1, 1),
      /**
       * <code>MASK = 2;</code>
       */
      MASK(2, 2),
      /**
       * <code>OTHER = 3;</code>
       */
      OTHER(3, 3),
      ;

      /**
       * <code>USER = 0;</code>
       */
      public static final int USER_VALUE = 0;
      /**
       * <code>GROUP = 1;</code>
       */
      public static final int GROUP_VALUE = 1;
      /**
       * <code>MASK = 2;</code>
       */
      public static final int MASK_VALUE = 2;
      /**
       * <code>OTHER = 3;</code>
       */
      public static final int OTHER_VALUE = 3;


      public final int getNumber() { return value; }

      public static AclEntryTypeProto valueOf(int value) {
        switch (value) {
          case 0: return USER;
          case 1: return GROUP;
          case 2: return MASK;
          case 3: return OTHER;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<AclEntryTypeProto>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<AclEntryTypeProto>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AclEntryTypeProto>() {
              public AclEntryTypeProto findValueByNumber(int number) {
                return AclEntryTypeProto.valueOf(number);
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDescriptor().getEnumTypes().get(1);
      }

      private static final AclEntryTypeProto[] VALUES = values();

      public static AclEntryTypeProto valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private AclEntryTypeProto(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.hdfs.AclEntryProto.AclEntryTypeProto)
    }

    /**
     * Protobuf enum {@code hadoop.hdfs.AclEntryProto.FsActionProto}
     */
    public enum FsActionProto
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>EXECUTE = 1;</code>
       */
      EXECUTE(1, 1),
      /**
       * <code>WRITE = 2;</code>
       */
      WRITE(2, 2),
      /**
       * <code>WRITE_EXECUTE = 3;</code>
       */
      WRITE_EXECUTE(3, 3),
      /**
       * <code>READ = 4;</code>
       */
      READ(4, 4),
      /**
       * <code>READ_EXECUTE = 5;</code>
       */
      READ_EXECUTE(5, 5),
      /**
       * <code>READ_WRITE = 6;</code>
       */
      READ_WRITE(6, 6),
      /**
       * <code>PERM_ALL = 7;</code>
       */
      PERM_ALL(7, 7),
      ;

      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>EXECUTE = 1;</code>
       */
      public static final int EXECUTE_VALUE = 1;
      /**
       * <code>WRITE = 2;</code>
       */
      public static final int WRITE_VALUE = 2;
      /**
       * <code>WRITE_EXECUTE = 3;</code>
       */
      public static final int WRITE_EXECUTE_VALUE = 3;
      /**
       * <code>READ = 4;</code>
       */
      public static final int READ_VALUE = 4;
      /**
       * <code>READ_EXECUTE = 5;</code>
       */
      public static final int READ_EXECUTE_VALUE = 5;
      /**
       * <code>READ_WRITE = 6;</code>
       */
      public static final int READ_WRITE_VALUE = 6;
      /**
       * <code>PERM_ALL = 7;</code>
       */
      public static final int PERM_ALL_VALUE = 7;


      public final int getNumber() { return value; }

      public static FsActionProto valueOf(int value) {
        switch (value) {
          case 0: return NONE;
          case 1: return EXECUTE;
          case 2: return WRITE;
          case 3: return WRITE_EXECUTE;
          case 4: return READ;
          case 5: return READ_EXECUTE;
          case 6: return READ_WRITE;
          case 7: return PERM_ALL;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<FsActionProto>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<FsActionProto>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<FsActionProto>() {
              public FsActionProto findValueByNumber(int number) {
                return FsActionProto.valueOf(number);
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDescriptor().getEnumTypes().get(2);
      }

      private static final FsActionProto[] VALUES = values();

      public static FsActionProto valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private FsActionProto(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:hadoop.hdfs.AclEntryProto.FsActionProto)
    }

    private int bitField0_;
    // required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto type_;
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto getType() {
      return type_;
    }

    // required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;
    public static final int SCOPE_FIELD_NUMBER = 2;
    private org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto scope_;
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
     */
    public boolean hasScope() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto getScope() {
      return scope_;
    }

    // required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;
    public static final int PERMISSIONS_FIELD_NUMBER = 3;
    private org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto permissions_;
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
     */
    public boolean hasPermissions() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto getPermissions() {
      return permissions_;
    }

    // optional string name = 4;
    public static final int NAME_FIELD_NUMBER = 4;
    private java.lang.Object name_;
    /**
     * <code>optional string name = 4;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      type_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto.USER;
      scope_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto.ACCESS;
      permissions_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto.NONE;
      name_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasScope()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPermissions()) {
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
        output.writeEnum(2, scope_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, permissions_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getNameBytes());
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
          .computeEnumSize(2, scope_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, permissions_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getNameBytes());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto) obj;

      boolean result = true;
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result &&
            (getType() == other.getType());
      }
      result = result && (hasScope() == other.hasScope());
      if (hasScope()) {
        result = result &&
            (getScope() == other.getScope());
      }
      result = result && (hasPermissions() == other.hasPermissions());
      if (hasPermissions()) {
        result = result &&
            (getPermissions() == other.getPermissions());
      }
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName()
            .equals(other.getName());
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
      if (hasScope()) {
        hash = (37 * hash) + SCOPE_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getScope());
      }
      if (hasPermissions()) {
        hash = (37 * hash) + PERMISSIONS_FIELD_NUMBER;
        hash = (53 * hash) + hashEnum(getPermissions());
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.AclEntryProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEntryProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEntryProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.newBuilder()
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
        type_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto.USER;
        bitField0_ = (bitField0_ & ~0x00000001);
        scope_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto.ACCESS;
        bitField0_ = (bitField0_ & ~0x00000002);
        permissions_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto.NONE;
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEntryProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.scope_ = scope_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.permissions_ = permissions_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.name_ = name_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasScope()) {
          setScope(other.getScope());
        }
        if (other.hasPermissions()) {
          setPermissions(other.getPermissions());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000008;
          name_ = other.name_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (!hasScope()) {
          
          return false;
        }
        if (!hasPermissions()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;
      private org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto type_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto.USER;
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto getType() {
        return type_;
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
       */
      public Builder setType(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryTypeProto type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryTypeProto.USER;
        onChanged();
        return this;
      }

      // required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;
      private org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto scope_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto.ACCESS;
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
       */
      public boolean hasScope() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto getScope() {
        return scope_;
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
       */
      public Builder setScope(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        scope_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.AclEntryScopeProto scope = 2;</code>
       */
      public Builder clearScope() {
        bitField0_ = (bitField0_ & ~0x00000002);
        scope_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.AclEntryScopeProto.ACCESS;
        onChanged();
        return this;
      }

      // required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;
      private org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto permissions_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto.NONE;
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
       */
      public boolean hasPermissions() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto getPermissions() {
        return permissions_;
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
       */
      public Builder setPermissions(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        permissions_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclEntryProto.FsActionProto permissions = 3;</code>
       */
      public Builder clearPermissions() {
        bitField0_ = (bitField0_ & ~0x00000004);
        permissions_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.FsActionProto.NONE;
        onChanged();
        return this;
      }

      // optional string name = 4;
      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 4;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 4;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.AclEntryProto)
    }

    static {
      defaultInstance = new AclEntryProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.AclEntryProto)
  }

  public interface AclStatusProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string owner = 1;
    /**
     * <code>required string owner = 1;</code>
     */
    boolean hasOwner();
    /**
     * <code>required string owner = 1;</code>
     */
    java.lang.String getOwner();
    /**
     * <code>required string owner = 1;</code>
     */
    com.google.protobuf.ByteString
        getOwnerBytes();

    // required string group = 2;
    /**
     * <code>required string group = 2;</code>
     */
    boolean hasGroup();
    /**
     * <code>required string group = 2;</code>
     */
    java.lang.String getGroup();
    /**
     * <code>required string group = 2;</code>
     */
    com.google.protobuf.ByteString
        getGroupBytes();

    // required bool sticky = 3;
    /**
     * <code>required bool sticky = 3;</code>
     */
    boolean hasSticky();
    /**
     * <code>required bool sticky = 3;</code>
     */
    boolean getSticky();

    // repeated .hadoop.hdfs.AclEntryProto entries = 4;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> 
        getEntriesList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getEntries(int index);
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    int getEntriesCount();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getEntriesOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getEntriesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.AclStatusProto}
   */
  public static final class AclStatusProto extends
      com.google.protobuf.GeneratedMessage
      implements AclStatusProtoOrBuilder {
    // Use AclStatusProto.newBuilder() to construct.
    private AclStatusProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AclStatusProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AclStatusProto defaultInstance;
    public static AclStatusProto getDefaultInstance() {
      return defaultInstance;
    }

    public AclStatusProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AclStatusProto(
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
              owner_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              group_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              sticky_ = input.readBool();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                entries_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>();
                mutable_bitField0_ |= 0x00000008;
              }
              entries_.add(input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          entries_ = java.util.Collections.unmodifiableList(entries_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclStatusProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclStatusProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder.class);
    }

    public static com.google.protobuf.Parser<AclStatusProto> PARSER =
        new com.google.protobuf.AbstractParser<AclStatusProto>() {
      public AclStatusProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AclStatusProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AclStatusProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string owner = 1;
    public static final int OWNER_FIELD_NUMBER = 1;
    private java.lang.Object owner_;
    /**
     * <code>required string owner = 1;</code>
     */
    public boolean hasOwner() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string owner = 1;</code>
     */
    public java.lang.String getOwner() {
      java.lang.Object ref = owner_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          owner_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string owner = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOwnerBytes() {
      java.lang.Object ref = owner_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        owner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string group = 2;
    public static final int GROUP_FIELD_NUMBER = 2;
    private java.lang.Object group_;
    /**
     * <code>required string group = 2;</code>
     */
    public boolean hasGroup() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string group = 2;</code>
     */
    public java.lang.String getGroup() {
      java.lang.Object ref = group_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          group_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string group = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGroupBytes() {
      java.lang.Object ref = group_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        group_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required bool sticky = 3;
    public static final int STICKY_FIELD_NUMBER = 3;
    private boolean sticky_;
    /**
     * <code>required bool sticky = 3;</code>
     */
    public boolean hasSticky() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required bool sticky = 3;</code>
     */
    public boolean getSticky() {
      return sticky_;
    }

    // repeated .hadoop.hdfs.AclEntryProto entries = 4;
    public static final int ENTRIES_FIELD_NUMBER = 4;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> entries_;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getEntriesList() {
      return entries_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getEntriesOrBuilderList() {
      return entries_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    public int getEntriesCount() {
      return entries_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getEntries(int index) {
      return entries_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getEntriesOrBuilder(
        int index) {
      return entries_.get(index);
    }

    private void initFields() {
      owner_ = "";
      group_ = "";
      sticky_ = false;
      entries_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasOwner()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGroup()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSticky()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getEntriesCount(); i++) {
        if (!getEntries(i).isInitialized()) {
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
        output.writeBytes(1, getOwnerBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getGroupBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, sticky_);
      }
      for (int i = 0; i < entries_.size(); i++) {
        output.writeMessage(4, entries_.get(i));
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
          .computeBytesSize(1, getOwnerBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getGroupBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, sticky_);
      }
      for (int i = 0; i < entries_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, entries_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto) obj;

      boolean result = true;
      result = result && (hasOwner() == other.hasOwner());
      if (hasOwner()) {
        result = result && getOwner()
            .equals(other.getOwner());
      }
      result = result && (hasGroup() == other.hasGroup());
      if (hasGroup()) {
        result = result && getGroup()
            .equals(other.getGroup());
      }
      result = result && (hasSticky() == other.hasSticky());
      if (hasSticky()) {
        result = result && (getSticky()
            == other.getSticky());
      }
      result = result && getEntriesList()
          .equals(other.getEntriesList());
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
      if (hasOwner()) {
        hash = (37 * hash) + OWNER_FIELD_NUMBER;
        hash = (53 * hash) + getOwner().hashCode();
      }
      if (hasGroup()) {
        hash = (37 * hash) + GROUP_FIELD_NUMBER;
        hash = (53 * hash) + getGroup().hashCode();
      }
      if (hasSticky()) {
        hash = (37 * hash) + STICKY_FIELD_NUMBER;
        hash = (53 * hash) + hashBoolean(getSticky());
      }
      if (getEntriesCount() > 0) {
        hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
        hash = (53 * hash) + getEntriesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.AclStatusProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclStatusProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclStatusProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.newBuilder()
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
          getEntriesFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        owner_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        group_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        sticky_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (entriesBuilder_ == null) {
          entries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          entriesBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclStatusProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.owner_ = owner_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.group_ = group_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.sticky_ = sticky_;
        if (entriesBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            entries_ = java.util.Collections.unmodifiableList(entries_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.entries_ = entries_;
        } else {
          result.entries_ = entriesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance()) return this;
        if (other.hasOwner()) {
          bitField0_ |= 0x00000001;
          owner_ = other.owner_;
          onChanged();
        }
        if (other.hasGroup()) {
          bitField0_ |= 0x00000002;
          group_ = other.group_;
          onChanged();
        }
        if (other.hasSticky()) {
          setSticky(other.getSticky());
        }
        if (entriesBuilder_ == null) {
          if (!other.entries_.isEmpty()) {
            if (entries_.isEmpty()) {
              entries_ = other.entries_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureEntriesIsMutable();
              entries_.addAll(other.entries_);
            }
            onChanged();
          }
        } else {
          if (!other.entries_.isEmpty()) {
            if (entriesBuilder_.isEmpty()) {
              entriesBuilder_.dispose();
              entriesBuilder_ = null;
              entries_ = other.entries_;
              bitField0_ = (bitField0_ & ~0x00000008);
              entriesBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getEntriesFieldBuilder() : null;
            } else {
              entriesBuilder_.addAllMessages(other.entries_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasOwner()) {
          
          return false;
        }
        if (!hasGroup()) {
          
          return false;
        }
        if (!hasSticky()) {
          
          return false;
        }
        for (int i = 0; i < getEntriesCount(); i++) {
          if (!getEntries(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string owner = 1;
      private java.lang.Object owner_ = "";
      /**
       * <code>required string owner = 1;</code>
       */
      public boolean hasOwner() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string owner = 1;</code>
       */
      public java.lang.String getOwner() {
        java.lang.Object ref = owner_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          owner_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string owner = 1;</code>
       */
      public com.google.protobuf.ByteString
          getOwnerBytes() {
        java.lang.Object ref = owner_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          owner_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string owner = 1;</code>
       */
      public Builder setOwner(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        owner_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string owner = 1;</code>
       */
      public Builder clearOwner() {
        bitField0_ = (bitField0_ & ~0x00000001);
        owner_ = getDefaultInstance().getOwner();
        onChanged();
        return this;
      }
      /**
       * <code>required string owner = 1;</code>
       */
      public Builder setOwnerBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        owner_ = value;
        onChanged();
        return this;
      }

      // required string group = 2;
      private java.lang.Object group_ = "";
      /**
       * <code>required string group = 2;</code>
       */
      public boolean hasGroup() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string group = 2;</code>
       */
      public java.lang.String getGroup() {
        java.lang.Object ref = group_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          group_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string group = 2;</code>
       */
      public com.google.protobuf.ByteString
          getGroupBytes() {
        java.lang.Object ref = group_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          group_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string group = 2;</code>
       */
      public Builder setGroup(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        group_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string group = 2;</code>
       */
      public Builder clearGroup() {
        bitField0_ = (bitField0_ & ~0x00000002);
        group_ = getDefaultInstance().getGroup();
        onChanged();
        return this;
      }
      /**
       * <code>required string group = 2;</code>
       */
      public Builder setGroupBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        group_ = value;
        onChanged();
        return this;
      }

      // required bool sticky = 3;
      private boolean sticky_ ;
      /**
       * <code>required bool sticky = 3;</code>
       */
      public boolean hasSticky() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required bool sticky = 3;</code>
       */
      public boolean getSticky() {
        return sticky_;
      }
      /**
       * <code>required bool sticky = 3;</code>
       */
      public Builder setSticky(boolean value) {
        bitField0_ |= 0x00000004;
        sticky_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool sticky = 3;</code>
       */
      public Builder clearSticky() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sticky_ = false;
        onChanged();
        return this;
      }

      // repeated .hadoop.hdfs.AclEntryProto entries = 4;
      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> entries_ =
        java.util.Collections.emptyList();
      private void ensureEntriesIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          entries_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>(entries_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> entriesBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getEntriesList() {
        if (entriesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entries_);
        } else {
          return entriesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public int getEntriesCount() {
        if (entriesBuilder_ == null) {
          return entries_.size();
        } else {
          return entriesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getEntries(int index) {
        if (entriesBuilder_ == null) {
          return entries_.get(index);
        } else {
          return entriesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder setEntries(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.set(index, value);
          onChanged();
        } else {
          entriesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder setEntries(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.set(index, builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder addEntries(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.add(value);
          onChanged();
        } else {
          entriesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder addEntries(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.add(index, value);
          onChanged();
        } else {
          entriesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder addEntries(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.add(builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder addEntries(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.add(index, builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder addAllEntries(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> values) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          super.addAll(values, entries_);
          onChanged();
        } else {
          entriesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder clearEntries() {
        if (entriesBuilder_ == null) {
          entries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          entriesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public Builder removeEntries(int index) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.remove(index);
          onChanged();
        } else {
          entriesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder getEntriesBuilder(
          int index) {
        return getEntriesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getEntriesOrBuilder(
          int index) {
        if (entriesBuilder_ == null) {
          return entries_.get(index);  } else {
          return entriesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
           getEntriesOrBuilderList() {
        if (entriesBuilder_ != null) {
          return entriesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entries_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addEntriesBuilder() {
        return getEntriesFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addEntriesBuilder(
          int index) {
        return getEntriesFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 4;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder> 
           getEntriesBuilderList() {
        return getEntriesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
          getEntriesFieldBuilder() {
        if (entriesBuilder_ == null) {
          entriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder>(
                  entries_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          entries_ = null;
        }
        return entriesBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.AclStatusProto)
    }

    static {
      defaultInstance = new AclStatusProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.AclStatusProto)
  }

  public interface AclEditLogProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string src = 1;
    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    com.google.protobuf.ByteString
        getSrcBytes();

    // repeated .hadoop.hdfs.AclEntryProto entries = 2;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> 
        getEntriesList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getEntries(int index);
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    int getEntriesCount();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getEntriesOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getEntriesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.AclEditLogProto}
   */
  public static final class AclEditLogProto extends
      com.google.protobuf.GeneratedMessage
      implements AclEditLogProtoOrBuilder {
    // Use AclEditLogProto.newBuilder() to construct.
    private AclEditLogProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AclEditLogProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AclEditLogProto defaultInstance;
    public static AclEditLogProto getDefaultInstance() {
      return defaultInstance;
    }

    public AclEditLogProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AclEditLogProto(
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
              src_ = input.readBytes();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                entries_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              entries_.add(input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.PARSER, extensionRegistry));
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
          entries_ = java.util.Collections.unmodifiableList(entries_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEditLogProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEditLogProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto.Builder.class);
    }

    public static com.google.protobuf.Parser<AclEditLogProto> PARSER =
        new com.google.protobuf.AbstractParser<AclEditLogProto>() {
      public AclEditLogProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AclEditLogProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AclEditLogProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string src = 1;
    public static final int SRC_FIELD_NUMBER = 1;
    private java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated .hadoop.hdfs.AclEntryProto entries = 2;
    public static final int ENTRIES_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> entries_;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getEntriesList() {
      return entries_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getEntriesOrBuilderList() {
      return entries_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    public int getEntriesCount() {
      return entries_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getEntries(int index) {
      return entries_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getEntriesOrBuilder(
        int index) {
      return entries_.get(index);
    }

    private void initFields() {
      src_ = "";
      entries_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSrc()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getEntriesCount(); i++) {
        if (!getEntries(i).isInitialized()) {
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
        output.writeBytes(1, getSrcBytes());
      }
      for (int i = 0; i < entries_.size(); i++) {
        output.writeMessage(2, entries_.get(i));
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
          .computeBytesSize(1, getSrcBytes());
      }
      for (int i = 0; i < entries_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, entries_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto) obj;

      boolean result = true;
      result = result && (hasSrc() == other.hasSrc());
      if (hasSrc()) {
        result = result && getSrc()
            .equals(other.getSrc());
      }
      result = result && getEntriesList()
          .equals(other.getEntriesList());
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      if (getEntriesCount() > 0) {
        hash = (37 * hash) + ENTRIES_FIELD_NUMBER;
        hash = (53 * hash) + getEntriesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.AclEditLogProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEditLogProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEditLogProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto.newBuilder()
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
          getEntriesFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (entriesBuilder_ == null) {
          entries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          entriesBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_AclEditLogProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (entriesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            entries_ = java.util.Collections.unmodifiableList(entries_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.entries_ = entries_;
        } else {
          result.entries_ = entriesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (entriesBuilder_ == null) {
          if (!other.entries_.isEmpty()) {
            if (entries_.isEmpty()) {
              entries_ = other.entries_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureEntriesIsMutable();
              entries_.addAll(other.entries_);
            }
            onChanged();
          }
        } else {
          if (!other.entries_.isEmpty()) {
            if (entriesBuilder_.isEmpty()) {
              entriesBuilder_.dispose();
              entriesBuilder_ = null;
              entries_ = other.entries_;
              bitField0_ = (bitField0_ & ~0x00000002);
              entriesBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getEntriesFieldBuilder() : null;
            } else {
              entriesBuilder_.addAllMessages(other.entries_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSrc()) {
          
          return false;
        }
        for (int i = 0; i < getEntriesCount(); i++) {
          if (!getEntries(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEditLogProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string src = 1;
      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          src_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }

      // repeated .hadoop.hdfs.AclEntryProto entries = 2;
      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> entries_ =
        java.util.Collections.emptyList();
      private void ensureEntriesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          entries_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>(entries_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> entriesBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getEntriesList() {
        if (entriesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entries_);
        } else {
          return entriesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public int getEntriesCount() {
        if (entriesBuilder_ == null) {
          return entries_.size();
        } else {
          return entriesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getEntries(int index) {
        if (entriesBuilder_ == null) {
          return entries_.get(index);
        } else {
          return entriesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public Builder setEntries(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.set(index, value);
          onChanged();
        } else {
          entriesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public Builder setEntries(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.set(index, builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public Builder addEntries(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.add(value);
          onChanged();
        } else {
          entriesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public Builder addEntries(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (entriesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntriesIsMutable();
          entries_.add(index, value);
          onChanged();
        } else {
          entriesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public Builder addEntries(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.add(builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public Builder addEntries(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.add(index, builderForValue.build());
          onChanged();
        } else {
          entriesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public Builder addAllEntries(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> values) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          super.addAll(values, entries_);
          onChanged();
        } else {
          entriesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public Builder clearEntries() {
        if (entriesBuilder_ == null) {
          entries_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          entriesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public Builder removeEntries(int index) {
        if (entriesBuilder_ == null) {
          ensureEntriesIsMutable();
          entries_.remove(index);
          onChanged();
        } else {
          entriesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder getEntriesBuilder(
          int index) {
        return getEntriesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getEntriesOrBuilder(
          int index) {
        if (entriesBuilder_ == null) {
          return entries_.get(index);  } else {
          return entriesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
           getEntriesOrBuilderList() {
        if (entriesBuilder_ != null) {
          return entriesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entries_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addEntriesBuilder() {
        return getEntriesFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addEntriesBuilder(
          int index) {
        return getEntriesFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto entries = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder> 
           getEntriesBuilderList() {
        return getEntriesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
          getEntriesFieldBuilder() {
        if (entriesBuilder_ == null) {
          entriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder>(
                  entries_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          entries_ = null;
        }
        return entriesBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.AclEditLogProto)
    }

    static {
      defaultInstance = new AclEditLogProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.AclEditLogProto)
  }

  public interface ModifyAclEntriesRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string src = 1;
    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    com.google.protobuf.ByteString
        getSrcBytes();

    // repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> 
        getAclSpecList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index);
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    int getAclSpecCount();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclSpecOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ModifyAclEntriesRequestProto}
   */
  public static final class ModifyAclEntriesRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements ModifyAclEntriesRequestProtoOrBuilder {
    // Use ModifyAclEntriesRequestProto.newBuilder() to construct.
    private ModifyAclEntriesRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ModifyAclEntriesRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ModifyAclEntriesRequestProto defaultInstance;
    public static ModifyAclEntriesRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public ModifyAclEntriesRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ModifyAclEntriesRequestProto(
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
              src_ = input.readBytes();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                aclSpec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              aclSpec_.add(input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.PARSER, extensionRegistry));
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
          aclSpec_ = java.util.Collections.unmodifiableList(aclSpec_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ModifyAclEntriesRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<ModifyAclEntriesRequestProto>() {
      public ModifyAclEntriesRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ModifyAclEntriesRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ModifyAclEntriesRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string src = 1;
    public static final int SRC_FIELD_NUMBER = 1;
    private java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;
    public static final int ACLSPEC_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> aclSpec_;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclSpecList() {
      return aclSpec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclSpecOrBuilderList() {
      return aclSpec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public int getAclSpecCount() {
      return aclSpec_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index) {
      return aclSpec_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
        int index) {
      return aclSpec_.get(index);
    }

    private void initFields() {
      src_ = "";
      aclSpec_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSrc()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getAclSpecCount(); i++) {
        if (!getAclSpec(i).isInitialized()) {
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
        output.writeBytes(1, getSrcBytes());
      }
      for (int i = 0; i < aclSpec_.size(); i++) {
        output.writeMessage(2, aclSpec_.get(i));
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
          .computeBytesSize(1, getSrcBytes());
      }
      for (int i = 0; i < aclSpec_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, aclSpec_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto) obj;

      boolean result = true;
      result = result && (hasSrc() == other.hasSrc());
      if (hasSrc()) {
        result = result && getSrc()
            .equals(other.getSrc());
      }
      result = result && getAclSpecList()
          .equals(other.getAclSpecList());
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      if (getAclSpecCount() > 0) {
        hash = (37 * hash) + ACLSPEC_FIELD_NUMBER;
        hash = (53 * hash) + getAclSpecList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ModifyAclEntriesRequestProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.newBuilder()
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
          getAclSpecFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (aclSpecBuilder_ == null) {
          aclSpec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          aclSpecBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (aclSpecBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            aclSpec_ = java.util.Collections.unmodifiableList(aclSpec_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.aclSpec_ = aclSpec_;
        } else {
          result.aclSpec_ = aclSpecBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (aclSpecBuilder_ == null) {
          if (!other.aclSpec_.isEmpty()) {
            if (aclSpec_.isEmpty()) {
              aclSpec_ = other.aclSpec_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureAclSpecIsMutable();
              aclSpec_.addAll(other.aclSpec_);
            }
            onChanged();
          }
        } else {
          if (!other.aclSpec_.isEmpty()) {
            if (aclSpecBuilder_.isEmpty()) {
              aclSpecBuilder_.dispose();
              aclSpecBuilder_ = null;
              aclSpec_ = other.aclSpec_;
              bitField0_ = (bitField0_ & ~0x00000002);
              aclSpecBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getAclSpecFieldBuilder() : null;
            } else {
              aclSpecBuilder_.addAllMessages(other.aclSpec_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSrc()) {
          
          return false;
        }
        for (int i = 0; i < getAclSpecCount(); i++) {
          if (!getAclSpec(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string src = 1;
      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          src_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }

      // repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;
      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> aclSpec_ =
        java.util.Collections.emptyList();
      private void ensureAclSpecIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          aclSpec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>(aclSpec_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> aclSpecBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclSpecList() {
        if (aclSpecBuilder_ == null) {
          return java.util.Collections.unmodifiableList(aclSpec_);
        } else {
          return aclSpecBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public int getAclSpecCount() {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.size();
        } else {
          return aclSpecBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index) {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.get(index);
        } else {
          return aclSpecBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder setAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.set(index, value);
          onChanged();
        } else {
          aclSpecBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder setAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.set(index, builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.add(value);
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.add(index, value);
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.add(builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.add(index, builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAllAclSpec(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> values) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          super.addAll(values, aclSpec_);
          onChanged();
        } else {
          aclSpecBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder clearAclSpec() {
        if (aclSpecBuilder_ == null) {
          aclSpec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          aclSpecBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder removeAclSpec(int index) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.remove(index);
          onChanged();
        } else {
          aclSpecBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder getAclSpecBuilder(
          int index) {
        return getAclSpecFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
          int index) {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.get(index);  } else {
          return aclSpecBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
           getAclSpecOrBuilderList() {
        if (aclSpecBuilder_ != null) {
          return aclSpecBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(aclSpec_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclSpecBuilder() {
        return getAclSpecFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclSpecBuilder(
          int index) {
        return getAclSpecFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder> 
           getAclSpecBuilderList() {
        return getAclSpecFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
          getAclSpecFieldBuilder() {
        if (aclSpecBuilder_ == null) {
          aclSpecBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder>(
                  aclSpec_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          aclSpec_ = null;
        }
        return aclSpecBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ModifyAclEntriesRequestProto)
    }

    static {
      defaultInstance = new ModifyAclEntriesRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ModifyAclEntriesRequestProto)
  }

  public interface ModifyAclEntriesResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.ModifyAclEntriesResponseProto}
   */
  public static final class ModifyAclEntriesResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements ModifyAclEntriesResponseProtoOrBuilder {
    // Use ModifyAclEntriesResponseProto.newBuilder() to construct.
    private ModifyAclEntriesResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ModifyAclEntriesResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ModifyAclEntriesResponseProto defaultInstance;
    public static ModifyAclEntriesResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public ModifyAclEntriesResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ModifyAclEntriesResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<ModifyAclEntriesResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<ModifyAclEntriesResponseProto>() {
      public ModifyAclEntriesResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ModifyAclEntriesResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ModifyAclEntriesResponseProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.ModifyAclEntriesResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.ModifyAclEntriesResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.ModifyAclEntriesResponseProto)
    }

    static {
      defaultInstance = new ModifyAclEntriesResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.ModifyAclEntriesResponseProto)
  }

  public interface RemoveAclRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string src = 1;
    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    com.google.protobuf.ByteString
        getSrcBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveAclRequestProto}
   */
  public static final class RemoveAclRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements RemoveAclRequestProtoOrBuilder {
    // Use RemoveAclRequestProto.newBuilder() to construct.
    private RemoveAclRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RemoveAclRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RemoveAclRequestProto defaultInstance;
    public static RemoveAclRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public RemoveAclRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveAclRequestProto(
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
              src_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RemoveAclRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<RemoveAclRequestProto>() {
      public RemoveAclRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RemoveAclRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RemoveAclRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string src = 1;
    public static final int SRC_FIELD_NUMBER = 1;
    private java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      src_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSrc()) {
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
        output.writeBytes(1, getSrcBytes());
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
          .computeBytesSize(1, getSrcBytes());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto) obj;

      boolean result = true;
      result = result && (hasSrc() == other.hasSrc());
      if (hasSrc()) {
        result = result && getSrc()
            .equals(other.getSrc());
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveAclRequestProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.newBuilder()
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
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSrc()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string src = 1;
      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          src_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveAclRequestProto)
    }

    static {
      defaultInstance = new RemoveAclRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveAclRequestProto)
  }

  public interface RemoveAclResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveAclResponseProto}
   */
  public static final class RemoveAclResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements RemoveAclResponseProtoOrBuilder {
    // Use RemoveAclResponseProto.newBuilder() to construct.
    private RemoveAclResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RemoveAclResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RemoveAclResponseProto defaultInstance;
    public static RemoveAclResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public RemoveAclResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveAclResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RemoveAclResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<RemoveAclResponseProto>() {
      public RemoveAclResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RemoveAclResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RemoveAclResponseProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveAclResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveAclResponseProto)
    }

    static {
      defaultInstance = new RemoveAclResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveAclResponseProto)
  }

  public interface RemoveAclEntriesRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string src = 1;
    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    com.google.protobuf.ByteString
        getSrcBytes();

    // repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> 
        getAclSpecList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index);
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    int getAclSpecCount();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclSpecOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveAclEntriesRequestProto}
   */
  public static final class RemoveAclEntriesRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements RemoveAclEntriesRequestProtoOrBuilder {
    // Use RemoveAclEntriesRequestProto.newBuilder() to construct.
    private RemoveAclEntriesRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RemoveAclEntriesRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RemoveAclEntriesRequestProto defaultInstance;
    public static RemoveAclEntriesRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public RemoveAclEntriesRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveAclEntriesRequestProto(
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
              src_ = input.readBytes();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                aclSpec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              aclSpec_.add(input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.PARSER, extensionRegistry));
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
          aclSpec_ = java.util.Collections.unmodifiableList(aclSpec_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RemoveAclEntriesRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<RemoveAclEntriesRequestProto>() {
      public RemoveAclEntriesRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RemoveAclEntriesRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RemoveAclEntriesRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string src = 1;
    public static final int SRC_FIELD_NUMBER = 1;
    private java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;
    public static final int ACLSPEC_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> aclSpec_;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclSpecList() {
      return aclSpec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclSpecOrBuilderList() {
      return aclSpec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public int getAclSpecCount() {
      return aclSpec_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index) {
      return aclSpec_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
        int index) {
      return aclSpec_.get(index);
    }

    private void initFields() {
      src_ = "";
      aclSpec_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSrc()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getAclSpecCount(); i++) {
        if (!getAclSpec(i).isInitialized()) {
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
        output.writeBytes(1, getSrcBytes());
      }
      for (int i = 0; i < aclSpec_.size(); i++) {
        output.writeMessage(2, aclSpec_.get(i));
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
          .computeBytesSize(1, getSrcBytes());
      }
      for (int i = 0; i < aclSpec_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, aclSpec_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto) obj;

      boolean result = true;
      result = result && (hasSrc() == other.hasSrc());
      if (hasSrc()) {
        result = result && getSrc()
            .equals(other.getSrc());
      }
      result = result && getAclSpecList()
          .equals(other.getAclSpecList());
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      if (getAclSpecCount() > 0) {
        hash = (37 * hash) + ACLSPEC_FIELD_NUMBER;
        hash = (53 * hash) + getAclSpecList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveAclEntriesRequestProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.newBuilder()
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
          getAclSpecFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (aclSpecBuilder_ == null) {
          aclSpec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          aclSpecBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (aclSpecBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            aclSpec_ = java.util.Collections.unmodifiableList(aclSpec_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.aclSpec_ = aclSpec_;
        } else {
          result.aclSpec_ = aclSpecBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (aclSpecBuilder_ == null) {
          if (!other.aclSpec_.isEmpty()) {
            if (aclSpec_.isEmpty()) {
              aclSpec_ = other.aclSpec_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureAclSpecIsMutable();
              aclSpec_.addAll(other.aclSpec_);
            }
            onChanged();
          }
        } else {
          if (!other.aclSpec_.isEmpty()) {
            if (aclSpecBuilder_.isEmpty()) {
              aclSpecBuilder_.dispose();
              aclSpecBuilder_ = null;
              aclSpec_ = other.aclSpec_;
              bitField0_ = (bitField0_ & ~0x00000002);
              aclSpecBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getAclSpecFieldBuilder() : null;
            } else {
              aclSpecBuilder_.addAllMessages(other.aclSpec_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSrc()) {
          
          return false;
        }
        for (int i = 0; i < getAclSpecCount(); i++) {
          if (!getAclSpec(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string src = 1;
      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          src_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }

      // repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;
      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> aclSpec_ =
        java.util.Collections.emptyList();
      private void ensureAclSpecIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          aclSpec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>(aclSpec_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> aclSpecBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclSpecList() {
        if (aclSpecBuilder_ == null) {
          return java.util.Collections.unmodifiableList(aclSpec_);
        } else {
          return aclSpecBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public int getAclSpecCount() {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.size();
        } else {
          return aclSpecBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index) {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.get(index);
        } else {
          return aclSpecBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder setAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.set(index, value);
          onChanged();
        } else {
          aclSpecBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder setAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.set(index, builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.add(value);
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.add(index, value);
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.add(builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.add(index, builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAllAclSpec(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> values) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          super.addAll(values, aclSpec_);
          onChanged();
        } else {
          aclSpecBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder clearAclSpec() {
        if (aclSpecBuilder_ == null) {
          aclSpec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          aclSpecBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder removeAclSpec(int index) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.remove(index);
          onChanged();
        } else {
          aclSpecBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder getAclSpecBuilder(
          int index) {
        return getAclSpecFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
          int index) {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.get(index);  } else {
          return aclSpecBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
           getAclSpecOrBuilderList() {
        if (aclSpecBuilder_ != null) {
          return aclSpecBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(aclSpec_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclSpecBuilder() {
        return getAclSpecFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclSpecBuilder(
          int index) {
        return getAclSpecFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder> 
           getAclSpecBuilderList() {
        return getAclSpecFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
          getAclSpecFieldBuilder() {
        if (aclSpecBuilder_ == null) {
          aclSpecBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder>(
                  aclSpec_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          aclSpec_ = null;
        }
        return aclSpecBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveAclEntriesRequestProto)
    }

    static {
      defaultInstance = new RemoveAclEntriesRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveAclEntriesRequestProto)
  }

  public interface RemoveAclEntriesResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveAclEntriesResponseProto}
   */
  public static final class RemoveAclEntriesResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements RemoveAclEntriesResponseProtoOrBuilder {
    // Use RemoveAclEntriesResponseProto.newBuilder() to construct.
    private RemoveAclEntriesResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RemoveAclEntriesResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RemoveAclEntriesResponseProto defaultInstance;
    public static RemoveAclEntriesResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public RemoveAclEntriesResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveAclEntriesResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RemoveAclEntriesResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<RemoveAclEntriesResponseProto>() {
      public RemoveAclEntriesResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RemoveAclEntriesResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RemoveAclEntriesResponseProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveAclEntriesResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveAclEntriesResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveAclEntriesResponseProto)
    }

    static {
      defaultInstance = new RemoveAclEntriesResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveAclEntriesResponseProto)
  }

  public interface RemoveDefaultAclRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string src = 1;
    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    com.google.protobuf.ByteString
        getSrcBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveDefaultAclRequestProto}
   */
  public static final class RemoveDefaultAclRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements RemoveDefaultAclRequestProtoOrBuilder {
    // Use RemoveDefaultAclRequestProto.newBuilder() to construct.
    private RemoveDefaultAclRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RemoveDefaultAclRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RemoveDefaultAclRequestProto defaultInstance;
    public static RemoveDefaultAclRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public RemoveDefaultAclRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveDefaultAclRequestProto(
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
              src_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RemoveDefaultAclRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<RemoveDefaultAclRequestProto>() {
      public RemoveDefaultAclRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RemoveDefaultAclRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RemoveDefaultAclRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string src = 1;
    public static final int SRC_FIELD_NUMBER = 1;
    private java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      src_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSrc()) {
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
        output.writeBytes(1, getSrcBytes());
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
          .computeBytesSize(1, getSrcBytes());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto) obj;

      boolean result = true;
      result = result && (hasSrc() == other.hasSrc());
      if (hasSrc()) {
        result = result && getSrc()
            .equals(other.getSrc());
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveDefaultAclRequestProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.newBuilder()
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
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSrc()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string src = 1;
      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          src_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveDefaultAclRequestProto)
    }

    static {
      defaultInstance = new RemoveDefaultAclRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveDefaultAclRequestProto)
  }

  public interface RemoveDefaultAclResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.RemoveDefaultAclResponseProto}
   */
  public static final class RemoveDefaultAclResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements RemoveDefaultAclResponseProtoOrBuilder {
    // Use RemoveDefaultAclResponseProto.newBuilder() to construct.
    private RemoveDefaultAclResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RemoveDefaultAclResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RemoveDefaultAclResponseProto defaultInstance;
    public static RemoveDefaultAclResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public RemoveDefaultAclResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RemoveDefaultAclResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<RemoveDefaultAclResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<RemoveDefaultAclResponseProto>() {
      public RemoveDefaultAclResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RemoveDefaultAclResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RemoveDefaultAclResponseProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.RemoveDefaultAclResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.RemoveDefaultAclResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.RemoveDefaultAclResponseProto)
    }

    static {
      defaultInstance = new RemoveDefaultAclResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.RemoveDefaultAclResponseProto)
  }

  public interface SetAclRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string src = 1;
    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    com.google.protobuf.ByteString
        getSrcBytes();

    // repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> 
        getAclSpecList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index);
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    int getAclSpecCount();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclSpecOrBuilderList();
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code hadoop.hdfs.SetAclRequestProto}
   */
  public static final class SetAclRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements SetAclRequestProtoOrBuilder {
    // Use SetAclRequestProto.newBuilder() to construct.
    private SetAclRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SetAclRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SetAclRequestProto defaultInstance;
    public static SetAclRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public SetAclRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SetAclRequestProto(
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
              src_ = input.readBytes();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                aclSpec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>();
                mutable_bitField0_ |= 0x00000002;
              }
              aclSpec_.add(input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.PARSER, extensionRegistry));
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
          aclSpec_ = java.util.Collections.unmodifiableList(aclSpec_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<SetAclRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<SetAclRequestProto>() {
      public SetAclRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetAclRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SetAclRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string src = 1;
    public static final int SRC_FIELD_NUMBER = 1;
    private java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;
    public static final int ACLSPEC_FIELD_NUMBER = 2;
    private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> aclSpec_;
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclSpecList() {
      return aclSpec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
        getAclSpecOrBuilderList() {
      return aclSpec_;
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public int getAclSpecCount() {
      return aclSpec_.size();
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index) {
      return aclSpec_.get(index);
    }
    /**
     * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
        int index) {
      return aclSpec_.get(index);
    }

    private void initFields() {
      src_ = "";
      aclSpec_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSrc()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getAclSpecCount(); i++) {
        if (!getAclSpec(i).isInitialized()) {
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
        output.writeBytes(1, getSrcBytes());
      }
      for (int i = 0; i < aclSpec_.size(); i++) {
        output.writeMessage(2, aclSpec_.get(i));
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
          .computeBytesSize(1, getSrcBytes());
      }
      for (int i = 0; i < aclSpec_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, aclSpec_.get(i));
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto) obj;

      boolean result = true;
      result = result && (hasSrc() == other.hasSrc());
      if (hasSrc()) {
        result = result && getSrc()
            .equals(other.getSrc());
      }
      result = result && getAclSpecList()
          .equals(other.getAclSpecList());
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      if (getAclSpecCount() > 0) {
        hash = (37 * hash) + ACLSPEC_FIELD_NUMBER;
        hash = (53 * hash) + getAclSpecList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.SetAclRequestProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.newBuilder()
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
          getAclSpecFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (aclSpecBuilder_ == null) {
          aclSpec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          aclSpecBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        if (aclSpecBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            aclSpec_ = java.util.Collections.unmodifiableList(aclSpec_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.aclSpec_ = aclSpec_;
        } else {
          result.aclSpec_ = aclSpecBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        if (aclSpecBuilder_ == null) {
          if (!other.aclSpec_.isEmpty()) {
            if (aclSpec_.isEmpty()) {
              aclSpec_ = other.aclSpec_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureAclSpecIsMutable();
              aclSpec_.addAll(other.aclSpec_);
            }
            onChanged();
          }
        } else {
          if (!other.aclSpec_.isEmpty()) {
            if (aclSpecBuilder_.isEmpty()) {
              aclSpecBuilder_.dispose();
              aclSpecBuilder_ = null;
              aclSpec_ = other.aclSpec_;
              bitField0_ = (bitField0_ & ~0x00000002);
              aclSpecBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getAclSpecFieldBuilder() : null;
            } else {
              aclSpecBuilder_.addAllMessages(other.aclSpec_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSrc()) {
          
          return false;
        }
        for (int i = 0; i < getAclSpecCount(); i++) {
          if (!getAclSpec(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string src = 1;
      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          src_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }

      // repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;
      private java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> aclSpec_ =
        java.util.Collections.emptyList();
      private void ensureAclSpecIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          aclSpec_ = new java.util.ArrayList<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto>(aclSpec_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> aclSpecBuilder_;

      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> getAclSpecList() {
        if (aclSpecBuilder_ == null) {
          return java.util.Collections.unmodifiableList(aclSpec_);
        } else {
          return aclSpecBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public int getAclSpecCount() {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.size();
        } else {
          return aclSpecBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto getAclSpec(int index) {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.get(index);
        } else {
          return aclSpecBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder setAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.set(index, value);
          onChanged();
        } else {
          aclSpecBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder setAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.set(index, builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.add(value);
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto value) {
        if (aclSpecBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAclSpecIsMutable();
          aclSpec_.add(index, value);
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.add(builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAclSpec(
          int index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder builderForValue) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.add(index, builderForValue.build());
          onChanged();
        } else {
          aclSpecBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder addAllAclSpec(
          java.lang.Iterable<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto> values) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          super.addAll(values, aclSpec_);
          onChanged();
        } else {
          aclSpecBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder clearAclSpec() {
        if (aclSpecBuilder_ == null) {
          aclSpec_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          aclSpecBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public Builder removeAclSpec(int index) {
        if (aclSpecBuilder_ == null) {
          ensureAclSpecIsMutable();
          aclSpec_.remove(index);
          onChanged();
        } else {
          aclSpecBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder getAclSpecBuilder(
          int index) {
        return getAclSpecFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder getAclSpecOrBuilder(
          int index) {
        if (aclSpecBuilder_ == null) {
          return aclSpec_.get(index);  } else {
          return aclSpecBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<? extends org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
           getAclSpecOrBuilderList() {
        if (aclSpecBuilder_ != null) {
          return aclSpecBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(aclSpec_);
        }
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclSpecBuilder() {
        return getAclSpecFieldBuilder().addBuilder(
            org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder addAclSpecBuilder(
          int index) {
        return getAclSpecFieldBuilder().addBuilder(
            index, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.getDefaultInstance());
      }
      /**
       * <code>repeated .hadoop.hdfs.AclEntryProto aclSpec = 2;</code>
       */
      public java.util.List<org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder> 
           getAclSpecBuilderList() {
        return getAclSpecFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder> 
          getAclSpecFieldBuilder() {
        if (aclSpecBuilder_ == null) {
          aclSpecBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclEntryProtoOrBuilder>(
                  aclSpec_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          aclSpec_ = null;
        }
        return aclSpecBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.SetAclRequestProto)
    }

    static {
      defaultInstance = new SetAclRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.SetAclRequestProto)
  }

  public interface SetAclResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hadoop.hdfs.SetAclResponseProto}
   */
  public static final class SetAclResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements SetAclResponseProtoOrBuilder {
    // Use SetAclResponseProto.newBuilder() to construct.
    private SetAclResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SetAclResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SetAclResponseProto defaultInstance;
    public static SetAclResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public SetAclResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SetAclResponseProto(
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<SetAclResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<SetAclResponseProto>() {
      public SetAclResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetAclResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SetAclResponseProto> getParserForType() {
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto) obj;

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

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.SetAclResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.newBuilder()
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
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_SetAclResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto.getDefaultInstance()) return this;
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
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.SetAclResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.SetAclResponseProto)
    }

    static {
      defaultInstance = new SetAclResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.SetAclResponseProto)
  }

  public interface GetAclStatusRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string src = 1;
    /**
     * <code>required string src = 1;</code>
     */
    boolean hasSrc();
    /**
     * <code>required string src = 1;</code>
     */
    java.lang.String getSrc();
    /**
     * <code>required string src = 1;</code>
     */
    com.google.protobuf.ByteString
        getSrcBytes();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetAclStatusRequestProto}
   */
  public static final class GetAclStatusRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements GetAclStatusRequestProtoOrBuilder {
    // Use GetAclStatusRequestProto.newBuilder() to construct.
    private GetAclStatusRequestProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetAclStatusRequestProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetAclStatusRequestProto defaultInstance;
    public static GetAclStatusRequestProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetAclStatusRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetAclStatusRequestProto(
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
              src_ = input.readBytes();
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusRequestProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusRequestProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetAclStatusRequestProto> PARSER =
        new com.google.protobuf.AbstractParser<GetAclStatusRequestProto>() {
      public GetAclStatusRequestProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetAclStatusRequestProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetAclStatusRequestProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string src = 1;
    public static final int SRC_FIELD_NUMBER = 1;
    private java.lang.Object src_;
    /**
     * <code>required string src = 1;</code>
     */
    public boolean hasSrc() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string src = 1;</code>
     */
    public java.lang.String getSrc() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          src_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string src = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSrcBytes() {
      java.lang.Object ref = src_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        src_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      src_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasSrc()) {
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
        output.writeBytes(1, getSrcBytes());
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
          .computeBytesSize(1, getSrcBytes());
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto) obj;

      boolean result = true;
      result = result && (hasSrc() == other.hasSrc());
      if (hasSrc()) {
        result = result && getSrc()
            .equals(other.getSrc());
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
      if (hasSrc()) {
        hash = (37 * hash) + SRC_FIELD_NUMBER;
        hash = (53 * hash) + getSrc().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetAclStatusRequestProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusRequestProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusRequestProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.newBuilder()
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
        src_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusRequestProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.src_ = src_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto.getDefaultInstance()) return this;
        if (other.hasSrc()) {
          bitField0_ |= 0x00000001;
          src_ = other.src_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSrc()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusRequestProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string src = 1;
      private java.lang.Object src_ = "";
      /**
       * <code>required string src = 1;</code>
       */
      public boolean hasSrc() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string src = 1;</code>
       */
      public java.lang.String getSrc() {
        java.lang.Object ref = src_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          src_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSrcBytes() {
        java.lang.Object ref = src_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          src_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder clearSrc() {
        bitField0_ = (bitField0_ & ~0x00000001);
        src_ = getDefaultInstance().getSrc();
        onChanged();
        return this;
      }
      /**
       * <code>required string src = 1;</code>
       */
      public Builder setSrcBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        src_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetAclStatusRequestProto)
    }

    static {
      defaultInstance = new GetAclStatusRequestProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetAclStatusRequestProto)
  }

  public interface GetAclStatusResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required .hadoop.hdfs.AclStatusProto result = 1;
    /**
     * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
     */
    boolean hasResult();
    /**
     * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto getResult();
    /**
     * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
     */
    org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder getResultOrBuilder();
  }
  /**
   * Protobuf type {@code hadoop.hdfs.GetAclStatusResponseProto}
   */
  public static final class GetAclStatusResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements GetAclStatusResponseProtoOrBuilder {
    // Use GetAclStatusResponseProto.newBuilder() to construct.
    private GetAclStatusResponseProto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetAclStatusResponseProto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetAclStatusResponseProto defaultInstance;
    public static GetAclStatusResponseProto getDefaultInstance() {
      return defaultInstance;
    }

    public GetAclStatusResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetAclStatusResponseProto(
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
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = result_.toBuilder();
              }
              result_ = input.readMessage(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(result_);
                result_ = subBuilder.buildPartial();
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
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusResponseProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusResponseProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.Builder.class);
    }

    public static com.google.protobuf.Parser<GetAclStatusResponseProto> PARSER =
        new com.google.protobuf.AbstractParser<GetAclStatusResponseProto>() {
      public GetAclStatusResponseProto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetAclStatusResponseProto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetAclStatusResponseProto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required .hadoop.hdfs.AclStatusProto result = 1;
    public static final int RESULT_FIELD_NUMBER = 1;
    private org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto result_;
    /**
     * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto getResult() {
      return result_;
    }
    /**
     * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
     */
    public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder getResultOrBuilder() {
      return result_;
    }

    private void initFields() {
      result_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasResult()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getResult().isInitialized()) {
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
        output.writeMessage(1, result_);
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
          .computeMessageSize(1, result_);
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
      if (!(obj instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto other = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto) obj;

      boolean result = true;
      result = result && (hasResult() == other.hasResult());
      if (hasResult()) {
        result = result && getResult()
            .equals(other.getResult());
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
      if (hasResult()) {
        hash = (37 * hash) + RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getResult().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto prototype) {
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
     * Protobuf type {@code hadoop.hdfs.GetAclStatusResponseProto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusResponseProto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusResponseProto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.class, org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.Builder.class);
      }

      // Construct using org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.newBuilder()
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
          getResultFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (resultBuilder_ == null) {
          result_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance();
        } else {
          resultBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.internal_static_hadoop_hdfs_GetAclStatusResponseProto_descriptor;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto getDefaultInstanceForType() {
        return org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.getDefaultInstance();
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto build() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto buildPartial() {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto result = new org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (resultBuilder_ == null) {
          result.result_ = result_;
        } else {
          result.result_ = resultBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto) {
          return mergeFrom((org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto other) {
        if (other == org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto.getDefaultInstance()) return this;
        if (other.hasResult()) {
          mergeResult(other.getResult());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasResult()) {
          
          return false;
        }
        if (!getResult().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hdfs.protocol.proto.AclProtos.GetAclStatusResponseProto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required .hadoop.hdfs.AclStatusProto result = 1;
      private org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto result_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder> resultBuilder_;
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public boolean hasResult() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto getResult() {
        if (resultBuilder_ == null) {
          return result_;
        } else {
          return resultBuilder_.getMessage();
        }
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public Builder setResult(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto value) {
        if (resultBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          result_ = value;
          onChanged();
        } else {
          resultBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public Builder setResult(
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder builderForValue) {
        if (resultBuilder_ == null) {
          result_ = builderForValue.build();
          onChanged();
        } else {
          resultBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public Builder mergeResult(org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto value) {
        if (resultBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              result_ != org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance()) {
            result_ =
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.newBuilder(result_).mergeFrom(value).buildPartial();
          } else {
            result_ = value;
          }
          onChanged();
        } else {
          resultBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public Builder clearResult() {
        if (resultBuilder_ == null) {
          result_ = org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.getDefaultInstance();
          onChanged();
        } else {
          resultBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder getResultBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getResultFieldBuilder().getBuilder();
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      public org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder getResultOrBuilder() {
        if (resultBuilder_ != null) {
          return resultBuilder_.getMessageOrBuilder();
        } else {
          return result_;
        }
      }
      /**
       * <code>required .hadoop.hdfs.AclStatusProto result = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder> 
          getResultFieldBuilder() {
        if (resultBuilder_ == null) {
          resultBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProto.Builder, org.apache.hadoop.hdfs.protocol.proto.AclProtos.AclStatusProtoOrBuilder>(
                  result_,
                  getParentForChildren(),
                  isClean());
          result_ = null;
        }
        return resultBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:hadoop.hdfs.GetAclStatusResponseProto)
    }

    static {
      defaultInstance = new GetAclStatusResponseProto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:hadoop.hdfs.GetAclStatusResponseProto)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_AclEntryProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_AclEntryProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_AclStatusProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_AclStatusProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_AclEditLogProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_AclEditLogProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveAclRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveAclRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveAclResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveAclResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_SetAclRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_SetAclRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_SetAclResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_SetAclResponseProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetAclStatusRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetAclStatusRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hadoop_hdfs_GetAclStatusResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hadoop_hdfs_GetAclStatusResponseProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tacl.proto\022\013hadoop.hdfs\032\nhdfs.proto\"\304\003\n" +
      "\rAclEntryProto\022:\n\004type\030\001 \002(\0162,.hadoop.hd" +
      "fs.AclEntryProto.AclEntryTypeProto\022<\n\005sc" +
      "ope\030\002 \002(\0162-.hadoop.hdfs.AclEntryProto.Ac" +
      "lEntryScopeProto\022=\n\013permissions\030\003 \002(\0162(." +
      "hadoop.hdfs.AclEntryProto.FsActionProto\022" +
      "\014\n\004name\030\004 \001(\t\"-\n\022AclEntryScopeProto\022\n\n\006A" +
      "CCESS\020\000\022\013\n\007DEFAULT\020\001\"=\n\021AclEntryTypeProt" +
      "o\022\010\n\004USER\020\000\022\t\n\005GROUP\020\001\022\010\n\004MASK\020\002\022\t\n\005OTHE" +
      "R\020\003\"~\n\rFsActionProto\022\010\n\004NONE\020\000\022\013\n\007EXECUT",
      "E\020\001\022\t\n\005WRITE\020\002\022\021\n\rWRITE_EXECUTE\020\003\022\010\n\004REA" +
      "D\020\004\022\020\n\014READ_EXECUTE\020\005\022\016\n\nREAD_WRITE\020\006\022\014\n" +
      "\010PERM_ALL\020\007\"k\n\016AclStatusProto\022\r\n\005owner\030\001" +
      " \002(\t\022\r\n\005group\030\002 \002(\t\022\016\n\006sticky\030\003 \002(\010\022+\n\007e" +
      "ntries\030\004 \003(\0132\032.hadoop.hdfs.AclEntryProto" +
      "\"K\n\017AclEditLogProto\022\013\n\003src\030\001 \002(\t\022+\n\007entr" +
      "ies\030\002 \003(\0132\032.hadoop.hdfs.AclEntryProto\"X\n" +
      "\034ModifyAclEntriesRequestProto\022\013\n\003src\030\001 \002" +
      "(\t\022+\n\007aclSpec\030\002 \003(\0132\032.hadoop.hdfs.AclEnt" +
      "ryProto\"\037\n\035ModifyAclEntriesResponseProto",
      "\"$\n\025RemoveAclRequestProto\022\013\n\003src\030\001 \002(\t\"\030" +
      "\n\026RemoveAclResponseProto\"X\n\034RemoveAclEnt" +
      "riesRequestProto\022\013\n\003src\030\001 \002(\t\022+\n\007aclSpec" +
      "\030\002 \003(\0132\032.hadoop.hdfs.AclEntryProto\"\037\n\035Re" +
      "moveAclEntriesResponseProto\"+\n\034RemoveDef" +
      "aultAclRequestProto\022\013\n\003src\030\001 \002(\t\"\037\n\035Remo" +
      "veDefaultAclResponseProto\"N\n\022SetAclReque" +
      "stProto\022\013\n\003src\030\001 \002(\t\022+\n\007aclSpec\030\002 \003(\0132\032." +
      "hadoop.hdfs.AclEntryProto\"\025\n\023SetAclRespo" +
      "nseProto\"\'\n\030GetAclStatusRequestProto\022\013\n\003",
      "src\030\001 \002(\t\"H\n\031GetAclStatusResponseProto\022+" +
      "\n\006result\030\001 \002(\0132\033.hadoop.hdfs.AclStatusPr" +
      "otoB5\n%org.apache.hadoop.hdfs.protocol.p" +
      "rotoB\tAclProtos\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hadoop_hdfs_AclEntryProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hadoop_hdfs_AclEntryProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_AclEntryProto_descriptor,
              new java.lang.String[] { "Type", "Scope", "Permissions", "Name", });
          internal_static_hadoop_hdfs_AclStatusProto_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_hadoop_hdfs_AclStatusProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_AclStatusProto_descriptor,
              new java.lang.String[] { "Owner", "Group", "Sticky", "Entries", });
          internal_static_hadoop_hdfs_AclEditLogProto_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_hadoop_hdfs_AclEditLogProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_AclEditLogProto_descriptor,
              new java.lang.String[] { "Src", "Entries", });
          internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ModifyAclEntriesRequestProto_descriptor,
              new java.lang.String[] { "Src", "AclSpec", });
          internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_ModifyAclEntriesResponseProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_RemoveAclRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_hadoop_hdfs_RemoveAclRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_RemoveAclRequestProto_descriptor,
              new java.lang.String[] { "Src", });
          internal_static_hadoop_hdfs_RemoveAclResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_hadoop_hdfs_RemoveAclResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_RemoveAclResponseProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(7);
          internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_RemoveAclEntriesRequestProto_descriptor,
              new java.lang.String[] { "Src", "AclSpec", });
          internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(8);
          internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_RemoveAclEntriesResponseProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(9);
          internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_RemoveDefaultAclRequestProto_descriptor,
              new java.lang.String[] { "Src", });
          internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(10);
          internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_RemoveDefaultAclResponseProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_SetAclRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(11);
          internal_static_hadoop_hdfs_SetAclRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_SetAclRequestProto_descriptor,
              new java.lang.String[] { "Src", "AclSpec", });
          internal_static_hadoop_hdfs_SetAclResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(12);
          internal_static_hadoop_hdfs_SetAclResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_SetAclResponseProto_descriptor,
              new java.lang.String[] { });
          internal_static_hadoop_hdfs_GetAclStatusRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(13);
          internal_static_hadoop_hdfs_GetAclStatusRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetAclStatusRequestProto_descriptor,
              new java.lang.String[] { "Src", });
          internal_static_hadoop_hdfs_GetAclStatusResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(14);
          internal_static_hadoop_hdfs_GetAclStatusResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hadoop_hdfs_GetAclStatusResponseProto_descriptor,
              new java.lang.String[] { "Result", });
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
