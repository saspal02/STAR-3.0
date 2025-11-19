package Maths;

import java.util.ArrayList;
import java.util.Collections;

public class PrintDivisors {

    public void divisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for new line after printing all divisors
    }

    public static int[] divisors2(int n) {
        ArrayList<Integer> temp = new ArrayList<>();

        // Find divisors up to sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                temp.add(i); // small divisor
                if (i != n / i) { // add paired divisor if not the square root
                    temp.add(n / i);
                }
            }
        }

        // Sort the divisors
        Collections.sort(temp);

        // Convert ArrayList to int[]
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }

        return result;
    }

}
