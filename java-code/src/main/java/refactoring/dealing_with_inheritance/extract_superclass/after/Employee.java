package refactoring.dealing_with_inheritance.extract_superclass.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//2.1. Extend the baseclass
@Getter
@Setter
class Employee extends Party {
  //3. Move common fields to the baseclass
  private String id;
  //private String name;
  private double monthlyCost;

  public Employee(String name, String id, double monthlyCost) {
    super(name);
    this.id = id;
    this.monthlyCost = monthlyCost;
  }

  //5. This can go to the base class as it is the same with Department
  /*public double getAnnualCost() {
    return monthlyCost * 12;
  }*/
}

