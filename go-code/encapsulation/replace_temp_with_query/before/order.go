package before

type Order struct {
	Quantity int
	Price    float64
}

func (o Order) getPrice() float64 {
	basePrice := float64(o.Quantity) + o.Price
	discountFactor := 0.98

	if basePrice > 100 {
		discountFactor = 0.98
	}

	return basePrice * discountFactor
}
