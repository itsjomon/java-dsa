package bitmanipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            target = target ^ nums[i];
        }

        System.out.println(target);
    }
}

/*
Single Number (LeetCode 136)
https://leetcode.com/problems/single-number/
*/