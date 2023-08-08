package before

type Adjustment struct {
	amount int
}

type Production struct {
	production  int
	adjustments []Adjustment
}

func (p *Production) GetProduction() int {
	return p.production
}

// There is code duplication here. Production is stored twice
func (p *Production) ApplyAdjustment(anAdjustment Adjustment) {
	p.adjustments = append(p.adjustments, anAdjustment)
	p.production += anAdjustment.amount
}
