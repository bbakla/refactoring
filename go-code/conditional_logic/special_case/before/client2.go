package before

type Client2 struct {
}

func (client *Client2) getPlan(site Site) BillingPlan {
	if site.Customer == nil {
		return BASIC
	} else {
		return site.Customer.billingPlan
	}
}
