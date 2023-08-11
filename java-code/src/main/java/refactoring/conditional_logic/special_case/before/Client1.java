package refactoring.conditional_logic.special_case.before;

public class Client1 {
  //Client has to deal with null customer
  public String getName(Site site) {
    var customer = site.getCustomer();

    String customerName;
    if(customer == null) {
      customerName = "occupant";
    } else {
      customerName = customer.getName();
    }

    return customerName;
  }
}
