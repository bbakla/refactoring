package after

type Client3 struct {
}

// STEP 3.2: Refactor client
func (client *Client3) setPlan(site Site, plan BillingPlan) {
	site.getCustomer().billingPlan = plan
}
