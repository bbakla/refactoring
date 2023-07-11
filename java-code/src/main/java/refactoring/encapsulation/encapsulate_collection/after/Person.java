package refactoring.encapsulation.encapsulate_collection.after;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


public class Person {
  @Getter
  @Setter
  private String name;

  private List<Course> courseList = new ArrayList<>();

  //Step 1: Encapsulate the list by adding add and remove methods
  public void addCourse(Course course) {
    this.courseList.add(course);
  }

  public void removeCourse(Course course) {
    this.courseList.remove(course);
  }

  public void removeCourseByName(String name) {
    this.courseList.removeIf(c -> c.getName().equals(name));
  }

  //Step 2: Return a copy of courseList to complete the encapsulation
  public List<Course> getCourseList() {
    return Collections.unmodifiableList(this.courseList);
  }
}
