package before

type Order struct {
	customer Customer
}

// Each time we create an Order, we create also a new customer. However a customer can have several orders
func NewOrder(data interface{}) *Order {
	return &Order{
		customer: Customer{id: ""}, //Id should come from the data object
	}
}
