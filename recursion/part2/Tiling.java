package recursion.part2;

// Given a "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board using the "2 x 1" tiles. (A tile can either be placed horizontally or vertically)
public class Tiling {
    public static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } 

        // // vertical choice
        // int verticalTiles = tiling(n - 1);

        // // horizontal ways
        // int horizontalTiles = tiling(n - 2);

        // int totalWays = verticalTiles + horizontalTiles;
        int totalWays = tiling(n - 1) + tiling(n - 2);

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
