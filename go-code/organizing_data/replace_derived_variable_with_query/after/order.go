package after

type Order struct {
	customer           Customer
	customerRepository CustomerRepository
}

// STEP 2: Call customer from the repository when creating an order
func NewOrder(customerRepository CustomerRepository, data interface{}) *Order {
	return &Order{
		customerRepository: customerRepository,
		customer:           customerRepository.RegisterCustomer(""), //Id should come from the data object
	}
}
