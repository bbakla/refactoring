package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.after;

//1. Lets start from one subclass. I create the delegate for EuropeanSwallowDelegate. It is empty for now.
public class EuropeanSwallowDelegate implements BirdDelegate{

  //2. Move Bird methods to the delegate
  public int airSpeedVelocity() {
    return 35;
  }
}
