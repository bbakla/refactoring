package refactoring.refactoring_api.remove_argument_flag.after;


import java.time.LocalDate;
import java.util.Arrays;

public class Order {

  String deliveryState;
  LocalDate placedOn;

    public static void main(String[] args) {
      var order = new Order();

      //STEP 2: Call methods without argument flag
      var rushDeliveryDate = order.rushDeliveryDate();
      var regularDeliveryDate = order.regularDeliveryDate();
    }

    //STEP 1: Apply decompose conditional
    //STEP 3: I dont need deliveryDate method anymore
    public LocalDate deliveryDate(boolean isRush) {
      if (isRush) {
        return rushDeliveryDate();
      } else {
        return regularDeliveryDate();
      }
    }

  public LocalDate regularDeliveryDate() {
    int deliveryTime;
    if (Arrays.asList("MA", "CT", "NY").contains(this.deliveryState)) {
      deliveryTime = 2;
    } else if (Arrays.asList("ME", "NH").contains(this.deliveryState)) {
      deliveryTime = 3;
    } else {
      deliveryTime = 4;
    }
    return this.placedOn.plusDays(2 + deliveryTime);
  }

  public LocalDate rushDeliveryDate() {
    int deliveryTime;
    if (Arrays.asList("MA", "CT").contains(this.deliveryState)) {
      deliveryTime = 1;
    } else if (Arrays.asList("NY", "NH").contains(this.deliveryState)) {
      deliveryTime = 2;
    } else {
      deliveryTime = 3;
    }
    return this.placedOn.plusDays(1 + deliveryTime);
  }
}
