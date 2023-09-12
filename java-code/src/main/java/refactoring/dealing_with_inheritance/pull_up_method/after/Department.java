package refactoring.dealing_with_inheritance.pull_up_method.after;

public class Department extends Party {

  @Override
  public void setMonthlyCost(double monthlyCost) {
      //implementation
  }

  //STEP 3: Move also the variable
  //private double monthlyCost;

  //STEP 1: Rename the method
  /*public double totalAnnualCost() {
    return monthlyCost * 12;
  }*/

//STEP 2: Move it to the base class
  /*public double annualCost() {
    return monthlyCost * 12;
  }*/
}
