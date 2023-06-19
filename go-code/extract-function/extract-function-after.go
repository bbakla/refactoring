package extract_function

import (
	"fmt"
)

func printOwingAfter(invoice Invoice) {
	printBanner()
	outstanding := calculateOutstanding(invoice)
	printDetails(invoice, outstanding)
}

func calculateOutstanding(invoice Invoice) int {
	outstanding := 0

	for _, order := range invoice.Orders {
		outstanding += order.Amount
	}
	return outstanding
}

func printDetails(invoice Invoice, outstanding int) {
	fmt.Println("name: " + invoice.Customer)
	fmt.Printf("amount:  %d\n", outstanding)
	fmt.Printf("due: %v\n", invoice.DueDate)
}

func printBanner() {
	fmt.Println("************************")
	fmt.Println("***Customer Owes***")
	fmt.Println("************************")
}
