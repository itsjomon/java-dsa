package loops;

import java.util.*;

/*
Write a program to find the factorial of any number entered by the user.

(Hint: factorial of a number n! = n * (n-1) * (n-2) * (n-3) * ...... * 1 and exists for positive numbers only. We write factorial as n!
So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24, and so on.)
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Factorial doesn't exist for negative numbers");
        } else {
            long f = 1;

            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            
            System.out.println("Factorial of " + n + " is " + f);
        }

        sc.close();
    }
}
