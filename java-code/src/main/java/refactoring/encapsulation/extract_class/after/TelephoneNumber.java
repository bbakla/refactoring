package refactoring.encapsulation.extract_class.after;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//STEP 2: Create Telephone number class
@Getter
@Setter
@ToString
public class TelephoneNumber {
  private String number;

  //Step3: Move telephone number related fields to this class
  private int officeAreaCode;
  private int officeNumber;

  public String getNumber() {

    return this.officeAreaCode
        + " "
        + this.officeNumber
        + " "
        + this.number;
  }

}
