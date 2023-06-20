package refactoring.inline_function;

import java.util.ArrayList;
import java.util.List;

public class InlineFunction {

  public List<String> reportLines(Customer customer) {
    var lines = new ArrayList<String>();

    gatherCustomerData(lines, customer);

    return lines;
  }

  private void gatherCustomerData(ArrayList<String> lines, Customer customer) {
    lines.add("name: " + customer.getName());
    lines.add("location: " + customer.getLocation());
  }

}
