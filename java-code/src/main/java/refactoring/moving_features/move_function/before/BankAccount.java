package refactoring.moving_features.move_function.before;

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
      result += getOverdraftCharge();
    }
    return result;
  }


  public double getOverdraftCharge() {
    if (type.isPremium()) {
      double baseCharge = 10;
      if (daysOverdrawn <= 7) {
        return baseCharge;
      } else {
        return baseCharge + ((daysOverdrawn - 7) * 0.85);
      }
    } else {
      return daysOverdrawn * 1.75;
    }
    }
}
