package refactoring.combine_functions_into_transform;

import org.apache.commons.lang3.SerializationUtils;
import refactoring.combine_functions_into_class.Reading;

/**
 * Lets say we have seen similar code pieces in the several places of our code base
 */
public class CombineFunctionsIntoTransform_After {

  public void calculate() {
    var rawReading = acquireReading();
    //Step1: create a deep copy of the input
    var reading = enrichReading(rawReading);


    //Step 3: I move taxableCharge to into the consumption
    var taxableCharge = reading.getTaxableCharge();
  }

  private TeaConsumption acquireReading() {
    return new TeaConsumption();
  }

  //Since it is essentially the same output with the input, the naming is enrich. If the values
  //had changed, the name would be "transform" instead of "enrich"
  private TeaConsumption enrichReading(TeaConsumption consumption) {
    var deepCopy =  SerializationUtils.clone(consumption); // deep clone

    //Step 2: Move BaseCharge logic to enrichment method. enrich method is the only place I mutate
    //the object.
    deepCopy.setBaseCharge(calculateBaseCharge(deepCopy));

    //Step 4: I move mutating taxable Charge into the enrichReading
    deepCopy.setTaxableCharge(Math.max(0, deepCopy.getBaseCharge() - taxThreshold(deepCopy.getYear())));

    return deepCopy;
  }

  private int calculateBaseCharge(TeaConsumption consumption) {
    return baseRate(consumption.getMonth(), consumption.getYear()) * consumption.getQuantity();
  }

  private int taxThreshold(Integer year) {
    return 0;
  }

  private int baseRate(Integer month, Integer year) {
    return 0;
  }

}
