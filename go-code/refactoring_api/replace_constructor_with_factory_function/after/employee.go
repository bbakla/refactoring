package before

import "fmt"

type Employee struct {
	name     string
	typeCode string
}

/*
Go doesnt have constructor mechanism. So it forces the developer to create constructor functions.
So we already have the flexibility that refactor could bring. Lets still refactor more
*/
func NewEmployee(name string, typeCode string) Employee {
	return Employee{name: name, typeCode: typeCode}
}

// STEP 1: Create a factory function for engineer
func CreateEngineer(name string) Employee {
	return Employee{
		name:     name,
		typeCode: "E",
	}
}

func (e Employee) GetTypeCode() string {
	return e.getTypeCodes()[e.typeCode]
}

func (e Employee) getTypeCodes() map[string]string {
	return map[string]string{"E": "Engineer", "M": "Manager", "S": "Salesman"}
}

func main() {
	//STEP 2: Use Engineer factory method directly
	//employee := NewEmployee("John", "E") //Having a string literal is a smell.

	employee := CreateEngineer("John")
	fmt.Println("Name:", employee.name)
	fmt.Println("Type:", employee.typeCode)
	fmt.Println("Legal Type Codes:", employee.GetTypeCode())
}
