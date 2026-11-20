package arraylists;

import java.util.ArrayList;

/*
Most Frequent Number following Key

Given an integer ArrayList nums and an integer key, count how many times target immediately
follows key (nums.get(i) == key and nums.get(i + 1) == target for 0 <= i <= nums.size() - 2).
Return the target with the maximum count (unique answer).

Sample 1: nums = [1, 100, 200, 1, 100], key = 1 -> 100
Sample 2: nums = [2, 2, 2, 2, 3], key = 2 -> 2

Constraints: 2 <= nums.size() <= 1000, 1 <= nums.get(i) <= 1000
*/
public class MostFreqNum {
    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] result = new int[1000];
        
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                result[nums.get(i + 1) - 1]++;
            }
        }
        
        int max = Integer.MIN_VALUE;
        int ans = 0;
        
        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);

        int key = 1;

        System.out.println(mostFrequent(nums, key));
    }
}
