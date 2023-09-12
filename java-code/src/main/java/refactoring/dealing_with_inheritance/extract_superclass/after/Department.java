package refactoring.dealing_with_inheritance.extract_superclass.after;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

//2. Extend the baseclass
@Getter
@Setter
public class Department extends Party {
  private List<Employee> staff;

  public Department(String name, List<Employee> staff) {
    super(name);
    this.staff = staff;
  }

  public List<Employee> getStaff() {
    return List.copyOf(staff);
  }

  //4. Rename the function to see it clearly that it has a similar field in Employee
  /*public double getTotalMonthlyCost() {
    return staff.stream()
        .mapToDouble(Employee::getMonthlyCost)
        .sum();
  }*/

  public double getMonthlyCost() {
    return staff.stream()
        .mapToDouble(Employee::getMonthlyCost)
        .sum();
  }

  public int getHeadCount() {
    return staff.size();
  }

  //4. Rename the function to see it clearly that it has a similar field in Employee
  /*public double getTotalAnnualCost() {
    return getMonthlyCost() * 12;
  }*/

  //5.1. This can go to the base class as it is the same with Department
  /*public double getAnnualCost() {
    return getMonthlyCost() * 12;
  }*/
}
