package refactoring.refactoring_api.replace_constructor_with_factory_function.before;

public enum TypeCode {
  E("ENGINEER"),
  M("MANAGER"),
  S("SALESMAN");

  public final String type;

  TypeCode(String type) {
    this.type = type;
  }
}
