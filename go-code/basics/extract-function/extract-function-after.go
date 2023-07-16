package extract_function

import (
	"fmt"
	"gitlab.com/clean-code55/refactor/improving-design-of-existing-code/go-code/basics/models"
)

func printOwingAfter(invoice models.Invoice) {
	printBanner()
	outstanding := calculateOutstanding(invoice)
	printDetails(invoice, outstanding)
}

func calculateOutstanding(invoice models.Invoice) int {
	outstanding := 0

	for _, order := range invoice.Orders {
		outstanding += order.Amount
	}
	return outstanding
}

func printDetails(invoice models.Invoice, outstanding int) {
	fmt.Println("name: " + invoice.Customer)
	fmt.Printf("amount:  %d\n", outstanding)
	fmt.Printf("due: %v\n", invoice.DueDate)
}

func printBanner() {
	fmt.Println("************************")
	fmt.Println("***Customer Owes***")
	fmt.Println("************************")
}
