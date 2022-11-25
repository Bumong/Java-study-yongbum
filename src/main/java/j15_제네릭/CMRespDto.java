package j15_제네릭;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CMRespDto <T>{
    private String msg;
    private T data;
}
