//10. We dont need the specific bird types anymore

/*
package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class NorwegianBlueParrot extends Bird {
  private int voltage;
  private boolean isNailed;

  NorwegianBlueParrot(BirdData data) {
    super(data);
    this.voltage = data.getVoltage();
    this.isNailed = data.isNailed();
  }

  @Override
  public String plumage() {
    if (voltage > 100) {
      return "scorched";
    } else {
      return super.plumage();
    }
  }

  @Override
  int airSpeedVelocity() {
    return isNailed ? 0 : 10 + voltage / 10;
  }
}
*/
