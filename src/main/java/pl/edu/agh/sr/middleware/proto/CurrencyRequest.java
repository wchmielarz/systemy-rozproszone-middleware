// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: currencyservice.pl.edu.agh.sr.middleware.proto

package pl.edu.agh.sr.middleware.proto;

/**
 * Protobuf type {@code CurrencyRequest}
 */
public  final class CurrencyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CurrencyRequest)
    CurrencyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CurrencyRequest.newBuilder() to construct.
  private CurrencyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CurrencyRequest() {
    code1_ = 0;
    code2_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CurrencyRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            code1_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            code2_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return pl.edu.agh.sr.middleware.proto.CurrencyServiceProto.internal_static_CurrencyRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return pl.edu.agh.sr.middleware.proto.CurrencyServiceProto.internal_static_CurrencyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            pl.edu.agh.sr.middleware.proto.CurrencyRequest.class, pl.edu.agh.sr.middleware.proto.CurrencyRequest.Builder.class);
  }

  public static final int CODE1_FIELD_NUMBER = 1;
  private int code1_;
  /**
   * <code>.CurrencyCode code1 = 1;</code>
   */
  public int getCode1Value() {
    return code1_;
  }
  /**
   * <code>.CurrencyCode code1 = 1;</code>
   */
  public pl.edu.agh.sr.middleware.proto.CurrencyCode getCode1() {
    pl.edu.agh.sr.middleware.proto.CurrencyCode result = pl.edu.agh.sr.middleware.proto.CurrencyCode.valueOf(code1_);
    return result == null ? pl.edu.agh.sr.middleware.proto.CurrencyCode.UNRECOGNIZED : result;
  }

  public static final int CODE2_FIELD_NUMBER = 2;
  private int code2_;
  /**
   * <code>.CurrencyCode code2 = 2;</code>
   */
  public int getCode2Value() {
    return code2_;
  }
  /**
   * <code>.CurrencyCode code2 = 2;</code>
   */
  public pl.edu.agh.sr.middleware.proto.CurrencyCode getCode2() {
    pl.edu.agh.sr.middleware.proto.CurrencyCode result = pl.edu.agh.sr.middleware.proto.CurrencyCode.valueOf(code2_);
    return result == null ? pl.edu.agh.sr.middleware.proto.CurrencyCode.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (code1_ != pl.edu.agh.sr.middleware.proto.CurrencyCode.USD.getNumber()) {
      output.writeEnum(1, code1_);
    }
    if (code2_ != pl.edu.agh.sr.middleware.proto.CurrencyCode.USD.getNumber()) {
      output.writeEnum(2, code2_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code1_ != pl.edu.agh.sr.middleware.proto.CurrencyCode.USD.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, code1_);
    }
    if (code2_ != pl.edu.agh.sr.middleware.proto.CurrencyCode.USD.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, code2_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof pl.edu.agh.sr.middleware.proto.CurrencyRequest)) {
      return super.equals(obj);
    }
    pl.edu.agh.sr.middleware.proto.CurrencyRequest other = (pl.edu.agh.sr.middleware.proto.CurrencyRequest) obj;

    boolean result = true;
    result = result && code1_ == other.code1_;
    result = result && code2_ == other.code2_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CODE1_FIELD_NUMBER;
    hash = (53 * hash) + code1_;
    hash = (37 * hash) + CODE2_FIELD_NUMBER;
    hash = (53 * hash) + code2_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(pl.edu.agh.sr.middleware.proto.CurrencyRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code CurrencyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CurrencyRequest)
      pl.edu.agh.sr.middleware.proto.CurrencyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.agh.sr.middleware.proto.CurrencyServiceProto.internal_static_CurrencyRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.agh.sr.middleware.proto.CurrencyServiceProto.internal_static_CurrencyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pl.edu.agh.sr.middleware.proto.CurrencyRequest.class, pl.edu.agh.sr.middleware.proto.CurrencyRequest.Builder.class);
    }

    // Construct using pl.edu.agh.sr.middleware.pl.edu.agh.sr.middleware.proto.CurrencyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      code1_ = 0;

      code2_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return pl.edu.agh.sr.middleware.proto.CurrencyServiceProto.internal_static_CurrencyRequest_descriptor;
    }

    public pl.edu.agh.sr.middleware.proto.CurrencyRequest getDefaultInstanceForType() {
      return pl.edu.agh.sr.middleware.proto.CurrencyRequest.getDefaultInstance();
    }

    public pl.edu.agh.sr.middleware.proto.CurrencyRequest build() {
      pl.edu.agh.sr.middleware.proto.CurrencyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public pl.edu.agh.sr.middleware.proto.CurrencyRequest buildPartial() {
      pl.edu.agh.sr.middleware.proto.CurrencyRequest result = new pl.edu.agh.sr.middleware.proto.CurrencyRequest(this);
      result.code1_ = code1_;
      result.code2_ = code2_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof pl.edu.agh.sr.middleware.proto.CurrencyRequest) {
        return mergeFrom((pl.edu.agh.sr.middleware.proto.CurrencyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(pl.edu.agh.sr.middleware.proto.CurrencyRequest other) {
      if (other == pl.edu.agh.sr.middleware.proto.CurrencyRequest.getDefaultInstance()) return this;
      if (other.code1_ != 0) {
        setCode1Value(other.getCode1Value());
      }
      if (other.code2_ != 0) {
        setCode2Value(other.getCode2Value());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      pl.edu.agh.sr.middleware.proto.CurrencyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (pl.edu.agh.sr.middleware.proto.CurrencyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int code1_ = 0;
    /**
     * <code>.CurrencyCode code1 = 1;</code>
     */
    public int getCode1Value() {
      return code1_;
    }
    /**
     * <code>.CurrencyCode code1 = 1;</code>
     */
    public Builder setCode1Value(int value) {
      code1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.CurrencyCode code1 = 1;</code>
     */
    public pl.edu.agh.sr.middleware.proto.CurrencyCode getCode1() {
      pl.edu.agh.sr.middleware.proto.CurrencyCode result = pl.edu.agh.sr.middleware.proto.CurrencyCode.valueOf(code1_);
      return result == null ? pl.edu.agh.sr.middleware.proto.CurrencyCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.CurrencyCode code1 = 1;</code>
     */
    public Builder setCode1(pl.edu.agh.sr.middleware.proto.CurrencyCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      code1_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.CurrencyCode code1 = 1;</code>
     */
    public Builder clearCode1() {
      
      code1_ = 0;
      onChanged();
      return this;
    }

    private int code2_ = 0;
    /**
     * <code>.CurrencyCode code2 = 2;</code>
     */
    public int getCode2Value() {
      return code2_;
    }
    /**
     * <code>.CurrencyCode code2 = 2;</code>
     */
    public Builder setCode2Value(int value) {
      code2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.CurrencyCode code2 = 2;</code>
     */
    public pl.edu.agh.sr.middleware.proto.CurrencyCode getCode2() {
      pl.edu.agh.sr.middleware.proto.CurrencyCode result = pl.edu.agh.sr.middleware.proto.CurrencyCode.valueOf(code2_);
      return result == null ? pl.edu.agh.sr.middleware.proto.CurrencyCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.CurrencyCode code2 = 2;</code>
     */
    public Builder setCode2(pl.edu.agh.sr.middleware.proto.CurrencyCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      code2_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.CurrencyCode code2 = 2;</code>
     */
    public Builder clearCode2() {
      
      code2_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:CurrencyRequest)
  }

  // @@protoc_insertion_point(class_scope:CurrencyRequest)
  private static final pl.edu.agh.sr.middleware.proto.CurrencyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new pl.edu.agh.sr.middleware.proto.CurrencyRequest();
  }

  public static pl.edu.agh.sr.middleware.proto.CurrencyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CurrencyRequest>
      PARSER = new com.google.protobuf.AbstractParser<CurrencyRequest>() {
    public CurrencyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CurrencyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CurrencyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CurrencyRequest> getParserForType() {
    return PARSER;
  }

  public pl.edu.agh.sr.middleware.proto.CurrencyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

