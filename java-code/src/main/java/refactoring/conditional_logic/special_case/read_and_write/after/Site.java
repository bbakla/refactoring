package refactoring.conditional_logic.special_case.read_and_write.after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Site {
  private Customer customer;

//STEP 3: Return unknown customer when it is null
  public Customer getCustomer() {
    if(customer == null) {
      customer = new UnknownCustomer();
    }
      return customer;
  }
}
