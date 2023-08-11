package after

type NorwegianBlueParrot struct {
	BirdAttributes
}

func (n NorwegianBlueParrot) GetBirdAttributes() BirdAttributes {
	return n.BirdAttributes
}

func (n NorwegianBlueParrot) Plumage() string {
	if n.Voltage > 100 {
		return "scorched"
	}
	return "beautiful"
}

func (n NorwegianBlueParrot) AirSpeedVelocity() int {
	if n.IsNailed {
		return 0
	}
	return 10 + n.Voltage/10
}
