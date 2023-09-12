package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.single_subclass.before;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Accomodation {
  private boolean isOwnPlace;
  private double price;
}
