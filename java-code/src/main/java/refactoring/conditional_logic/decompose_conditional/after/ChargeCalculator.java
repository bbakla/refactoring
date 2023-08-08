package refactoring.conditional_logic.decompose_conditional.after;

import java.time.LocalDate;

public class ChargeCalculator {

  public double calculateCharge(LocalDate date, double quantity, Plan plan) {

    //STEP 4: Reformat the if statement with a ternary operator
    return summer(date, plan) ? summerCharge(quantity, plan) : regularCharge(quantity, plan);
  }

  //STEP 3: Extract else logic to a method
  private double regularCharge(double quantity, Plan plan) {
    return quantity * plan.getRegularRate() + plan.getRegularServiceCharge();
  }

  //STEP 2: Extract if logic to a method
  private double summerCharge(double quantity, Plan plan) {
    return quantity * plan.getSummerRate();
  }

  //STEP 1: Extract if validation logic to a method
  private boolean summer(LocalDate aDate, Plan plan) {
    return !aDate.isBefore(plan.getSummerStart()) && !aDate.isAfter(plan.getSummerEnd());
  }
}
