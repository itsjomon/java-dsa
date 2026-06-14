package recursion.part1;

public class SumOfFirstNNaturalNums {
    public static int sum(int n) {
        if ( n == 1) {
            return 1;
        }

        int sumOfN = n + sum(n - 1);
        return sumOfN;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(sum(n));
    }
}

// Print sum of first n natural numbers.