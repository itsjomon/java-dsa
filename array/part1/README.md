# Array

An **Array** is a linear data structure that collects elements of the **same data type** stored in **contiguous (sequential) memory locations**. 

- **Fixed Size:** The size of an array must be defined at creation and cannot be dynamically changed in standard arrays.
- **Homogeneous Data:** Every element in the array must share the exact same data type (e.g., all integers, all characters).
- **Random Access:** You can directly access any element instantly if you know its position.

```text
Logical View:
               +-----+-----+-----+-----+-----+
Element:       | 'a' | 'b' | 'c' | 'd' | 'e' |
               +-----+-----+-----+-----+-----+
Index:            0     1     2     3     4


Physical Memory View (Assuming 1-byte Character size):
               +-----+-----+-----+-----+-----+
Memory Address:| 1000| 1001| 1002| 1003| 1004|
               +-----+-----+-----+-----+-----+
```

## Operations in array

- Create
- Input
- Output
- Update

```java
// Creating an Array

dataType arrayName[] = new dataType[size];

int marks[] = new int[50];

int numbers[] = {1, 2, 3};

String fruits[] = {"apple", "mango", "orange"};
```

## Passing array as function arguments

When you pass an array to a method, Java passes a <mark>copy of the reference (memory address)</mark> which points to the <mark>original array</mark>. So changes to array elements inside the method <mark>modify the original array</mark> outside the method.

Java is <mark>strictly pass by value</mark>. For primitives, it copies the <mark>actual data</mark>. For <mark>arrays/objects</mark>, it copies the <mark>reference (address)</mark> which points to the <mark>same heap object</mark>. So changes to object state affect the original, but reassigning the reference does not.

```java
public static void updatePrimitive(int num) {
    num = 100;  // Changes local copy only
}

public static void updateArray(int[] arr) {
    arr[0] = 100;  // Changes original array
}

public static void main(String[] args) {
    int[] marks = {10, 20, 30};
    updateArray(marks);
    System.out.println("Array: " + marks[0]);  // 100 (CHANGED)
    
    int value = 10;
    updatePrimitive(value);
    System.out.println("Primitive: " + value);  // 10 (NOT CHANGED)
}
```

## Linear Search

A simple searching algorithm that sequentially checks each element of an array/list from start to end until the target element is found or the list ends.

```text
Array: [10, 25, 30, 45, 50]
Target: 30

Step 1: Check 10 -> No
Step 2: Check 25 -> No  
Step 3: Check 30 -> Yes -> Found at index 2
```

## Binary Search

A efficient searching algorithm that repeatedly divides a sorted array in half and compares the target with the middle element, eliminating half of the remaining elements each time.

```text
Sorted Array: [10, 25, 30, 45, 50]
Indices:       0   1   2   3   4
Target: 45

Step 1: mid = index 2 (value 30)
        45 > 30 -> Search RIGHT half
        New range: indices 3 to 4 -> [45, 50]

Step 2: mid = index 3 (value 45)
        45 == 45 -> FOUND at index 3

Total comparisons: 2
```