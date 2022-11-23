package j13_Object;

import lombok.*;

/*
   클래스는 두가지로 나뉜다.
   1. 정보를 담는 Entity클래스
   2. 기능을 담는 Service클래스
 */
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
public class Entity {

    private String name;
    private int age;
    private String address;

    public boolean cmp(){
        return this.getClass() == Entity.class;
    }


}
