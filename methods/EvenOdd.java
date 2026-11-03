package methods;

import java.util.Scanner;

// Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test the method.
public class EvenOdd {
    public static boolean isEven(int n) {
        // if (n % 2 == 0) {
        //     return true;
        // } else {
        //     return false;
        // }

        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // System.out.println(isEven(n));

        if (isEven(n)) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is not even");
        }

        sc.close();
    }
}
