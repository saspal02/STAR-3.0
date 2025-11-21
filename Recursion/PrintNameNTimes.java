package Recursion;

public class PrintNameNTimes {

    public static void printNameNTimes(int n) {
        if (n == 0) return;   // base case

        System.out.println("Saswat");

        printNameNTimes(n - 1);   // recursive call
    }
}

