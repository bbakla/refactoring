package refactoring.encapsulation.extract_class.after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
  private String name;

  //Step 1: Separate telephone number related logic

  //Step 4: Add new class an instance variable
  private TelephoneNumber telephoneNumber;

}

