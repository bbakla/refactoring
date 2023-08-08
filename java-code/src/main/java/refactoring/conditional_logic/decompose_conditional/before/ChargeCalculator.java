package refactoring.conditional_logic.decompose_conditional.before;

import java.time.LocalDate;

public class ChargeCalculator {

  public static double calculateCharge(LocalDate aDate, double quantity, Plan plan) {
    double charge;

    if (!aDate.isBefore(plan.getSummerStart()) && !aDate.isAfter(plan.getSummerEnd())) {
      charge = quantity * plan.getSummerRate();
    } else {
      charge = quantity * plan.getRegularRate() + plan.getRegularServiceCharge();
    }

    return charge;
  }
}
