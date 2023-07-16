package refactoring.encapsulation.replace_primitive_with_object.after;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class Priority {
  private Integer priority;

  public Priority(Integer priority) {
    this.setPriority(priority);
  }

  //Step 4: OPTIONAL- Add validation for initialization of priority. Also priority is set
  // by only one method
  public void setPriority(Integer value) {
    if(legalValues().contains(value)) {
      this.priority = value;
    } else {
      throw new IllegalArgumentException("Not valid");
    }
  }

  private List<Integer> legalValues() {
    return List.of(1, 2, 3);
  }

  //Step 5: simplify the client code by adding this behavior to the Priority
  public boolean higherThan(Integer priority) {
    return this.priority > priority;
  }
}