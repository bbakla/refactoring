package refactoring.conditional_logic.special_case.read_and_write.after;

import lombok.Getter;
import lombok.Setter;

//Step 5: Create a NullPaymentHistory as Client 4 sets it
/*
The general rule with a specialcase object is that if it needs to return related objects,
they are usually special cases themselves. So here I need to create a null payment history.
 */
@Getter
@Setter
public class NullPaymentHistory extends PaymentHistory{
  public NullPaymentHistory() {
    this.weekDelinquentInLastYear = 0;
  }
}
