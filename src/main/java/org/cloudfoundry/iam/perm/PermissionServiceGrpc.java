package org.cloudfoundry.iam.perm;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0-SNAPSHOT)",
    comments = "Source: permission_service.proto")
public final class PermissionServiceGrpc {

  private PermissionServiceGrpc() {}

  public static final String SERVICE_NAME = "cloud_foundry.perm.protos.PermissionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<HasPermissionRequest,
      HasPermissionResponse> getHasPermissionMethod;

  public static io.grpc.MethodDescriptor<HasPermissionRequest,
      HasPermissionResponse> getHasPermissionMethod() {
    io.grpc.MethodDescriptor<HasPermissionRequest, HasPermissionResponse> getHasPermissionMethod;
    if ((getHasPermissionMethod = PermissionServiceGrpc.getHasPermissionMethod) == null) {
      synchronized (PermissionServiceGrpc.class) {
        if ((getHasPermissionMethod = PermissionServiceGrpc.getHasPermissionMethod) == null) {
          PermissionServiceGrpc.getHasPermissionMethod = getHasPermissionMethod = 
              io.grpc.MethodDescriptor.<HasPermissionRequest, HasPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cloud_foundry.perm.protos.PermissionService", "HasPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HasPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HasPermissionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PermissionServiceMethodDescriptorSupplier("HasPermission"))
                  .build();
          }
        }
     }
     return getHasPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ListResourcePatternsRequest,
      ListResourcePatternsResponse> getListResourcePatternsMethod;

  public static io.grpc.MethodDescriptor<ListResourcePatternsRequest,
      ListResourcePatternsResponse> getListResourcePatternsMethod() {
    io.grpc.MethodDescriptor<ListResourcePatternsRequest, ListResourcePatternsResponse> getListResourcePatternsMethod;
    if ((getListResourcePatternsMethod = PermissionServiceGrpc.getListResourcePatternsMethod) == null) {
      synchronized (PermissionServiceGrpc.class) {
        if ((getListResourcePatternsMethod = PermissionServiceGrpc.getListResourcePatternsMethod) == null) {
          PermissionServiceGrpc.getListResourcePatternsMethod = getListResourcePatternsMethod = 
              io.grpc.MethodDescriptor.<ListResourcePatternsRequest, ListResourcePatternsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cloud_foundry.perm.protos.PermissionService", "ListResourcePatterns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListResourcePatternsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListResourcePatternsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PermissionServiceMethodDescriptorSupplier("ListResourcePatterns"))
                  .build();
          }
        }
     }
     return getListResourcePatternsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PermissionServiceStub newStub(io.grpc.Channel channel) {
    return new PermissionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PermissionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PermissionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PermissionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PermissionServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PermissionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void hasPermission(HasPermissionRequest request,
        io.grpc.stub.StreamObserver<HasPermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHasPermissionMethod(), responseObserver);
    }

    /**
     */
    public void listResourcePatterns(ListResourcePatternsRequest request,
        io.grpc.stub.StreamObserver<ListResourcePatternsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListResourcePatternsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHasPermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                  HasPermissionRequest,
                  HasPermissionResponse>(
                  this, METHODID_HAS_PERMISSION)))
          .addMethod(
            getListResourcePatternsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                  ListResourcePatternsRequest,
                  ListResourcePatternsResponse>(
                  this, METHODID_LIST_RESOURCE_PATTERNS)))
          .build();
    }
  }

  /**
   */
  public static final class PermissionServiceStub extends io.grpc.stub.AbstractStub<PermissionServiceStub> {
    private PermissionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PermissionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PermissionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PermissionServiceStub(channel, callOptions);
    }

    /**
     */
    public void hasPermission(HasPermissionRequest request,
        io.grpc.stub.StreamObserver<HasPermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHasPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listResourcePatterns(ListResourcePatternsRequest request,
        io.grpc.stub.StreamObserver<ListResourcePatternsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListResourcePatternsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PermissionServiceBlockingStub extends io.grpc.stub.AbstractStub<PermissionServiceBlockingStub> {
    private PermissionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PermissionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PermissionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PermissionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public HasPermissionResponse hasPermission(HasPermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getHasPermissionMethod(), getCallOptions(), request);
    }

    /**
     */
    public ListResourcePatternsResponse listResourcePatterns(ListResourcePatternsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListResourcePatternsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PermissionServiceFutureStub extends io.grpc.stub.AbstractStub<PermissionServiceFutureStub> {
    private PermissionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PermissionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PermissionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PermissionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HasPermissionResponse> hasPermission(
        HasPermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHasPermissionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ListResourcePatternsResponse> listResourcePatterns(
        ListResourcePatternsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListResourcePatternsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HAS_PERMISSION = 0;
  private static final int METHODID_LIST_RESOURCE_PATTERNS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PermissionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PermissionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HAS_PERMISSION:
          serviceImpl.hasPermission((HasPermissionRequest) request,
              (io.grpc.stub.StreamObserver<HasPermissionResponse>) responseObserver);
          break;
        case METHODID_LIST_RESOURCE_PATTERNS:
          serviceImpl.listResourcePatterns((ListResourcePatternsRequest) request,
              (io.grpc.stub.StreamObserver<ListResourcePatternsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PermissionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PermissionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PermissionServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PermissionService");
    }
  }

  private static final class PermissionServiceFileDescriptorSupplier
      extends PermissionServiceBaseDescriptorSupplier {
    PermissionServiceFileDescriptorSupplier() {}
  }

  private static final class PermissionServiceMethodDescriptorSupplier
      extends PermissionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PermissionServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PermissionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PermissionServiceFileDescriptorSupplier())
              .addMethod(getHasPermissionMethod())
              .addMethod(getListResourcePatternsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
