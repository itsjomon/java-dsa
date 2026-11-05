package arrays.part1;

// Find the largest number in a given array

public class LargestNumber {
    public static int largest(int[] nums) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println("Largest value is: " + largest(nums));
    }
}

// Integer.MIN_VALUE = -2147483648 (smallest possible int)
// Integer.MAX_VALUE = 2147483647 (largest possible int)

/*
Largest in Array
https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

class Solution {
    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        return largest;
    }
}
 */
