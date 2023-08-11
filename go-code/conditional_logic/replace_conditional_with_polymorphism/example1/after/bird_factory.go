package after

//STEP 3: Create bird factory

func CreateBird(bird BirdAttributes) Bird {

	switch bird.Type {
	case "EuropeanSwallow":
		return &EuropeanSwallow{
			BirdAttributes: bird,
		}
	case "AfricanSwallow":
		return &AfricanSwallow{BirdAttributes: bird}
	case "NorwegianBlueParrot":
		return &NorwegianBlueParrot{BirdAttributes: bird}
	default:
		return &DefaultBird{BirdAttributes: bird}
	}

}
