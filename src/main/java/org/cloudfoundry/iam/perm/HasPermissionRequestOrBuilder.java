// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: permission_service.proto

package org.cloudfoundry.iam.perm;

public interface HasPermissionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cloud_foundry.perm.protos.HasPermissionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cloud_foundry.perm.protos.Actor actor = 1;</code>
   */
  boolean hasActor();
  /**
   * <code>.cloud_foundry.perm.protos.Actor actor = 1;</code>
   */
  Actor getActor();
  /**
   * <code>.cloud_foundry.perm.protos.Actor actor = 1;</code>
   */
  ActorOrBuilder getActorOrBuilder();

  /**
   * <code>string action = 2;</code>
   */
  java.lang.String getAction();
  /**
   * <code>string action = 2;</code>
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <code>string resource = 3;</code>
   */
  java.lang.String getResource();
  /**
   * <code>string resource = 3;</code>
   */
  com.google.protobuf.ByteString
      getResourceBytes();

  /**
   * <code>repeated .cloud_foundry.perm.protos.Group groups = 4;</code>
   */
  java.util.List<Group>
      getGroupsList();
  /**
   * <code>repeated .cloud_foundry.perm.protos.Group groups = 4;</code>
   */
  Group getGroups(int index);
  /**
   * <code>repeated .cloud_foundry.perm.protos.Group groups = 4;</code>
   */
  int getGroupsCount();
  /**
   * <code>repeated .cloud_foundry.perm.protos.Group groups = 4;</code>
   */
  java.util.List<? extends GroupOrBuilder>
      getGroupsOrBuilderList();
  /**
   * <code>repeated .cloud_foundry.perm.protos.Group groups = 4;</code>
   */
  GroupOrBuilder getGroupsOrBuilder(
      int index);
}
