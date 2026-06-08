package array.part1;

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

// Find the largest number in a given array


// Integer.MIN_VALUE = -2,147,483,648 (smallest possible int)
// Integer.MAX_VALUE = 2,147,483,647 (largest possible int)