package refactoring.encapsulation.replace_primitive_with_object.after;

import java.util.List;
import refactoring.encapsulation.replace_primitive_with_object.after.Order;

public class ReplacePrimiteWithObject_After {

  public void doIt(List<Order> orders) {

    var highPriorityObjectCount = orders.stream()
        .filter(o -> o.getPriority().higherThan(2))
        .count();
  }
}
