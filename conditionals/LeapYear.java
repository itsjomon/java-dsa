package conditionals;

import java.util.Scanner;

// Write a program that takes a year from the user and print whether that year is a leap year or not.
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // A leap year is divisible by 4, but not by 100, unless it is also divisible by 400.

        // ===== Method 1: Nested If Else =====
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



        // ===== Method 2: Else If Ladder =====
        // if (year % 400 == 0) {
        //     System.out.println(year + " is a leap year");
        // } else if (year % 100 == 0) {
        //     System.out.println(year + " is not a leap year");
        // } else if (year % 4 == 0) {
        //     System.out.println(year + " is a leap year");
        // } else {
        //     System.out.println(year + " is not a leap year");
        // }



        // ===== Method 3: Boolean Variable =====
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
