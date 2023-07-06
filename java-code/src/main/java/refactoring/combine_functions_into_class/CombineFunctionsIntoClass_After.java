package refactoring.combine_functions_into_class;

public class CombineFunctionsIntoClass_After {
  public void calculate() {
    var reading = acquireReading();
    var taxableCharge = reading.taxableCharge();
  }
  private Reading acquireReading() {
    return new Reading();
  }
}
