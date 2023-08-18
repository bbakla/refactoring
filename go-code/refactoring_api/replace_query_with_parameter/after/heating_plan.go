package after

type Thermostat struct {
	SelectedTemperature int
	CurrentTemperature int
}

type Plan struct {
	Min, Max   int
	//STEP 6: We dont need Thermostat as a dependency in the Plan anymore so we can reduce coupling
	//Thermostat Thermostat
}

//STEP 4: We dont need the old func anymore
/*func (plan Plan) getTargetTemperature() int {
	// STEP 1: Inline selectedTemperature variable to be able to refactor easily
	selectedTemperature := plan.Thermostat.SelectedTemperature
	// STEP 2: Extract selectedTemperature Logic to a new function new_getTargetTemperature
	return plan.new_getTargetTemperature(selectedTemperature)
}*/

//STEP 5: Rename the new func
func (plan Plan) getTargetTemperature(selectedTemperature int) int {
	if selectedTemperature > plan.Max {
		return plan.Max
	} else if selectedTemperature < plan.Min {
		return plan.Min
	} else {
		return selectedTemperature
	}
}

func main() {
	thermostat := Thermostat{SelectedTemperature: 25}
	thePlan := Plan{Min: 20, Max: 30}

	// STEP 3: Use new function in the client
	if thePlan.getTargetTemperature(thermostat.SelectedTemperature) > thermostat.CurrentTemperature {
		setToHeat()
	} else if thePlan.getTargetTemperature(thermostat.SelectedTemperature) < thermostat.CurrentTemperature {
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
