package strings;

public class Compression {
    public static String compress(String str) {
        /*String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }

        return newStr;
        */

        // --- Using StringBuilder ---
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";

        System.out.println(compress(str));
    }
}

// String compression (LeetCode 443)
// https://leetcode.com/problems/string-compression/description/
/*
class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        
        while (i < chars.length) {
            char current = chars[i];
            int count = 0;
            
            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }
            
            chars[index++] = current;
            
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        
        return index;
    }
}
*/
