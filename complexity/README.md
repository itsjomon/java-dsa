# Time and Space Complexity

## What is Time Complexity

Time Complexity measures the amount of time an algorithm takes to run as a function of input size (n).

Not the actual time taken.

## Big O Notation- O(n)

**Big O** describes the worst-case scenario of an algorithm. It tells you the maximum time or maximum memory your program will need as input grows.

## Big Omega Notation - &Omega;(n)

**Big Omega** describes the best-case scenario of an algorithm. It tells you the minimum time or minimum memory your program will need.

## Big Theta Notation - &Theta;(n)

**Big Theta** describes the average-case scenario when upper and lower bounds are the same. It tells you the exact growth rate your program will have.

## Common Complexities

- `O(2^n)`
- `O(n^2)`
- `O(n)`
- `O(n log n)`
- `O(log n)`
- `O(1)`

## Space Complexity

Space Complexity measures the amount of memory an algorithm uses as a function of input size (n).

## Master's Theorem

The Master's Theorem (or Master's Method) is a mathematical tool used to determine the time complexity of recursive algorithms. It provides a quick way to solve recurrence relations without manually expanding them.

The theorem is specifically designed for divide-and-conquer algorithms that break a problem into smaller subproblems, solve them recursively, and combine the results. Examples include Merge Sort, Binary Search, Quick Sort, and Strassen's Matrix Multiplication.

### The Standard 

The Master's Theorem applies to recurrences that can be expressed in the form:

```text
T(n) = aT(n/b) + f(n)
```
Where:

- **n** = size of the problem.
- **a** = number of subproblems in the recursion (where a &ge; 1).
- **n/b** = size of each subproblem (where b > 1).
- **f(n)** = work done outside the recursive calls (combining step)
- **T(n)** = time complexity for input size n

## The Three Cases

- If f(n) = O(n<sup>c</sup>) where c < Log<sub>b</sub>a then T(n) = &Theta;(n * Log<sub>b</sub>a)
- If f(n) = &Theta;(n<sup>c</sup>) where c = Log<sub>b</sub>a then T(n) = &Theta;(n<sup>c</sup> * Log n)
- If f(n) = &Omega;(n<sup>c</sup>) where c > Log<sub>b</sub>a then T(n) = &Theta;(f(n))

**How does this work?**

This is how a recursive tree for such problems will be like:

```text
               T(n)
              /  |  \
             /   |   \
       T(n/b)  T(n/b)  ... T(n/b)
         |      |
         ·      ·
         ·      ·
         ·      ·
      T(n/b^2) T(n/b^2)
         |      |
         ·      ·
         ·      ·
         ·      ·

    ... (recursive calls) ...
```

In the recurrence tree method, we calculate the total work done.

Case 1: If the work done at leaves is polynomially more, then leaves are the dominant part, and our result becomes the work done at leaves 

Case 2: If work done at leaves and root is asymptotically the same, then our result becomes height multiplied by work done at any level

Case 3: If work done at the root is asymptotically more, then our result becomes work done at the root

- **Merge Sort:** T(n) = 2T(n/2) + O(n). It falls in case 2 as c is 1 and Log<sub>b</sub>a is also 1. So the solution is &Theta;(n log n)
- **Binary Search:** T(n) = T(n/2)+ O(1). It also falls in case 2 as c is 0 and Log<sub>b</sub>a is also 0. So the solution is &Theta;(log n)
