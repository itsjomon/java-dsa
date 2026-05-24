package basicsortingalgorithms;

public class Practice {
    
    // a. Bubble Sort - DESCENDING order
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {  
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // b. Selection Sort - DESCENDING order
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int maxIndex = i;
            
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[maxIndex] < nums[j]) {  
                    maxIndex = j;
                }
            }
            
            if (maxIndex != i) {
                int temp = nums[maxIndex];
                nums[maxIndex] = nums[i];
                nums[i] = temp;
            }
        }
    }

    // c. Insertion Sort - DESCENDING order
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            
            while (prev >= 0 && nums[prev] < curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
    }

    // d. Counting Sort - DESCENDING order
    public static void countingSort(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int nums1[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int nums2[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int nums3[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int nums4[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        
        System.out.println("Original array: ");
        printArray(nums1);
        
        System.out.println("\nBubble Sort (Descending): ");
        bubbleSort(nums1);
        printArray(nums1);
        
        System.out.println("\nSelection Sort (Descending): ");
        selectionSort(nums2);
        printArray(nums2);
        
        System.out.println("\nInsertion Sort (Descending): ");
        insertionSort(nums3);
        printArray(nums3);
        
        System.out.println("\nCounting Sort (Descending): ");
        countingSort(nums4);
        printArray(nums4);
    }
}

// Use the following sorting algorithms to sort an array in DESCENDING order :
// a. Bubble Sort
// b. Selection Sort
// c. Insertion Sort
// d. Counting Sort
// You can use this array as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]