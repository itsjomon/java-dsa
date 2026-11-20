package arraylists;

import java.util.ArrayList;
import java.util.Collections;

/*
Lonely Numbers in ArrayList

Given an integer ArrayList nums, a number x is lonely if it appears only once
and neither x + 1 nor x - 1 appears in nums.
Return all lonely numbers in any order.

Sample 1: [10, 6, 5, 8] -> [10, 8]
Sample 2: [1, 3, 5, 3] -> [1, 5]

Constraints: 1 <= nums.size() <= 10^5, 0 <= nums.get(i) <= 10^6
*/
public class LonelyNums {
    public static ArrayList<Integer> findLonely(ArrayList<Integer>nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }
        
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }
        
        if(nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size() - 1));
            }
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        System.out.println(findLonely(nums));
    }
}
