package j03_연산자;

public class LeapMonth {
    public static void main(String[] args) {

        int year = 2000;
        String result = (year & 4) == 0 && (year % 100) != 0 || (year % 400) == 0? "윤달입니다": "윤달이 아닙니다";

        System.out.println(year + ": " + result );




        /*
        윤달의 조건 4의배수이고 100의 배수는 아니고 400의 배수
        2000:윤년입니다.
        1999:윤년이 아닙니다.
         */
    }
}
