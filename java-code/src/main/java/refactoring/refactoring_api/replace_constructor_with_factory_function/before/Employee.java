package refactoring.refactoring_api.replace_constructor_with_factory_function.before;

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

  public String getType() {
    return this.typeCode.type;
  }

  public static void main(String[] args){
   var e = new Employee("a", TypeCode.E);
    System.out.println(e.getType());
  }

}

