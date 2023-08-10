package refactoring.conditional_logic.replace_conditional_with_polymorphism.example1.after;


public class DefaultBird extends Bird {

  public DefaultBird(Bird bird) {
    super(bird.getName(), bird.getType(), bird.getNumberOfCoconuts(), bird.getVoltage(), bird.isNailed());
  }

  @Override
  public String plumage() {
    return "unknown";
  }

  @Override
  public int airSpeedVelocity() {
    return 0;
  }
}
