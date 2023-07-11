package refactoring.basics.extract_variable;

import refactoring.basics.model.Order;

public class ExtractVariable_After {

  /**
   * This method can actually be moved to order class as a method as all the
   * variables are from order class.
   */
  public double price(Order order) {
    final double basePrice = order.getQuantity() * order.getItemPrice();
    final double quantityDiscount = Math.max(0, order.getQuantity() - 500) * 0.05;
    final double shipping = Math.min(basePrice * 0.1, 100);

    return basePrice - quantityDiscount + shipping;
  }
}
