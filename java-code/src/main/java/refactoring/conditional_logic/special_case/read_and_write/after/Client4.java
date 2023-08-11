package refactoring.conditional_logic.special_case.read_and_write.after;

public class Client4 {

  public int calculateDelinquent(Site site) {
    return site.getCustomer().getPaymentHistory().getWeekDelinquentInLastYear();
  }
}
