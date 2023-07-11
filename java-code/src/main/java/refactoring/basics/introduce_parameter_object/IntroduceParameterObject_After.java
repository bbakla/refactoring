package refactoring.basics.introduce_parameter_object;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IntroduceParameterObject_After {

  public void readingsOutsideRange(Station station, NumberRange range) {
    station.getReadings().stream()
        .filter(r -> !range.includes(r.getTemp()))
        .forEach(r -> log.info("Reading outside range: " + r.getTemp()));
  }
}



