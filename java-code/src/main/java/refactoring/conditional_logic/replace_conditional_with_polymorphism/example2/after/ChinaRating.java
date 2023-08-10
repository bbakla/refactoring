package refactoring.conditional_logic.replace_conditional_with_polymorphism.example2.after;

import java.util.List;

// STEP 7: Create ChinaRating class that has a different behavior than normal
public class ChinaRating extends Rating {

  public ChinaRating(Voyage voyage, List<History> history) {
    super(voyage, history);
  }

  @Override
  public double captainHistoryRisk() {

    // Since we are in the ChinaRating class anyway, no need for the if check
    var result = super.captainHistoryRisk() - 2;

    return Math.max(result, 0);
  }

  @Override
  public double voyageProfitFactor() {
    var result = 6;
    result += historyLengthFactor();
    result += voyageLengthFactor();

    return result;
  }

  private int historyLengthFactor() {
    if (history.size() > 10) {
      return 1;
    }
    return 0;
  }

  private int voyageLengthFactor() {
    var result = 0;
    if (voyage.getLength() > 12) {
      result = 1;
    }

    if (voyage.getLength() > 18) {
      result -= 1;
    }
    return result;
  }
}
