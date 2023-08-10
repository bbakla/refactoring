package refactoring.conditional_logic.replace_conditional_with_polymorphism.after;


public class NorwegianParrot extends Bird {

  public NorwegianParrot(Bird bird) {
    super(bird.getName(), bird.getType(), bird.getNumberOfCoconuts(), bird.getVoltage(), bird.isNailed());
  }

  @Override
  public String plumage() {
    return (this.getVoltage() > 100) ? "scorched" : "beautiful";
  }

  @Override
  public int airSpeedVelocity() {
    return (this.isNailed()) ? 0 : 10 + this.getVoltage() / 10;
  }
}
