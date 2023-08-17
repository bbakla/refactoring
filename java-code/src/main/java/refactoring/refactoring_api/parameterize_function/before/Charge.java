package refactoring.refactoring_api.parameterize_function.before;

public class Charge {
    public double baseCharge(int usage) {
      if (usage < 0) {
        return 0;
      }
      return bottomBand(usage) * 0.03 +
          middleBand(usage) * 0.05 +
          topBand(usage) * 0.07;
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

    private int topBand(int usage) {
      if (usage > 200) {
        return usage - 200;
      }
      return 0;
    }
  }
