package bitmanipulation;

// Add 1 to an integer using Bit Manipulation.
// (Hint: try using Bitwise NOT Operator)
public class AddOne {
    public static void main(String[] args) {
        int n = 6;

        n = -~n;

        System.out.println(n);
    }
}
