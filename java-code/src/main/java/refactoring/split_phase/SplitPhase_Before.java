package refactoring.split_phase;

public class SplitPhase_Before {

  /**
   * There are two things happening here:
   * <ul>
   *   <li>First part calculates the price of the product and</li>
   *   <li>Second part calculates the shipping cost</li>
   * </ul>
   *
   */
  public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
    double basePrice = product.getBasePrice() * quantity;
    double discount = Math.max(quantity - product.getDiscountThreshold(), 0) * product.getBasePrice() * product.getDiscountRate();
    double shippingPerCase = (basePrice > shippingMethod.getDiscountThreshold()) ? shippingMethod.getDiscountedFee() : shippingMethod.getFeePerCase();
    double shippingCost = quantity * shippingPerCase;
    double price = basePrice - discount + shippingCost;

    return price;
  }

}
