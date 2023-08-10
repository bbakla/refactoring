package refactoring.conditional_logic.replace_conditional_with_polymorphism.example2.before;

import java.util.List;
public class RatingFunctions {

  /**
   * Combines the risk&profit calculations to five overall rating for the voyage
   */
  public String rating(Voyage voyage, List<History> history) {
    double vpf = voyageProfitFactor(voyage, history);
    double vr = voyageRisk(voyage);
    double chr = captainHistoryRisk(voyage, history);

    if (vpf * 3 > (vr + chr * 2)) {
      return "A";
    } else {
      return "B";
    }
  }

  private double voyageRisk(Voyage voyage) {
    double result = 1;
    if (voyage.getLength() > 4) {
      result += 2;
    }
    if (voyage.getLength() > 8) {
      result += Math.max(voyage.getLength() - 8, 0);
    }
    if (List.of("china", "eastindies").contains(voyage.getZone())) {
      result += 4;
    }
    return Math.max(result, 0);
  }

  private double captainHistoryRisk(Voyage voyage, List<History> history) {
    double result = 1;
    if (history.size() < 5) {
      result += 4;
    }
    result += history.stream().filter(v -> v.getProfit() < 0).count();
    if ("china".equals(voyage.getZone()) && hasChina(history)) {
      result -= 2;
    }
    return Math.max(result, 0);
  }

  private boolean hasChina(List<History> history) {
    return history.stream().anyMatch(v -> "china".equals(v.getZone()));
  }

  private double voyageProfitFactor(Voyage voyage, List<History> history) {
    double result = 2;
    if ("china".equals(voyage.getZone())) {
      result += 1;
    }
    if ("eastindies".equals(voyage.getZone())) {
      result += 1;
    }
    if ("china".equals(voyage.getZone()) && hasChina(history)) {
      result += 3;
      if (history.size() > 10) {
        result += 1;
      }
      if (voyage.getLength() > 12) {
        result += 1;
      }
      if (voyage.getLength() > 18) {
        result -= 1;
      }
    } else {
      if (history.size() > 8) {
        result += 1;
      }
      if (voyage.getLength() > 14) {
        result -= 1;
      }
    }
    return result;
  }
}

