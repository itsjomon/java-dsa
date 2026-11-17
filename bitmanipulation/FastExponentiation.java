package bitmanipulation;

// Fast Exponentiation
public class FastExponentiation {
    public static void main(String[] args) {
        int x = 3;
        int n = 5;
        int res = 1;

        while (n > 0) {
            if ((n & 1) != 0) {
                res *= x;
            }

            x *= x;
            n >>= 1;
        }

        System.out.println(res); // 243
    }
}

