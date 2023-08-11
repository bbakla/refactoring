package refactoring.conditional_logic.special_case.before;

public class Client4 {

  //Client has to deal with null customer
  public int calculateDelinquent(Site site) {
    return site.getCustomer() == null
        ? 0
        : site.getCustomer().getPaymentHistory().getWeekDelinquentInLastYear();
  }
}
