package refactoring.organizing_data.change_reference_to_value.before;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Person {
  private TelephoneNumber telephoneNumber;

  public String getOfficeAreaCode() {
    return this.telephoneNumber.getAreaCode();
  }

  public void setOfficeAreaCode(String arg) {
    this.telephoneNumber.setAreaCode(arg);
  }

  public String getOfficeNumber() {
    return this.telephoneNumber.getNumber();
  }

  public void setOfficeNumber(String arg) {
    this.telephoneNumber.setNumber(arg);
  }


}

