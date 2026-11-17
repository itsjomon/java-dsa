package twodarrays;

/*
Print the sum of the numbers in the second row of the "nums" array.

Example:

Input: int[][] nums = {{1,4,9},{11,4,3},{2,2,3}};
Output: 18
 */
public class PracticeQn2 {
    public static void main(String[] args) {
        int[][] nums = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        int sum = 0;

        for (int j = 0; j < nums[1].length; j++) {
            sum += nums[1][j];
        }
        
        System.out.println(sum);
    }
}
