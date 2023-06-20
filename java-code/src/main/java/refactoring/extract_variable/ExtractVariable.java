package refactoring.extract_variable;

import refactoring.model.Order;

public class ExtractVariable {

  public double price(Order order) {
    //price = base price - quantity discount + shipping
    return order.getQuantity() * order.getItemPrice() -
        Math.max(0, order.getQuantity() - 500) * 0.05 +
        Math.min(order.getQuantity() * order.getItemPrice()* 0.1, 100);
  }
}
