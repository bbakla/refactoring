package refactoring.encapsulation.replace_temp_with_query.before;

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
    //basePrice and discountFactor are our temp variables
    var basePrice = this.quantity * this.item.getPrice();
    var discountFactor = 0.98;

    if(basePrice > 100) {
      discountFactor -= 0.03;
    }

    return basePrice * discountFactor;

  }
}
