package after

type Item struct {
	Quantity  int
	ItemPrice float64
}

func (item Item) finalPrice() float64 {
	basePrice := float64(item.Quantity) * item.ItemPrice
	//STEP 4: Remove discountLevel calculation as we dont need to put it to the parameter list anymore
	/*var discountLevel int
	if item.Quantity > 100 {
		discountLevel = 2
	} else {
		discountLevel = 1
	}*/
	return item.discountedPrice(basePrice)
}

// func (item Item) discountedPrice(basePrice float64, discountLevel int) float64 {
// STEP 3: We dont need discountLevel in the parameter list anymore
func (item Item) discountedPrice(basePrice float64) float64 {

	//switch discountLevel {
	// STEP 2: Use function for discountLevel
	switch item.discountLevel() {
	case 1:
		return basePrice * 0.95
	case 2:
		return basePrice * 0.9
	default:
		return basePrice
	}
}

// STEP 1: Extract discount level
func (item Item) discountLevel() int {
	if item.Quantity > 100 {
		return 2
	}

	return 1
}

func main() {
	anItem := Item{Quantity: 120, ItemPrice: 10.0}
	finalPrice := anItem.finalPrice()
	println("Final Price:", finalPrice)
}
