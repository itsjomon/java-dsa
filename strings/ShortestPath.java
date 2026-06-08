package strings;

public class ShortestPath {
    public static float shortestPath(String path) {
        int x  = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);

            if(direction == 'S') { // south
                y--;
            } else if (direction == 'N') { // north
                y++;
            } else if ( direction == 'W') { // west
                x--;
            } else { // east
                x++;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        return (float)Math.sqrt(X2 + Y2);

    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println(shortestPath(path));

    }
}

/*
Given a route containing 4 directions (E, W, N, S), find the shortest path (straight-line distance) to reach the destination from the origin.
Example:
Input: "WNEENESENNN"
Output: 5.0 */