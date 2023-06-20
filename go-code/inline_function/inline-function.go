package inline_function

type Customer struct {
	Name     string
	Location string
}

func reportLine(customer Customer) []string {
	lines := make([]string, 2)
	gatherCustomerData(lines, customer)

	return lines
}

func gatherCustomerData(lines []string, customer Customer) {
	lines = append(lines, customer.Name)
	lines = append(lines, customer.Location)
}
