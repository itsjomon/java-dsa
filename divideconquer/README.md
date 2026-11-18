## Merge Sort

Merge Sort is a divide-and-conquer algorithm that divides the array into halves, recursively sorts them, and then merges the sorted halves.

```text
Array: [6, 3, 9, 5, 2, 8]

Step 1: Divide the array into halves

                    [6, 3, 9, 5, 2, 8]
                             |
             --------------------------------
             |                              |
         [6, 3, 9]                      [5, 2, 8]
             |                              |
        -----------                    -----------
        |         |                    |         |
      [6, 3]     [9]                 [5, 2]     [8]
        |                              |
      ------                         ------
      |    |                         |    |
     [6]  [3]                       [5]  [2]


Step 2: Merge back in sorted order

Merge [6] and [3]: 6 > 3 -> [3, 6]
  
Merge [3, 6] and [9]: 3 < 9 -> [3, 6, 9]
  
Merge [5] and [2]: 5 > 2 -> [2, 5]
  
Merge [2, 5] and [8]: 2 < 8 -> [2, 5, 8]


Step 3: Final merge - merge [3, 6, 9] and [2, 5, 8]

Compare 3 and 2 -> 2 is smaller, take 2
  Left: [3, 6, 9]    Right: [5, 8]    Result: [2]

Compare 3 and 5 -> 3 is smaller, take 3
  Left: [6, 9]       Right: [5, 8]    Result: [2, 3]

Compare 6 and 5 -> 5 is smaller, take 5
  Left: [6, 9]       Right: [8]       Result: [2, 3, 5]

Compare 6 and 8 -> 6 is smaller, take 6
  Left: [9]          Right: [8]       Result: [2, 3, 5, 6]

Compare 9 and 8 -> 8 is smaller, take 8
  Left: [9]          Right: []        Result: [2, 3, 5, 6, 8]

Left has remaining 9, add it:
  Result: [2, 3, 5, 6, 8, 9]


Final Sorted Array: [2, 3, 5, 6, 8, 9]
```

## Quick Sort

Quick Sort is also a divide-and-conquer algorithm that uses a **depth-first** approach like Merge Sort, but works differently by partitioning around a pivot.

```text
Array: [6, 3, 9, 5, 2, 8]

Step 1: Choose pivot = 8 (last element)
Partition around 8: [6, 3, 5, 2] | 8 | [9]

Step 2: Sort left part [6, 3, 5, 2] with pivot = 2
Partition around 2: [] | 2 | [3, 5, 6]

Step 3: Sort right part [3, 5, 6] with pivot = 6
Partition around 6: [3, 5] | 6 | []

Step 4: Sort [3, 5] with pivot = 5
Partition around 5: [3] | 5 | []

Step 5: All single elements and empty arrays are sorted

Final Sorted Array: [2, 3, 5, 6, 8, 9]
```

### Quick Sort Worst Case

When pivot is always the smallest or largest element (array already sorted or reverse sorted).

**Example: [1, 2, 3, 4, 5, 6] (pivot = last element)**

```text
Array: [1, 2, 3, 4, 5, 6]

Step 1: pivot=6 -> [1,2,3,4,5] | 6 | []
Step 2: pivot=5 -> [1,2,3,4] | 5 | []
Step 3: pivot=4 -> [1,2,3] | 4 | []
Step 4: pivot=3 -> [1,2] | 3 | []
Step 5: pivot=2 -> [1] | 2 | []
Step 6: Base case -> [1]

Recursion Tree (Skewed):
Level 0: [1,2,3,4,5,6]     Size: n
Level 1: [1,2,3,4,5]       Size: n-1
Level 2: [1,2,3,4]         Size: n-2
Level 3: [1,2,3]           Size: n-3
Level 4: [1,2]             Size: n-4
Level 5: [1]               Size: 1

Time Complexity: O(n²)  [n + (n-1) + (n-2) + ... + 1 = n(n+1)/2]
Space Complexity: O(n)  [Recursion stack depth = n]
```
