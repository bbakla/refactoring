package before

/*There is no way in to make variables immutable for the function which
are in the same package. We should move it to another package and make the
variables in the struct not accessible
*/

// STEP 1: Move the struct to another package
type Person struct {
	Name string
	id   int
}

// STEP 2: Create a constructor function
func NewPerson(id int) Person {
	return Person{id: id}
}
