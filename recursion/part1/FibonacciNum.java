package recursion.part1;

public class FibonacciNum {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibN = fib(n - 1) + fib(n -2);
        return fibN;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(fib(n));
    }
}


// Print nth fibonacci number.

/*
Fibonacci Number (LeetCode 509)
https://leetcode.com/problems/fibonacci-number/description/

class Solution {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibN = fib(n - 1) + fib(n -2);
        return fibN;
    }
}
 */