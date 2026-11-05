package arrays.part1;

// Reverse an array
public class ReverseArray {
    public static void reverse(int[] nums) {
        int first = 0;
        int last = nums.length - 1;

        while (first < last) {
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverse(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}

/* 
Reverse Array
https://www.geeksforgeeks.org/problems/reverse-an-array/1

class Solution {
    public void reverseArray(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
}
 */
