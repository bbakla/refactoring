package after

type Client2 struct {
}

// STEP 3.1: Refactor client
func (client *Client2) getPlan(site Site) BillingPlan {
	return site.getCustomer().billingPlan
}
