package org.cloudfoundry;

import org.cloudfoundry.iam.perm.PermissionServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {

  public static void main(String[] args) {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6283)
        .usePlaintext()
        .build();
    PermissionServiceGrpc.PermissionServiceBlockingStub stub = PermissionServiceGrpc.newBlockingStub(channel);
    System.out.println("hi");
  }
}
