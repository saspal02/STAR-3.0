package Arrays.Easy;

public class PrintElements {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        printElements(arr);

    }

    static void printElements(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
