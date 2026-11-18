package recursion.part2;

// Write a program to find length of a string using Recursion.
public class StringLength {
    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }
        
        return length(str.substring(1)) + 1;
    }
    
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(length(str));
    }
}
