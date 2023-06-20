package refactoring.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {

  private int amount;
  private int quantity;
  private int itemPrice;

  //was taken to Order class as a result of extract variable refactoring
  public double price() {
    return this.basePrice() - quantityDiscount() + getShipping();
  }

  private double getShipping() {
    return Math.min(this.basePrice() * 0.1, 100);
  }

  private double quantityDiscount() {
    return Math.max(0, this.quantity - 500) * 0.05;
  }

  private int basePrice() {
    return this.quantity * this.itemPrice;
  }
}
