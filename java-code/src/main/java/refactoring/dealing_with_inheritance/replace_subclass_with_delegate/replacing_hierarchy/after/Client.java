package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.after;

public class Client {
  public static void main(String[] args) {
    Bird europeanSwallow = createBird(new BirdData("EuropeanSwallow"));
    Bird africanSwallow = createBird(new BirdData("AfricanSwallow", 3));
    Bird norwegianBlueParrot = createBird(new BirdData("NorwegianBlueParrot", 120, false));

    System.out.println("European Swallow: " + europeanSwallow.plumage());
    System.out.println("European Swallow Air Speed Velocity: " + europeanSwallow.airSpeedVelocity());

    System.out.println("African Swallow: " + africanSwallow.plumage());
    System.out.println("African Swallow Air Speed Velocity: " + africanSwallow.airSpeedVelocity());

    System.out.println("Norwegian Blue Parrot: " + norwegianBlueParrot.plumage());
    System.out.println("Norwegian Blue Parrot Air Speed Velocity: " + norwegianBlueParrot.airSpeedVelocity());


  }

  static Bird createBird(
      BirdData data) {
    return switch (data.getType()) {
      case "EuropeanSwallow" -> new EuropeanSwallow(data);
      case "AfricanSwallow" -> new AfricanSwallow(data);
      case "NorwegianBlueParrot" -> new NorwegianBlueParrot(data);
      default -> new Bird(data);
    };
  }
}
