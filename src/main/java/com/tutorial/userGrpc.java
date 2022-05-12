package com.tutorial;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: userService.proto")
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "user";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tutorial.UserService.LoginRequest,
      com.tutorial.UserService.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.tutorial.UserService.LoginRequest.class,
      responseType = com.tutorial.UserService.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tutorial.UserService.LoginRequest,
      com.tutorial.UserService.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.tutorial.UserService.LoginRequest, com.tutorial.UserService.APIResponse> getLoginMethod;
    if ((getLoginMethod = userGrpc.getLoginMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLoginMethod = userGrpc.getLoginMethod) == null) {
          userGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.tutorial.UserService.LoginRequest, com.tutorial.UserService.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tutorial.UserService.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tutorial.UserService.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tutorial.UserService.Empty,
      com.tutorial.UserService.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = com.tutorial.UserService.Empty.class,
      responseType = com.tutorial.UserService.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tutorial.UserService.Empty,
      com.tutorial.UserService.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.tutorial.UserService.Empty, com.tutorial.UserService.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = userGrpc.getLogoutMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getLogoutMethod = userGrpc.getLogoutMethod) == null) {
          userGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<com.tutorial.UserService.Empty, com.tutorial.UserService.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tutorial.UserService.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tutorial.UserService.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tutorial.UserService.Empty,
      com.tutorial.UserService.APIResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listUsers",
      requestType = com.tutorial.UserService.Empty.class,
      responseType = com.tutorial.UserService.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tutorial.UserService.Empty,
      com.tutorial.UserService.APIResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<com.tutorial.UserService.Empty, com.tutorial.UserService.APIResponse> getListUsersMethod;
    if ((getListUsersMethod = userGrpc.getListUsersMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getListUsersMethod = userGrpc.getListUsersMethod) == null) {
          userGrpc.getListUsersMethod = getListUsersMethod = 
              io.grpc.MethodDescriptor.<com.tutorial.UserService.Empty, com.tutorial.UserService.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "user", "listUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tutorial.UserService.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tutorial.UserService.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("listUsers"))
                  .build();
          }
        }
     }
     return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tutorial.UserService.UserPro,
      com.tutorial.UserService.APIResponse> getRecordUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "recordUsers",
      requestType = com.tutorial.UserService.UserPro.class,
      responseType = com.tutorial.UserService.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.tutorial.UserService.UserPro,
      com.tutorial.UserService.APIResponse> getRecordUsersMethod() {
    io.grpc.MethodDescriptor<com.tutorial.UserService.UserPro, com.tutorial.UserService.APIResponse> getRecordUsersMethod;
    if ((getRecordUsersMethod = userGrpc.getRecordUsersMethod) == null) {
      synchronized (userGrpc.class) {
        if ((getRecordUsersMethod = userGrpc.getRecordUsersMethod) == null) {
          userGrpc.getRecordUsersMethod = getRecordUsersMethod = 
              io.grpc.MethodDescriptor.<com.tutorial.UserService.UserPro, com.tutorial.UserService.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "user", "recordUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tutorial.UserService.UserPro.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tutorial.UserService.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userMethodDescriptorSupplier("recordUsers"))
                  .build();
          }
        }
     }
     return getRecordUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    return new userStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userFutureStub(channel);
  }

  /**
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.tutorial.UserService.LoginRequest request,
        io.grpc.stub.StreamObserver<com.tutorial.UserService.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.tutorial.UserService.Empty request,
        io.grpc.stub.StreamObserver<com.tutorial.UserService.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     */
    public void listUsers(com.tutorial.UserService.Empty request,
        io.grpc.stub.StreamObserver<com.tutorial.UserService.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.tutorial.UserService.UserPro> recordUsers(
        io.grpc.stub.StreamObserver<com.tutorial.UserService.APIResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getRecordUsersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tutorial.UserService.LoginRequest,
                com.tutorial.UserService.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tutorial.UserService.Empty,
                com.tutorial.UserService.APIResponse>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getListUsersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.tutorial.UserService.Empty,
                com.tutorial.UserService.APIResponse>(
                  this, METHODID_LIST_USERS)))
          .addMethod(
            getRecordUsersMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.tutorial.UserService.UserPro,
                com.tutorial.UserService.APIResponse>(
                  this, METHODID_RECORD_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class userStub extends io.grpc.stub.AbstractStub<userStub> {
    private userStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void login(com.tutorial.UserService.LoginRequest request,
        io.grpc.stub.StreamObserver<com.tutorial.UserService.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.tutorial.UserService.Empty request,
        io.grpc.stub.StreamObserver<com.tutorial.UserService.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUsers(com.tutorial.UserService.Empty request,
        io.grpc.stub.StreamObserver<com.tutorial.UserService.APIResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.tutorial.UserService.UserPro> recordUsers(
        io.grpc.stub.StreamObserver<com.tutorial.UserService.APIResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRecordUsersMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class userBlockingStub extends io.grpc.stub.AbstractStub<userBlockingStub> {
    private userBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tutorial.UserService.APIResponse login(com.tutorial.UserService.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tutorial.UserService.APIResponse logout(com.tutorial.UserService.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.tutorial.UserService.APIResponse> listUsers(
        com.tutorial.UserService.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userFutureStub extends io.grpc.stub.AbstractStub<userFutureStub> {
    private userFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tutorial.UserService.APIResponse> login(
        com.tutorial.UserService.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tutorial.UserService.APIResponse> logout(
        com.tutorial.UserService.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_LIST_USERS = 2;
  private static final int METHODID_RECORD_USERS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.tutorial.UserService.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.tutorial.UserService.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.tutorial.UserService.Empty) request,
              (io.grpc.stub.StreamObserver<com.tutorial.UserService.APIResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.tutorial.UserService.Empty) request,
              (io.grpc.stub.StreamObserver<com.tutorial.UserService.APIResponse>) responseObserver);
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
        case METHODID_RECORD_USERS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordUsers(
              (io.grpc.stub.StreamObserver<com.tutorial.UserService.APIResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tutorial.UserService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("user");
    }
  }

  private static final class userFileDescriptorSupplier
      extends userBaseDescriptorSupplier {
    userFileDescriptorSupplier() {}
  }

  private static final class userMethodDescriptorSupplier
      extends userBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userMethodDescriptorSupplier(String methodName) {
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
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getListUsersMethod())
              .addMethod(getRecordUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
