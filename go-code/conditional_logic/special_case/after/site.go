package after

type Site struct {
	customer *Customer
}

// STEP 2: Return unknown customer if customer is null
func (s Site) getCustomer() *Customer {
	if s.customer == nil {
		s.customer = createUnknownCustomer()
	}
	return s.customer
}
