package refactoring.encapsulation.replace_primitive_with_object.before;

import java.util.List;
import refactoring.encapsulation.replace_primitive_with_object.before.Order;

public class ReplacePrimiteWithObject_Before {

  public void doIt(List<Order> orders) {

    var highPriorityObjectCount = orders.stream().filter(o -> o.getPriority() == 1 || o.getPriority() == 2)
        .count();


  }
}
