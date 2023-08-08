package before

func PayAmount(employee Employee) PaymentResult {
	var result PaymentResult

	if employee.IsSeparated {
		result = PaymentResult{Amount: 0, ReasonCode: "SEP"}
	} else {
		if employee.IsRetired {
			result = PaymentResult{Amount: 0, ReasonCode: "RET"}
		} else {
			// logic to compute amount
			// ...
			result = someFinalComputation()
		}
	}

	return result
}

func someFinalComputation() PaymentResult {
	// Perform computation and return PaymentResult
	return PaymentResult{Amount: 123.45, ReasonCode: "OK"}
}
