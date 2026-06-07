## Two-Dimensional Array (2D-Array)

A 2D array represents data in rows and columns. It can be understood as an array of 1D arrays.

### Representation of 2D Array

```
+---------+---------+---------+---------+
|         | Col 0   | Col 1   | Col 2   |
+=========+=========+=========+=========+
| Row 0   | [0][0]  | [0][1]  | [0][2]  |
+---------+---------+---------+---------+
| Row 1   | [1][0]  | [1][1]  | [1][2]  |
+---------+---------+---------+---------+
| Row 2   | [2][0]  | [2][1]  | [2][2]  |
+---------+---------+---------+---------+
```

**Example:**

```java
// 2D Array: 3 students × 3 subjects
// Subjects order: [English, Math, Physics]

int[][] marks = {
    {85, 90, 78},  // Student 1: English=85, Math=90, Physics=78
    {88, 92, 81},  // Student 2: English=88, Math=92, Physics=81
    {79, 85, 88}   // Student 3: English=79, Math=85, Physics=88
};

// Print Student 1's Math mark (row 0, column 1)
System.out.println("Student 1 Math mark: " + marks[0][1]);  // Output: 90
```

## 2D Array in memory

### 1. Row-Major Order (Row by Row)

- **How it works:** Flattened row by row. Complete the first row, then move to the next.
- **Layout (2x2):** `[Row 0, Col 0]`, `[Row 0, Col 1]`, `[Row 1, Col 0]`, `[Row 1, Col 1]`
- **Languages:** C, C++, Python (NumPy default)

### 2. Column-Major Order (Column by Column)

- **How it works:** Flattened column by column. Complete the first column, then move to the next.
- **Layout (2x2):** `[Row 0, Col 0]`, `[Row 1, Col 0]`, `[Row 0, Col 1]`, `[Row 1, Col 1]`
- **Languages:** Fortran, MATLAB

### 3. Java's Approach (Array of Arrays)

- **How it works:** Uses neither. The master array holds references (pointers) to separate 1D rows.
- **Memory:** **Non-contiguous**. Rows are scattered independently across the heap.
- **Feature:** Allows **Ragged Arrays** where each row can have a completely different length or be `null`.

```
+--------------+
|   int[][]    |
+--------------+          +---------> +------------+
|  0: int[]    | ---------+           |   int[]    |
|  1: int[]    | ---------+           +------------+
|  2: null     |          |           |  0: int    |
|  3: int[]    | ----+    |           |  1: int    |
+--------------+     |    |           |  2: int    |
                     |    |           +------------+
                     |    |
                     |    +---------> +------------+
                     |                |   int[]    |
                     |                +------------+
                     |                |  0: int    |
                     |                |  1: int    |
                     |                |  2: int    |
                     |                |  3: int    |
                     |                +------------+
                     |
                     +--------------> +------------+
                                      |   int[]    |
                                      +------------+
                                      |  0: int    |
                                      |  1: int    |
                                      |  2: int    |
                                      |  3: int    |
                                      |  4: int    |
                                      |  5: int    |
                                      +------------+
```

