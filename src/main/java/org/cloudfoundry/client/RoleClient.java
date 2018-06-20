package org.cloudfoundry.client;

import io.grpc.ManagedChannel;
import org.cloudfoundry.entity.Operation;
import org.cloudfoundry.iam.perm.Actor;
import org.cloudfoundry.iam.perm.AssignRoleRequest;
import org.cloudfoundry.iam.perm.CreateRoleRequest;
import org.cloudfoundry.iam.perm.Permission;
import org.cloudfoundry.iam.perm.RoleServiceGrpc;

import java.io.IOException;

public class RoleClient {
  private RoleServiceGrpc.RoleServiceBlockingStub stub;

  public RoleClient(String host, int port) throws IOException {
    stub = RoleServiceGrpc.newBlockingStub(Util.getChannel(host, port));
  }

  public void createRole(String name, String path, Operation operation) {
    Permission permission = Permission.newBuilder()
        .setAction(operation.toString())
        .setResourcePattern(path)
        .build();
    CreateRoleRequest request = CreateRoleRequest.newBuilder()
        .setName(name)
        .addPermissions(permission)
        .build();
    stub.createRole(request);
  }

  public void assignRole(String actorId, String namespace, String role) {
    Actor actor = Actor.newBuilder().setId(actorId).setNamespace(namespace).build();
    AssignRoleRequest request = AssignRoleRequest.newBuilder()
        .setActor(actor)
        .setRoleName(role)
        .build();
    stub.assignRole(request);
  }

  public void shutdown() {
    ((ManagedChannel)stub.getChannel()).shutdown();
  }
}
