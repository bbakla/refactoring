package refactoring.dealing_with_inheritance.extract_superclass.before;

import java.util.List;

public class Client {
  public static void main(String[] args) {
    Employee employee1 = new Employee("John", "001", 5000);
    Employee employee2 = new Employee("Alice", "002", 6000);
    Employee employee3 = new Employee("Bob", "003", 5500);

    Department department = new Department("Engineering", List.of(employee1, employee2, employee3));

    System.out.println("Department Name: " + department.getName());
    System.out.println("Total Monthly Cost: " + department.getTotalMonthlyCost());
    System.out.println("Head Count: " + department.getHeadCount());
    System.out.println("Total Annual Cost: " + department.getTotalAnnualCost());
  }
  }
