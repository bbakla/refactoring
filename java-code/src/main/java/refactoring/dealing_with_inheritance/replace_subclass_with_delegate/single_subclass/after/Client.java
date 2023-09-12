package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.single_subclass.after;

import static refactoring.dealing_with_inheritance.replace_subclass_with_delegate.single_subclass.after.BookingFactory.createBooking;
import static refactoring.dealing_with_inheritance.replace_subclass_with_delegate.single_subclass.after.BookingFactory.createPremiumbooking;

import java.time.Instant;

public class Client {
  public static void main(String[] args){
    var accomodation = new Accomodation(true, 2.4);
    //1.1 use factory method
    var booking = createBooking(accomodation, Instant.now());

    var extras = new Extras(true, 20);
    //1.2 use factory method
    var premium = createPremiumbooking(accomodation, Instant.now(), extras);
  }
}
