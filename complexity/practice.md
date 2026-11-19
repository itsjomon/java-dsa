# Practice Questions

Find the Time Complexity of the following:

## Qn 1.

```java
int i, j, k = 0;

for (i= n / 2; i <= n; i++) {
    for (j = 2; j <= n; j = j * 2) {
        k = k + n / 2;
    }
}
```
- [ ] A. O(n)
- [x] B. O(n log n)
- [ ] C. O(n^2)
- [ ] D. O(n^2 Log n)

## Qn 2.

```java
for(int i = 0; i < n; i++) {
    i *= k;
}
```

Here, k is some constant value

- [ ] A. O(n)
- [ ] B. O(k)
- [x] C. O(log<sub>k</sub> n) (= log n of base k)
- [ ] D. O(log<sub>n</sub> k) (= log k of base n)

## Qn 3.

Algorithm A and B have a worst-case running time of O(n) and O(logn), respectively. Therefore, algorithm B always runs faster than algorithm A.

- [ ] A. True
- [x] B. False

## Qn 4.

Find the time & space complexity of floorSqrt function in the following code to calculate square root of a number:

```java
class SqrtNum {
    static int floorSqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        int i = 1, result = 1;
        
        while (result <= x) {
            i++;
            result = i * i;
        }
        
        return i - 1;   
    }
    
    public static void main(String[] args) {
        int x = 11;
        System.out.print(floorSqrt(x));
    }
}

// Ans:
// Time complexity: O(sqrt(n))
// Space complexity: O(1)
```

## Qn 5.

Find the time & space complexity of the following code:

```java
int a = 0;
for (int i = 0; i < n; ++i) {
    for (int j = n; j > i; --j) {
        a = a + i + j;
    }
}

// Ans:
// Time complexity: O(n^2)
// Space complexity: O(1)
```
