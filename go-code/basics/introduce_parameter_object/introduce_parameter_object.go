package introduce_parameter_object

import "fmt"

type Reading struct {
	Temp int
	Time string
}

type Station struct {
	Name     string
	Readings []Reading
}

func readingsOutsideRange(station Station, min int, max int) {
	for _, r := range station.Readings {
		if r.Temp < min || r.Temp > max {
			fmt.Println("Reading outside range: ", r.Temp)
		}
	}
}
