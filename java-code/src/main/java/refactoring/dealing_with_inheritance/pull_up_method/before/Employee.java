package refactoring.dealing_with_inheritance.pull_up_method.before;

public class Employee extends Party{

  private double monthlyCost;
  public double annualCost() {
    return monthlyCost * 12;
  }
}
