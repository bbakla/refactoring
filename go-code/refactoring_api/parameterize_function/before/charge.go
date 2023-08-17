package before

import (
	"math"
)

func baseCharge(usage int) float64 {
	if usage < 0 {
		return 0
	}
	return bottomBand(usage)*0.03 +
		middleBand(usage)*0.05 +
		topBand(usage)*0.07
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

func topBand(usage int) float64 {
	if usage > 200 {
		return float64(usage - 200)
	}
	return 0
}
