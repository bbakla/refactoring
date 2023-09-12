package refactoring.dealing_with_inheritance.extract_superclass.after;

import lombok.AllArgsConstructor;
import lombok.Getter;

//1. Create base class
@AllArgsConstructor
@Getter
public abstract class Party {
  //3. Move common parts to this class
  protected String name;

  //5.4 Add abstract method that subclasses should implement
  public abstract double getMonthlyCost();

  //5.3 Move annualCost to the base class
  public double getAnnualCost() {
    return getMonthlyCost() * 12;
  }
}
