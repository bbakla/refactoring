package refactoring.dealing_with_inheritance.pull_up_method.after;

public abstract class Party {
  protected double monthlyCost;

  public double annualCost() {
    return monthlyCost * 12;
  }

  //STEP 4: Add an abstract method in the base class so that subclasses can change the monthly cost
  //for themselves
  public abstract void setMonthlyCost(double monthlyCost);
}
