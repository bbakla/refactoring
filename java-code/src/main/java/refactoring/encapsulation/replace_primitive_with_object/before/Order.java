package refactoring.encapsulation.replace_primitive_with_object.before;

import lombok.Getter;
  import lombok.Setter;


@Getter
public class Order {

  private Integer priority;
  public Order(InitData data) {
    //start initialization
    this.priority = data.getPriority();
  }


  @Getter
  @Setter
  private class InitData {
    private Integer priority;
  }
}
