package before

type Bird struct {
	Name            string
	Type            string
	NumberOfCoconuts int
	Voltage         int
	IsNailed        bool
}

func plumages(birds []Bird) map[string]string {
	result := make(map[string]string)
	for _, b := range birds {
		result[b.Name] = plumage(b)
	}
	return result
}

func speeds(birds []Bird) map[string]int {
	result := make(map[string]int)
	for _, b := range birds {
		result[b.Name] = airSpeedVelocity(b)
	}
	return result
}

func plumage(bird Bird) string {
	switch bird.Type {
	case "EuropeanSwallow":
		return "average"
	case "AfricanSwallow":
		if bird.NumberOfCoconuts > 2 {
			return "tired"
		}
		return "average"
	case "NorwegianBlueParrot":
		if bird.Voltage > 100 {
			return "scorched"
		}
		return "beautiful"
	default:
		return "unknown"
	}
}

func airSpeedVelocity(bird Bird) int {
	switch bird.Type {
	case "EuropeanSwallow":
		return 35
	case "AfricanSwallow":
		return 40 * bird.NumberOfCoconuts
	case "NorwegianBlueParrot":
		if bird.IsNailed {
			return 0
		}
		return 10 + bird.Voltage/10
	default:
		return 0
	}
}

func main() {
	// You can create Bird objects and call the functions here
}
