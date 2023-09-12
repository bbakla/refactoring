package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class AfricanSwallow extends Bird {
  private int numberOfCoconuts;

  AfricanSwallow(BirdData data) {
    super(data);
    this.numberOfCoconuts = data.getNumberOfCoconuts();
  }

  @Override
  int airSpeedVelocity() {
    return 40 * numberOfCoconuts;
  }
}
