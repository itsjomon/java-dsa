package loops;

// Print Reverse of a Number, n = 2468
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 2468;

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;
        }

        System.out.println();
    }
}
