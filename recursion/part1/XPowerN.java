package recursion.part1;

public class XPowerN {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        
        // int xPowN = x * pow(x, n-1);
        // return xPowN;

        return x * pow(x, n-1);
    }

    public static void main(String[] args) {
        int x = 2, n = 10;

        System.out.println(pow(x, n));
    }
}

// print x^n