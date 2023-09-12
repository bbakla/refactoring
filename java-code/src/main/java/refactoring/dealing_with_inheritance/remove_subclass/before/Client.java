package refactoring.dealing_with_inheritance.remove_subclass.before;

import java.util.ArrayList;
import java.util.List;

public class Client {

  private List<Person> people = new ArrayList<>();
  public static void main(String[] args){

    var client = new Client();
    var males = client.findMales();

  }

  private List<Person> findMales() {
    return people.stream().filter(Male.class::isInstance).toList();
  }
}
