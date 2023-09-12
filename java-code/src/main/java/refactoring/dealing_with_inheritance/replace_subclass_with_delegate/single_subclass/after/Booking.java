package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.single_subclass.after;

import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Booking {
  protected Accomodation accomodation;
  private Instant date;

  // 3.0. Add premium delegation as instance variable
  private PremiumBookingDelegate premiumBookingDelegate;

  public Booking(Accomodation accomodation, Instant date) {
    this.accomodation = accomodation;
    this.date = date;
  }

  public boolean isPeakDay() {
    // do some calculation
    return true;
  }

  // 3.1 Add premium delegation to transform the booking into premium
  protected void bePremium(Extras extras) {
    this.premiumBookingDelegate = new PremiumBookingDelegate(this, extras);
  }

  //5. Adapt booking method to react if it is transformed to premium
  public boolean hasTalkback() {
    return this.premiumBookingDelegate != null
        ? this.premiumBookingDelegate.hasTalkback()
        : (accomodation.isOwnPlace() && !this.isPeakDay());
  }

  //6. Adapt basePrice method
  public double basePrice() {
    var  basePrice = rawBasePrice();

    if(this.premiumBookingDelegate != null) {
      return this.premiumBookingDelegate.extendBasePrice(basePrice);
    }

    return basePrice;
  }

  //7. Implement hasDinner also for booking
  public boolean hasDinner() {
    return this.premiumBookingDelegate != null && this.premiumBookingDelegate.hasDinner();
  }

  //6.4 Make basePrice private
  private double rawBasePrice() {
    var result = this.accomodation.getPrice();
    if (this.isPeakDay()) {
      result += Math.round(result * 0.15);
    }
    return result;
  }

}
