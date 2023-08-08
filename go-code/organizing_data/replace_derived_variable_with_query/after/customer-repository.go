package after

// STEP 1: Create a central place to store the customers
type CustomerRepository struct {
	customers map[string]*Customer
}

func NewCustomerRepository() *CustomerRepository {
	return &CustomerRepository{
		customers: make(map[string]*Customer),
	}
}

func (cr *CustomerRepository) RegisterCustomer(id string) Customer {
	if cr.customers[id] == nil {
		cr.customers[id] = NewCustomer(id)
	}

	return cr.FindCustomer(id)
}

func (cr *CustomerRepository) FindCustomer(id string) Customer {
	return *cr.customers[id]
}
