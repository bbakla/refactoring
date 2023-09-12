package refactoring.dealing_with_inheritance.replace_type_code_with_subclasses.before;

public class Main {
  public static void main(String[] args) {
    Employee employee = new Employee("John", "engineer");
    System.out.println(employee.toString());
  }
}
