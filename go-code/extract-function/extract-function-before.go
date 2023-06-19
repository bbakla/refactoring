package extract_function

import (
	"fmt"
	"time"
)

type Invoice struct {
	Orders   []Order
	Customer string
	DueDate  time.Time
}

type Order struct {
	Name   string
	Amount int
}

func printOwing(invoice Invoice) {
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
