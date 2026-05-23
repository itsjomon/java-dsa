# Sorting

Arranging elements in a specific order (ascending or descending) based on comparison criteria.

##  Bubble sort

Repeatedly step through the list, compare adjacent elements, and swap them if they are in the wrong order. Larger elements "bubble up" to the end.

```text
Start: [5, 4, 1, 3, 2]

Pass 1:
  [5, 4, 1, 3, 2] -> 5 greater than 4? Yes -> swap -> [4, 5, 1, 3, 2]
  [4, 5, 1, 3, 2] -> 5 greater than 1? Yes -> swap -> [4, 1, 5, 3, 2]
  [4, 1, 5, 3, 2] -> 5 greater than 3? Yes -> swap -> [4, 1, 3, 5, 2]
  [4, 1, 3, 5, 2] -> 5 greater than 2? Yes -> swap -> [4, 1, 3, 2, 5]
  Result: Largest element (5) reached the end

Pass 2:
  [4, 1, 3, 2, 5] -> 4 greater than 1? Yes -> swap -> [1, 4, 3, 2, 5]
  [1, 4, 3, 2, 5] -> 4 greater than 3? Yes -> swap -> [1, 3, 4, 2, 5]
  [1, 3, 4, 2, 5] -> 4 greater than 2? Yes -> swap -> [1, 3, 2, 4, 5]
  Result: Second largest (4) in place

Pass 3:
  [1, 3, 2, 4, 5] -> 1 greater than 3? No
  [1, 3, 2, 4, 5] -> 3 greater than 2? Yes -> swap -> [1, 2, 3, 4, 5]
  [1, 2, 3, 4, 5] -> 3 greater than 4? No
  Result: Sorted

Pass 4:
  [1, 2, 3, 4, 5] -> No swaps needed -> done
```

## Selection sort

Divide array into sorted (left) and unsorted (right) parts. Repeatedly pick the smallest element from unsorted part and swap it with the first element of unsorted part.

```text
Array: [5, 4, 1, 3, 2]

Pass 1 (i=0):
  Unsorted: [5, 4, 1, 3, 2] -> smallest = 1 (at index 2)
  Swap index 0 and 2 -> [1, 4, 5, 3, 2]
  Sorted: [1] | Unsorted: [4, 5, 3, 2]

Pass 2 (i=1):
  Unsorted: [4, 5, 3, 2] -> smallest = 2 (at index 4)
  Swap index 1 and 4 -> [1, 2, 5, 3, 4]
  Sorted: [1, 2] | Unsorted: [5, 3, 4]

Pass 3 (i=2):
  Unsorted: [5, 3, 4] -> smallest = 3 (at index 3)
  Swap index 2 and 3 -> [1, 2, 3, 5, 4]
  Sorted: [1, 2, 3] | Unsorted: [5, 4]

Pass 4 (i=3):
  Unsorted: [5, 4] -> smallest = 4 (at index 4)
  Swap index 3 and 4 -> [1, 2, 3, 4, 5]
  Sorted: [1, 2, 3, 4, 5] | Unsorted: []

Done
```

## Insertion sort

Build sorted array one element at a time. Take each element from unsorted part and insert it into correct position in sorted part (like arranging cards in your hand).

```text
Array: [5, 4, 1, 3, 2]

Pass 1 (take 4):
  Sorted part: [5]
  Insert 4: 4 < 5 -> shift 5 right -> [_, 5]
  Insert 4 -> [4, 5, 1, 3, 2]

Pass 2 (take 1):
  Sorted part: [4, 5]
  Insert 1: 1 < 5 -> shift 5 -> [4, _, 5]
          1 < 4 -> shift 4 -> [_, 4, 5]
  Insert 1 -> [1, 4, 5, 3, 2]

Pass 3 (take 3):
  Sorted part: [1, 4, 5]
  Insert 3: 3 < 5 -> shift 5 -> [1, 4, _, 5]
          3 < 4 -> shift 4 -> [1, _, 4, 5]
          3 > 1 -> stop
  Insert 3 -> [1, 3, 4, 5, 2]

Pass 4 (take 2):
  Sorted part: [1, 3, 4, 5]
  Insert 2: 2 < 5 -> shift 5 -> [1, 3, 4, _, 5]
          2 < 4 -> shift 4 -> [1, 3, _, 4, 5]
          2 < 3 -> shift 3 -> [1, _, 3, 4, 5]
          2 > 1 -> stop
  Insert 2 -> [1, 2, 3, 4, 5]
```

## Inbuilt sort

Java's built-in sorting method using highly optimized algorithms (Dual-Pivot QuickSort for primitives, TimSort for objects). Sorts in O(n log n) time.

> [!NOTE] 
> Collections.reverseOrder() only works with Objects (Integer, Double) because primitives (int, double) don't have methods.

```java
import java.util.Arrays;
import java.util.Collections;

// Basic usage
Arrays.sort(nums);

// Partial sort
Arrays.sort(nums, fromIndex, toIndex);

// Descending order (Objects only)
Arrays.sort(nums, Collections.reverseOrder());

// Partial plus descending
Arrays.sort(nums, fromIndex, toIndex, Collections.reverseOrder());
```

```text
Array: [5, 4, 1, 3, 2]

Call Arrays.sort(nums)

Internal process:
  1. Check length = 5
  2. Choose two pivots
  3. Partition into 3 sections:
    - Smaller than pivot1
    - Between pivots
    - Larger than pivot2
  4. Recursively sort each section

Result: [1, 2, 3, 4, 5]
```

## Counting sort

Non-comparison sorting algorithm. Counts frequency of each distinct value, then uses arithmetic to determine positions. Best when range of possible values is small.

```text
Array: [4, 2, 2, 8, 3, 3, 1]

Step 1: Find min = 1, max = 8, range = 8

Step 2: Create count array (size = max + 1 = 9)

  Index:   0  1  2  3  4  5  6  7  8
  Count:  [0, 0, 0, 0, 0, 0, 0, 0, 0]

Step 3: Count frequencies
  4 makes count[4] become 1
  2 makes count[2] become 1
  2 makes count[2] become 2
  8 makes count[8] become 1
  3 makes count[3] become 1
  3 makes count[3] become 2
  1 makes count[1] become 1

  Result:
    Index:   0  1  2  3  4  5  6  7  8
    Count:  [0, 1, 2, 2, 1, 0, 0, 0, 1]

Step 4: Rebuild sorted array
  i=1: count[1]=1 -> add 1 once      -> [1]
  i=2: count[2]=2 -> add 2 twice     -> [1, 2, 2]
  i=3: count[3]=2 -> add 3 twice     -> [1, 2, 2, 3, 3]
  i=4: count[4]=1 -> add 4 once      -> [1, 2, 2, 3, 3, 4]
  i=8: count[8]=1 -> add 8 once      -> [1, 2, 2, 3, 3, 4, 8]

Final: [1, 2, 2, 3, 3, 4, 8]
```
