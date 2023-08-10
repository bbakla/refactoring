package refactoring.conditional_logic.replace_conditional_with_polymorphism.after;

import static java.util.stream.Collectors.toMap;

import java.util.List;
import java.util.Map;

public class BirdFunctions {
    public Map<String, String> plumages(List<Bird> birds) {
        //STEP 7: Refactor plumages method that calls the bird plumage methods

        return birds.stream()
            .map(b -> b.createBird(b))
            .collect(toMap(Bird::getName, Bird::plumage));
    }

    public Map<String, Integer> speeds(List<Bird> birds) {
        //STEP 8: Refactor speed method that calls the bird speed methods

        return birds.stream()
            .map(b -> b.createBird(b))
            .collect(toMap(Bird::getName, Bird::airSpeedVelocity));
    }


}
