package refactoring.extract_function;

import lombok.extern.slf4j.Slf4j;
import refactoring.model.Invoice;
import refactoring.model.Order;

@Slf4j
public class ExtractFunction {

  public void printOwing(Invoice invoice) {
   var outstanding = 0;


   log.info("*************************");
   log.info("***** Customer Owes *****");
    log.info("*************************");

    // calculate outstanding
    for (Order order : invoice.getOrders()) {
      outstanding += order.getAmount();
    }

    // print details
    log.info("name: " + invoice.getCustomer());
    log.info("amount: " + outstanding);
    log.info("due: " + invoice.getDueDate());
  }

}
