package backtracking;

// ===== Recursive Approach (Exponential) =====
// public class GridWays {
//     public static int gridWays(int i, int j, int n, int m) {
//         if ( i == n - 1 && j == m - 1) { // condition for last cell
//             return 1;
//         } else if (i == n || j == m) { // boundry cross condition
//             return 0;
//         }

//         int ways1 = gridWays(i + 1, j, n, m);
//         int ways2 = gridWays(i, j + 1, n, m);
//         return ways1 + ways2;
//     }

//     public static void main(String[] args) {
//         int n = 3, m = 3;
//         System.out.println(gridWays(0, 0, n, m));
//     }
// }
// TC: O(2^(n+m)) | SC: O(m + n)


// ===== Combinations Approach (Optimized) =====
public class GridWays {
    public static int gridWays(int n, int m) {
        int totalSteps = (n - 1) + (m - 1);
        int steps = Math.min(n - 1, m - 1);

        long res = 1;
        for (int i = 1; i <= steps; i++) {
            res = res * (totalSteps - steps + i) / i;
        }

        return (int) res;
    }

    public static void main(String[] args) {
        int  n = 3, m = 3;
        System.out.println(gridWays(n, m));
    }
}

// TC: O(min(n, m)) | SC: O(1)
