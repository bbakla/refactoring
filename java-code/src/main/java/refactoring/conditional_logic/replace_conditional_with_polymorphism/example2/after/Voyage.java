package refactoring.conditional_logic.replace_conditional_with_polymorphism.example2.after;


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
