package backtracking;

/*
Rat in a Maze

You are given a starting position for a rat which is stuck in a maze at an initial point (0, 0) (the maze can be thought of as a 2-dimensional plane). The maze would be given in the form of a square matrix of order N*N where the cells with value 0 represent the maze's blocked locations while value 1 is the open/available path that the rat can take to reach its destination. The rat's destination is at (N - 1, N - 1).

Your task is to find all the possible paths that the rat can take to reach from source to destination in the maze.

The possible directions that it can take to move in the maze are 'U' (up) i.e. (x, y - 1), 'D' (down) i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).

(This problem is similar to Grid ways.)



Sample Input: int maze[][] = {{ 1, 0, 0, 0 },
                              { 1, 1, 0, 1 },
                              { 0, 1, 0, 0 },
                              { 1, 1, 1, 1 }};

Sample Output: 1  0  0  0
               1  1  0  0
               0  1  0  0
               0  1  1  1
*/
public class RatMaze {
    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, +1, -1};
    static char[] dir = {'U', 'D', 'R', 'L'};

    public static void findPaths(int[][] maze, int row, int col, String path) {
        // boundary check
        if (row < 0 || row >= maze.length || col < 0 || col >= maze.length) {
            return;
        }

        // blocked (0) or visited (-1)
        if (maze[row][col] == 0 || maze[row][col] == -1) {
            return;
        }

        if (row == maze.length - 1 && col == maze.length - 1) {
            System.out.println(path);
            return;
        }

        maze[row][col] = -1; // mark visited
        
        for (int i = 0; i < 4; i++) {
            int nr = row + dr[i];
            int nc = col + dc[i];
            findPaths(maze, nr, nc, path + dir[i]);
        }

        maze[row][col] = 1; // backtrack (restore to open path: 1)
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 1, 1, 0},
            {1, 0, 1, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 1}
        };

        findPaths(maze, 0, 0, "");
    }
}
// TC: O(4^(n^2)) | SC: O(n^2)