package before

type Client4 struct {
}

func (client *Client4) calculateDelinquent(site Site) int {
	if site.Customer == nil {
		return 0
	}
	return site.Customer.paymentHistory.weekDelinquentInLastYear
}