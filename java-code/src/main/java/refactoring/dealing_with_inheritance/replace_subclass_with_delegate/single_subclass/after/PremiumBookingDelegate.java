package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.single_subclass.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//2. After isolating the constructors in the booking classes, I can now create the delegate

@Getter
@Setter
@AllArgsConstructor
public class PremiumBookingDelegate {

  private Booking host;
  private Extras extras;

  //4. Move overriding subclass method to the delegate
  public boolean hasTalkback() {
    return this.host.accomodation.isOwnPlace();
  }

  //6.1 Move base price to the delegate
  public double basePrice() {
    //6.3 No need to call rawBasePrice anymore
    return Math.round(host.basePrice() + this.extras.getPremiumFee());
    //return Math.round(host.rawBasePrice() + this.extras.getPremiumFee());
  }

  //6.2 Premium normally calls super class baseMethod. We make the way around now
  public double extendBasePrice(double basePrice) {
    return Math.round(basePrice + this.extras.getPremiumFee());
  }

  public boolean hasDinner() {
    return this.extras.isDinnerIncluded() && !this.host.isPeakDay();
  }

}
