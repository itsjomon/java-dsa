package functionsandmethods.practice.ans;

public class Ans3 {
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return originalNum == reverse;
    }

    public static void main(String[] args) {
        int num = 565;

        // System.out.println(isPalindrome(num));

        System.out.println(num + (isPalindrome(num) ? " is a palindrome" : " is not a palindrome"));
    }
}
