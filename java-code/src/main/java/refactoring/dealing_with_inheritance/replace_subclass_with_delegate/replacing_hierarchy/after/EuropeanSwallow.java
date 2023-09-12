package refactoring.dealing_with_inheritance.replace_subclass_with_delegate.replacing_hierarchy.after;


class EuropeanSwallow extends Bird {
  EuropeanSwallow(BirdData data) {
    super(data);
  }

  @Override
  int airSpeedVelocity() {
    return 35;
  }
}





