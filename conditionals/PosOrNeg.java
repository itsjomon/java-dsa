package conditionals;

import java.util.Scanner;

// Write a program to get a number from the user and print whether it is positive or negative.
public class PosOrNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("x is a positive number");
        } else if (x == 0) {
            System.out.println("x is neither positive nor negative");
        } else {
            System.out.println("x is a negative number");
        }

        sc.close();
    }
}
