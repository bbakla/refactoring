package refactoring.basics.model;

import java.time.Instant;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Invoice {

  private List<Order> orders;
  private String customer;

  private Instant dueDate;

}
