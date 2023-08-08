package refactoring.conditional_logic.replace_nested_with_guard_clause.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PaymentResult {
  private double amount;
  private String reasonCode;

}
