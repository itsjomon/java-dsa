package backtracking;

// Find & print all subsets of a given string "abc".

public class Subsets {
    public static void subsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursion
        subsets(str, ans + str.charAt(i), i + 1); // yes choice
        subsets(str, ans, i + 1); // no choice

    }

    public static void main(String[] args) {
        String str = "abc";
        subsets(str, "", 0);
    }
}

// TC: O(n * 2^n) | SC: O(n)
