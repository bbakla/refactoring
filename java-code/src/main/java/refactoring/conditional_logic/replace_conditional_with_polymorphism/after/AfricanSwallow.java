package refactoring.conditional_logic.replace_conditional_with_polymorphism.after;

public class AfricanSwallow extends Bird {

  public AfricanSwallow(Bird bird) {
    super(bird.getName(), bird.getType(), bird.getNumberOfCoconuts(), bird.getVoltage(), bird.isNailed());
  }
  @Override
  public String plumage() {
    return (this.getNumberOfCoconuts() > 2) ? "tired" : "average";
  }

  @Override
  public int airSpeedVelocity() {
    return 40 * this.getNumberOfCoconuts();
  }
}
