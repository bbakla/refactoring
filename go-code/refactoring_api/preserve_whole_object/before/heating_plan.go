package before

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

func (plan Plan) withinRange(low, high int) bool {
	return (low >= plan.TemperatureRange.Low) && (high <= plan.TemperatureRange.High)
}

func main() {
	aRoom := Room{DaysTempRange: TempRange{Low: 10, High: 25}}
	aPlan := Plan{} // Instantiate a Plan

	low := aRoom.DaysTempRange.Low
	high := aRoom.DaysTempRange.High

	if !aPlan.withinRange(low, high) {
		log.Fatalln("room temperature went outside range")
	}
}
