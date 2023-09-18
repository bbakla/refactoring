package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.after;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BirdData {
  private String type;
  private int numberOfCoconuts;
  private int voltage;
  private boolean isNailed;

  BirdData(String type) {
    this.type = type;
  }

  BirdData(String type, int numberOfCoconuts) {
    this.type = type;
    this.numberOfCoconuts = numberOfCoconuts;
  }

  BirdData(String type, int voltage, boolean isNailed) {
    this.type = type;
    this.voltage = voltage;
    this.isNailed = isNailed;
  }
}





