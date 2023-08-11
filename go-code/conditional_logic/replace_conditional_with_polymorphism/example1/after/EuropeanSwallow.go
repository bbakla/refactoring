package after

type EuropeanSwallow struct {
	BirdAttributes
}

func (e EuropeanSwallow) GetBirdAttributes() BirdAttributes {
	return e.BirdAttributes
}

func (e EuropeanSwallow) Plumage() string {
	return "average"
}

func (e EuropeanSwallow) AirSpeedVelocity() int {
	return 35
}
