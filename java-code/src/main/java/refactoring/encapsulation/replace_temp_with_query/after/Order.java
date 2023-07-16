package refactoring.encapsulation.replace_temp_with_query.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
  private int quantity;
  private Item item;

  public double getPrice() {

    //STEP 4: inline also discount factor
    return basePrice() * getDiscountFactor();

  }

  //STEP 3: Apply the same extraction to the other temp discountFactor
  private double getDiscountFactor() {
    var discountFactor = 0.98;

    //STEP 2: Inline basePrice method as it always returns the same result
    if(basePrice() > 100) {
      discountFactor -= 0.03;
    }
    return discountFactor;
  }

  //STEP 1: Extract basePrice to a method
  private double basePrice() {
    return this.quantity * this.item.getPrice();
  }
}
