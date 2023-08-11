package refactoring.conditional_logic.special_case.read.after;

public class Client2 {
  public BillingPlan getPlan(Site site) {
    //STEP 5: Return billing plan directly
   return site.getCustomer().getBillingPlan();
    }
}
