package j14_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .username("YB")
                .password("1234")
                .email("asdasda@naver.com")
                .name("권용범")
                .build();

        System.out.println(user);
    }
}
