package arrays.part1;

public class BinarySearch {
    // Requires nums to be sorted in ascending order
    public static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            // Safe: int mid = start + (end - start) / 2;  (avoids overflow)

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("Index of key is: " + binarySearch(nums, key));
    }
}

/*
Binary Search (LeetCode 704)
https://leetcode.com/problems/binary-search/description/

class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
 */
