package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.before;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bird {
  private String name;
  private String plumage;

  Bird(BirdData data) {
    this.name = data.getType();
    this.plumage = "average";
  }

  int airSpeedVelocity() {
    return 0;
  }

  public String plumage() {
    return plumage;
  }
}
