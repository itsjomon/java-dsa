package twodimensionalarray;

import java.util.*;

public class Create2DArray {
    public static boolean search(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ( matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }

        System.out.println("Not found");
        return false;
    }

    public static void findLargest(int[][] matrix) {
        int largest = matrix[0][0];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest number: " + largest);
    }

    public static void findSmallest(int[][] matrix) {
        int smallest = matrix[0][0];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest number: " + smallest);
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        // int n = 3, m = 3;
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();


        // Output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 5);
        findLargest(matrix);
        findSmallest(matrix);

    }
}
