package arrays.part1;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        // ===== Create =====
        double[] marks = new double[50];
        // int[] numbers = {1, 2, 3};
        // String[] fruits = {"apple", "mango", "orange"};



        // ===== Input =====
        Scanner sc = new Scanner(System.in);
        // double phy;
        // phy = sc.nextDouble();

        marks[0] = sc.nextDouble();
        marks[1] = sc.nextDouble();
        marks[2] = sc.nextDouble();

        sc.close();



        // ===== Output =====
        System.out.println("Phy: " + marks[0]);
        System.out.println("Chem: " + marks[1]);
        System.out.println("Math: " + marks[2]);



        // ===== Update =====
        // marks[1] = 35;
        // marks[1] = marks[1] + 3;
        // System.out.println("Chem: " + marks[1]);

        double avg = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Average = " + avg);

        System.out.println("length of array = " + marks.length);
    }    
}
