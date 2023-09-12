package refactoring.dealing_with_inheritance.remove_subclass.after;

public enum GenderCode {
  Male("M"),
  Female("F"),
  X("X");

  public final String code;

  GenderCode(String code) {
    this.code = code;
  }
}
