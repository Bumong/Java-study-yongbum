package j15_제네릭;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

    private int StudentCode;
    private String name;
}
