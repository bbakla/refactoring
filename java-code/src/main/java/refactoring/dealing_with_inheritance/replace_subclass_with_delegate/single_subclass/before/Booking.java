package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.single_subclass.before;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Booking {
  protected Accomodation accomodation;
  private Instant date;

  public boolean isPeakDay() {
    //do some calculation
    return true;
  }

  public boolean hasTalkback() {
    return accomodation.isOwnPlace() && !this.isPeakDay();
  }

  public double basePrice() {
    var result = this.accomodation.getPrice();
    if(this.isPeakDay()) {
      result += Math.round(result * 0.15);
    }

    return result;
  }
}
