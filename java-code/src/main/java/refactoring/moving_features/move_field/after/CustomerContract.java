package refactoring.moving_features.move_field.after;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CustomerContract {

  private LocalDate startDate;
}
