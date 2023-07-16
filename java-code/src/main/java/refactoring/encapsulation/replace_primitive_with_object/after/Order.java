package refactoring.encapsulation.replace_primitive_with_object.after;

import lombok.Getter;


@Getter //Step3: Return priority directly
public class Order {
  //Step 1: Create a class for the property
  private Priority priority;

  //Step 2: Initialize the property using setter instead of a constructor
  public void setPriority(Integer priority) {
    if(priority == null) {
      this.priority = new Priority(priority);
    } else {
      this.priority.setPriority(priority);
    }

  }
}
