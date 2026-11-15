package conditionals;

import java.util.Scanner;

/*
Income Tax Calculator

Income < 5L
0% tax

Income between 5-10L
20% tax

Income > 10L
30% tax
 */
public class IncomeTaxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income: ");
        int inc = sc.nextInt();
        int tax;

        if (inc < 500000) {
            tax = 0;
        } else if (inc >= 500000 && inc < 1000000) {
            tax = (int) (inc * 0.2);
        } else {
            tax = (int) (inc * 0.3);
        }

        System.out.println("Your tax is: " + tax);
        
        sc.close();
    }
}
