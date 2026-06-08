package twodimensionalarray;

public class SearchA2DMarix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        // top-right
        /*
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Target found at (" + row + ", " + col + ")");
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("Target not found");
        return false; */


        // bottom-left
        int row = matrix.length - 1, col = 0;
            
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == target) {
                System.out.println("Found at (" + row + ", " + col + ")");
                return true;
            } else if (target < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        
        System.out.println("Target not found");
        return false;
    }
        
        

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;

        searchMatrix(matrix, target);
    }
}

// Search a 2D Matrix (LeetCode 74)
// https://leetcode.com/problems/search-a-2d-matrix/description/