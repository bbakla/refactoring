package refactoring.refactoring_api.replace_constructor_with_factory_function.after;

public enum TypeCode {
  E("ENGINEER"),
  M("MANAGER"),
  S("SALESMAN");

  private final String type;

  TypeCode(String type) {
    this.type = type;
  }
}
