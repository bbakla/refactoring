package refactoring.dealing_with_inheritance.replace_type_code_with_subclasses.after.direct_inheritance;

//2. Create an engineer class to separate logics and type
public class Engineer extends Employee{
  //Step 6.2. Move the type to the subclass
  private final String type;

  public Engineer(String name, String type) {
    super(name);

    this.type = "engineer";
  }

  @Override
  public String getType() {
    return type;
  }
}
