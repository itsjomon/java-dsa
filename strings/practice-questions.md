# Practice Questions

## Qn 3.

What will be the output of the following code?

```java
public class Solution {
    public static void main(String[] args) {
        String str = "itsjomon";
        String str1 = "LeetCode";
        String str2 = "itsjomon";
        
        System.out.println(str.equals(str1) + " " + str.equals(str2));
    }
}

// Output:
// false true
```

## Qn 4. What will be the output of the following code?

```java
public class Solution {
    public static void main(String[] args) {
        String str = "itsjomon".replace("s","z");
        
        System.out.println(str);
    }
}

// Output:
// itzjomon
```

## Qn 5.

Search and read about

- intern() method in String
- StringBuffer

**Ans:**

- `intern()` method in String
    - Returns canonical representation from String pool
    - If string exists in pool -> returns pool reference
    - If not -> adds to pool and returns reference
    - Saves memory by reusing String objects

    ```java
    String s1 = new String("hello");
    String s2 = s1.intern(); // Returns pool reference
    ```

- `StringBuffer`
    - Mutable (modifiable) sequence of characters
    - Thread-safe (synchronized methods)
    - Slower than StringBuilder
    - Used for multi-threaded environments

    ```java
    StringBuffer sb = new StringBuffer("Hello");
    sb.append(" World"); // Modifies existing object (no new object created)
    ```