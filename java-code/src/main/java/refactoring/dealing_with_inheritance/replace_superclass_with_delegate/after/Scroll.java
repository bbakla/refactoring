package refactoring.dealing_with_inheritance.replace_superclass_with_delegate.after;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// I remove the inheritance
public class Scroll { //extends CatalogItem {

  private int id;
  private LocalDate lastCleaned;

  //1. The goal is to remove the inheritance. Lets add superclass instance to the subclass
  private CatalogItem catalogItem;

  public Scroll(int id, String title, List<String> tags, LocalDate lastCleaned) {
    //super(id, title, tags);

    //1.1 Initialize the catalog item
    //2.1 Update the constructor of CatalogItem
    this.catalogItem = new CatalogItem(title, tags);
    this.id = id;
    this.lastCleaned = lastCleaned;
  }

  public boolean needsCleaning(LocalDate targetDate) {
    int threshold = catalogItem.hasTag("revered") ? 700 : 1500;
    return daysSinceLastCleaning(targetDate) > threshold;
  }

  public long daysSinceLastCleaning(LocalDate targetDate) {
    return ChronoUnit.DAYS.between(lastCleaned, targetDate);
  }
}
