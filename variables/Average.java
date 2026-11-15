package variables;

import java.util.*;

// In a program, input 3 numbers: a, b and c. You have to output the average of these 3 numbers.
// (Hint: Average of N numbers is sum of those numbers divided by N)
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a + b + c) / 3;

        System.out.println("Average is: " + avg);
        
        sc.close();
    }
}
