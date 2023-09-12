package refactoring.dealing_with_inheritance.replace_type_code_with_subclasses.after.direct_inheritance;

//4. Create Salesman which has another type
public class Salesman extends Employee{
  //Step 6.2. Move the type to the subclass
  private final String type;

  protected Salesman(String name, String type) {
    super(name);
    this.type = "salesman";
  }

  @Override
  public String getType() {
    return type;
  }
}
