package refactoring.dealing_with_inheritance.remove_subclass.before;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Male extends Person {
  public Male(String name) {
    super(name);
  }

  public String genderCode() {
    return "M";
  }
}
