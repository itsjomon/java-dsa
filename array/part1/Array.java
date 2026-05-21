package array.part1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int marks[] = new int[50];
        // int numbers[] = {1, 2, 3};
        // String fruits[] = {"apple", "mango", "orange"};


        // Input
        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        sc.close();

        // Output
        System.out.println("Phy: " + marks[0]);
        System.out.println("Chem: " + marks[1]);
        System.out.println("Math: " + marks[2]);

        // Update
        // marks[1] = 35;
        // marks[1] = marks[1] + 3;
        // System.out.println("Chem: " + marks[1]);

        int avg = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Average = " + avg);

        System.out.println("length of array = " + marks.length);


    }    
}
