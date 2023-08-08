package before

import (
	"time"
)

type ChargeCalculator struct{}

func (cc *ChargeCalculator) calculateCharge(aDate time.Time, quantity float64, plan Plan) float64 {

	//STEP 4: Refactor if/else
	if cc.summer(aDate, plan) {
		return cc.summerCharge(quantity, plan)
	} else {
		return cc.regularCharge(quantity, plan)
	}
}

// STEP 3: Extract else logic to a method
func (cc *ChargeCalculator) regularCharge(quantity float64, plan Plan) float64 {
	return quantity*plan.RegularRate + plan.RegularServiceCharge
}

// STEP 2: Extract if logic to a method
func (cc *ChargeCalculator) summerCharge(quantity float64, plan Plan) float64 {
	return quantity * plan.SummerRate
}

// STEP 1: Extract if validation logic to a method
func (cc *ChargeCalculator) summer(aDate time.Time, plan Plan) bool {
	return !aDate.Before(plan.SummerStart) && !aDate.After(plan.SummerEnd)
}
