package backtracking;

// Place N Knights on a N*N chessboard such that no 2 Knights can attack each other.
public class NKnight {
    public static void nKnights(char[][] board, int row) {
        // base
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'K';
                nKnights(board, row + 1);
                board[row][j] = '.'; // backtracking step
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // 2 up, 1 left
        if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1] == 'K') {
            return false;
        }
        
        // 2 up, 1 right
        if (row - 2 >= 0 && col + 1 < board.length && board[row - 2][col + 1] == 'K') {
            return false;
        }
        
        // 1 up, 2 left
        if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2] == 'K') {
            return false;
        }
        
        // 1 up, 2 right
        if (row - 1 >= 0 && col + 2 < board.length && board[row - 1][col + 2] == 'K') {
            return false;
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("----- Chess Board -----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // init
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nKnights(board, 0);
    }
}

// TC: O(n!) | SC: O(n^2)
