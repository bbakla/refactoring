package refactoring.dealing_with_inheritance.replace_superclass_with_delegate.after;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CatalogItem {

  //2. CatalogItem item is a reference in Scroll. It is better to define id in the Scroll class
    //private int id;
    private String title;
    private List<String> tags;

  public boolean hasTag(String arg) {
    return tags.contains(arg);
  }

}
