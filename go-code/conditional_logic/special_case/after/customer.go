package after

type Customer struct {
	Name           string
	billingPlan    BillingPlan
	paymentHistory PaymentHistory
}

// STEP 1: Create unknown Customer
func createUnknownCustomer() *Customer {
	return &Customer{
		Name:           "occupant",
		billingPlan:    BASIC,
		paymentHistory: PaymentHistory{weekDelinquentInLastYear: 0},
	}
}
