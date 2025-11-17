package Basics;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();   // input marks

        if (marks >= 90) {
            System.out.println("Grade A");      // 90 – 100
        }
        else if (marks >= 70) {
            System.out.println("Grade B");      // 70 – 89
        }
        else if (marks >= 50) {
            System.out.println("Grade C");      // 50 – 69
        }
        else if (marks >= 35) {
            System.out.println("Grade D");      // 35 – 49
        }
        else {
            System.out.println("Fail");         // below 35
        }

        sc.close();
    }
}
