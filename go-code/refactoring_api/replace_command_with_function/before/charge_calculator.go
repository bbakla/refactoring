package before

type ChargeCalculator struct {
	Customer  Customer
	Usage     float64
	Provider  Provider
}

type Customer struct {
	BaseRate float64
	// ... other fields if needed
}

type Provider struct {
	ConnectionCharge float64
	// ... other fields if needed
}


func (calculator ChargeCalculator) BaseCharge() float64 {
	return calculator.Customer.BaseRate * calculator.Usage
}

func (calculator ChargeCalculator) Charge() float64 {
	return calculator.BaseCharge() + calculator.Provider.ConnectionCharge
}

func main() {
	customer := Customer{BaseRate: 0.05}
	provider := Provider{ConnectionCharge: 10.0}
	calculator := ChargeCalculator{Customer: customer, Usage: 100.0, Provider: provider}
	charge := calculator.Charge()
	println("Charge:", charge)
}
