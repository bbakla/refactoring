package before

func findHighPrioOrders(orders []Order) int {
	count := 0
	for _, o := range orders {
		if o.priority > 1 || o.priority > 2 {
			count++
		}
	}

	return count
}
