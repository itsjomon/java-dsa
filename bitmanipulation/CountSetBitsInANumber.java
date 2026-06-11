package bitmanipulation;

public class CountSetBitsInANumber {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;

        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            
            n >>= 1; 
        }
        
        System.out.println(count); // 2
    }
}

// Count set bits in a number.

/*
Number of 1 Bits (LeetCode 191)
https://leetcode.com/problems/number-of-1-bits/description/
*/