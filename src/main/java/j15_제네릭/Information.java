package j15_제네릭;

public class Information<T> {
    private T target;

    public Information(T target) {
        this.target = target;
    }

    public void printInfo(){
        System.out.println(target);
    }
}
