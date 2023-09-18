package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.after;

//7.1 I create AfricanSwallowDelegate class and move the methods to the delegate
public class AfricanSwallowDelegate implements BirdDelegate {

  private final int numberOfCoconuts;

  AfricanSwallowDelegate(BirdData data) {
    this.numberOfCoconuts = data.getNumberOfCoconuts();
  }

  @Override
  public int airSpeedVelocity() {
    return 40 * numberOfCoconuts;
  }
}
