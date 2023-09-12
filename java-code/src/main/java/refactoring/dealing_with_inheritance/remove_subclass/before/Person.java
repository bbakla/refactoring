package refactoring.dealing_with_inheritance.remove_subclass.before;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {
  private String name;

  public String genderCode() {
    return "X";
  }
}
