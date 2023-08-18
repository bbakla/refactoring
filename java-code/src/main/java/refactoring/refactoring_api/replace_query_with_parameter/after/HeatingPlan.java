package refactoring.refactoring_api.replace_query_with_parameter.after;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HeatingPlan {
  int min, max;
  //STEP 6: Dependency to the Thermostat is not necessary anymore
  //Thermostat thermostat;

 //STEP 4: Old method is not needed anymore
  /*public int getTargetTemperature() {
    //STEP 1: Inline currentTemperature variable
    var currentTemp = thermostat.getCurrentTemperature();
    //STEP 2: Create a new method that takes the currentTemp as a parameter
    return new_TargetTemperature(currentTemp);
  }*/

  //STEP 5: Rename the new method
  public int targetTemperature(int currentTemp) {
    if (currentTemp > max) {
      return max;
    } else if (currentTemp < min) {
      return min;
    } else {
      return currentTemp;
    }
  }
}


