package refactoring.refactoring_api.preserve_whole_object.before;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Plan {

  private TemperatureRange temperatureRange;

    boolean withinRange(int bottom, int top) {
      return (bottom >= temperatureRange.getLow()) && (top <= temperatureRange.getHigh());
    }
}
