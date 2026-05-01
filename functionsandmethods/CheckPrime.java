package functionsandmethods;

public class CheckPrime {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPrime(n));
    }
}
