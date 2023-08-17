package before

type Item struct {
	Quantity  int
	ItemPrice float64
}

func (item Item) finalPrice() float64 {
	basePrice := float64(item.Quantity) * item.ItemPrice
	var discountLevel int
	if item.Quantity > 100 {
		discountLevel = 2
	} else {
		discountLevel = 1
	}
	return item.discountedPrice(basePrice, discountLevel)
}

func (item Item) discountedPrice(basePrice float64, discountLevel int) float64 {
	switch discountLevel {
	case 1:
		return basePrice * 0.95
	case 2:
		return basePrice * 0.9
	default:
		return basePrice
	}
}

func main() {
	anItem := Item{Quantity: 120, ItemPrice: 10.0}
	finalPrice := anItem.finalPrice()
	println("Final Price:", finalPrice)
}
