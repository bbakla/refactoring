package refactoring.introduce_parameter_object;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IntroduceParameterObject {

  public void readingsOutsideRange(Station station, int min, int max) {
    station.getReadings().stream()
        .filter(r -> r.getTemp() < min || r.getTemp() > max)
        .forEach(r -> log.info("Reading outside range: " + r.getTemp()));
  }
}



