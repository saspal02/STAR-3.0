package Arrays.Easy;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        System.out.println(findSecondLargestElement(arr));
    }

    static int findSecondLargestElement(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];

            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }

        }

        return secondMax;

    }
}
