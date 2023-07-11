package refactoring.basics.introduce_parameter_object;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NumberRange {

  private int min;
  private int max;

  public boolean includes(int arg) {
    return arg >= min && arg <= max;
  }
}
