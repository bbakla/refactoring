package refactoring.refactoring_api.remove_setting_method.after;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//STEP 2: Add constructor for id
@RequiredArgsConstructor
public class Person {
  private String name;

  //STEP 1: Remove setter for id and make it final
  @Setter(AccessLevel.NONE)
  private final Integer id;
}

