package recursion.part1;

public class FirstOccurrence {
    public static int firstOcc(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        
        if (arr[i] == key) {
            return i;
        }

        return firstOcc(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 3, 6, 8, 3, 6, 7};
        int key = 3;

        System.out.println(firstOcc(arr, key, 0));
    }
}

// Write a function to find the first occurrence of an element in an array.