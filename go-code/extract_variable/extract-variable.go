package extract_variable

import (
	"gitlab.com/clean-code55/refactor/improving-design-of-existing-code/go-code/models"
	"math"
)

func price(order models.Order) float64 {
	// price = base price - quantity discount + shipping
	return float64(order.Quantity)*order.ItemPrice -
		math.Max(0, float64(order.Quantity-500))*0.05 +
		math.Min(float64(order.Quantity)*order.ItemPrice*0.1, 100)
}
