package functionsandmethods;

import java.util.*;


public class FunctionBasics {
    // ----- Function -----
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello Java!");
        
        return; // return is optional for void methods
    }



    // ----- Function with Parameters -----
    public static int calSum(int num1, int num2) { // Parameters or formal parameters
        int sum = num1 + num2;

        return sum;
    }



    // ----- Swap: values exchange (With Function) -----
    public static void swap(int e, int f) { // Receives COPIES of original values
        int temp = e; // Swaps local copies only
        e = f;
        f = temp;

        // Original variables in main remain unchanged (Java is pass-by-value)
        System.out.println("e = " + e); // Prints swapped local values
        System.out.println("f = " + f);
    }



    public static void main(String[] args) {
        // ----- Hello World -----
        printHelloWorld(); // Function call



        // ----- User Input & Sum -----
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();

        int sum = calSum(a, b); // Arguments or actual parameters

        System.out.println("Sum is: " + sum);

        sc.close();



        // ----- Swap: values exchange (Without Function) -----
        int c = 5;
        int d = 10;

        // Original values changed because we swapped c and d directly (no function copies involved)
        int temp = c;
        c = d;
        d = temp;

        System.out.println("c = " + c);
        System.out.println("d = " + d);



        // ----- Swap: values exchange (With Function) -----
        int e = 15;
        int f = 5;
        
        System.out.println("Before swap function: e = " + e + ", f = " + f); // Shows original values: 15, 5
        swap(e, f); // Passes COPIES (15 and 5) - original e, f remain 15, 5
        System.out.println("After swap function: e = " + e + ", f = " + f); // Still 15, 5 (copies changed, originals didn't)
        // Java passes copies, not references - so original e, f remain 15, 5
    }
}