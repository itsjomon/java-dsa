package variablesanddatatypes.practice;

import java.util.*;

public class Ans1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = (a + b + c) * (1.0) / 3;

        System.out.println("Average is: " + avg);
        sc.close();
    }
}
