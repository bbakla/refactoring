package models

import "math"

type Order struct {
	Name      string
	Amount    int
	ItemPrice float64
	Quantity  int
}

// after the refactor for extract-variable
func (order *Order) Price() float64 {

	return order.basePrice() - order.discount() + order.shippingCost()
}

func (order *Order) shippingCost() float64 {

	return math.Min(order.basePrice()*0.1, 100)
}

func (order *Order) discount() float64 {

	return math.Max(0, float64(order.Quantity-500)) * 0.05
}

func (order *Order) basePrice() float64 {

	return float64(order.Quantity) * order.ItemPrice
}
