package strings.practice;
import java.util.Arrays;

public class Ans4 {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if (str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            
            boolean result = Arrays.equals(str1charArray, str2charArray);
            
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
}

// Valid Anagram (LeetCode 242)
// https://leetcode.com/problems/valid-anagram/description/

// Solution 1: Sorting - O(n log n) time, O(n) space
/*
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
*/

// Solution 2: Counting Array - O(n) time, O(1) space
/*
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        int n1 = s.length();
        int n2 = t.length();
        if (n1 != n2) {
            return false;
        }

        for (int i = 0; i < n1; i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
*/
