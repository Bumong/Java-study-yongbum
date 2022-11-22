package j12_추상.추상클래스;
/*
    추상메소드를 하나라도 포함하는 클래스는 추상클래스로 정의하여야 한다.
 */

public abstract class Animal {

    private String name;
    private String kind;


    public Animal() {
    }


    public Animal(String name) {
        this.name = name;

    }

    //추상메소드는 구현부({})가 필요없다
    public abstract void move();

    public void eat(){
        System.out.println("동물이 밥을 먹습니다");
    }




}
