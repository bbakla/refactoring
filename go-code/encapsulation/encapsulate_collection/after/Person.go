package before

type Person struct {
	Name    string
	courses []Course
}

func (p Person) addCourse(course Course) {
	p.courses = append(p.courses, course)
}

func (p Person) removeCourse(course Course) {

	index := 0
	for i, c := range p.courses {
		if c == course {
			index = i
			break
		}
	}

	p.courses = append(p.courses[:index], p.courses[index+1:]...)
}

func (p Person) getCourses() []Course {
	copyOfCourses := make([]Course, len(p.courses))

	copy(copyOfCourses, p.courses)

	return copyOfCourses
}
