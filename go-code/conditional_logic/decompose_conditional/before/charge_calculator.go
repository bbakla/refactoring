package before

import (
	"time"
)

type ChargeCalculator struct{}

func (cc *ChargeCalculator) calculateCharge(aDate time.Time, quantity float64, plan Plan) float64 {
	var charge float64

	if !aDate.Before(plan.SummerStart) && !aDate.After(plan.SummerEnd) {
		charge = quantity * plan.SummerRate
	} else {
		charge = quantity*plan.RegularRate + plan.RegularServiceCharge
	}

	return charge
}
