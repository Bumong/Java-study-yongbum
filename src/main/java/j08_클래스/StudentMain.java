package j08_클래스;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("부경대", "홍길순", 2, false);

        student1.school = "부산대";
        student1.name = "홍길동";
        student1.studentYear = 3;
        student1.gender = true;

        student1.showStudentInfo();
        student2.showStudentInfo();




    }
}
