package refactoring.moving_features.move_field.after;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {
  private String name;
  private BigDecimal discountRate;
  private CustomerContract contract;

  public Customer(String name, BigDecimal discountRate) {
    this.name = name;
    this.discountRate = discountRate;
    this.contract = new CustomerContract(LocalDate.now());
  }

  public BigDecimal getDiscountRate() {
    return this.discountRate;
  }

  public void becomePreferred() {
    this.discountRate = this.discountRate.add(BigDecimal.valueOf(0.03));
    // other nice things
  }

  public BigDecimal applyDiscount(BigDecimal amount) {
    return amount.subtract(amount.multiply(this.discountRate));
  }
}
