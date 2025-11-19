package Arrays.easy;

import java.util.Arrays;

public class MaxAndMin {

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
