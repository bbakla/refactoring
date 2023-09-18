package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.after;

//8.1 I create delegate class
public class NorwegianBlueParrotDelegate implements BirdDelegate {
  private final int voltage;
  private final boolean isNailed;

  //8.2 I call bird instance as it calls the super class
  private final Bird bird;

  public NorwegianBlueParrotDelegate(Bird bird, BirdData data) {
    this.voltage = data.getVoltage();
    this.isNailed = data.isNailed();
    this.bird = bird;
  }

  public String plumage() {
    if (voltage > 100) {
      return "scorched";
    } else {
      return bird.plumage();
    }
  }

  @Override
  public int airSpeedVelocity() {
    return isNailed ? 0 : 10 + voltage / 10;
  }
}
