package refactoring.dealing_with_inheritance.replace_superclass_with_delegate.after;

import java.time.LocalDate;
import java.util.List;
import lombok.extern.java.Log;

@Log
public class Client {
  public static void main(String[] args) {

    var cleanableItem = new Scroll(1, "Sample Cleanable Item", List.of("revered", "tag2"), LocalDate.of(2023, 1, 1));

    // Calculate and check if it needs cleaning
    LocalDate currentDate = LocalDate.of(2023, 9, 1);
    boolean needsCleaning = cleanableItem.needsCleaning(currentDate);
    log.info("Needs Cleaning: " + needsCleaning);
  }
}
