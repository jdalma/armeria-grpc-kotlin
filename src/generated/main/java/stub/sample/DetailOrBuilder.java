// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample/SampleProto.proto

package stub.sample;

public interface DetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.sample.Detail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string data = 1;</code>
   * @return The data.
   */
  java.lang.String getData();
  /**
   * <code>string data = 1;</code>
   * @return The bytes for data.
   */
  com.google.protobuf.ByteString
      getDataBytes();

  /**
   * <code>repeated string numbers = 2;</code>
   * @return A list containing the numbers.
   */
  java.util.List<java.lang.String>
      getNumbersList();
  /**
   * <code>repeated string numbers = 2;</code>
   * @return The count of numbers.
   */
  int getNumbersCount();
  /**
   * <code>repeated string numbers = 2;</code>
   * @param index The index of the element to return.
   * @return The numbers at the given index.
   */
  java.lang.String getNumbers(int index);
  /**
   * <code>repeated string numbers = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the numbers at the given index.
   */
  com.google.protobuf.ByteString
      getNumbersBytes(int index);
}