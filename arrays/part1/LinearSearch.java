package arrays.part1;

public class LinearSearch {
    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 10;

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key is at index: " + index);
        }
    }
}

/*
Array Search
https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1

class Solution {
    public int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }
}
 */
