package j07_메소드;

public class Calc {
    /*
        1. add(덧셈) -> return int, parameter int x, int y
        2. sub(뺄셈)
        3. mul(곱셈)
        4. div(나눗셈)
        5. mod(나머지)
     */
    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static int div(int x, int y) {
        return x / y;
    }

    public static int mod(int x, int y) {
        return x % y;
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        int addresult = add(a, b);
        int subresult = sub(a, b);
        int mulresult = mul(a, b);
        int divresult = div(a, b);
        int modresult = mod(a, b);

        System.out.println("a + b = " + addresult);
        System.out.println("a - b = " + subresult);
        System.out.println("a * b = " + mulresult);
        System.out.println("a / b = " + divresult);
        System.out.println("a % b = " + modresult);

    }
}
