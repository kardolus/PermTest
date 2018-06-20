package org.cloudfoundry.service;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.cloudfoundry.client.PermissionClient;
import org.cloudfoundry.client.RoleClient;
import org.cloudfoundry.entity.Operation;
import org.cloudfoundry.entity.Permission;

import java.io.IOException;
import java.util.List;

public class PermService {
  private static final String HOST = "localhost";
  private static final int PORT = 6283;

  public void parse(List<Permission> permissions) throws IOException {
    RoleClient roleClient = new RoleClient(HOST, PORT);

    for (Permission permission : permissions) {
      for (Operation operation : permission.getOperations()) {
        String roleName = permission.getPath() + operation.toString();
        try {
          roleClient.createRole(roleName, permission.getPath(), operation);
        } catch (StatusRuntimeException e) {
          if (!e.getStatus().getCode().equals(Status.Code.ALREADY_EXISTS)) {
            throw (e);
          }
        }

        for (String actor : permission.getActors()) {
          String[] splitActor = actor.split(":", 2);
          try {
            roleClient.assignRole(splitActor[1], splitActor[0], roleName);
          } catch (StatusRuntimeException e) {
            if (!e.getStatus().getCode().equals(Status.Code.ALREADY_EXISTS)) {
              throw (e);
            }
          }
        }
      }
    }

    roleClient.shutdown();
  }

  public boolean hasPermission(String actor, String path, Operation operation) throws IOException {
    PermissionClient permissionClient = new PermissionClient(HOST, PORT);
    String[] splitActor = actor.split(":", 2);
    boolean hasPermission = permissionClient.hasPermission(splitActor[1], splitActor[0], path, operation);
    permissionClient.shutdown();
    return hasPermission;
  }
}
