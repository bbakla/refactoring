package refactoring.conditional_logic.special_case.before;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
  private String name;
  private BillingPlan billingPlan;
  private PaymentHistory paymentHistory;
}
