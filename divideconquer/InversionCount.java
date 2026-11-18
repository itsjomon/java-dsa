package divideconquer;

/*
Given an array of integers. Find the Inversion Count in the array.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum.

Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

Sample Input 1: N = 5, arr[] = {2, 4, 1, 3, 5}

Sample Output 1: 3
Because it has 3 inversions: (2, 1), (4, 1), (4, 3)

Sample Input 2: N = 5, arr[] = {2, 3, 4, 5, 6}

Sample Output 2: 0
Because the array is already sorted.

Sample Input 3: N = 3, arr[] = {5, 5, 5}

Sample Output 3: 0
Because all the elements are the same and already in sorted order.

Hint: A sorting algorithm will be used to solve this question.
 */
public class InversionCount {
    // === Brute Force ===
    public static int bruteForce(int[] arr) {
        int n = arr.length;
        int invCount = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        
        return invCount;
    }
    

    // === Modified Merge Sort ===
    public static int merge(int[] arr, int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        int invCount = 0;
        int[] temp = new int[ei - si + 1];

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = si, k = 0; i <= ei; i++, k++) {
            arr[i] = temp[k];
        }

        return invCount;
    }
    
    private static int mergeSort(int[] arr, int si, int ei) {
        int invCount = 0;
        
        if (ei > si) {
            int mid = si + (ei - si) / 2;
            
            invCount = mergeSort(arr, si, mid);
            invCount += mergeSort(arr, mid + 1, ei);
            invCount += merge(arr, si, mid, ei);
        }
        
        return invCount;
    }
    
    public static int getInversions(int[] arr) {
        int n = arr.length;
        return mergeSort(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5};
        // System.out.println("Inversion Count = " + bruteForce(arr));
        System.out.println("Inversion Count = " + getInversions(arr));
    }
}
