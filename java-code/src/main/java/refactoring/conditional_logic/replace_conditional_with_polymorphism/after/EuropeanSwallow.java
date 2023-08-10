package refactoring.conditional_logic.replace_conditional_with_polymorphism.after;

import lombok.AllArgsConstructor;


public class EuropeanSwallow extends Bird {

  public EuropeanSwallow(Bird bird) {
    super(bird.getName(), bird.getType(), bird.getNumberOfCoconuts(), bird.getVoltage(), bird.isNailed());
  }

  @Override
  public String plumage() {
    return "average";
  }

  @Override
  public int airSpeedVelocity() {
    return 35;
  }

}
