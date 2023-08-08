package refactoring.moving_features.move_field.before;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CustomerContract {

  private LocalDate startDate;

  //Step 1: Move discountRate to CustomerContract
  private BigDecimal discountRate;
}
