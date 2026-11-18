package recursion.part1;

// Print numbers from 1 to n (Increasing order)
public class IncreasingOrder {
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}
