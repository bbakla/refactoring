package after

func PayAmount(employee Employee) PaymentResult {

	if employee.IsSeparated {
		// STEP 1: Convert it to a guard clause
		return PaymentResult{Amount: 0, ReasonCode: "SEP"}
	}
	if employee.IsRetired {
		// STEP 2: Convert it to a guard clause
		return PaymentResult{Amount: 0, ReasonCode: "RET"}
	}
	// STEP 3: Else is not needed
	// logic to compute amount
	// ...

	//STEP 4: I dont need result variable anymore
	return someFinalComputation()
}

func someFinalComputation() PaymentResult {
	// Perform computation and return PaymentResult
	return PaymentResult{Amount: 123.45, ReasonCode: "OK"}
}
