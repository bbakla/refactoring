package refactoring.moving_features.move_field.before;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Move field: We decided that discountRate belongs to Customer Contract.
 */
public class Customer {
  private String name;

  private CustomerContract contract;

  public Customer(String name, BigDecimal discountRate) {
    this.name = name;
    this.contract = new CustomerContract(LocalDate.now(), discountRate);
  }

  public void addDiscountRate(BigDecimal newValue) {
    this.contract.setDiscountRate(this.contract.getDiscountRate().add(newValue));
  }

  public void becomePreferred() {
     this.addDiscountRate(BigDecimal.valueOf(0.03));

  }

  public BigDecimal discountRate() {
    return this.contract.getDiscountRate();
  }

  public BigDecimal applyDiscount(BigDecimal amount) {
    return amount.subtract(amount.multiply(this.discountRate()));
  }
}
