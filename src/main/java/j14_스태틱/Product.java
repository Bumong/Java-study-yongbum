package j14_스태틱;

import lombok.Data;

/*
   정적영역(공유영역)
   정의할 때 부터 메모리 할당 그래서 다른 클래스에서 바로 사용가능(메모리 할당 필요없다.)
   하지만 스테틱메소드안에 private변수는 할당하지 않으면 사용불가

 */
@Data
public class Product {

    private static int autoIncrement = 20220000;

    private int serialNumber;
    private String name;

    public Product(String name) {
        this.serialNumber = ++autoIncrement;
        this.name = name;
    }

    public static void print(){
        System.out.println(autoIncrement);
        Product product = new Product("아이폰");

        System.out.println(product.add(10,20));
    }

    public int add(int a, int b) {
        return a + b;

    }
}
