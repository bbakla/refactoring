package after

import (
	"log"
	"time"
)

type Order struct {
	DeliveryState string
	PlacedOn      time.Time
}

//STEP 1 : I refactor the method by Decompose Conditional
//STEP 3: I dont need deliveryDate func anymore
/*func deliveryDate(anOrder Order, isRush bool) time.Time {
	if isRush {
		return rushDeliveryData(anOrder)
	} else {
		return regularDeliveryDate(anOrder)
	}
}*/

func regularDeliveryDate(anOrder Order) time.Time {
	var deliveryTime int

	if contains([]string{"MA", "CT", "NY"}, anOrder.DeliveryState) {
		deliveryTime = 2
	} else if contains([]string{"ME", "NH"}, anOrder.DeliveryState) {
		deliveryTime = 3
	} else {
		deliveryTime = 4
	}
	return anOrder.PlacedOn.AddDate(0, 0, 2+deliveryTime)
}

func rushDeliveryData(anOrder Order) time.Time {
	var deliveryTime int

	if contains([]string{"MA", "CT"}, anOrder.DeliveryState) {
		deliveryTime = 1
	} else if contains([]string{"NY", "NH"}, anOrder.DeliveryState) {
		deliveryTime = 2
	} else {
		deliveryTime = 3
	}
	return anOrder.PlacedOn.AddDate(0, 0, 1+deliveryTime)
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

	//STEP 2: I can now call directly the function that doesnt require argument flag
	notRushDeliveryDate := regularDeliveryDate(order)
	rushDeliveryDate := rushDeliveryData(order)

	log.Printf("notRushDeliveryDate = %v\n", notRushDeliveryDate)
	log.Printf("rushDeliveryDate = %v\n", rushDeliveryDate)
}
