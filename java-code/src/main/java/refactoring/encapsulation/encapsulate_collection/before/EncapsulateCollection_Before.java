package refactoring.encapsulation.encapsulate_collection.before;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EncapsulateCollection_Before {

  private Person person;

  public List<Course> findAdvanceCourses() {
    return person.getCourseList().stream().filter(
        Course::isAdvanced).toList();
  }

  public void addCourse(Course course) {
    //this.person.setCourseList(List.of(course)); // also possible. Overrides the whole collection
    this.person.getCourseList().add(course);
  }

}
