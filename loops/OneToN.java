package loops;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int counter = 1;

        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }

        sc.close();
    }
}

// Print numbers from 1 to n, where n is provided by the user as input.