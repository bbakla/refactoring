package refactoring.dealing_with_inheritance.pull_up_constructor_body.after;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Party {

  //STEP 1: Move  name to the super class as it is common in all subclasses
  protected String name;
}
