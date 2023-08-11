package after

type BirdAttributes struct {
	Name             string
	Type             string
	NumberOfCoconuts int
	Voltage          int
	IsNailed         bool
}

// STEP 1 : Create Bird specific behaviors
// STEP 3: Create subclasses
type Bird interface {
	GetBirdAttributes() BirdAttributes
	Plumage() string
	AirSpeedVelocity() int
}

// STEP 2 : Refactor the functions to fix compilation errors
func plumages(birds []Bird) map[string]string {
	result := make(map[string]string)
	for _, b := range birds {
		// Step 5: Call factory directly from caller function
		result[b.GetBirdAttributes().Name] = CreateBird(b.GetBirdAttributes()).Plumage()
	}
	return result
}

// STEP 2.1 : Refactor the methods to fix compilation errors
func speeds(birds []Bird) map[string]int {
	result := make(map[string]int)
	for _, b := range birds {
		// Step 5.1: Call factory directly from caller function
		result[b.GetBirdAttributes().Name] = CreateBird(b.GetBirdAttributes()).AirSpeedVelocity()
	}
	return result
}

// STEP 2.2 : Refactor the methods to fix compilation errors
// Step 4: Decouple function from bird types
// Step 5: You dont need this function with bird input argument anymore
/*func plumage(bird Bird) string {
	return CreateBird(bird.GetBirdAttributes()).Plumage()
}*/

// STEP 2.3 : Refactor the methods to fix compilation errors
// Step 4.1: Decouple function from bird types
// Step 5.1: You dont need this function with bird input argument anymore
/*func airSpeedVelocity(bird Bird) int {
	return CreateBird(bird.GetBirdAttributes()).AirSpeedVelocity()
}*/
