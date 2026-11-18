package recursion.part2;

import java.util.ArrayList;
import java.util.List;

// Generate Binary Strings Without Adjacent Zeros
public class GenerateBinaryStrings {
    public static List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        helper(n, 1, "", result);
        return result;
    }

    private static void helper(int n, int previousDigit, String str, List<String> result) {
        if (n == 0) {
            result.add(str);
            return;
        }

        helper(n - 1, 1, str + "1", result);
        if (previousDigit == 1) {
            helper(n - 1, 0, str + "0", result);
        }
    }

    public static void main(String[] args) {
        System.out.println(validStrings(3));
    }
}
