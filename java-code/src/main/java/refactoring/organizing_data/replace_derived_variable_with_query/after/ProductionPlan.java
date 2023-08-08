package refactoring.organizing_data.replace_derived_variable_with_query.after;

import java.util.List;
import lombok.Getter;

public class ProductionPlan {


  //STEP 2: As we calculate production in a method, we dont need production as variable anymore
  private List<Adjustment> adjustments;


  //STEP 1: Calculate production in a separate method
  public int getProduction() {
    return adjustments.stream().reduce(0, (sum, a) -> sum + a.getAmount(), Integer::sum);
  }
  public void applyAdjustment(Adjustment adjustment) {
    adjustments.add(adjustment);
  }
}

