package refactoring.conditional_logic.replace_conditional_with_polymorphism.example2.after;

import java.util.List;

public class RatingFunctions {

  //STEP 6: Call rating method of Rating class
  public String rating(
      Voyage voyage, List<History> history) {
    //STEP: 9 Call factory method instead of calling the Rating method directly. We now decoupled from
    // the Rating object
    return new RatingFactory().createRating(voyage, history).rating();
  }






}

