package before

func CalculateDisabilityAmount(anEmployee Employee) int {

	if isEligibleForDisability(anEmployee) {
		return 0
	}
	// compute the disability amount
	// ...

	return 10
}

// STEP 1: Extract logic and combine them as they have the same action
func isEligibleForDisability(employee Employee) bool {
	return employee.Seniority < 2 || employee.MonthsDisabled > 12 || employee.IsPartTime
}
