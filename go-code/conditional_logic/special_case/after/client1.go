package after

type Client1 struct {
}

// STEP 3: Refactor client
func (client *Client1) getName(site Site) string {
	return site.getCustomer().Name
}
