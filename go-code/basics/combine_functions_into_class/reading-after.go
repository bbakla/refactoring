package combine_functions_into_class

/**
 * reading = {customer: "ivan", quantity: 10, month: 5, year: 2017};
 */
type ReadingAfter struct {
	Month    int
	Year     int
	Quantity int
}

func (reading ReadingAfter) BaseRateCharge() int {
	return reading.baseRate() * reading.Quantity
}
func (reading ReadingAfter) TaxableCharge() int {
	return Max(0, reading.BaseRateCharge()-reading.taxThreshold())
}

func (reading ReadingAfter) baseRate() int {
	return 0
}

func (reading ReadingAfter) taxThreshold() int {
	return 0
}

func createReading() *ReadingAfter {
	return new(ReadingAfter)
}
