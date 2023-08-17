package refactoring.refactoring_api.replace_parameter_with_query.before;

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
    int discountLevel = (quantity > 100) ? 2 : 1;
    return discountedPrice(basePrice, discountLevel);
  }

  double discountedPrice(double basePrice, int discountLevel) {
    switch (discountLevel) {
      case 1:
        return basePrice * 0.95;
      case 2:
        return basePrice * 0.9;
      default:
        return basePrice;
    }
  }
}
