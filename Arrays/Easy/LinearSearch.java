package Arrays.Easy;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int elementToSearch = 30;
        System.out.println(linearSearch(arr,elementToSearch));

    }

    static int linearSearch(int[] arr, int elementToSearch) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == elementToSearch) {
                return arr[i];
            }
        }

        return -1;
    }
}
