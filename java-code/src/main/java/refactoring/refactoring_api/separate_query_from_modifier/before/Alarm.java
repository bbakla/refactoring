package refactoring.refactoring_api.separate_query_from_modifier.before;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Alarm {

    public static void main(String[] args) {
      List<String> people = List.of("Alice", "Bob", "Don", "Eve", "John");
      var alarm = new Alarm();
      String alertedPerson = alarm.alertForMiscreant(people);
      if (!alertedPerson.isEmpty()) {
        log.info("Alert for: {}",  alertedPerson);
      } else {
        log.info("No alert triggered.");
      }
    }

    public String alertForMiscreant(List<String> people) {
      for (String p : people) {
        if ("Don".equals(p) || "John".equals(p)) {
          setOffAlarms();
          return p;
        }
      }
      return "";
    }

    public void setOffAlarms() {
      // Implement setOffAlarms logic if needed
    }

}
