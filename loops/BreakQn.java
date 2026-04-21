package loops;

import java.util.Scanner;

public class BreakQn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();

            if ( n % 10 == 0) {
                break; // Exit the loop if the number is a multiple of 10
            }

            System.out.println(n);
        } while (true);

        sc.close();
    }
}

// Keep entering numbers till user enters a multiple of 10