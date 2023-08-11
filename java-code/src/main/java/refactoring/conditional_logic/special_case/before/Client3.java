package refactoring.conditional_logic.special_case.before;

public class Client3 {

  //Client has to deal with null customer
  public void setPlan(Site site, BillingPlan plan) {
    if(site.getCustomer() != null) {
      site.getCustomer().setBillingPlan(plan);
    }
  }
}
