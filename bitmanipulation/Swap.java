package bitmanipulation;

// Swap two numbers without using any third variable.
public class Swap {
    public static void main(String[] args) {
        int x = 3, y = 4;

        x ^= y;
        y = x ^ y;
        x ^= y;

        System.out.println("x = " + x + ", y = " + y);
    }
}
