package refactoring.conditional_logic.replace_conditional_with_polymorphism.example1.before;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirdFunctions {
    public Map<String, String> plumages(List<Bird> birds) {
        Map<String, String> result = new HashMap<>();
        for (Bird b : birds) {
            result.put(b.getName(), plumage(b));
        }
        return result;
    }

    public Map<String, Integer> speeds(List<Bird> birds) {
        Map<String, Integer> result = new HashMap<>();
        for (Bird b : birds) {
            result.put(b.getName(), airSpeedVelocity(b));
        }
        return result;
    }

    public String plumage(Bird bird) {
        return switch (bird.getType()) {
            case "EuropeanSwallow" -> "average";
            case "AfricanSwallow" -> (bird.getNumberOfCoconuts() > 2) ? "tired" : "average";
            case "NorwegianBlueParrot" -> (bird.getVoltage() > 100) ? "scorched" : "beautiful";
            default -> "unknown";
        };
    }

    public int airSpeedVelocity(Bird bird) {
        return switch (bird.getType()) {
            case "EuropeanSwallow" -> 35;
            case "AfricanSwallow" -> 40 * bird.getNumberOfCoconuts();
            case "NorwegianBlueParrot" -> (bird.isNailed()) ? 0 : 10 + bird.getVoltage() / 10;
            default -> 0;
        };
    }
}
