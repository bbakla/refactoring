package refactoring.conditional_logic.special_case.read.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
  private String name;
  private BillingPlan billingPlan;
  private PaymentHistory paymentHistory;

  //STEP 1: Add unknown flag
  private boolean isUnknown;


  //STEP 2: Create a method for unknown customer
  public static Customer createUnknownCustomer() {
    var unknownPaymentHistory = new PaymentHistory();
    unknownPaymentHistory.setWeekDelinquentInLastYear(0);

    return new Customer("occupent", BillingPlan.BASIC, unknownPaymentHistory , true);
  }
}
