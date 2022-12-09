```proto
syntax = "proto3";

package grpc.sample;

option java_multiple_files = true;
option java_package = "com.wert.jvmstub.sample";

message SampleRequest {
  string string = 1;
  int32 number = 2;
  sint32 negative = 3;
}

message SampleResponse {
  string message = 1;
  Detail detail = 2;
}

message Detail {
  string data = 1;
  repeated string numbers = 2;
}

service SampleService {
  rpc SampleUnaryCall (SampleRequest) returns (SampleResponse) {}
  rpc SampleCallClientStream (stream SampleRequest) returns (SampleResponse) {}
  rpc SampleCallServerStream (SampleRequest) returns (stream SampleResponse) {}
  rpc SampleCallBiStream (stream SampleRequest) returns (stream SampleResponse) {}
}
```
