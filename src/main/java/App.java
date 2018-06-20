import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.cloudfoundry.iam.perm.Actor;
import org.cloudfoundry.iam.perm.Group;
import org.cloudfoundry.iam.perm.HasPermissionRequest;
import org.cloudfoundry.iam.perm.ListResourcePatternsRequest;
import org.cloudfoundry.iam.perm.PermissionServiceGrpc;

public class App {
  public static void main(String[] args) {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6283)
        .usePlaintext()
        .build();
    PermissionServiceGrpc.PermissionServiceBlockingStub stub = PermissionServiceGrpc.newBlockingStub(channel);

    // TODO
    //

    // Create Group (What is a group)
    Group group = Group.newBuilder().build();

    HasPermissionRequest hasPermissionRequest = HasPermissionRequest.newBuilder().setGroups(1, group).build();
    stub.hasPermission(hasPermissionRequest);
    System.exit(0);

    // List Resources
    Actor actor = Actor.newBuilder().build();
    ListResourcePatternsRequest listResourcePatternsRequest = ListResourcePatternsRequest.newBuilder().setActor(actor).build();
    stub.listResourcePatterns(listResourcePatternsRequest);

    System.out.println("hi");
  }
}
