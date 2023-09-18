package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.after;

public interface BirdDelegate {
  int airSpeedVelocity();

  //8.2 I a plumage method with a default implementation to the interface
  default String plumage() {
    return "average";
  }
}
