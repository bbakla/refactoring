package refactoring.encapsulation.encapsulate_collection.after;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EncapsulateCollection_After {

  private Person person;

  public List<Course> findAdvanceCourses() {
    return person.getCourseList().stream().filter(Course::isAdvanced).toList();
  }

  public void addCourse(Course course) {
    this.person.addCourse(course);
  }

}
