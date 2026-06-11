package bitmanipulation;

public class FastExponentiation {
    public static void main(String[] args) {
        int x = 3;
        int n = 5;
        int res = 1;

        while (n > 0) {
            if ((n & 1) != 0) {
                res *= x;
            }

            x *= x;
            n >>= 1;
        }

        System.out.println(res); // 243
    }
}

// Fast Exponentiation

/*
Pow(x, n) (LeetCode 50)
https://leetcode.com/problems/powx-n/description/

class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        long exp = n;

        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }

        while (exp > 0) {
            if ((exp & 1) != 0) {
                res *= x;
            }

            x *= x;
            exp >>= 1;
        }
        return res;
    }
}
 */