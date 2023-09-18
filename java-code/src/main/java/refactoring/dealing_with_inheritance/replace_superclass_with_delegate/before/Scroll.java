package refactoring.dealing_with_inheritance.replace_superclass_with_delegate.before;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Scroll extends CatalogItem{

  private LocalDate lastCleaned;

  public Scroll(int id, String title, List<String> tags, LocalDate lastCleaned) {
    super(id, title, tags);
    this.lastCleaned = lastCleaned;
  }

  public boolean needsCleaning(LocalDate targetDate) {
    int threshold = this.hasTag("revered") ? 700 : 1500;
    return daysSinceLastCleaning(targetDate) > threshold;
  }

  public long daysSinceLastCleaning(LocalDate targetDate) {
    return ChronoUnit.DAYS.between(lastCleaned, targetDate);
  }
}
