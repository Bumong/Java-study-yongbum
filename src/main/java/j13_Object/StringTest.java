package j13_Object;
/*
    import는 외부에서 가져올때
    모든 클래스는 Object클래스를 상속받는다.
 */

public class StringTest {
    public static void main(String[] args) {

        String str = "A";
        String str2 = "A";
        String str3 = new String("A");

        System.out.println(str == str2);
        System.out.println(str.equals(str2));

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str == str3);

        System.out.println(str.toString());



    }
}
