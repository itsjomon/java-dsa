package functionsandmethods.practice.ans;

public class Ans5 {
    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        int num = 789;

        System.out.println(sumOfDigits(num));
    }
}
