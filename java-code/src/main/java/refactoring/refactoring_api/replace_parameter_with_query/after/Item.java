package refactoring.refactoring_api.replace_parameter_with_query.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class Item {

  int quantity;
  double itemPrice;

  public static void main(String[] args) {
    Item anItem = new Item(120, 10.0);
    double finalPrice = anItem.finalPrice();
    log.info("Final Price: {}", finalPrice);
  }

  double finalPrice() {
    double basePrice = quantity * itemPrice;
    //STEP 4: Calculation of discount level here is not necessary anymore
    //int discountLevel = (quantity > 100) ? 2 : 1;
    return discountedPrice(basePrice);
  }


  //double discountedPrice(double basePrice, int discountLevel) {
  //STEP 3: We dont need discountLevel in the signature anymore
  double discountedPrice(double basePrice) {
    // switch (discountLevel) {
    //STEP 2: Calculate discountLevel using the method
    switch (discountLevel()) {
      case 1:
        return basePrice * 0.95;
      case 2:
        return basePrice * 0.9;
      default:
        return basePrice;
    }
  }

  //STEP 1: Extract discountLevel calculation
  int discountLevel() {
    return quantity > 100 ? 2 : 1;
  }
}
