package refactoring.conditional_logic.special_case.read.after;

public class Client1 {
  public String getName(Site site) {
    //STEP 4: Return name directly
    return site.getCustomer().getName();
  }
}
