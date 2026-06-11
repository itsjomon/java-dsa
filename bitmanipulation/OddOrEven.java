package bitmanipulation;

public class OddOrEven {
    public static void oddOrEven(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        oddOrEven(5);
    }
}

// Check if a number is odd or even