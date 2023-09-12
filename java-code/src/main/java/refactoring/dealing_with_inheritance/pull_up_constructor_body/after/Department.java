package refactoring.dealing_with_inheritance.pull_up_constructor_body.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department extends Party {
  private Staff staff;
  public Department(String name, Staff staff) {
    super(name);
    this.staff = staff;
  }

}
