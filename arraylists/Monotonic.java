package arraylists;

import java.util.ArrayList;

/*
Monotonic ArrayList

An ArrayList is monotonic if it is either monotone increasing (nums.get(i) <= nums.get(j) for all i <= j)
or monotone decreasing (nums.get(i) >= nums.get(j) for all i <= j).
Return true if the given integer ArrayList nums is monotonic, or false otherwise.

Sample 1: [1, 2, 2, 3] -> true
Sample 2: [6, 5, 4, 4] -> true
Sample 3: [1, 3, 2] -> false

Constraints: 1 <= nums.size() <= 10^5, -10^5 <= nums.get(i) <= 10^5
 */
public class Monotonic {
    public static boolean isMonotonic(ArrayList<Integer> nums) {
        boolean inc = true;
        boolean dec = true;
        
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                inc = false;
            }

            if(nums.get(i) < nums.get(i + 1)) {
                dec = false;
            }
        }
        
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        System.out.println(isMonotonic(nums));
    }
}
