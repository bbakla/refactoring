package combine_functions_into_class

/*
All the code using fields of reading can be moved to reading struct func
*/
func calculate() int {
	reading := acquireReading()
	baseCharge := baseRate(reading.Month, reading.Year) * reading.Quantity

	return Max(0, baseCharge-taxThreshold(reading.Year))

}

/**
 * reading = {customer: "ivan", quantity: 10, month: 5, year: 2017};
 */
type ReadingBefore struct {
	Month    int
	Year     int
	Quantity int
}

func taxThreshold(year int) int {
	return 0
}

func baseRate(month int, year int) int {
	return 0
}

func acquireReading() *ReadingBefore {
	return new(ReadingBefore)
}

func Max(x, y int) int {
	if x > y {
		return x
	}
	return y
}
