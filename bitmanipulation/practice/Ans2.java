package bitmanipulation.practice;

public class Ans2 {
    public static void main(String[] args) {
        int x = 3, y = 4;

        x ^= y;
        y = x^y;
        x ^= y;

        System.out.println("x = " + x + ", y = " + y);
    }
}
