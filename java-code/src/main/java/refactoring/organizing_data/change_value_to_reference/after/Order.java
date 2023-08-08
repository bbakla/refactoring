package refactoring.organizing_data.change_value_to_reference.after;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class Order {
  private final Customer customer;
  private final CustomerRepository customerRegistry;

  public Order(CustomerRepository customerRegistry, Object data) {
    this.customerRegistry = customerRegistry;
    String id = null; //It comes from data objet
    this.customer = customerRegistry.registerCustomer(id);
  }
}
