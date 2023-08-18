package before

type Thermostat struct {
	SelectedTemperature int
	CurrentTemperature int
}

type Plan struct {
	Min, Max   int
	Thermostat Thermostat
}

func (plan Plan) getTargetTemperature() int {
	if plan.Thermostat.SelectedTemperature > plan.Max {
		return plan.Max
	} else if plan.Thermostat.SelectedTemperature < plan.Min {
		return plan.Min
	} else {
		return plan.Thermostat.SelectedTemperature
	}
}

func main() {
	thermostat := Thermostat{SelectedTemperature: 25}
	thePlan := Plan{Min: 20, Max: 30, Thermostat: thermostat}

	if thePlan.getTargetTemperature() > thermostat.CurrentTemperature {
		setToHeat()
	} else if thePlan.getTargetTemperature() < thermostat.CurrentTemperature {
		setToCool()
	} else {
		setOff()
	}
}

func setOff() {

}

func setToCool() {

}

func setToHeat() {

}
