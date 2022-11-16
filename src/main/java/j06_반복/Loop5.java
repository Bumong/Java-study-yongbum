package j06_반복;

import java.util.Scanner;

public class Loop5 {

    public static boolean selectionCondition(String select, int a, int b) {
        boolean loopflag = true;

        if (select.equals("1")) {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (select.equals("2")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (select.equals("3")) {
            System.out.println(a + " x " + b + " = " + (a * b));
        } else if (select.equals("4")) {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else if (select.equals("5")) {
            System.out.println(a + " % " + b + " = " + (a % b));
        } else if (select.equals("q")) {
            loopflag = false;
        } else {
            System.out.println("다시 입력하세요");
        }
        return loopflag;
    }

    public static void main(String[] args) {

        boolean loopflag = true;
        int a = 10;
        int b = 2;
        String select = null;

            while (loopflag) {
                System.out.println("---------------------------");
                System.out.println("1. 덧셈");
                System.out.println("2. 뺄셈");
                System.out.println("3. 곱셈");
                System.out.println("4. 나눗셈");
                System.out.println("5. 나머지");
                System.out.println("q. 프로그램종료");
                System.out.print("입력하세요 : ");
                Scanner sc = new Scanner(System.in);
                select = sc.next();

                loopflag = selectionCondition(select, a, b);

            }


    }
}
