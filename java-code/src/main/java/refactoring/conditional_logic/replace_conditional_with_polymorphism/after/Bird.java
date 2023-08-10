package refactoring.conditional_logic.replace_conditional_with_polymorphism.after;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
//STEP 4: Make Bird class abstract to escalate type specific behaviors to the subclasses
public abstract class Bird {
    private String name;
    private String type;
    private int numberOfCoconuts;
    private int voltage;
    private boolean isNailed;

    //STEP 1: Move bird specific methods to the class
    //STEP 2: Create subclasses for each kind of bird
    //STEP 9 : After refactoring BirdFunctions method, we dont need this method anymore
/*    public String plumage(Bird bird) {
        //STEP 6: call the method of subclasses
        return createBird(bird).plumage();
    }*/

    //STEP 10 : After refactoring BirdFunctions method, we dont need this method anymore
/*    public int airSpeedVelocity(Bird bird) {
        //STEP 6: call the method of subclasses
        return createBird(bird).airSpeedVelocity();
    }*/


    //STEP3: Create factory method for bird creation
    public Bird createBird(Bird bird) {
    return switch (bird.getType()) {
      case "EuropeanSwallow" -> new EuropeanSwallow(bird);
      case "AfricanSwallow" -> new AfricanSwallow(bird);
      case "NorwegianBlueParrot" -> new NorwegianParrot(bird);
      default -> new DefaultBird(bird);
    };
    }

    //STEP 5: Define behaviors to be implemented by the subclasses
    public abstract String plumage();
    public abstract int airSpeedVelocity();

}
