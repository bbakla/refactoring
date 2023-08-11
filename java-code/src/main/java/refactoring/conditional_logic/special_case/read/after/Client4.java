package refactoring.conditional_logic.special_case.read.after;

public class Client4 {

  public int calculateDelinquent(Site site) {
    return site.getCustomer().getPaymentHistory().getWeekDelinquentInLastYear();
  }
}
