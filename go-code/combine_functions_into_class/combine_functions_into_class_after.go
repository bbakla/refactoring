package combine_functions_into_class

func calculateAfter() int {
	reading := createReading()
	baseCharge := reading.BaseRateCharge()

	return Max(0, baseCharge-taxThreshold(reading.Year))
}
