package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.after;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bird {
  private String name;
  private String plumage;

  //4. Define a delegate interface for now to be able to inject all the delegates
  private BirdDelegate birdDelegate;

  Bird(BirdData data) {
    this.name = data.getType();
    this.plumage = "average";
    this.birdDelegate = selectSpeciesDelegate(data);
  }

  BirdDelegate selectSpeciesDelegate(BirdData data) {
    switch (data.getType()) {
      case "EuropeanSwallow":
        return new EuropeanSwallowDelegate();
      //7. I add AfricanSwallow to the method
      case "AfricanSwallow":
        return new AfricanSwallowDelegate(data);
      //8. I add NorwegianBlueParrot to the method
      case "NorwegianBlueParrot":
        return new NorwegianBlueParrotDelegate(this, data);
      default:
        return null;
    }
  }

  //5. Modify the method to call delegate behavior
  int airSpeedVelocity() {
    return birdDelegate != null ? birdDelegate.airSpeedVelocity() : 0;
  }

  //8.3 Modify the plumage report
  public String plumage() {
    if(this.birdDelegate != null) {
      return birdDelegate.plumage();
    }

    return plumage;

    //return plumage;
  }
}
