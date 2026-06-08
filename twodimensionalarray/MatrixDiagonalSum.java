package twodimensionalarray;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        // Brute force (O(n^2))
        /*
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                } else if (i + j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        } */
        

        // Optimized (O(n))
        for (int i = 0; i < mat.length; i++) {
            // primary diagonal
            sum += mat[i][i];

            // secondary diagonal (avoid double-counting center)
            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(diagonalSum(mat));
        
    }
}

// Matrix Diagonal Sum (LeetCode 1572)
// https://leetcode.com/problems/matrix-diagonal-sum/description/