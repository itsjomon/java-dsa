package array.part1;

public class PrintSubarray {
    public static void subarray(int[] nums) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int start = i;

            for (int j = i; j < nums.length; j++) {
                int end = j;
                int currentSum = 0;

                for ( int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");
                    currentSum += nums[k];
                }
                System.out.print("| Sum = " + currentSum);

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                if (currentSum < minSum) {
                    minSum = currentSum;
                }

                ts++;
                System.out.println();
            }

            System.out.println();
        }

        System.out.println("Total subarrays = " + ts);
        System.out.println("Maximum subarray sum = " + maxSum);
        System.out.println("Minimum subarray sum = " + minSum);
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};

        subarray(nums);
    }
}

// Print subarrays