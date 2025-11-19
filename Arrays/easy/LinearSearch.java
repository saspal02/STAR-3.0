package Arrays.easy;

public class LinearSearch {

    static int linearSearch(int[] arr, int elementToSearch) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == elementToSearch) {
                return arr[i];
            }
        }

        return -1;
    }
}
