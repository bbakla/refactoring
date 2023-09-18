package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.single_subclass.before;

import java.time.Instant;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PremiumBooking extends Booking{

  private Extras extras;
  public PremiumBooking(Accomodation show, Instant date, Extras extras) {
    super(show, date);

    this.extras = extras;
  }

  // Premium overrides the behavior of booking class
  @Override
  public boolean hasTalkback() {
    return this.accomodation.isOwnPlace();
  }

  // Premium overrides the behavior of booking class
  @Override
  public double basePrice() {
    return Math.round(super.basePrice() + this.extras.getPremiumFee());
  }

  //Base class doesnt have this method
  public boolean hasDinner() {
    return this.extras.isDinnerIncluded() && !this.isPeakDay();
  }
}
