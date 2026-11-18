package divideconquer;

/*
Search in a rotated and sorted array
input: sorted, rotated array with distinct numbers (in ascending order) it is rotated at a pivot point. Find the index of a given element.
arr = [4, 5, 6, 7, 0, 1, 2]
target = 0
output: 4
 */
public class RotatedAndSortedArray {
    public static int search(int[] arr, int target, int si, int ei) {
        int mid = si + (ei - si) / 2; // (si + ei) /2

        if (si > ei) {
            return -1;
        }

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                return search(arr, target, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int targetIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(targetIdx);

    }
}
