package refactoring.conditional_logic.special_case.read_and_write.after;

public class Client1 {
  public String getName(Site site) {
   return site.getCustomer().getName();
  }
}
