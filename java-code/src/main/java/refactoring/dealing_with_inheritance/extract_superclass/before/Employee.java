package refactoring.dealing_with_inheritance.extract_superclass.before;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Employee {
  private String id;
  private String name;
  private double monthlyCost;

  public double getAnnualCost() {
    return monthlyCost * 12;
  }
}

