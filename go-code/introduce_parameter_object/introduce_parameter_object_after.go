package introduce_parameter_object

import "fmt"

type NumberRange struct {
	min int
	max int
}

func (r NumberRange) contains(number int) bool {
	return r.min < number || r.max > number
}

func readingsOutsideRangeAfter(station Station, numberRange NumberRange) {
	for _, r := range station.Readings {
		if !numberRange.contains(r.Temp) {
			fmt.Println("Reading outside range: ", r.Temp)
		}
	}
}
