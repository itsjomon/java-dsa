package array.part1;

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
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverse(nums);
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}

// Reverse an array