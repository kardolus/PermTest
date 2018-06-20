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
    comments = "Source: role_service.proto")
public final class RoleServiceGrpc {

  private RoleServiceGrpc() {}

  public static final String SERVICE_NAME = "cloud_foundry.perm.protos.RoleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<CreateRoleRequest,
      CreateRoleResponse> getCreateRoleMethod;

  public static io.grpc.MethodDescriptor<CreateRoleRequest,
      CreateRoleResponse> getCreateRoleMethod() {
    io.grpc.MethodDescriptor<CreateRoleRequest, CreateRoleResponse> getCreateRoleMethod;
    if ((getCreateRoleMethod = RoleServiceGrpc.getCreateRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getCreateRoleMethod = RoleServiceGrpc.getCreateRoleMethod) == null) {
          RoleServiceGrpc.getCreateRoleMethod = getCreateRoleMethod = 
              io.grpc.MethodDescriptor.<CreateRoleRequest, CreateRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cloud_foundry.perm.protos.RoleService", "CreateRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CreateRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  CreateRoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("CreateRole"))
                  .build();
          }
        }
     }
     return getCreateRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<DeleteRoleRequest,
      DeleteRoleResponse> getDeleteRoleMethod;

  public static io.grpc.MethodDescriptor<DeleteRoleRequest,
      DeleteRoleResponse> getDeleteRoleMethod() {
    io.grpc.MethodDescriptor<DeleteRoleRequest, DeleteRoleResponse> getDeleteRoleMethod;
    if ((getDeleteRoleMethod = RoleServiceGrpc.getDeleteRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getDeleteRoleMethod = RoleServiceGrpc.getDeleteRoleMethod) == null) {
          RoleServiceGrpc.getDeleteRoleMethod = getDeleteRoleMethod = 
              io.grpc.MethodDescriptor.<DeleteRoleRequest, DeleteRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cloud_foundry.perm.protos.RoleService", "DeleteRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DeleteRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  DeleteRoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("DeleteRole"))
                  .build();
          }
        }
     }
     return getDeleteRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AssignRoleRequest,
      AssignRoleResponse> getAssignRoleMethod;

  public static io.grpc.MethodDescriptor<AssignRoleRequest,
      AssignRoleResponse> getAssignRoleMethod() {
    io.grpc.MethodDescriptor<AssignRoleRequest, AssignRoleResponse> getAssignRoleMethod;
    if ((getAssignRoleMethod = RoleServiceGrpc.getAssignRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getAssignRoleMethod = RoleServiceGrpc.getAssignRoleMethod) == null) {
          RoleServiceGrpc.getAssignRoleMethod = getAssignRoleMethod = 
              io.grpc.MethodDescriptor.<AssignRoleRequest, AssignRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cloud_foundry.perm.protos.RoleService", "AssignRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AssignRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AssignRoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("AssignRole"))
                  .build();
          }
        }
     }
     return getAssignRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AssignRoleToGroupRequest,
      AssignRoleToGroupResponse> getAssignRoleToGroupMethod;

  public static io.grpc.MethodDescriptor<AssignRoleToGroupRequest,
      AssignRoleToGroupResponse> getAssignRoleToGroupMethod() {
    io.grpc.MethodDescriptor<AssignRoleToGroupRequest, AssignRoleToGroupResponse> getAssignRoleToGroupMethod;
    if ((getAssignRoleToGroupMethod = RoleServiceGrpc.getAssignRoleToGroupMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getAssignRoleToGroupMethod = RoleServiceGrpc.getAssignRoleToGroupMethod) == null) {
          RoleServiceGrpc.getAssignRoleToGroupMethod = getAssignRoleToGroupMethod = 
              io.grpc.MethodDescriptor.<AssignRoleToGroupRequest, AssignRoleToGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cloud_foundry.perm.protos.RoleService", "AssignRoleToGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AssignRoleToGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AssignRoleToGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("AssignRoleToGroup"))
                  .build();
          }
        }
     }
     return getAssignRoleToGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UnassignRoleRequest,
      UnassignRoleResponse> getUnassignRoleMethod;

  public static io.grpc.MethodDescriptor<UnassignRoleRequest,
      UnassignRoleResponse> getUnassignRoleMethod() {
    io.grpc.MethodDescriptor<UnassignRoleRequest, UnassignRoleResponse> getUnassignRoleMethod;
    if ((getUnassignRoleMethod = RoleServiceGrpc.getUnassignRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getUnassignRoleMethod = RoleServiceGrpc.getUnassignRoleMethod) == null) {
          RoleServiceGrpc.getUnassignRoleMethod = getUnassignRoleMethod = 
              io.grpc.MethodDescriptor.<UnassignRoleRequest, UnassignRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cloud_foundry.perm.protos.RoleService", "UnassignRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UnassignRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UnassignRoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("UnassignRole"))
                  .build();
          }
        }
     }
     return getUnassignRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<UnassignRoleFromGroupRequest,
      UnassignRoleFromGroupResponse> getUnassignRoleFromGroupMethod;

  public static io.grpc.MethodDescriptor<UnassignRoleFromGroupRequest,
      UnassignRoleFromGroupResponse> getUnassignRoleFromGroupMethod() {
    io.grpc.MethodDescriptor<UnassignRoleFromGroupRequest, UnassignRoleFromGroupResponse> getUnassignRoleFromGroupMethod;
    if ((getUnassignRoleFromGroupMethod = RoleServiceGrpc.getUnassignRoleFromGroupMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getUnassignRoleFromGroupMethod = RoleServiceGrpc.getUnassignRoleFromGroupMethod) == null) {
          RoleServiceGrpc.getUnassignRoleFromGroupMethod = getUnassignRoleFromGroupMethod = 
              io.grpc.MethodDescriptor.<UnassignRoleFromGroupRequest, UnassignRoleFromGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cloud_foundry.perm.protos.RoleService", "UnassignRoleFromGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UnassignRoleFromGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  UnassignRoleFromGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("UnassignRoleFromGroup"))
                  .build();
          }
        }
     }
     return getUnassignRoleFromGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HasRoleRequest,
      HasRoleResponse> getHasRoleMethod;

  public static io.grpc.MethodDescriptor<HasRoleRequest,
      HasRoleResponse> getHasRoleMethod() {
    io.grpc.MethodDescriptor<HasRoleRequest, HasRoleResponse> getHasRoleMethod;
    if ((getHasRoleMethod = RoleServiceGrpc.getHasRoleMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getHasRoleMethod = RoleServiceGrpc.getHasRoleMethod) == null) {
          RoleServiceGrpc.getHasRoleMethod = getHasRoleMethod = 
              io.grpc.MethodDescriptor.<HasRoleRequest, HasRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cloud_foundry.perm.protos.RoleService", "HasRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HasRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HasRoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("HasRole"))
                  .build();
          }
        }
     }
     return getHasRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<HasRoleForGroupRequest,
      HasRoleForGroupResponse> getHasRoleForGroupMethod;

  public static io.grpc.MethodDescriptor<HasRoleForGroupRequest,
      HasRoleForGroupResponse> getHasRoleForGroupMethod() {
    io.grpc.MethodDescriptor<HasRoleForGroupRequest, HasRoleForGroupResponse> getHasRoleForGroupMethod;
    if ((getHasRoleForGroupMethod = RoleServiceGrpc.getHasRoleForGroupMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getHasRoleForGroupMethod = RoleServiceGrpc.getHasRoleForGroupMethod) == null) {
          RoleServiceGrpc.getHasRoleForGroupMethod = getHasRoleForGroupMethod = 
              io.grpc.MethodDescriptor.<HasRoleForGroupRequest, HasRoleForGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cloud_foundry.perm.protos.RoleService", "HasRoleForGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HasRoleForGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HasRoleForGroupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("HasRoleForGroup"))
                  .build();
          }
        }
     }
     return getHasRoleForGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ListRolePermissionsRequest,
      ListRolePermissionsResponse> getListRolePermissionsMethod;

  public static io.grpc.MethodDescriptor<ListRolePermissionsRequest,
      ListRolePermissionsResponse> getListRolePermissionsMethod() {
    io.grpc.MethodDescriptor<ListRolePermissionsRequest, ListRolePermissionsResponse> getListRolePermissionsMethod;
    if ((getListRolePermissionsMethod = RoleServiceGrpc.getListRolePermissionsMethod) == null) {
      synchronized (RoleServiceGrpc.class) {
        if ((getListRolePermissionsMethod = RoleServiceGrpc.getListRolePermissionsMethod) == null) {
          RoleServiceGrpc.getListRolePermissionsMethod = getListRolePermissionsMethod = 
              io.grpc.MethodDescriptor.<ListRolePermissionsRequest, ListRolePermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cloud_foundry.perm.protos.RoleService", "ListRolePermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListRolePermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ListRolePermissionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleServiceMethodDescriptorSupplier("ListRolePermissions"))
                  .build();
          }
        }
     }
     return getListRolePermissionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoleServiceStub newStub(io.grpc.Channel channel) {
    return new RoleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RoleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RoleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RoleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createRole(CreateRoleRequest request,
        io.grpc.stub.StreamObserver<CreateRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateRoleMethod(), responseObserver);
    }

    /**
     */
    public void deleteRole(DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<DeleteRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRoleMethod(), responseObserver);
    }

    /**
     */
    public void assignRole(AssignRoleRequest request,
        io.grpc.stub.StreamObserver<AssignRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignRoleMethod(), responseObserver);
    }

    /**
     */
    public void assignRoleToGroup(AssignRoleToGroupRequest request,
        io.grpc.stub.StreamObserver<AssignRoleToGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignRoleToGroupMethod(), responseObserver);
    }

    /**
     */
    public void unassignRole(UnassignRoleRequest request,
        io.grpc.stub.StreamObserver<UnassignRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnassignRoleMethod(), responseObserver);
    }

    /**
     */
    public void unassignRoleFromGroup(UnassignRoleFromGroupRequest request,
        io.grpc.stub.StreamObserver<UnassignRoleFromGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnassignRoleFromGroupMethod(), responseObserver);
    }

    /**
     */
    public void hasRole(HasRoleRequest request,
        io.grpc.stub.StreamObserver<HasRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHasRoleMethod(), responseObserver);
    }

    /**
     */
    public void hasRoleForGroup(HasRoleForGroupRequest request,
        io.grpc.stub.StreamObserver<HasRoleForGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHasRoleForGroupMethod(), responseObserver);
    }

    /**
     */
    public void listRolePermissions(ListRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<ListRolePermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListRolePermissionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                  CreateRoleRequest,
                  CreateRoleResponse>(
                  this, METHODID_CREATE_ROLE)))
          .addMethod(
            getDeleteRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                  DeleteRoleRequest,
                  DeleteRoleResponse>(
                  this, METHODID_DELETE_ROLE)))
          .addMethod(
            getAssignRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                  AssignRoleRequest,
                  AssignRoleResponse>(
                  this, METHODID_ASSIGN_ROLE)))
          .addMethod(
            getAssignRoleToGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                  AssignRoleToGroupRequest,
                  AssignRoleToGroupResponse>(
                  this, METHODID_ASSIGN_ROLE_TO_GROUP)))
          .addMethod(
            getUnassignRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                  UnassignRoleRequest,
                  UnassignRoleResponse>(
                  this, METHODID_UNASSIGN_ROLE)))
          .addMethod(
            getUnassignRoleFromGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                  UnassignRoleFromGroupRequest,
                  UnassignRoleFromGroupResponse>(
                  this, METHODID_UNASSIGN_ROLE_FROM_GROUP)))
          .addMethod(
            getHasRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                  HasRoleRequest,
                  HasRoleResponse>(
                  this, METHODID_HAS_ROLE)))
          .addMethod(
            getHasRoleForGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                  HasRoleForGroupRequest,
                  HasRoleForGroupResponse>(
                  this, METHODID_HAS_ROLE_FOR_GROUP)))
          .addMethod(
            getListRolePermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                  ListRolePermissionsRequest,
                  ListRolePermissionsResponse>(
                  this, METHODID_LIST_ROLE_PERMISSIONS)))
          .build();
    }
  }

  /**
   */
  public static final class RoleServiceStub extends io.grpc.stub.AbstractStub<RoleServiceStub> {
    private RoleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleServiceStub(channel, callOptions);
    }

    /**
     */
    public void createRole(CreateRoleRequest request,
        io.grpc.stub.StreamObserver<CreateRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRole(DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<DeleteRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignRole(AssignRoleRequest request,
        io.grpc.stub.StreamObserver<AssignRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignRoleToGroup(AssignRoleToGroupRequest request,
        io.grpc.stub.StreamObserver<AssignRoleToGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignRoleToGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unassignRole(UnassignRoleRequest request,
        io.grpc.stub.StreamObserver<UnassignRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnassignRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unassignRoleFromGroup(UnassignRoleFromGroupRequest request,
        io.grpc.stub.StreamObserver<UnassignRoleFromGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnassignRoleFromGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hasRole(HasRoleRequest request,
        io.grpc.stub.StreamObserver<HasRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHasRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hasRoleForGroup(HasRoleForGroupRequest request,
        io.grpc.stub.StreamObserver<HasRoleForGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHasRoleForGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRolePermissions(ListRolePermissionsRequest request,
        io.grpc.stub.StreamObserver<ListRolePermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListRolePermissionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RoleServiceBlockingStub extends io.grpc.stub.AbstractStub<RoleServiceBlockingStub> {
    private RoleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public CreateRoleResponse createRole(CreateRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public AssignRoleResponse assignRole(AssignRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public AssignRoleToGroupResponse assignRoleToGroup(AssignRoleToGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignRoleToGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public UnassignRoleResponse unassignRole(UnassignRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnassignRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public UnassignRoleFromGroupResponse unassignRoleFromGroup(UnassignRoleFromGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnassignRoleFromGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public HasRoleResponse hasRole(HasRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getHasRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public HasRoleForGroupResponse hasRoleForGroup(HasRoleForGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getHasRoleForGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public ListRolePermissionsResponse listRolePermissions(ListRolePermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListRolePermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RoleServiceFutureStub extends io.grpc.stub.AbstractStub<RoleServiceFutureStub> {
    private RoleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<CreateRoleResponse> createRole(
        CreateRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<DeleteRoleResponse> deleteRole(
        DeleteRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AssignRoleResponse> assignRole(
        AssignRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<AssignRoleToGroupResponse> assignRoleToGroup(
        AssignRoleToGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignRoleToGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UnassignRoleResponse> unassignRole(
        UnassignRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnassignRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UnassignRoleFromGroupResponse> unassignRoleFromGroup(
        UnassignRoleFromGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnassignRoleFromGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HasRoleResponse> hasRole(
        HasRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHasRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HasRoleForGroupResponse> hasRoleForGroup(
        HasRoleForGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHasRoleForGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ListRolePermissionsResponse> listRolePermissions(
        ListRolePermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListRolePermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ROLE = 0;
  private static final int METHODID_DELETE_ROLE = 1;
  private static final int METHODID_ASSIGN_ROLE = 2;
  private static final int METHODID_ASSIGN_ROLE_TO_GROUP = 3;
  private static final int METHODID_UNASSIGN_ROLE = 4;
  private static final int METHODID_UNASSIGN_ROLE_FROM_GROUP = 5;
  private static final int METHODID_HAS_ROLE = 6;
  private static final int METHODID_HAS_ROLE_FOR_GROUP = 7;
  private static final int METHODID_LIST_ROLE_PERMISSIONS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ROLE:
          serviceImpl.createRole((CreateRoleRequest) request,
              (io.grpc.stub.StreamObserver<CreateRoleResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROLE:
          serviceImpl.deleteRole((DeleteRoleRequest) request,
              (io.grpc.stub.StreamObserver<DeleteRoleResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_ROLE:
          serviceImpl.assignRole((AssignRoleRequest) request,
              (io.grpc.stub.StreamObserver<AssignRoleResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_ROLE_TO_GROUP:
          serviceImpl.assignRoleToGroup((AssignRoleToGroupRequest) request,
              (io.grpc.stub.StreamObserver<AssignRoleToGroupResponse>) responseObserver);
          break;
        case METHODID_UNASSIGN_ROLE:
          serviceImpl.unassignRole((UnassignRoleRequest) request,
              (io.grpc.stub.StreamObserver<UnassignRoleResponse>) responseObserver);
          break;
        case METHODID_UNASSIGN_ROLE_FROM_GROUP:
          serviceImpl.unassignRoleFromGroup((UnassignRoleFromGroupRequest) request,
              (io.grpc.stub.StreamObserver<UnassignRoleFromGroupResponse>) responseObserver);
          break;
        case METHODID_HAS_ROLE:
          serviceImpl.hasRole((HasRoleRequest) request,
              (io.grpc.stub.StreamObserver<HasRoleResponse>) responseObserver);
          break;
        case METHODID_HAS_ROLE_FOR_GROUP:
          serviceImpl.hasRoleForGroup((HasRoleForGroupRequest) request,
              (io.grpc.stub.StreamObserver<HasRoleForGroupResponse>) responseObserver);
          break;
        case METHODID_LIST_ROLE_PERMISSIONS:
          serviceImpl.listRolePermissions((ListRolePermissionsRequest) request,
              (io.grpc.stub.StreamObserver<ListRolePermissionsResponse>) responseObserver);
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

  private static abstract class RoleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return RoleServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RoleService");
    }
  }

  private static final class RoleServiceFileDescriptorSupplier
      extends RoleServiceBaseDescriptorSupplier {
    RoleServiceFileDescriptorSupplier() {}
  }

  private static final class RoleServiceMethodDescriptorSupplier
      extends RoleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoleServiceFileDescriptorSupplier())
              .addMethod(getCreateRoleMethod())
              .addMethod(getDeleteRoleMethod())
              .addMethod(getAssignRoleMethod())
              .addMethod(getAssignRoleToGroupMethod())
              .addMethod(getUnassignRoleMethod())
              .addMethod(getUnassignRoleFromGroupMethod())
              .addMethod(getHasRoleMethod())
              .addMethod(getHasRoleForGroupMethod())
              .addMethod(getListRolePermissionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
