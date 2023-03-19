// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample/SampleProto.proto

package stub.sample;

/**
 * Protobuf type {@code grpc.sample.SampleResponse}
 */
public final class SampleResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.sample.SampleResponse)
    SampleResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SampleResponse.newBuilder() to construct.
  private SampleResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SampleResponse() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SampleResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SampleResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 18: {
            stub.sample.Detail.Builder subBuilder = null;
            if (detail_ != null) {
              subBuilder = detail_.toBuilder();
            }
            detail_ = input.readMessage(stub.sample.Detail.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(detail_);
              detail_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
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
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return stub.sample.SampleProto.internal_static_grpc_sample_SampleResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stub.sample.SampleProto.internal_static_grpc_sample_SampleResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stub.sample.SampleResponse.class, stub.sample.SampleResponse.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 1;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
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

  public static final int DETAIL_FIELD_NUMBER = 2;
  private stub.sample.Detail detail_;
  /**
   * <code>.grpc.sample.Detail detail = 2;</code>
   * @return Whether the detail field is set.
   */
  @java.lang.Override
  public boolean hasDetail() {
    return detail_ != null;
  }
  /**
   * <code>.grpc.sample.Detail detail = 2;</code>
   * @return The detail.
   */
  @java.lang.Override
  public stub.sample.Detail getDetail() {
    return detail_ == null ? stub.sample.Detail.getDefaultInstance() : detail_;
  }
  /**
   * <code>.grpc.sample.Detail detail = 2;</code>
   */
  @java.lang.Override
  public stub.sample.DetailOrBuilder getDetailOrBuilder() {
    return getDetail();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    if (detail_ != null) {
      output.writeMessage(2, getDetail());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    if (detail_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDetail());
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
    if (!(obj instanceof stub.sample.SampleResponse)) {
      return super.equals(obj);
    }
    stub.sample.SampleResponse other = (stub.sample.SampleResponse) obj;

    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (hasDetail() != other.hasDetail()) return false;
    if (hasDetail()) {
      if (!getDetail()
          .equals(other.getDetail())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasDetail()) {
      hash = (37 * hash) + DETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getDetail().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stub.sample.SampleResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stub.sample.SampleResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stub.sample.SampleResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stub.sample.SampleResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stub.sample.SampleResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stub.sample.SampleResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stub.sample.SampleResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stub.sample.SampleResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stub.sample.SampleResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stub.sample.SampleResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stub.sample.SampleResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stub.sample.SampleResponse parseFrom(
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
  public static Builder newBuilder(stub.sample.SampleResponse prototype) {
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
   * Protobuf type {@code grpc.sample.SampleResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.sample.SampleResponse)
      stub.sample.SampleResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stub.sample.SampleProto.internal_static_grpc_sample_SampleResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stub.sample.SampleProto.internal_static_grpc_sample_SampleResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stub.sample.SampleResponse.class, stub.sample.SampleResponse.Builder.class);
    }

    // Construct using stub.sample.SampleResponse.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      message_ = "";

      if (detailBuilder_ == null) {
        detail_ = null;
      } else {
        detail_ = null;
        detailBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stub.sample.SampleProto.internal_static_grpc_sample_SampleResponse_descriptor;
    }

    @java.lang.Override
    public stub.sample.SampleResponse getDefaultInstanceForType() {
      return stub.sample.SampleResponse.getDefaultInstance();
    }

    @java.lang.Override
    public stub.sample.SampleResponse build() {
      stub.sample.SampleResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stub.sample.SampleResponse buildPartial() {
      stub.sample.SampleResponse result = new stub.sample.SampleResponse(this);
      result.message_ = message_;
      if (detailBuilder_ == null) {
        result.detail_ = detail_;
      } else {
        result.detail_ = detailBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof stub.sample.SampleResponse) {
        return mergeFrom((stub.sample.SampleResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stub.sample.SampleResponse other) {
      if (other == stub.sample.SampleResponse.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.hasDetail()) {
        mergeDetail(other.getDetail());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      stub.sample.SampleResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stub.sample.SampleResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 1;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     * @return The bytes for message.
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
     * <code>string message = 1;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private stub.sample.Detail detail_;
    private com.google.protobuf.SingleFieldBuilderV3<
        stub.sample.Detail, stub.sample.Detail.Builder, stub.sample.DetailOrBuilder> detailBuilder_;
    /**
     * <code>.grpc.sample.Detail detail = 2;</code>
     * @return Whether the detail field is set.
     */
    public boolean hasDetail() {
      return detailBuilder_ != null || detail_ != null;
    }
    /**
     * <code>.grpc.sample.Detail detail = 2;</code>
     * @return The detail.
     */
    public stub.sample.Detail getDetail() {
      if (detailBuilder_ == null) {
        return detail_ == null ? stub.sample.Detail.getDefaultInstance() : detail_;
      } else {
        return detailBuilder_.getMessage();
      }
    }
    /**
     * <code>.grpc.sample.Detail detail = 2;</code>
     */
    public Builder setDetail(stub.sample.Detail value) {
      if (detailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        detail_ = value;
        onChanged();
      } else {
        detailBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.grpc.sample.Detail detail = 2;</code>
     */
    public Builder setDetail(
        stub.sample.Detail.Builder builderForValue) {
      if (detailBuilder_ == null) {
        detail_ = builderForValue.build();
        onChanged();
      } else {
        detailBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.grpc.sample.Detail detail = 2;</code>
     */
    public Builder mergeDetail(stub.sample.Detail value) {
      if (detailBuilder_ == null) {
        if (detail_ != null) {
          detail_ =
            stub.sample.Detail.newBuilder(detail_).mergeFrom(value).buildPartial();
        } else {
          detail_ = value;
        }
        onChanged();
      } else {
        detailBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.grpc.sample.Detail detail = 2;</code>
     */
    public Builder clearDetail() {
      if (detailBuilder_ == null) {
        detail_ = null;
        onChanged();
      } else {
        detail_ = null;
        detailBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.grpc.sample.Detail detail = 2;</code>
     */
    public stub.sample.Detail.Builder getDetailBuilder() {
      
      onChanged();
      return getDetailFieldBuilder().getBuilder();
    }
    /**
     * <code>.grpc.sample.Detail detail = 2;</code>
     */
    public stub.sample.DetailOrBuilder getDetailOrBuilder() {
      if (detailBuilder_ != null) {
        return detailBuilder_.getMessageOrBuilder();
      } else {
        return detail_ == null ?
            stub.sample.Detail.getDefaultInstance() : detail_;
      }
    }
    /**
     * <code>.grpc.sample.Detail detail = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stub.sample.Detail, stub.sample.Detail.Builder, stub.sample.DetailOrBuilder> 
        getDetailFieldBuilder() {
      if (detailBuilder_ == null) {
        detailBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stub.sample.Detail, stub.sample.Detail.Builder, stub.sample.DetailOrBuilder>(
                getDetail(),
                getParentForChildren(),
                isClean());
        detail_ = null;
      }
      return detailBuilder_;
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


    // @@protoc_insertion_point(builder_scope:grpc.sample.SampleResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.sample.SampleResponse)
  private static final stub.sample.SampleResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stub.sample.SampleResponse();
  }

  public static stub.sample.SampleResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SampleResponse>
      PARSER = new com.google.protobuf.AbstractParser<SampleResponse>() {
    @java.lang.Override
    public SampleResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SampleResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SampleResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SampleResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stub.sample.SampleResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
