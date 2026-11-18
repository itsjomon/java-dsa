package recursion.part1;

// Print nth fibonacci number.
public class FibonacciNum {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fibN = fib(n - 1) + fib(n - 2);
        return fibN;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(fib(n));
    }
}
