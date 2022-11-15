package j06_반복;

public class Loop2 {
    public static void main(String[] args) {





        for(int i = 0; i < 8; i++){
            System.out.println();
            int a = i + 2;
            System.out.println(a + "단");
            for(int j = 0; j < 9; j++){


                int b = j + 1;
                System.out.println(a + " x " + b + " = " + ( a * b));

            }

        }
    }
}
