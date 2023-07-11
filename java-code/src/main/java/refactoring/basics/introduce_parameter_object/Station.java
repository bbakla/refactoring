
package refactoring.basics.introduce_parameter_object;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Station {

    private String name;
    private List<Reading> readings;

}
