package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.after;


public class Client {
  public static void main(String[] args) {
    //11. Since factory method is gone, we can directly initialize the bird
    Bird europeanSwallow = new Bird(new BirdData("EuropeanSwallow", 0, false));
    Bird africanSwallow = new Bird(new BirdData("AfricanSwallow", 3));
    Bird norwegianBlueParrot = new Bird(new BirdData("NorwegianBlueParrot", 120, false));

    System.out.println("European Swallow: " + europeanSwallow.plumage());
    System.out.println("European Swallow Air Speed Velocity: " + europeanSwallow.airSpeedVelocity());

    System.out.println("African Swallow: " + africanSwallow.plumage());
    System.out.println("African Swallow Air Speed Velocity: " + africanSwallow.airSpeedVelocity());

    System.out.println("Norwegian Blue Parrot: " + norwegianBlueParrot.plumage());
    System.out.println("Norwegian Blue Parrot Air Speed Velocity: " + norwegianBlueParrot.airSpeedVelocity());


  }
}
