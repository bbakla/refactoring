package refactoring.conditional_logic.special_case.read_and_write.after;

import lombok.Getter;
import lombok.Setter;
//STEP 2: Create a class for unknown customers
/*
Since client 3 updates customer data, it is a better idea to create a class for special case
 */
@Getter
@Setter
public class UnknownCustomer extends Customer{

  private boolean isUnknown = true;

  //STEP 4: Start setting attributes of the unknown customer according to the needs of clients

  //STEP 4.1 : Add default name for unknown customer as client 1 needs that
  //STEP 4.2 : Add default plan for unknown customer as client 2 needs that
  //STEP 4.4 : Add default setWeekDelinquentInLastYear for unknown customer as client 2 needs that
  public UnknownCustomer() {
    super.name = "occupent";
    super.billingPlan = BillingPlan.BASIC;
    super.paymentHistory = new NullPaymentHistory();
  }

  @Override
  public void setBillingPlan(BillingPlan plan) {
    //DO Nothing
  }
}
