package after

type Order struct {
	//Step 1: Convert prio to a separate data structure
	priority Priority
}

// Step 4: Set Priority through Order in order to make client more readable
func (o Order) setPriority(prio int) {
	o.priority.setPriority(prio)
}
