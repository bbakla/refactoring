package refactoring.dealing_with_inheritance.replace_type_code_with_subclasses.after.direct_inheritance;

//5. Create Manager which has another type
public class Manager extends Employee{
  //Step 6.2. Move the type to the subclass
  private final String type;
  protected Manager(String name, String type) {
    super(name);
    this.type = "manager";
  }

  @Override
  public String getType() {
    return type;
  }
}
