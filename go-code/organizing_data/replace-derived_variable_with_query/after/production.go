package after

type Adjustment struct {
	amount int
}

type Production struct {
	//STEP 3: Since we calculate the production with a method dynamically, we dont
	//need production as variable anymore
	adjustments []Adjustment
}

// STEP 1: Calculate production in the method
func (p *Production) GetProduction() int {
	sum := 0
	for _, a := range p.adjustments {
		sum += a.amount
	}
	return sum
}

func (p *Production) ApplyAdjustment(anAdjustment Adjustment) {
	p.adjustments = append(p.adjustments, anAdjustment)

	//STEP 2: Stop doing two things in one method and remove calculating production
}
