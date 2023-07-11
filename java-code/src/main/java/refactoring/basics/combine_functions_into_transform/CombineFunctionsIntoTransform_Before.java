package refactoring.basics.combine_functions_into_transform;

import refactoring.basics.combine_functions_into_class.Reading;

/**
 * Lets say we have seen similar code pieces in the several places of our code base
 */
public class CombineFunctionsIntoTransform_Before {

  /**
  All the code using fields of reading can be moved to reading class so that we dont
   have to inject reading fields into the methods
 */
  public void calculate() {
    var aReading = acquireReading();
    var baseCharge = baseRate(aReading.getMonth(), aReading.getYear()) * aReading.getQuantity();
    var taxableCharge = Math.max(0, baseCharge - taxThreshold(aReading.getYear()));

  }

  private int taxThreshold(Integer year) {
    return 0;
  }

  private int baseRate(Integer month, Integer year) {
    return 0;
  }

  private void baseRate() {

  }

  private Reading acquireReading() {
    return new Reading();
  }
}
