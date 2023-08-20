package refactoring.refactoring_api.remove_setting_method.after;

public class Main {
  public static void main(String[] args){
    //STEP 3: Give id in the constructor
    var person = new Person(123);
    person.setName("martin");
  }

}
