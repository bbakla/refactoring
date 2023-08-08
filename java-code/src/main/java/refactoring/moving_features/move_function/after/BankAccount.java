package refactoring.moving_features.move_function.after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount {
  private int daysOverdrawn;
  private AccountType type;

  public double getBankCharge() {
    double result = 4.5;
    if (daysOverdrawn > 0) {
      result += this.type.getOverdraftCharge(this.daysOverdrawn);
    }
    return result;
  }
}
