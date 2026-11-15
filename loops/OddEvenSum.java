package loops;

import java.util.*;

// Write a program that reads a set of integers and then prints the sum of the even and odd integers.
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of total inputs: ");
        int n = sc.nextInt();
        
        int evenSum = 0;
        int oddSum = 0;

        while (n > 0) {
            int currNum = sc.nextInt();

            if (currNum % 2 == 0) {
                evenSum = evenSum + currNum;
            } else {
                oddSum = oddSum + currNum;
            }

            n--;
        }
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        sc.close();
    }
}
