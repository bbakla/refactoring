package refactoring.refactoring_api.remove_argument_flag.before;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Order {

  String deliveryState;
  LocalDate placedOn;

    public static void main(String[] args) {
      var order = new Order();

      var rushDeliveryDate = order.deliveryDate( true);
      var regularDeliveryDate = order.deliveryDate( false);
    }

    public LocalDate deliveryDate(boolean isRush) {
      int deliveryTime;
      if (isRush) {
        if (Arrays.asList("MA", "CT").contains(this.deliveryState)) {
          deliveryTime = 1;
        } else if (Arrays.asList("NY", "NH").contains(this.deliveryState)) {
          deliveryTime = 2;
        } else {
          deliveryTime = 3;
        }
        return this.placedOn.plusDays(1 + deliveryTime);
      } else {
        if (Arrays.asList("MA", "CT", "NY").contains(this.deliveryState)) {
          deliveryTime = 2;
        } else if (Arrays.asList("ME", "NH").contains(this.deliveryState)) {
          deliveryTime = 3;
        } else {
          deliveryTime = 4;
        }
        return this.placedOn.plusDays(2 + deliveryTime);
      }
    }
  }
