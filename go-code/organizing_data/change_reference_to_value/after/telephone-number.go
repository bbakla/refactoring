package after

// STEP1: struct fields are mutable by default. Lets try to make Telephone number immutable
type TelephoneNumber struct {
	areaCode string
	number   string
}

// Create a constructor function
func New(areaCode string, number string) TelephoneNumber {
	return TelephoneNumber{
		areaCode: areaCode,
		number:   number,
	}
}

func (tn TelephoneNumber) getAreaCode() string {
	return tn.areaCode
}

func (tn TelephoneNumber) getNumber() string {
	return tn.number
}
