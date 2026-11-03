package methods;

// Write a method to compute the average of three numbers.
public class Average {
    public static double avg(int a, int b, int c) {
        // int avg = (a + b + c) / 3;
        // return avg;

        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int c = 9;

        System.out.println(avg(a, b, c));
    }
}
