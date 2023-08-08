package refactoring.conditional_logic.replace_nested_with_guard_clause.before;

/**
 * Nesting the conditionals here masks the true meaning of what it going on. The primary
 * purpose of this code only applies if these conditions aren’t the case. In this situation,
 * the intention of the code reads more clearly with guard clauses.
 */
public class PaymentCalculator {
  public PaymentResult payAmount(Employee employee) {
    PaymentResult result;

    if (employee.isSeparated()) {
      result = new PaymentResult(0, "SEP");
    } else {
      if (employee.isRetired()) {
        result = new PaymentResult(0, "RET");
      } else {
        // logic to compute amount
        // ...
        result = someFinalComputation();
      }
    }

    return result;
  }

  private PaymentResult someFinalComputation() {
    // Perform computation and return PaymentResult
    return new PaymentResult(123.45, "OK");
  }
  }
