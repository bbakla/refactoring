package refactoring.moving_features.move_function.after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountType {
  private boolean isPremium;

  //STEP 1: Move overdraft settings seem to be part of AccountType setting as it depends on the
  //account type. Lets move it to AccountType class

  public double getOverdraftCharge(int daysOverdrawn) {
    if (this.isPremium()) {
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
