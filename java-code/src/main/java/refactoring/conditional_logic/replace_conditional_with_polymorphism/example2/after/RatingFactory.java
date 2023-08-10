package refactoring.conditional_logic.replace_conditional_with_polymorphism.example2.after;

import java.util.List;
public class RatingFactory {

  //STEP 8: Create factory method
  public Rating createRating(Voyage voyage, List<History> history) {
    if("china".equals(voyage.getZone()) && hasChina(history)) {
      return new ChinaRating(voyage, history);
    } else {
      return new Rating(voyage, history);
    }
  }

  private boolean hasChina(List<History> history) {
    return history.stream().anyMatch(v -> "china".equals(v.getZone()));
  }
}
