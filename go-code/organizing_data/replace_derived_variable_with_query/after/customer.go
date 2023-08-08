package after

type Customer struct {
	id string
}

func NewCustomer(id string) *Customer {
	return &Customer{
		id: id,
	}
}
