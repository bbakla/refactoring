package refactoring.split_phase;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
  private double basePrice;
  private int discountThreshold;
  private double discountRate;
}
