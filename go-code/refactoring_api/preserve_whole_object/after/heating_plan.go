package after

import "log"

type TempRange struct {
	Low, High int
}

type Room struct {
	DaysTempRange TempRange
}

type Plan struct {
	TemperatureRange TempRange
}

//STEP 6: We dont need the old method aymore
/*func (plan Plan) withinRange(low, high int) bool {
	return (low >= plan.TemperatureRange.Low) && (high <= plan.TemperatureRange.High)
}*/

// STEP 1: create a new function withinRangeNew with TempRange signature
// STEP 5: Inline existing withinRange in new func
// STEP 7: Rename the new method to withinRange
func (plan Plan) withinRange(tempRange TempRange) bool {
	//STEP 2: call directly existing withinRange func
	//return plan.withinRange(tempRange.Low, tempRange.High)

	return (tempRange.Low >= plan.TemperatureRange.Low) && (tempRange.High <= plan.TemperatureRange.High)
}

func main() {
	aRoom := Room{DaysTempRange: TempRange{Low: 10, High: 25}}
	aPlan := Plan{} // Instantiate a Plan

	//STEP 4: Delete unused variables
	/*low := aRoom.DaysTempRange.Low
	high := aRoom.DaysTempRange.High*/

	//STEP 3: Call new method
	if !aPlan.withinRange(aRoom.DaysTempRange) {
		log.Fatalln("room temperature went outside range")
	}
	/*if !aPlan.withinRange(low, high) {
		log.Fatalln("room temperature went outside range")
	}*/
}
