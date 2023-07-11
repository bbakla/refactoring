package before

var person Person

func getAdvancedCourses() []Course {

	advancedCources := make([]Course, 4)
	for _, course := range person.Courses {
		if course.isAdvanced {
			advancedCources = append(advancedCources, course)
		}
	}
	return advancedCources
}

func addCourse(course Course) {
	person.Courses = []Course{course} //overrides the whole array
}
