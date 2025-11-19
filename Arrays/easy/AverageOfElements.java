package Arrays.easy;

public class AverageOfElements {

    static double findAverageOfElements(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = arr[i] + sum;
        }

        return (double) sum / arr.length;
    }
}
