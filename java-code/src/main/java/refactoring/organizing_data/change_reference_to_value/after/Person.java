package refactoring.organizing_data.change_reference_to_value.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * After step3 our telephoneNumber object is immutable
 */
@Setter
@Getter
@AllArgsConstructor
public class Person {
  private TelephoneNumber telephoneNumber;

  public String getOfficeAreaCode() {
    return this.telephoneNumber.getAreaCode();
  }

  public void setOfficeAreaCode(String areaCode) {
    //STEP 2: Create new Object for each setting
    this.telephoneNumber = new TelephoneNumber(areaCode, this.telephoneNumber.getNumber());

  }

  public String getOfficeNumber() {
    return this.telephoneNumber.getNumber();
  }

  public void setOfficeNumber(String number) {
    //STEP 3: Create new Object for each setting
    this.telephoneNumber = new TelephoneNumber(this.telephoneNumber.getAreaCode(), number);
  }


}

