package after

type AfricanSwallow struct {
	BirdAttributes
}

func (a AfricanSwallow) GetBirdAttributes() BirdAttributes {
	return a.BirdAttributes
}

func (a AfricanSwallow) Plumage() string {
	if a.NumberOfCoconuts > 2 {
		return "tired"
	}
	return "average"
}

func (a AfricanSwallow) AirSpeedVelocity() int {
	return 40 * a.NumberOfCoconuts
}
