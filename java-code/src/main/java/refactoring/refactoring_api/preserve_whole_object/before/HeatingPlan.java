package refactoring.refactoring_api.preserve_whole_object.before;

import java.util.ArrayList;
import java.util.List;
public class HeatingPlan {
    public static void main(String[] args) {
      Room aRoom = new Room(new TemperatureRange(10, 25));
      Plan aPlan = new Plan(); // Instantiate a Plan

      int low = aRoom.getDaysTempRange().getLow();
      int high = aRoom.getDaysTempRange().getHigh();

      if (!aPlan.withinRange(low, high)) {
        List<String> alerts = new ArrayList<>();
        alerts.add("room temperature went outside range");
      }
    }
}
