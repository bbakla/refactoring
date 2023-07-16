package after

import "log"

type Priority struct {
	//Step 2: Define priority in the new data structure
	Value int
}

// Step3: Create a single change of point for setting prio
func (p Priority) setPriority(prio int) {
	if p.legal(prio) {
		p.Value = prio
	} else {
		log.Fatalf("prio  %d is not value", prio)
	}
}

func (p Priority) legal(value int) bool {
	values := []int{1, 2, 3}
	for _, v := range values {
		if v == value {
			return true
		}
	}

	return false
}

func (p Priority) higherThan(value int) bool {
	return p.Value > value
}
