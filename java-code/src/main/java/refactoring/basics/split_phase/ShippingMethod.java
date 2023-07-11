package refactoring.basics.split_phase;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShippingMethod {
  private int discountThreshold;
  private double discountedFee;
  private double feePerCase;
}
