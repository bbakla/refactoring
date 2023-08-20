package before

import (
	person "gitlab.com/clean-code55/refactor/improving-design-of-existing-code/go-code/refactoring_api/remove_setting_method/after/person"
)

func main() {

	//STEP 3: Start using constructor function
	martin := person.NewPerson(3)
	martin.Name = "martin"
}
