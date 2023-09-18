//10. Factory method is not needed anymore
/*
package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.after;

public class BirdFactory {
  public static Bird createBird(BirdData data) {
    return switch (data.getType()) {
      //6. We dont need initialization of EuropeanSwallow anymore. It is already taken care in Bird
      //case "EuropeanSwallow" -> new EuropeanSwallow(data);
      //7.2 I dont need AfricanSwallow anymore. Its behavior is also handled by the bird class
      //case "AfricanSwallow" -> new AfricanSwallow(data);
      //9.3 We dont need NorwegianBlueParrot anymore
      //case "NorwegianBlueParrot" -> new NorwegianBlueParrot(data);
      default -> new Bird(data);
    };
  }
}
*/
