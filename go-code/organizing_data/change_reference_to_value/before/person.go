package before

type Person struct {
	telephoneNumber TelephoneNumber
}

func (p *Person) getOfficeAreaCode() string {
	return p.telephoneNumber.areaCode
}

func (p *Person) setOfficeAreaCode(arg string) {
	p.telephoneNumber.areaCode = arg
}

func (p *Person) getOfficeNumber() string {
	return p.telephoneNumber.number
}

func (p *Person) setOfficeNumber(arg string) {
	p.telephoneNumber.number = arg
}
