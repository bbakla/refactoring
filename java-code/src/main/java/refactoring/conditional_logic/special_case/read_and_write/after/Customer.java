package refactoring.conditional_logic.special_case.read_and_write.after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
  protected String name;
  protected BillingPlan billingPlan;
  protected PaymentHistory paymentHistory;

  //STEP 1: Add a new attribute to the customer for being unknown
  private boolean isUnknown;
}
