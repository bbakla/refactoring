package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.single_subclass.after;

import java.time.Instant;

//1. Removing the subclass will change the client code, so I want to encapsulate constructor calls
public class BookingFactory {

  public static Booking createBooking(Accomodation accomodation, Instant time) {
    return new Booking(accomodation, time);
  }

  //2.1 Modify factory method of the premium booking.
  public static Booking createPremiumbooking(Accomodation accomodation, Instant time, Extras extras) {
    var booking =  new Booking(accomodation, time);
    booking.bePremium(extras);

    return booking;

  }

  /*public static PremiumBooking createPremiumbooking(Accomodation accomodation, Instant time, Extras extras) {
    return new PremiumBooking(accomodation, time, extras);
  }*/



}
