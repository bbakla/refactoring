package refactoring.basics.combine_functions_into_transform;

import java.io.Serializable;
import lombok.Data;

/**
 * reading = {customer: "ivan", quantity: 10, month: 5, year: 2017};
 */
@Data
public class TeaConsumption implements Serializable {
  private String customer;
  private Integer quantity;
  private Integer month;
  private Integer year;
  private Integer baseCharge;
  private Integer taxableCharge;

  public int taxableCharge() {
    return Math.max(0, baseCharge - taxThreshold());
  }

  public int taxThreshold() {
    return 0;
  }

  private int baseRate(Integer month, Integer year) {
    return 0;
  }
}
