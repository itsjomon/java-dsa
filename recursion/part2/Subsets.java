package recursion.part2;

// Print all subsets (the power set) of a given integer array using recursion.
public class Subsets {
    public static void subsets(int[] arr, int index, int[] current, int currentIndex) {
        if (index == arr.length) {
            for (int i = 0; i < currentIndex; i++) {
                System.out.print(current[i] + " ");
            }
            System.out.println();
            return;
        }

        subsets(arr, index + 1, current, currentIndex);

        current[currentIndex] = arr[index];
        subsets(arr, index + 1, current, currentIndex + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        subsets(nums, 0, new int[nums.length], 0);
    }
}
