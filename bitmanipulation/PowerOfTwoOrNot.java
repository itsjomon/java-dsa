package bitmanipulation;

// Check if a number is power of 2 or not.
public class PowerOfTwoOrNot {
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(12));
    }
}
