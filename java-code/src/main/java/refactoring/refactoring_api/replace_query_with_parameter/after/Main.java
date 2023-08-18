package refactoring.refactoring_api.replace_query_with_parameter.after;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
  public static void main(String[] args) {
    Thermostat thermostat = new Thermostat(10);
    HeatingPlan thePlan = new HeatingPlan(20, 10, thermostat);

    // STEP 3: Get the target temperature using the new method
    int targetTemperature = thePlan.targetTemperature(thermostat.getCurrentTemperature());

    log.info("Target Temperature: {} ", targetTemperature);

    if (targetTemperature > thermostat.getCurrentTemperature()) {
      setToHeat();
    } else if (targetTemperature < thermostat.getCurrentTemperature()) {
      setToCool();
    } else {
      setOff();
    }
  }

  private static void setToCool() {}

  private static void setOff() {}

  private static void setToHeat() {}
}
