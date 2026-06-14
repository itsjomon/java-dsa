package recursion.part1;

public class Factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int factOfN = n * fact(n - 1);
        return factOfN;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}

// Print factorial of a number n.