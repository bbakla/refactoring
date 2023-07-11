package extract_variable

import (
	"gitlab.com/clean-code55/refactor/improving-design-of-existing-code/go-code/basics/models"
	"math"
)

// this func can be moved to Order
func priceAfter(order models.Order) float64 {
	// price = base price - quantity discount + shipping
	basePrice := float64(order.Quantity) * order.ItemPrice
	orderDiscount := math.Max(0, float64(order.Quantity-500)) * 0.05
	shipping := math.Min(basePrice*0.1, 100)

	return basePrice - orderDiscount + shipping
}
