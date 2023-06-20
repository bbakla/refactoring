package refactoring.extract_function;

import lombok.extern.slf4j.Slf4j;
import refactoring.model.Invoice;
import refactoring.model.Order;

@Slf4j
public class ExtractFunction_After {

  public void printOwing(Invoice invoice) {

    printBanner();
    var outstanding = calculateOutstanding(invoice);
    printDetails(invoice, outstanding);
  }

  private static int calculateOutstanding(Invoice invoice) {
    var outstanding = 0;

    for (Order order : invoice.getOrders()) {
      outstanding += order.getAmount();
    }
    return outstanding;
  }

  private static void printDetails(Invoice invoice, int outstanding) {
    // print details
    log.info("name: " + invoice.getCustomer());
    log.info("amount: " + outstanding);
    log.info("due: " + invoice.getDueDate());
  }

  void printBanner() {
    log.info("*************************");
    log.info("***** Customer Owes *****");
    log.info("*************************");
  }
}
