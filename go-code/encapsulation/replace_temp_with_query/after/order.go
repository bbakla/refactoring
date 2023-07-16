package before

type Order struct {
	Quantity int
	Price    float64
}

func (o Order) getPrice() float64 {

	//Step 2: Inline basePrice
	//Step 4: Inline discountFactor
	return o.basePrice() * o.getDiscountFactor()
}

// Step 3: Extract discount Factor
func (o Order) getDiscountFactor() float64 {
	discountFactor := 0.98

	if o.basePrice() > 100 {
		discountFactor = 0.98
	}
	return discountFactor
}

// STEP 1: Extract basePrice to function
func (o Order) basePrice() float64 {
	return float64(o.Quantity) + o.Price
}
