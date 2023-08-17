package after

import (
	"math"
)

func baseCharge(usage int) float64 {
	if usage < 0 {
		return 0
	}
	//STEP 3: Change bottomBand with the parameterized func
	return withinBand(usage, 100, 0)*.03 +
		//bottomBand(usage)*0.03 +
		//middleBand(usage)*0.05 +
		//STEP 2: Change middleBand with the parameterized func
		withinBand(usage, 200, 100)*0.05 +
		//STEP 3: Change topBand with the parameterized func
		withinBand(usage, math.MaxInt, 200)*.07
	//+ topBand(usage) * 0.07
}

func bottomBand(usage int) float64 {
	return math.Min(float64(usage), 100)
}

func middleBand(usage int) float64 {
	if usage > 100 {
		return math.Min(float64(usage), 200) - 100
	}
	return 0
}

// STEP 1: Copy and paste middleBand func and parameterize it
func withinBand(usage int, top int, bottom int) float64 {
	if usage > bottom {
		return math.Min(float64(usage), float64(top)) - float64(bottom)
	}
	return 0
}

func topBand(usage int) float64 {
	if usage > 200 {
		return float64(usage - 200)
	}
	return 0
}
