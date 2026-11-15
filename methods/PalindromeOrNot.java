package methods;

/*
Write a program to check if a number is a palindrome or not? (121 is a palindrome, 321 is not)

A number is called a palindrome if the number is equal to the reverse of a number e.g. 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.
 */
public class PalindromeOrNot {
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
