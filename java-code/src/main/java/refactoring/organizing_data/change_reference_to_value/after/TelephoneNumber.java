package refactoring.organizing_data.change_reference_to_value.after;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
//STEP 1: Lets make TelephoneNumber immutable (Remove Setting Method)
@AllArgsConstructor
public class TelephoneNumber {
  private String areaCode;
  private String number;
}
