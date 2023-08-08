package refactoring.organizing_data.change_value_to_reference.after;

import java.util.HashMap;
import java.util.Map;

//STEP1: Create a repository for customer so that we dont have to create customer with the same id
// all the time
public class CustomerRepository {
  private Map<String, Customer> customers = new HashMap<>();
  public Customer registerCustomer(String id) {
    if(customers.get(id) == null) {
      customers.put(id, new Customer(id));
    }

    return findCustomer(id);
  }

  public Customer findCustomer(String id) {
    return customers.get(id);
  }
}
