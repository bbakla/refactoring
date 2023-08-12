package before

type Client1 struct {
	// Define the Client1 struct if needed
}

func (client *Client1) getName(site Site) string {
	customer := site.Customer

	var customerName string
	if customer == nil {
		customerName = "occupant"
	} else {
		customerName = customer.Name
	}

	return customerName
}
