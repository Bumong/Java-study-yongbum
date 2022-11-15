package j03_연산자;
/*
    논리연산
    &&(and) - 곱
    ||(or) - 합
    !(not) - 부정

    true(1)
    false(0)
 */

public class Operation1 {
    public static void main(String[] args) {

        boolean a = 100 % 4 == 0;
        boolean b = 100 % 4 != 0 ;

        System.out.println(a && a);
        System.out.println(a && b);
        System.out.println(b && b);

        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || b);






    }
}
