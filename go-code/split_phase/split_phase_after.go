package split_phase

import "math"

// PriceData Step 2: Create intermediate struct
type PriceData struct {

	//Step3: Move pricing related data into intermediate struct
	Qantity   int
	BasePrice float64
	Discount  float64
}

func priceOrderAfter(product Product, quantity int, shippingMethod ShippingMethod) float64 {

	//Step 4: Move price calculation phase into a separate method
	priceData := calculatePricingData(product, quantity)

	return applyShipping(priceData, shippingMethod)
}

func calculatePricingData(product Product, quantity int) PriceData {
	basePrice := product.BasePrice * float64(quantity)
	discount := math.Max(float64(quantity-product.DiscountThreshold), 0) * product.BasePrice * product.DiscountRate

	priceData := PriceData{
		BasePrice: basePrice,
		Qantity:   quantity,
		Discount:  discount,
	}
	return priceData
}

// Step 1: split the shipping part from the main func
func applyShipping(priceData PriceData, shippingMethod ShippingMethod) float64 {
	shippingPerCase := shippingMethod.FeePerCase
	if priceData.BasePrice > float64(shippingMethod.DiscountThreshold) {
		shippingPerCase = shippingMethod.DiscountedFee
	}
	shippingCost := float64(priceData.Qantity) * shippingPerCase

	return priceData.BasePrice - priceData.Discount + shippingCost
}
