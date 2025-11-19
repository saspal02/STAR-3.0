package Maths;

public class ArmstrongNumber {
    static boolean armstrongNumber(int n) {

        int temp = n;
        int res = 0;

        while (n != 0) {
            int digit = n % 10;

            res += Math.pow(digit, 3);

            n = n / 10;
        }

        return res == temp;
    }
}
