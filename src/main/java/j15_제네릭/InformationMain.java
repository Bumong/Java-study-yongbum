package j15_제네릭;

public class InformationMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .StudentCode(20220001)
                .name("권용범")
                .build();

        Teacher teacher = Teacher.builder()
                .teacherCode(200)
                .name("김준일")
                .build();


        Information<Student> studentInformation
                = new Information<Student>(student);
        Information<Teacher> teacherInformation
                = new Information<Teacher>(teacher);



        studentInformation.printInfo();
        teacherInformation.printInfo();



    }

}
