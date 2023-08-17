package before

import (
	"log"
	"time"
)

type Order struct {
	DeliveryState string
	PlacedOn      time.Time
}

func deliveryDate(anOrder Order, isRush bool) time.Time {
	var deliveryTime int
	if isRush {
		if contains([]string{"MA", "CT"}, anOrder.DeliveryState) {
			deliveryTime = 1
		} else if contains([]string{"NY", "NH"}, anOrder.DeliveryState) {
			deliveryTime = 2
		} else {
			deliveryTime = 3
		}
		return anOrder.PlacedOn.AddDate(0, 0, 1+deliveryTime)
	} else {
		if contains([]string{"MA", "CT", "NY"}, anOrder.DeliveryState) {
			deliveryTime = 2
		} else if contains([]string{"ME", "NH"}, anOrder.DeliveryState) {
			deliveryTime = 3
		} else {
			deliveryTime = 4
		}
		return anOrder.PlacedOn.AddDate(0, 0, 2+deliveryTime)
	}
}

func contains(slice []string, target string) bool {
	for _, item := range slice {
		if item == target {
			return true
		}
	}
	return false
}

func main() {
	order := Order{
		DeliveryState: "MA",
		PlacedOn:      time.Now(),
	}

	notRushDeliveryDate := deliveryDate(order, false)
	rushDeliveryDate := deliveryDate(order, true)

	log.Printf("notRushDeliveryDate = %v\n", notRushDeliveryDate)
	log.Printf("rushDeliveryDate = %v\n", rushDeliveryDate)
}
