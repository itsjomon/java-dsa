package loops;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum+=i;
            i++;
        }

        System.out.println("Sum is: " + sum);
        
        sc.close();
    }
}

// Print sum of first n natural numbers