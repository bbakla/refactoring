package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.single_subclass.before;

import java.time.Instant;

public class Client {
  public static void main(String[] args){
    var accomodation = new Accomodation(true, 2.4);
    var booking = new Booking(accomodation, Instant.now());

    var extras = new Extras(true, 20);
    var premium = new PremiumBooking(accomodation, Instant.now(), extras);
  }
}
