package Arrays.easy;

import java.util.Arrays;

public class MaxAndMin {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(findMaxAndMin(arr)));

    }

    static int[] findMaxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max ) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        return new int[]{max, min};
    }
}
