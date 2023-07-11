package refactoring.basics.split_phase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PriceData {
  double basePrice;
  int quantity;
  double discount;
}
