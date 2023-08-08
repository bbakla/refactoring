package refactoring.conditional_logic.consolidate_conditions.after;

import refactoring.conditional_logic.consolidate_conditions.before.Employee;

public class DisabilityCalculator {
  public int calculateDisabilityAmount(Employee anEmployee) {
    if (isEligibleForDisability(anEmployee)) {
      return 0;
    }

    // compute the disability amount
    var calculatedAmount = 0;
    
    return calculatedAmount;
  }

  //STEP 1: Extract logic and combine them as they have the same action
  private boolean isEligibleForDisability(Employee anEmployee) {
    return anEmployee.getSeniority() < 2 || anEmployee.getMonthsDisabled() > 12 || anEmployee.isPartTime();
  }
}

