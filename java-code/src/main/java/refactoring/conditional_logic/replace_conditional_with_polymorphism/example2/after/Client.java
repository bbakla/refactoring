package refactoring.conditional_logic.replace_conditional_with_polymorphism.example2.after;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
  public static void main(String[] args) {
    Voyage voyage = new Voyage("westindies", 10);

    List<History> history = new ArrayList<>();
    history.add(new History("eastindies", 5));
    history.add(new History("westindies", 15));
    history.add(new History("china", 2));
    history.add(new History("westafrica", 7));

    String myRating = new RatingFunctions().rating(voyage, history);
    log.info("My Rating: {}", myRating);
  }
}
