package chapter6_OOP1;

import java.util.Arrays;

public class Exercise6_23 {
    public static int max(int[] arr) {
        int max = -999999;

        if(arr==null){
            return -999999;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[]{}));
    }
}
