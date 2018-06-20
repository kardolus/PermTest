package org.cloudfoundry.service;

import org.cloudfoundry.entity.Operation;
import org.cloudfoundry.entity.Permission;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PermServiceTest {
  private PermService subject;
  private List<Permission> permissions;
  private static final String USER_A = "uaa:userA";
  private static final String USER_B = "uaa:userB";
  private static final String CREDENTIAL_PATH = "/some/credential";
  private static Operation[] ALLOWED_OPERATIONS = new Operation[]{
      Operation.READ,
      Operation.WRITE,
      Operation.DELETE,
      Operation.READ_ACL,
      Operation.WRITE_ACL,
  };
  private static Operation[] UNALLOWED_OPERATIONS = new Operation[]{Operation.DELETE_ACL};


  @Before
  public void setUp() {
    subject = new PermService();
    permissions = new ArrayList<>();

    Permission permission = new Permission();

    List<String> actors = new ArrayList<>();
    actors.add(USER_A);
    actors.add(USER_B);

    List<Operation> operations = new ArrayList<>();
    Collections.addAll(operations, ALLOWED_OPERATIONS);

    permission.setActors(actors);
    permission.setOperations(operations);
    permission.setPath(CREDENTIAL_PATH);

    permissions.add(permission);
  }

  @Test
  public void acceptanceTest() throws Exception {
    subject.parse(permissions);

    for (Operation operation : ALLOWED_OPERATIONS) {
      assertAllowed(USER_A, CREDENTIAL_PATH, operation);
      assertAllowed(USER_B, CREDENTIAL_PATH, operation);
      assertNotAllowed("uaa:otherUser", CREDENTIAL_PATH, operation);
    }
    for (Operation operation : UNALLOWED_OPERATIONS) {
      assertNotAllowed(USER_A, CREDENTIAL_PATH, operation);
      assertNotAllowed(USER_B, CREDENTIAL_PATH, operation);
      assertNotAllowed("uaa:otherUser", CREDENTIAL_PATH, operation);
    }
  }

  private void assertAllowed(String user, String credentialPath, Operation operation) throws Exception {
    assertTrue(String.format("Expected %s to be allowed to %s credential %s", user, operation.toString(), credentialPath),
        subject.hasPermission(user, credentialPath, operation));
  }

  private void assertNotAllowed(String user, String credentialPath, Operation operation) throws Exception {
    assertFalse(String.format("Expected %s not to be allowed to %s credential %s", user, operation.toString(), credentialPath),
        subject.hasPermission(user, credentialPath, operation));
  }
}
