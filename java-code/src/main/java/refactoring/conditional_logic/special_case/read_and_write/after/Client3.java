package refactoring.conditional_logic.special_case.read_and_write.after;

public class Client3 {
  public void setPlan(Site site, BillingPlan plan) {
    if(!site.getCustomer().isUnknown()) {
      site.getCustomer().setBillingPlan(plan);
    }
  }
}
