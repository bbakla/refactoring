package refactoring.conditional_logic.special_case.read.after;

import lombok.Getter;
import lombok.Setter;
@Setter
public class Site {
  private Customer customer;

  //STEP 3: Return unknown customer if customer is null
  public Customer getCustomer() {
    return this.customer == null ? Customer.createUnknownCustomer() : customer;
  }
}
