package before

type Client3 struct {
}

func (client *Client3) setPlan(site Site, plan BillingPlan) {
	if site.Customer != nil {
		site.Customer.billingPlan = plan
	}
}
