package refactoring.dealing_with_inheritance.replace_type_code_with_subclasses.after.direct_inheritance;

public class Main {
  public static void main(String[] args) {
    //9. Fix client code
    Employee employee = Employee.createEmployee("John", "engineer");
    System.out.println(employee.toString());
  }
}
