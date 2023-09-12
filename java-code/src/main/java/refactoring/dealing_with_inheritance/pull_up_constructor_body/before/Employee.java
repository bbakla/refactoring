package refactoring.dealing_with_inheritance.pull_up_constructor_body.before;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {

  private String id;
  private String name;
  private double monthlyCost;
}
