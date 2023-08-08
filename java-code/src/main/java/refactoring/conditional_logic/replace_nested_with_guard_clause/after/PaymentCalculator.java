package refactoring.conditional_logic.replace_nested_with_guard_clause.after;

public class PaymentCalculator {
  public PaymentResult payAmount(Employee employee) {

    if (employee.isSeparated()) {
      // STEP 1: Convert it to a guard clause
      return new PaymentResult(0, "SEP");
    }
    //STEP 2: Convert it to a guard clause
    if (employee.isRetired()) {
      return new PaymentResult(0, "RET");
    }
    //STEP 3: Else is not needed anymore

      // logic to compute amount
      // ...
    //STEP 4: I dont need result variable anymore
      return someFinalComputation();
  }

  private PaymentResult someFinalComputation() {
    // Perform computation and return PaymentResult
    return new PaymentResult(123.45, "OK");
  }
}
