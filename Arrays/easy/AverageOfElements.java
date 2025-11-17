package Arrays.easy;

public class AverageOfElements {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        System.out.println(findAverageOfElements(arr));

    }

    static double findAverageOfElements(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = arr[i] + sum;
        }

        return (double) sum / arr.length;
    }
}
