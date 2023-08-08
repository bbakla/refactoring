package refactoring.organizing_data.change_reference_to_value.before;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TelephoneNumber {
  private String areaCode;
  private String number;
}
