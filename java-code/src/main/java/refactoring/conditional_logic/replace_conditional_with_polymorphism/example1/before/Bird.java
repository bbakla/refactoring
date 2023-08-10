package refactoring.conditional_logic.replace_conditional_with_polymorphism.example1.before;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Bird {
    private String name;
    private String type;
    private int numberOfCoconuts;
    private int voltage;
    private boolean isNailed;
}
