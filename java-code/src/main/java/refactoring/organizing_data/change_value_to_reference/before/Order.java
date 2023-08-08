package refactoring.organizing_data.change_value_to_reference.before;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Order {
  private Customer customer;

  //We create customer each time we create an order. However, several orders can belong to one customer
  public Order(Object data) {
    this.customer = new Customer(null); //customerId comes from the data object
  }
}
