# Practice Questions

## Qn 1.

How many times 'Hello' is printed?

```java
public class Qn1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i += 2;
        }
    }
}

// Answer: 2 times
```

## Qn 2.

What is wrong in the following program?

```java
public class Qn2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        
        System.out.println("i after the loop = " + i);
    }
}

// Answer: i is declared inside the loop, so it is out of scope and cannot be accessed outside the loop.
```
