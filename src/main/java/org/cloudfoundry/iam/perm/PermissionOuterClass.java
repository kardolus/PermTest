// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: permission.proto

package org.cloudfoundry.iam.perm;

public final class PermissionOuterClass {
  private PermissionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cloud_foundry_perm_protos_Permission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cloud_foundry_perm_protos_Permission_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020permission.proto\022\031cloud_foundry.perm.p" +
      "rotos\032-github.com/gogo/protobuf/gogoprot" +
      "o/gogo.proto\"<\n\nPermission\022\016\n\006action\030\002 \001" +
      "(\t\022\030\n\020resource_pattern\030\003 \001(\tJ\004\010\001\020\002B1\n\031or" +
      "g.cloudfoundry.iam.permP\001Z\006protos\310\342\036\001\340\342\036" +
      "\001\320\342\036\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        }, assigner);
    internal_static_cloud_foundry_perm_protos_Permission_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cloud_foundry_perm_protos_Permission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cloud_foundry_perm_protos_Permission_descriptor,
        new java.lang.String[] { "Action", "ResourcePattern", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.marshalerAll);
    registry.add(com.google.protobuf.GoGoProtos.sizerAll);
    registry.add(com.google.protobuf.GoGoProtos.unmarshalerAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
