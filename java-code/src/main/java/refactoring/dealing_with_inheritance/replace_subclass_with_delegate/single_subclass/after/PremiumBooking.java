//8. PremiumBooking class is not needed

/*
package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.after;

import java.time.Instant;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PremiumBooking extends Booking {

  private Extras extras;
  public PremiumBooking(Accomodation show, Instant date, Extras extras) {
    super(show, date);

    this.extras = extras;
  }

  //4. Move hasTalkback to the delegate
  */
/*@Override
  public boolean hasTalkback() {
    return this.accomodation.isOwnPlace();
  }*//*


  //6. Move basePrice to the delegate
  */
/*@Override
  public double basePrice() {
    return Math.round(super.basePrice() + this.extras.getPremiumFee());
  }*//*


  //7. Move hasDinner method to the delegate
  */
/*public boolean hasDinner() {
    return this.extras.isDinnerIncluded() && !this.isPeakDay();
  }*//*

}
*/
