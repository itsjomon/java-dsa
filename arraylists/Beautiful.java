package arraylists;

import java.util.ArrayList;

/*
Beautiful ArrayList

Given n, return any ArrayList nums of size n that is a permutation of [1, n]
such that for every 0 <= i < j < n, there is no k (i < k < j) with
2 * nums.get(k) == nums.get(i) + nums.get(j).

Sample 1: n = 4 -> [2, 1, 4, 3]
Sample 2: n = 5 -> [3, 1, 2, 5, 4]

Constraints: 1 <= n <= 1000
*/
public class Beautiful {
    public static ArrayList<Integer> beautifulArray(int n) {
        // === Iterative ===
        // ArrayList<Integer> res = new ArrayList<>();
        // res.add(1);
        
        // for (int i = 2; i <= n; i++) {
        //     ArrayList<Integer> temp = new ArrayList<>();

        //     for (Integer e:res) {
        //         if (2 * e <= n) {
        //             temp.add(e * 2);
        //         }
        //     }

        //     for (Integer e:res) {
        //         if (2 * e - 1 <= n) {
        //             temp.add(e * 2 - 1);
        //         }
        //     }
            
        //     res = temp;
        // }
        
        // return res;


        // === Divide & Conquer ===
        ArrayList<Integer> res = new ArrayList<>();
        divideConquer(1, 1, res, n);
        return res;
    }
    
    private static void divideConquer(int start, int increment, ArrayList<Integer> res, int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }
        divideConquer(start, 2 * increment, res, n);
        divideConquer(start + increment, 2 * increment, res, n);
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> result = beautifulArray(n);

        System.out.println(result);
    }
}
