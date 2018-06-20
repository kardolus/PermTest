package org.cloudfoundry.client;

import io.grpc.ManagedChannel;
import org.cloudfoundry.entity.Operation;
import org.cloudfoundry.iam.perm.Actor;
import org.cloudfoundry.iam.perm.HasPermissionRequest;
import org.cloudfoundry.iam.perm.PermissionServiceGrpc;

import java.io.IOException;

public class PermissionClient {
  private PermissionServiceGrpc.PermissionServiceBlockingStub stub;

  public PermissionClient(String host, int port) throws IOException {
    stub = PermissionServiceGrpc.newBlockingStub(Util.getChannel(host, port));
  }

  public boolean hasPermission(String actorId, String namespace, String credential, Operation operation) {
    Actor actor = Actor.newBuilder().setId(actorId).setNamespace(namespace).build();
    HasPermissionRequest request = HasPermissionRequest.newBuilder()
        .setActor(actor)
        .setResource(credential)
        .setAction(operation.toString())
        .build();
    return stub.hasPermission(request).getHasPermission();
  }

  public void shutdown() {
    ((ManagedChannel)stub.getChannel()).shutdown();
  }
}
