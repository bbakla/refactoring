package refactoring.conditional_logic.decompose_conditional.after;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Plan {
  private LocalDate summerStart;
  private LocalDate summerEnd;
  private double summerRate;
  private double regularRate;
  private double regularServiceCharge;


}
