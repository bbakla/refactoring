package refactoring.dealing_with_inheritance.pull_up_constructor_body.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee extends Party{

  private String id;
  private String name;
  private double monthlyCost;

  public Employee(String id, String name, double monthlyCost) {
    super(name);

    this.id = id;
    this.monthlyCost = monthlyCost;


  }
}
