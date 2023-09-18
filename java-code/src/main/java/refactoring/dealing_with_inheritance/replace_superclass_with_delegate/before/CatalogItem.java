package refactoring.dealing_with_inheritance.replace_superclass_with_delegate.before;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CatalogItem {

    private int id;
    private String title;
    private List<String> tags;

  public boolean hasTag(String arg) {
    return tags.contains(arg);
  }

}
