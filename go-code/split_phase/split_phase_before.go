package split_phase

import "math"

type Product struct {
	BasePrice         float64
	DiscountThreshold int
	DiscountRate      float64
}

type ShippingMethod struct {
	DiscountThreshold int
	DiscountedFee     float64
	FeePerCase        float64
}

/**
* There are two things happening here:
	- First part calculates the price of the product and
   - Second part calculates the shipping cost
*
*/

func priceOrder(product Product, quantity int, shippingMethod ShippingMethod) float64 {
	basePrice := product.BasePrice * float64(quantity)
	discount := math.Max(float64(quantity-product.DiscountThreshold), 0) * product.BasePrice * product.DiscountRate
	shippingPerCase := shippingMethod.FeePerCase
	if basePrice > float64(shippingMethod.DiscountThreshold) {
		shippingPerCase = shippingMethod.DiscountedFee
	}
	shippingCost := float64(quantity) * shippingPerCase
	price := basePrice - discount + shippingCost
	return price
}
