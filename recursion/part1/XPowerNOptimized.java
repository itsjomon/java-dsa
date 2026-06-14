package recursion.part1;

public class XPowerNOptimized {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPow = pow(x, n/2);
        int halfPowSquare = halfPow * halfPow;
        
        // n is odd
        if (n % 2 != 0) {
            halfPowSquare *= x;
        }

        return halfPowSquare;
    }

    public static void main(String[] args) {
        int x = 2, n = 10;

        System.out.println(pow(x, n));
    }
}

// print x^n (optimized)


/*
Pow(x, n) (LeetCode 50)
https://leetcode.com/problems/powx-n/description/

class Solution {
    public double myPow(double x, int n) {
        long N = n;
        
        if (N < 0) {
            return 1 / helper(x, -N);
        }
        
        return helper(x, N);
    }
    
    private double helper(double x, long n) {
        if (n == 0) {
            return 1;
        }
        
        double halfPow = helper(x, n / 2);
        double halfPowSquare = halfPow * halfPow;
        
        if (n % 2 != 0) {
            halfPowSquare *= x;
        }
        
        return halfPowSquare;
    }
}
 */