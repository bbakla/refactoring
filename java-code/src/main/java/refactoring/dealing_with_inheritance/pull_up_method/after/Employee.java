package refactoring.dealing_with_inheritance.pull_up_method.after;

public class Employee extends Party {

  //STEP 3.1: Move also the variable
  //private double monthlyCost;

  //STEP 2.1: Move it to the base class
  public double annualCost() {
    return monthlyCost * 12;
  }

  @Override
  public void setMonthlyCost(double monthlyCost) {
    //implementation

  }
}
