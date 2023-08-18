package refactoring.refactoring_api.replace_query_with_parameter.before;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HeatingPlan {
  int min, max;
  Thermostat thermostat;

  int getTargetTemperature() {
    if (thermostat.currentTemperature > max) {
      return max;
    } else if (thermostat.currentTemperature < min) {
      return min;
    } else {
      return thermostat.currentTemperature;
    }
  }
}


