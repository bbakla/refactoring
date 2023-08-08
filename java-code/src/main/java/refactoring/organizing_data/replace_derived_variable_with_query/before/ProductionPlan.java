package refactoring.organizing_data.replace_derived_variable_with_query.before;

import java.util.List;
import lombok.Getter;

public class ProductionPlan {

  @Getter
  private int production;
  private List<Adjustment> adjustments;


  //There is duplication here. Production data is duplicated
  public void applyAdjustment(Adjustment adjustment) {
    adjustments.add(adjustment);
    production += adjustment.getAmount();
  }
}

