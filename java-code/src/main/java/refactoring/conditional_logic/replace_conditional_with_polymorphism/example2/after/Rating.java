package refactoring.conditional_logic.replace_conditional_with_polymorphism.example2.after;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//STEP 1: Create a Rating class to group similar methods in a class block
@Getter
@Setter
@AllArgsConstructor
public class Rating {

  //STEP 7.1: Make variables protected so that they could be used by the subclasses
  protected Voyage voyage;
  protected List<History> history;

  //STEP 2: Refactor rating methods as the attributes are part of the class
  public String rating() {

    double vpf = voyageProfitFactor();
    double vr = voyageRisk();
    double chr = captainHistoryRisk();

    if (vpf * 3 > (vr + chr * 2)) {
      return "A";
    } else {
      return "B";
    }
  }


  //STEP 3: Refactor rating methods as the attributes are part of the class
  public double voyageRisk() {
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

  //STEP 4: Refactor rating methods as the attributes are part of the class
  public double captainHistoryRisk() {
    double result = 1;
    if (history.size() < 5) {
      result += 4;
    }
    result += history.stream().filter(v -> v.getProfit() < 0).count();
   //STEP 10: Move china logic to ChinaRating class
    return Math.max(result, 0);
  }


  //STEP 5: Refactor rating methods as the attributes are part of the class
  public double voyageProfitFactor() {
    double result = 2;

    if ("eastindies".equals(voyage.getZone())) {
      result += 1;
    }
    //STEP 11: Extract china logic to ChinaRating class
    //STEP 12: Extract else logic to a different method
      result += getHistoryLengthFactor();
      result += getVoyageLengthFactor();

    return result;
  }

  private double getHistoryLengthFactor() {
    return history.size() > 8 ? 1: 0;
  }

  private double getVoyageLengthFactor() {
    return history.size() > 14 ? -1: 0;
  }
}
