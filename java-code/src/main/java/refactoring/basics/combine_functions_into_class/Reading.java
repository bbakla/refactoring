package refactoring.basics.combine_functions_into_class;

import java.io.Serializable;
import lombok.Data;

/**
 * reading = {customer: "ivan", quantity: 10, month: 5, year: 2017};
 */
@Data
public class Reading implements Serializable {
  private String customer;
  private Integer quantity;
  private Integer month;
  private Integer year;

  public int baseCharge() {
    return baseRate(this.month, this.year) * this.quantity;

  }

  public int taxableCharge() {
    return Math.max(0, baseCharge() - taxThreshold());
  }

  public int taxThreshold() {
    return 0;
  }

  private int baseRate(Integer month, Integer year) {
    return 0;
  }
}
