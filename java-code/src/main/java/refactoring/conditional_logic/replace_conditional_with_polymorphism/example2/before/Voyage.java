package refactoring.conditional_logic.replace_conditional_with_polymorphism.example2.before;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Voyage {
  private String zone;
  private int length;
}
