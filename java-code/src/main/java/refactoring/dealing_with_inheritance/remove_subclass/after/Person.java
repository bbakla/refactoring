package refactoring.dealing_with_inheritance.remove_subclass.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {
  private String name;

  //1. Add gender code to the base class
  private GenderCode genderCode;

  //2. Create a factory method
  public Person createPerson(PersonData data) {
    switch (data.code()) {
      case Male -> {return new Person(data.name(), GenderCode.Male); }
      case Female -> {return new Person(data.name(), GenderCode.Female);}
      default -> { return new Person(data.name(), GenderCode.X);}

    }
  }

  //3. Change the gender code to enum. Lombok generates the getter automatically
  /*public String genderCode() {
    return "X";
  }*/
}
