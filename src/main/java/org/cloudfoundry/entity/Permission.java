package org.cloudfoundry.entity;

import java.util.List;

public class Permission {
  String path;
  List<String> actors;
  List<Operation> operations;

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public List<String> getActors() {
    return actors;
  }

  public void setActors(List<String> actors) {
    this.actors = actors;
  }

  public List<Operation> getOperations() {
    return operations;
  }

  public void setOperations(List<Operation> operations) {
    this.operations = operations;
  }
}
