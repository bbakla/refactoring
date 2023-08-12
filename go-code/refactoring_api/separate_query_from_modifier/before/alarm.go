package before

func alertForMiscreant(people []string) string {
	for _, p := range people {
		if p == "Don" || p == "John" {
			setOffAlarms()
			return p
		}
	}
	return ""
}

func setOffAlarms() {
	// Implement setOffAlarms logic if needed
}

func main() {
	people := []string{"Alice", "Bob", "Don", "Eve", "John"}
	alertedPerson := alertForMiscreant(people)
	if alertedPerson != "" {
		println("Alert for:", alertedPerson)
	} else {
		println("No alert triggered.")
	}
}
