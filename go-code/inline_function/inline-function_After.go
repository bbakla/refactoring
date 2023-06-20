package inline_function

func reportLineAfter(customer Customer) []string {
	lines := make([]string, 2)
	lines = append(lines, customer.Name)
	lines = append(lines, customer.Location)

	return lines
}
