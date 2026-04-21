package loops;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not a prime number");
        } else if (n == 2) {
            System.out.println(n + " is a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // // n is a multiple of i (i is not equal to 1 or n)
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }

        sc.close();
    }
}

// Check if a number is prime or not (a prime number is a number that is only divisible by 1 and itself)