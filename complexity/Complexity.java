package complexity;

public class Complexity {
    public static void main(String[] args) {
        int n = 10;
        int k = 2;
        int[] arr = {1, 2, 3, 4, 5};

        // ===== Simple Loop =====
        for (int i = 0; i < n; i++) {
            // some constant work is done in this loop

            // O(1) constant work
            // Examples: System.out.println(), arithmetic, assignment, comparison
            // Even if there are 5 or 100 println statements, it's still O(1)
            // Because the number of operations is fixed and does not depend on n
        }
        // Time: O(n) | Space: O(1)
        // Runs n times, each iteration does O(1) work
        // Total = n x O(1) = O(n)



        // ===== Nested Loop 1 (i < j) =====
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // O(1) constant work
            }
        }
        // Time: O(n^2) | Space: O(1)
        //
        // Example n = 5:
        // i = 0: j = 1, 2, 3, 4 (4 times)
        // i = 1: j = 2, 3, 4    (3 times)
        // i = 2: j = 3, 4       (2 times)
        // i = 3: j = 4          (1 times)
        // i = 4: j = none       (0 times)



        // ===== Nested loop 2 (i > j) =====
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // some constant work is done in this loop
            }
        }
        // Time: O(n^2) | Space: O(1)
        //
        // Example n = 5:
        // i = 0: j = none       (0 times)
        // i = 1: j = 0          (1 times)
        // i = 2: j = 0, 1       (2 times)
        // i = 3: j = 0, 1, 2    (3 times)
        // i = 4: j = 0, 1, 2, 3 (4 times)



        // ===== Nested loop 3 (k < n) =====
        for (int i = 0; i < n; i = i + k) {
            for (int j = i + 1; j <= k; j++) {
                // some constant work is done in this loop
            }
        }
        // Time: O(n) | Space: O(1)
        //
        // Example n = 25, k = 5:
        // i = 0:  j = 1, 2, 3, 4, 5 (5 times)
        // i = 5:  j = none          (0 times)
        // i = 10: j = none          (0 times)
        // i = 15: j = none          (0 times)
        // i = 20: j = none          (0 times)



        // ===== Bubble Sort (Worst & Best case)=====
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Time: O(n^2) | Space: O(1)
        //
        // Example [1, 2, 3, 4, 5] (n=5):
        // turn = 0: j = 0 to 3 (4 times)  [n-1]
        // turn = 1: j = 0 to 2 (3 times)  [n-2]
        // turn = 2: j = 0 to 1 (2 times)  [n-3]
        // turn = 3: j = 0 to 0 (1 time)   [n-4]


        // === Optimized Bubble Sort ===
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
        // Time: O(n) best case | O(n²) worst case | Space: O(1)
        // Best case: O(n) - when array is already sorted (only 1 pass)
        // Worst case: O(n^2) - when array is reverse sorted
        // Average case: O(n^2)
    }



    // ===== Binary Search =====
    public static int binarySearch(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (nums[mid] == key) {
                return mid;
            }
            if (nums[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
    // Time: O(log n) | Space: O(1)
    // Best Case: O(1) - key found at middle (mid = n/2) on first check
    // Worst Case: O(log n) - key at ends or not in array
    //
    // Example n = 8, search for 23 in [2, 5, 8, 12, 16, 23, 38, 45]:
    // start = 0, end = 7, mid = 3 (12) -> 12 < 23, start = 4
    // start = 4, end = 7, mid = 5 (23) -> found!
    //
    // Best case example: search for 12 in same array
    // mid = 3 (12) -> found in 1 step! O(1)
    //
    // Why O(log n)? Each step cuts array in half: n -> n/2 -> n/4 -> ... -> 1
    // So steps = log2(n). For n = 1M, only ~20 steps!
    // Space O(1): just uses start, end, mid variables



    // ===== Recursive Algos =====
    // Total work done = (num of calls * work in each call)
    // Recurrence Equation:
    // Space Complexity = (max depth * memory in each call)



    // === Factorial ===
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
       
    }
    // Time: O(n) | Space: O(n)
    //
    // Example n = 5:
    // fact(5) = 5 * fact(4)
    //         = 5 * 4 * fact(3)
    //         = 5 * 4 * 3 * fact(2)
    //         = 5 * 4 * 3 * 2 * fact(1)
    //         = 5 * 4 * 3 * 2 * 1 * fact(0)
    //         = 5 * 4 * 3 * 2 * 1 * 1 = 120
    //
    // Time O(n): Makes n recursive calls (n, n-1, n-2, ..., 0)
    // Space O(n): Call stack stores n function calls



    // === Sum of n ===
    public static int sum(int n) {
        if ( n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }
    // Time: O(n) | Space: O(n)
    //
    // Example n = 5:
    // sum(5) = 5 + sum(4)
    //        = 5 + 4 + sum(3)
    //        = 5 + 4 + 3 + sum(2)
    //        = 5 + 4 + 3 + 2 + sum(1)
    //        = 5 + 4 + 3 + 2 + 1 = 15
    //
    // Time O(n): Makes n recursive calls (n, n-1, ..., 1)
    // Space O(n): Call stack stores n function calls



    // === Fibonacci ===
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n -2);
    }
    // Time: O(2^n) | Space: O(n)
    //
    // Example n = 5:
    // fib(5) = fib(4) + fib(3)
    //        = (fib(3) + fib(2)) + (fib(2) + fib(1))
    //        = ((fib(2) + fib(1)) + (fib(1) + fib(0))) + ((fib(1) + fib(0)) + 1)
    //        = ... = 5
    //
    // Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    // fib(0)=0, fib(1)=1, fib(2)=1, fib(3)=2, fib(4)=3, fib(5)=5
    //
    // Time O(2^n): Each call branches into 2 more calls (exponential growth)
    // Space O(n): Maximum depth of recursion tree is n



    // === Merge Sort ===
    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    // merge() TC: O(n) | SC: O(n)

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // or mid = (si + ei) / 2
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei); // TC: O(n) | SC: O(n)
    }
    // mergeSort() TC: O(n log n) | SC: O(n)
    //
    // Example: arr = [6, 3, 9, 5, 2, 8]
    //
    // Step 1: Divide until single elements
    //      [6, 3, 9, 5, 2, 8]
    //         /           \
    //    [6, 3, 9]     [5, 2, 8]
    //     /     \       /     \
    //  [6, 3]   [9]  [5, 2]   [8]
    //   /  \           /  \
    // [6]  [3]       [5]  [2]
    //
    // Step 2: Merge (conquer)
    // [6] + [3] -> [3, 6]
    // [3, 6] + [9] -> [3, 6, 9]
    // [5] + [2] -> [2, 5]
    // [2, 5] + [8] -> [2, 5, 8]
    // [3, 6, 9] + [2, 5, 8] -> [2, 3, 5, 6, 8, 9]
    //
    // Time Complexity Analysis:
    // - Each level does O(n) work (merge function)
    // - Number of levels = log n (dividing array in half each time)
    // - Total = O(n log n)
    //
    // Space Complexity: O(n) for temp array in merge()
    // - At any time, only one temp array exists (not all levels combined)
    // - Recursion stack depth = O(log n) (ignored as O(n) dominates)
    //
    // Best Case: O(n log n) | Worst Case: O(n log n) | Average: O(n log n)



    // === Power Function 1 ===
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }

        return a * power(a, n - 1);
    }
    // Time: O(n) | Space: O(n)
    //
    // Example: power(2, 5)
    // power(2, 5) = 2 * power(2, 4)
    //             = 2 * 2 * power(2, 3)
    //             = 2 * 2 * 2 * power(2, 2)
    //             = 2 * 2 * 2 * 2 * power(2, 1)
    //             = 2 * 2 * 2 * 2 * 2 * power(2, 0)
    //             = 2 * 2 * 2 * 2 * 2 * 1 = 32
    //
    // Time O(n): Makes n recursive calls (n, n-1, ..., 0)
    // Space O(n): Call stack stores n function calls
    //
    // Note: This is linear recursion.



    // === Power Function 2 ===
    public static int power2(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPowSquare = power2(a, n/2) * power2(a, n/2);
        
        if (n % 2 != 0) { // n is odd
            halfPowSquare *= a;
        }

        return halfPowSquare;
    }
    // Time: O(n) | Space: O(log n)
    //
    // Example: power2(2, 5)
    //
    // power2(2, 5):
    //   halfPowSquare = power2(2,2) * power2(2,2)
    //   
    //   power2(2, 2):
    //     halfPowSquare = power2(2,1) * power2(2,1)
    //     
    //     power2(2, 1):
    //       halfPowSquare = power2(2,0) * power2(2,0)
    //       power2(2, 0) = 1
    //       halfPowSquare = 1 * 1 = 1
    //       n is odd -> 1 * 2 = 2
    //       return 2
    //     
    //     halfPowSquare = 2 * 2 = 4
    //     n is even -> return 4
    //   
    //   halfPowSquare = 4 * 4 = 16
    //   n is odd -> 16 * 2 = 32
    //   return 32
    //
    // Actual Recursion Tree (with repeated calls):
    //                   power2(2,5)
    //                   /         \
    //            power2(2,2)   power2(2,2)
    //             /     \       /     \
    //         p(2,1)  p(2,1) p(2,1) p(2,1)
    //         / \     / \     / \     / \
    //      p(2,0)... (many repeated calls)
    //
    // Time O(n): Each call makes 2 recursive calls, so total calls = O(n)
    // Space O(log n): Recursion depth is log n



    // === Power Function 3 ===
    public static int power3(int a, int n) {
        if (n == 0) {
            return 1;
        }

        int halfPow = power3(a, n/2);
        int halfPowSquare = halfPow * halfPow;
        
        if (n % 2 != 0) { // n is odd
            halfPowSquare *= a;
        }

        return halfPowSquare;
    }
    // Time: O(log n) | Space: O(log n)
    //
    // Example: power3(2, 5)
    // power3(2, 5):
    //   halfPow = power3(2, 2)
    //   halfPowSquare = 4 × 4 = 16
    //   n is odd → 16 × 2 = 32 ✓
    //   
    //   power3(2, 2):
    //     halfPow = power3(2, 1)
    //     halfPowSquare = 2 × 2 = 4
    //     n is even → return 4
    //     
    //     power3(2, 1):
    //       halfPow = power3(2, 0)
    //       halfPowSquare = 1 × 1 = 1
    //       n is odd → 1 × 2 = 2
    //       return 2
    //       
    //       power3(2, 0) = 1
    //
    // Time O(log n): Only log n recursive calls
    // Space O(log n): Call stack depth = log n
}
