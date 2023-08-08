package after

type Person struct {
	telephoneNumber TelephoneNumber
}

func (p *Person) getOfficeAreaCode() string {
	return p.telephoneNumber.areaCode
}

// STEP 2: Create new Object for each setting
func (p *Person) setOfficeAreaCode(areaCode string) {
	p.telephoneNumber = New(areaCode, p.telephoneNumber.getNumber())
}

func (p *Person) getOfficeNumber() string {
	return p.telephoneNumber.getNumber()
}

// STEP 3: Create new Object for each setting
func (p *Person) setOfficeNumber(officeNumber string) {
	p.telephoneNumber = New(p.telephoneNumber.getAreaCode(), officeNumber)
}
