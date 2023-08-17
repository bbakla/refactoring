package refactoring.refactoring_api.preserve_whole_object.after;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Plan {
  private TemperatureRange temperatureRange;

  //STEP 1: Create a new withinRange method with TemparatureRange signature
  boolean withinRange(TemperatureRange range) {
    //STEP 2: Call directly the existing method
    //return withinRange(range.getLow(), range.getHigh());

    //STEP 5: Inline old withinRange method
    return (range.getLow() >= temperatureRange.getLow()) && (range.getLow() <= temperatureRange.getHigh());
  }

  //STEP 6: We dont need the old method anymore
  /*boolean withinRange(int bottom, int top) {
      return (bottom >= temperatureRange.getLow()) && (top <= temperatureRange.getHigh());
    }*/
}
