package refactoring.conditional_logic.special_case.before;

public class Client2 {
  //Client has to deal with null customer
  public BillingPlan getPlan(Site site) {

    if (site.getCustomer() == null) {
      return BillingPlan.BASIC;
    } else {
      return site.getCustomer().getBillingPlan();
    }
    }
}
