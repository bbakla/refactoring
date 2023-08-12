package after

type Client4 struct {
}

// STEP 3.3: Refactor client
func (client *Client4) calculateDelinquent(site Site) int {
	return site.getCustomer().paymentHistory.weekDelinquentInLastYear
}
