package refactoring.refactoring_api.parameterize_function.after;

public class Charge {
    public double baseCharge(int usage) {
      if (usage < 0) {
        return 0;
      }
      return
          //STEP 4: Use parameterized method for bottomBand
          withinBand(usage, 100, 0) +
          //bottomBand(usage) * 0.03 +

          //STEP 2: Use parameterized method for middleBand
          withinBand(usage, 200, 100) * 0.05 +
          //middleBand(usage) * 0.05 +

          //STEP 3: Use parameterized method for topBand
          withinBand(usage, Integer.MAX_VALUE, 200) * 0.07;
          //topBand(usage) * 0.07;
    }

    private int bottomBand(int usage) {
      return Math.min(usage, 100);
    }

    private int middleBand(int usage) {
      if (usage > 100) {
        return Math.min(usage, 200) - 100;
      }
      return 0;
    }

  //STEP 1: Copy and paste middleBand method and parameterize it
    private int withinBand(int usage, int top, int bottom) {
    if (usage > bottom) {
      return Math.min(usage, top) - bottom;
    }
    return 0;
  }

    private int topBand(int usage) {
      if (usage > 200) {
        return usage - 200;
      }
      return 0;
    }
  }
