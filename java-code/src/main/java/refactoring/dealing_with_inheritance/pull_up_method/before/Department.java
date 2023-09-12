package refactoring.dealing_with_inheritance.pull_up_method.before;

public class Department extends Party {

  private double monthlyCost;
  public double totalAnnualCost() {
    return monthlyCost * 12;
  }
}
