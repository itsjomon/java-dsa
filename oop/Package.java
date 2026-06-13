// User-defined (oop)
package oop; // Groups related classes together

// Built-in (java.util)
import java.util.Scanner; // Importing Scanner from java.util package

public class Package {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner from imported package
        int a = sc.nextInt();
        sc.close();

        System.out.println("a = " + a);
    }
}

/*
WHAT IS A PACKAGE?
- A folder that groups related classes
- Prevents naming conflicts
- Makes code organized
 */