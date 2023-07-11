package refactoring.encapsulation.encapsulate_collection.before;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
  private String name;

  //Is not properly encapsulated. The collection can be changed or updated using set method
  private List<Course> courseList;
}
