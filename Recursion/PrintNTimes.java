package Recursion;

public class PrintNTimes {
    public static void printNTimes(int n) {
        // Base condition: stop when n becomes 0
        if (n == 0) return;

        System.out.println("Hello");

        // Recursive call: print for remaining (n - 1) times
        printNTimes(n - 1);
    }

}
