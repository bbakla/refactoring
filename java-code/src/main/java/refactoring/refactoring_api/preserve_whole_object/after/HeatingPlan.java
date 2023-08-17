package refactoring.refactoring_api.preserve_whole_object.after;

import java.util.ArrayList;
import java.util.List;

public class HeatingPlan {
    public static void main(String[] args) {
      Room aRoom = new Room(new TemperatureRange(10, 25));
      Plan aPlan = new Plan(); // Instantiate a Plan

      //STEP 4: Unused variables are not needed anymore
      /*int low = aRoom.getDaysTempRange().getLow();
      int high = aRoom.getDaysTempRange().getHigh();*/

      //STEP 3: Call the new method from the client
      /*if (!aPlan.withinRange(low, high)) {*/
      if (!aPlan.withinRange(aRoom.getDaysTempRange())) {
        List<String> alerts = new ArrayList<>();
        alerts.add("room temperature went outside range");
      }
    }
}
