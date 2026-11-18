package recursion.part2;

// Print all binary strings of size N without consecutive 1's.
public class BinaryStrings {
    public static void binString(int n, int previousDigit, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        
        // if (previousDigit == 0) {
        //     binString(n - 1, 0, str + "0");
        //     binString(n - 1, 1, str + "1");
        // } else {
        //     binString(n - 1, 0, str + "0");
        // }

        binString(n - 1, 0, str + "0");
        if (previousDigit == 0) {
            binString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 3;

        binString(n, 0, "");
    }
}
