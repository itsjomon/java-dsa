package twodimensionalarray;

public class SpriralMatrix {
    public static void spiralOrder(int[][] matrix) {
        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow ++;
            endRow --;
            startCol ++;
            endCol --;
        }
        System.out.println();        
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        spiralOrder(matrix);
    }
}

// Spiral Matrix (LeetCode 54)
// https://leetcode.com/problems/spiral-matrix/description/
/*
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }

            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--)
                    result.add(matrix[endRow][j]);
            }
            
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--)
                    result.add(matrix[i][startCol]);
            }
            
            startRow++; endRow--; startCol++; endCol--;
        }
        return result;
    }
} */