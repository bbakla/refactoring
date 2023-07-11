package extract_function

import (
	"fmt"
	"gitlab.com/clean-code55/refactor/improving-design-of-existing-code/go-code/basics/models"
)

func printOwing(invoice models.Invoice) {
	fmt.Println("************************")
	fmt.Println("***Customer Owes***")
	fmt.Println("************************")

	outstanding := 0

	for _, order := range invoice.Orders {
		outstanding += order.Amount
	}

	fmt.Println("name: " + invoice.Customer)
	fmt.Printf("amount:  %d\n", outstanding)
	fmt.Printf("due: %v\n", invoice.DueDate)

}
