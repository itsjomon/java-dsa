package strings;

import java.util.Arrays;

// Determine if two strings are anagrams of each other. What are anagrams? If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider "race" and "care". In this case, "race's" characters can be formed into "care", or "care's" characters can be formed into "race". Below is a Java program to check if two strings are anagrams or not.
public class PracticeQn2 {
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
