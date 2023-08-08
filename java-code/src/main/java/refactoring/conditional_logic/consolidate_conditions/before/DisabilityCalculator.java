package refactoring.conditional_logic.consolidate_conditions.before;

public class DisabilityCalculator {
  public int calculateDisabilityAmount(Employee anEmployee) {
    if (anEmployee.getSeniority() < 2) return 0;
    if (anEmployee.getMonthsDisabled() > 12) return 0;
    if (anEmployee.isPartTime()) return 0;

    // compute the disability amount
    var calculatedAmount = 0;

    return calculatedAmount;
  }
}

