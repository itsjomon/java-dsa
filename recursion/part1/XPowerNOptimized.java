package recursion.part1;

// Print x^n (optimized)
public class XPowerNOptimized {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPow = pow(x, n / 2);
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
