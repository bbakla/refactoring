package before

type TelephoneNumber struct {
	areaCode string
	number   string
}

func (tn *TelephoneNumber) getAreaCode() string {
	return tn.areaCode
}

// You can add a setAreaCode method if you need to set the areaCode.

func (tn *TelephoneNumber) getNumber() string {
	return tn.number
}
