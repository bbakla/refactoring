package refactoring.refactoring_api.replace_constructor_with_factory_function.after;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  private String name;

  @Getter(AccessLevel.NONE)
  private TypeCode typeCode;

  //STEP 1: Lets create the factory method
  public static Employee createEmployee(String name, TypeCode typeCode) {
    return new Employee(name, typeCode);
  }

  //STEP 3: To remove the smell and remove the parameter list of factory method, lets define
  //another factory method
  public static Employee createEngineer(String name) {
    return createEmployee(name, TypeCode.E);
  }

  public String getType() {
    return this.typeCode.name();
  }



  public static void main(String[] args){

    //STEP 2: Change the caller code and call factory method
   //var e = new Employee("a", TypeCode.E);

    //Step 4: Call the factory method for engineed
    //var e = Employee.createEmployee("a", TypeCode.E); //Passing a literal string is a smell

    var e = Employee.createEngineer("a");
    System.out.println(e.getType());
  }

}

