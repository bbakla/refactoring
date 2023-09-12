package after

//STEP 8.2: We dont need the struct anymore

/*type ChargeCalculator struct {
//STEP 7: We dont need the struct variable definition anymore
/*Customer Customer
Usage    float64
Provider Provider
*/
//}*/

type Customer struct {
	BaseRate float64
	// ... other fields if needed
}

type Provider struct {
	ConnectionCharge float64
	// ... other fields if needed
}

//STEP 4: We dont need  BaseCharge anymore
/*func (calculator ChargeCalculator) BaseCharge() float64 {
	return calculator.Customer.BaseRate * calculator.Usage
}*/

//STEP 5: Change signature of the Charge Method
//func (calculator ChargeCalculator) Charge() float64 {
//STEP 8.1: We actually dont need the struct anymore
/*func (calculator ChargeCalculator) Charge(customer Customer, usage float64, provider Provider) float64 {
	//STEP 3: Inline baseCharge calculation
	//STEP 6: We dont need the struct variables anymore
	baseCharge := customer.BaseRate * usage
	return baseCharge + provider.ConnectionCharge
}*/

// STEP 1: Create a function for Charge
// STEP 8: Struct function now can be defined to the new function.
func Charge(customer Customer, usage float64, provider Provider) float64 {
	//return ChargeCalculator{Customer: customer, Usage: usage, Provider: provider}.Charge(customer, usage, provider)
	//return ChargeCalculator{}.Charge(customer, usage, provider)
	baseCharge := customer.BaseRate * usage
	return baseCharge + provider.ConnectionCharge
}

func main() {
	customer := Customer{BaseRate: 0.05}
	provider := Provider{ConnectionCharge: 10.0}
	//STEP 2: Call the function
	//calculator := ChargeCalculator{Customer: customer, Usage: 100.0, Provider: provider}
	//charge := calculator.Charge()
	println("Charge:", Charge(customer, 100.0, provider))
}
