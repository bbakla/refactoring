package after

type DefaultBird struct {
	BirdAttributes
}

func (n DefaultBird) GetBirdAttributes() BirdAttributes {
	return n.BirdAttributes
}

func (n DefaultBird) Plumage() string {
	return "unknown"
}

func (n DefaultBird) AirSpeedVelocity() int {

	return 0
}
