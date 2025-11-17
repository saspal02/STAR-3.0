package Basics;

import java.util.*;

public class UserInput {
    static void printNumber(int n) {
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        printNumber(x);
    }
}
