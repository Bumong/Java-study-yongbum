package j11_상속.동물;

public class Human extends Animal{

    public Human() {
        super(); //상위 객체를 의미

        System.out.println("Human 객체 생성");
    }
    @Override // @붙은 문법 = 어노테이션 (상위 객체로부터 재정의 된 메소드)
    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");

    }
    public void readBook(){
        System.out.println("사람이 책을 읽습니다.");
    }

}
