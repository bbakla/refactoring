package refactoring.dealing_with_inheritance.replace_type_code_with_subclasses.before;

import java.util.List;

public class Employee {
  private final String name;
  private final String type;

  public Employee(String name, String type) {
    validateType(type);
    this.name = name;
    this.type = type;
  }

  //The class seems to be overused here
  private void validateType(String arg) {
    if (!List.of("engineer", "manager", "salesman").contains(arg)) {
      throw new IllegalArgumentException("Employee cannot be of type " + arg);
    }
  }

  @Override
  public String toString() {
    return name + " (" + type + ")";
  }
}

