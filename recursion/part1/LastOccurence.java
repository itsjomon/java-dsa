package recursion.part1;

public class LastOccurence {
    public static int lastOcc(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        
        int isFound = lastOcc(arr, key, i + 1);
        
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 3, 6, 8, 3, 6, 7};
        int key = 3;

        System.out.println(lastOcc(arr, key, 0));
    }
}

// Write a function to find the last occurrence of an element in an array.