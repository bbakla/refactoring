package after

// Step 5: refactor client
func findHighPrioOrders(orders []Order) int {
	count := 0
	for _, o := range orders {
		if o.priority.higherThan(2) {
			count++
		}
	}
	return count
}
