package refactoring.conditional_logic.special_case.read_and_write.after;

public class Client2 {
  public BillingPlan getPlan(Site site) {
    return site.getCustomer().getBillingPlan();
  }
}
