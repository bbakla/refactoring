package refactoring.dealing_with_inheritance.remove_subclass.after;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.java.Log;


@Log
public class Client {

  private List<Person> people = new ArrayList<>();
  public static void main(String[] args){

    var client = new Client();

    client.people.add(new Person("a", GenderCode.Male));
    client.people.add(new Person("b", GenderCode.Female));

    var males = client.findMales();

   log.info("result " + males.toString());

  }

  private List<Person> findMales() {
    return people.stream().filter(p -> GenderCode.Male.equals(p.getGenderCode())).toList();
  }
}
