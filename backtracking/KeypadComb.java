package backtracking;

/*
Keypad Combinations

Given a string containing digits from 2 - 9 inclusive, print all possible letter combinations that the number could represent. You can print the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Sample Input 1: digits = "23"
Sample Output 1: "ad", "ae", "af", "bd", "be", "bf","cd", "ce", "cf"

Sample Input 2: digits = "2"
Sample Output 2: "a", "b", "c"

Sample Input 3: digits = ""
Sample Output 3: ""
 */
public class KeypadComb {
    private static final char[][] KEYPAD = {
        {}, 
        {},
        {'a', 'b', 'c'},
        {'d', 'e', 'f'},
        {'g', 'h', 'i'},
        {'j', 'k', 'l'},
        {'m', 'n', 'o'},
        {'p', 'q', 'r', 's'},
        {'t', 'u', 'v'},
        {'w', 'x', 'y', 'z'}
    };
    
    public static void letterCombinations(String digits) {
        int len = digits.length();
        if (len == 0) {
            System.out.println("");
            return;
        }
        
        generateCombinations(0, len, new StringBuilder(), digits);
    }
    
    public static void generateCombinations(int pos, int len, StringBuilder sb, String digits) {
        if (pos == len) {
            System.out.print(sb.toString() + " ");
            return;
        }
        
        char[] letters = KEYPAD[Character.getNumericValue(digits.charAt(pos))];
        for (int i = 0; i < letters.length; i++) {
            sb.append(letters[i]);
            generateCombinations(pos + 1, len, sb, digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
    public static void main(String[] args) {
        letterCombinations("2");
    }
}


// TC: O(4^n) | SC: O(n)
// Where n = D.length() (number of digits)
