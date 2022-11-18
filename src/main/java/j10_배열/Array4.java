package j10_배열;

public class Array4 {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int min = 0;
        int min1 = nums1[0];
        int max1 = nums1[0];

        int max = 0;
        int min2 = nums2[0];
        int max2 = nums2[0];

        int first = 0;
        int second = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] < min1) {
                min1 = nums1[i];
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] > max1){
                max1 = nums1[i];
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] < min2) {
                min2 = nums2[i];
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] > max2){
                max2 = nums2[i];
            }
        }

        if(min1 > min2){
            min = min1;
        }else min = min2;

        if(max1 > max2){
            max = max1;
        }else max = max2;

        while (true) {
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] == min){
                    first = nums1[i];
                    break;
                }
                if (nums2[i] == min){
                    first = nums2[i];
                    break;
                }
            }

            for (int i = 0; i < nums2.length; i++){
                if (nums1[i] == max){
                    second = nums1[i];
                    break;
                }
                if (nums2[i] == max){
                    second = nums2[i];
                    break;
                }
            }
            break;

        }
        System.out.println("1. " + first);
        System.out.println("2. " + second);

    }

}
