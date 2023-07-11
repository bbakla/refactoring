package refactoring.basics.inline_function;

import java.util.ArrayList;
import java.util.List;

public class InlineFunction_After {
  
  public List<String> reportLines1(Customer customer) {
    var lines = new ArrayList<String>();

    lines.add("name: " + customer.getName());
    lines.add("location: " + customer.getLocation());

    return lines;
  }
}
