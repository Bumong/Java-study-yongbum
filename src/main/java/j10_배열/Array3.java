package j10_배열;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[10];
        Random random = new Random();
        int total = 0;

        for (int i = 0; i < arrayNumber.length; i++){
            while (true){
                boolean found = true;
                int randomNumber = random.nextInt(10) + 1;
                for (int j = 0; j < arrayNumber.length; j++){
                    if (arrayNumber[j] == randomNumber) {
                        found = false;
                        break;
                    }
                }
                if (found){
                    arrayNumber[i] = randomNumber;
                    total += arrayNumber[i];
                    break;
                }



            }
            System.out.print(arrayNumber[i]);
            if (i < 9){
                System.out.print(", ");
            }
        }
        System.out.print("\n총점 : " + total);


    }
}
