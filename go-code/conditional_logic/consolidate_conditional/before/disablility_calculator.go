package before

func CalculateDisabilityAmount(anEmployee Employee) int {
	if anEmployee.Seniority < 2 {
		return 0
	}
	if anEmployee.MonthsDisabled > 12 {
		return 0
	}
	if anEmployee.IsPartTime {
		return 0
	}
	// compute the disability amount
	// ...

	return 10
}
