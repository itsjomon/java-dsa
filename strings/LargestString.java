package strings;

public class LargestString {
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) { // compareTo() compares strings lexicographically based on Unicode values, while compareToIgnoreCase() does the same but ignores case differences.
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}

// For a given set of strings, print the largest string.
// "apple", "mango", "banana"

