package before

// STEP 1: Create a new function to implement the query aspect
func findMiscreant(people []string) string {
	for _, p := range people {
		if p == "Don" || p == "John" {
			return p
		}
	}
	return ""
}

// STEP2: Refactor the alert function to convert it into a command function
// STEP2.1: Remove return type
// STEP 2.2: Remove query logic and escalate it to the query method
func alertForMiscreant(people []string) {
	if findMiscreant(people) != "" {
		setOffAlarms()
	}
}

func setOffAlarms() {
	// Implement setOffAlarms logic if needed
}

func main() {
	people := []string{"Alice", "Bob", "Don", "Eve", "John"}
	//STEP 2.3: First call the query. As you can see there is duplication here. findMiscreant()
	// function is called both by the client and in the API. That is ok
	alertedPerson := findMiscreant(people)
	alertForMiscreant(people)
	if alertedPerson != "" {
		println("Alert for:", alertedPerson)
	} else {
		println("No alert triggered.")
	}
}
