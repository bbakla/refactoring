package refactoring.dealing_with_inheritance.extract_superclass.before;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*
There are common fields with employee.
 */
@Getter
@Setter
@AllArgsConstructor
public class Department {
  private String name;
  private List<Employee> staff;
  public List<Employee> getStaff() {
    return List.copyOf(staff);
  }

  public double getTotalMonthlyCost() {
    return staff.stream()
        .mapToDouble(Employee::getMonthlyCost)
        .sum();
  }

  public int getHeadCount() {
    return staff.size();
  }

  public double getTotalAnnualCost() {
    return getTotalMonthlyCost() * 12;
  }
}
