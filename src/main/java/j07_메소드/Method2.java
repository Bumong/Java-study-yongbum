package j07_메소드;

public class Method2 {
    /*
        메소드 오버로딩
     */

    public static void print(String name){
        System.out.println("이름 : " + name);     //매게변수의 자료형이 다르면 메소드이름 같아도 무관
    }

    public static void print(int age){        // 객체 = 컴퓨터(pc) 데이터(변수) = 모니터,본체, 키보드, 마우스, 스피커 등
        System.out.println("나이 : " + age);   // 기능(메소드) = 화면출력, 프로그램 실행, 입력, 소리출력 등  상속, 캡슐화, 추상화, 다형성
    }

    public static void print(String name, int age){      //
        System.out.println("이름 : " + name + " 나이 : " + age);
    }

    public static void main(String[] args) {

        print("권용범");
        print(23);
        print("권용범", 23 );


    }
}
