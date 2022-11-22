package j12_추상.추상클래스;
/*
    추상화 하는 이유는 객체지향언어때문
 */
public class Tiger extends Animal{

    public Tiger(String kind) {
        super(kind);

    }

    public Tiger() {
}
    @Override
    public void move() {
        System.out.println("호랑이가 움직인다");
    }
}
