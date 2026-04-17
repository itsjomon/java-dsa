package conditionalstatements.practice;

import java.util.Scanner;

public class Ans5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // A leap year is divisible by 4, but not by 100, unless it is also divisible by 400.

        // ===== METHOD 1: Nested if-else =====
        // if (year % 4 == 0) {
        //     if (year % 100 == 0) {
        //         if (year % 400 == 0) {
        //             System.out.println(year + " is a leap year");
        //         } else {
        //             System.out.println(year + " is not a leap year");
        //         }
        //     } else {
        //         System.out.println(year + " is a leap year");
        //     }
        // } else {
        //     System.out.println(year + " is not a leap year");
        // }


        // ===== METHOD 2: else-if ladder =====
        // if (year % 400 == 0) {
        //     System.out.println(year + " is a leap year");
        // } else if (year % 100 == 0) {
        //     System.out.println(year + " is not a leap year");
        // } else if (year % 4 == 0) {
        //     System.out.println(year + " is a leap year");
        // } else {
        //     System.out.println(year + " is not a leap year");
        // }

        // ===== METHOD 3: Boolean variable =====
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}