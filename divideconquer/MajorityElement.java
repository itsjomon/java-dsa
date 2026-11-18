package divideconquer;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than n / 2 times. You may assume that the majority element always exists in the array.

Sample Input 1: nums = [3, 2, 3]

Sample Output 1: 3

Sample Input 2: nums = [2, 2, 1, 1, 1, 2, 2]

Sample Output 2: 2

Constraints:

- n == nums.length
- 1 <= n <= 5 * 10^4
- -10^9 <= nums[i] <= 10^9
 */
public class MajorityElement {
    // === Brute Force ===
    public static int bruteForce(int[] nums) {
        int majorityCount = nums.length / 2;
        
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > majorityCount) {
                return nums[i];
            }
        }
        return -1;
    }
    
    // === Divide and Conquer ===
    private static int majorityElementRec(int[] nums, int si, int ei) {
        if (si == ei) {
            return nums[ei];
        }
        
        int mid = si + (ei - si) / 2;
        int left = majorityElementRec(nums, si, mid);
        int right = majorityElementRec(nums, mid + 1, ei);
        
        if (left == right) {
            return left;
        }
        
        int leftCount = countInRange(nums, left, si, ei);
        int rightCount = countInRange(nums, right, si, ei);
        
        return leftCount > rightCount ? left : right;
    }

    private static int countInRange(int[] nums, int num, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }
    
    public static int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        // System.out.println("Majority Element = " + bruteForce(nums));
        System.out.println("Majority Element = " + majorityElement(nums));
    }
}
