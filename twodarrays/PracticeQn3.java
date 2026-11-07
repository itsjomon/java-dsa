package twodarrays;

/*
Write a program to Find Transpose of a Matrix.

What is Transpose?

Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix, 

- Matrix
    a11  a12  a13
    a21  a22  a23

- Transposed Matrix
    a11  a21
    a12  a22
    a13  a23
 */
public class PracticeQn3 {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] result = transpose(matrix);
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}

/*
Transpose Matrix (LeetCode 867)
https://leetcode.com/problems/transpose-matrix/description/

class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }
}
 */
