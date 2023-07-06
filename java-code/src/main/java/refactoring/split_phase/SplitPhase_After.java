package refactoring.split_phase;

public class SplitPhase_After {
  
  public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {

    //Step4: Move the pricing logic also to a separate method and let it return intermediate object
    PriceData priceData = calculatePricingData(product, quantity);

    return applyShipping(priceData, shippingMethod);
  }

  private PriceData calculatePricingData(Product product, int quantity) {
    double basePrice = product.getBasePrice() * quantity;
    double discount =
        Math.max(quantity - product.getDiscountThreshold(), 0)
            * product.getBasePrice()
            * product.getDiscountRate();

    // Step 2: Create an intermediate class
    // Step 3: Move the properties into this intermediate class
    return new PriceData(basePrice, quantity, discount);
  }

  // Step 1: Extract shipping Logic
  private double applyShipping(
      PriceData priceData, ShippingMethod shippingMethod) {
    double shippingPerCase =
        (priceData.getBasePrice() > shippingMethod.getDiscountThreshold())
            ? shippingMethod.getDiscountedFee()
            : shippingMethod.getFeePerCase();
    double shippingCost = priceData.getQuantity() * shippingPerCase;
    return priceData.getBasePrice() - priceData.getDiscount() + shippingCost;
  }
}
