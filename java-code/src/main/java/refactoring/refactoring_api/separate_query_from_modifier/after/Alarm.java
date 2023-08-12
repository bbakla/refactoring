package refactoring.refactoring_api.separate_query_from_modifier.after;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Alarm {

    public static void main(String[] args) {
      List<String> people = List.of("Alice", "Bob", "Don", "Eve", "John");
      var alarm = new Alarm();
      //STEP 2.2: First call the query method and stop using return value of the command method
      var alertedPerson = alarm.findAlarmedPerson(people);
      alarm.alertForMiscreant(people);

      if (!alertedPerson.isEmpty()) {
        log.info("Alert for: {}",  alertedPerson);
      } else {
        log.info("No alert triggered.");
      }
    }

  //STEP 1: Copy the method and refactor it to a query method
    public String findAlarmedPerson(List<String> people) {
    for (String p : people) {
      if ("Don".equals(p) || "John".equals(p)) {
        return p;
      }
    }
    return "";
  }

  //STEP 2: Convert the method into a command method
  //STEP 2.1: Remove return type
  public void alertForMiscreant(List<String> people) {
      //STEP 2.3: Remove query logic from command and call query method directly
    //query method (findAlarmedPerson)  is called both from the client and the command method.
    // This may look like a duplication, but it is ok to have it like that.
      if(!"".equals(findAlarmedPerson(people))) {
        setOffAlarms();
      }
    }

    public void setOffAlarms() {
      // Implement setOffAlarms logic if needed
    }
  
}
