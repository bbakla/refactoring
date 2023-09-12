package refactoring.dealing_with_inheritance.replace_type_code_with_subclasses.after.direct_inheritance;

//8 Employee class can be now abstract
public abstract class Employee {
  private final String name;

  //6.1 Move the field to the subclass
  //private final String type;

  //Refactor of step 6. We have now a new constructor
  protected Employee(String name) {
    //7. We dont need the validation anymore as we moved the type to the subclass
    //validateType(type);
    this.name = name;
  }

  //3. Make the constructor protected
  /*protected Employee(String name, String type) {
    validateType(type);
    this.name = name;

    //6. We now made the type class subclass specific. We can remove the type from the superclass
    this.type = type;
  }*/

  //3.1 Create a factory method to return object based on the type
  public static Employee createEmployee(String name, String type) {
    switch (type) {
      case "engineer": return new Engineer(name, type);
      case "manager": return new Manager(name, type);
      case "salesman": return new Salesman(name, type);
    }

    //7.1 Throw exception for unknown types. We have now the validation here.
    throw  new IllegalArgumentException(String.format("Type %s is not known", type));
  }

  //1. Isolate the type
  //8.1 Make getType abstract
  public abstract String getType();

  /*public String getType() {
    return this.type;
  }*/

  //7.2 No need for explicit validation
  /*private void validateType(String arg) {
    if (!List.of("engineer", "manager", "salesman").contains(arg)) {
      throw new IllegalArgumentException("Employee cannot be of type " + arg);
    }
  }*/

  //8.2 Fix type related errors
  @Override
  public String toString() {
    return name + " (" + getType() + ")";
  }

}

