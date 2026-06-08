package array.part2;

public class MaxSubarray {

    // Method I (Brute Force)
    public static void bruteForce(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int start = i;

            for (int j = i; j < nums.length; j++) {
                int end = j;
                int currentSum = 0;

                for ( int k = start; k <= end; k++) {
                    currentSum += nums[k];
                }
                System.out.println(currentSum);


                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum subarray sum = " + maxSum);
    }

    // Method II (Prefix Sum)
    public static void prefixSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;

            for (int j = i; j < nums.length; j++) {
                int end = j;
                int currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                System.out.println(currentSum);

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum subarray sum = " + maxSum);
    }

    // Method III (Kandane's Algorithm)
    public static void kadanesAlgo(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            maxSum = Math.max(currentSum, maxSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum subarray sum = " + maxSum);
    }

    public static void main(String[] args) {
        int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3};

        // bruteForce(nums);
        // prefixSum(nums);
        kadanesAlgo(nums);
    }
    
}

// Max Subarray (LeetCode 53)
// https://leetcode.com/problems/maximum-subarray/description/