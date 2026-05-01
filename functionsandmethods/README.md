## Functions

A function (also called method) is a block of code that performs a specific task. It's like a mini-program inside your main program.

### Syntax

```java
returnType name() {
    // body
    return statement;
}


// Functions with Parameters
returnType name (type param1, type param2) {
    // body
    return statement;
}
```

## What happens in memory? (Call Stack)

### When a function is called:

1. **Stack Frame Creation:** JVM creates a new frame on the call stack
2. **Frame contains:**
    - Local variables
    - Method Parameters
    - Return address

### Example:

```java
public int add(int a, int b) {
    int result = a + b;
    return result;
}
```

#### Stack memory for this call:

```text
|  result = 7     | Local variable
|  b = 3          | Parameters
|  a = 4          | Parameters
|  return address | Where to go back
|-----------------|
|  Previous frame | (caller method)
|-----------------|
```

### Key points:

- **Each method call** = new stack frame
- **LIFO Order** (Last In, First Out)
- **Frame destroyed** when method returns
- **Primitives** stored directly in stack
- **Objects** stored in heap (references in stack)

    ```text
    Object Example:

    Person p = new Person();

    Stack:              Heap:
    |  p  |  ---------> | Person |
    | ref |             | object |
    ```

## Call by Value vs Call by Reference

### Call by Value

- Copies the argument's value into the parameter
- Changes inside function don't affect original
- Function works on a copy

### Call by Reference

- Passes the memory address of the argument
- Changes inside function affect original
- Function works on original data

### Java: Call by Value ONLY

```java
public class Main {
    public static void swap(int a, int b) {    // Step 3: a=15, b=5 (copies received)
        int temp = a;                          // Step 4: temp = 15
        a = b;                                 // Step 5: a = 5 (now a becomes 5)
        b = temp;                              // Step 6: b = 15 (now b becomes 15)

        System.out.println("a = " + a);        // Step 7: prints "a = 5"
        System.out.println("b = " + b);        // Step 8: prints "b = 15"
    }                                          // Step 9: swap method ends, its variables destroyed
    
    public static void main (String[] args) {
        int a = 15;                            // Step 1: main's a = 15
        int b = 5;                             // Step 2: main's b = 5
        
        System.out.println("a = " + a);        // prints 15
        System.out.println("b = " + b);        // prints 5
        
        swap(a, b);                            // Step 3: call swap with COPIES of 15 and 5
        
        System.out.println("a = " + a);        // Step 10: still 15 (main's a unchanged)
        System.out.println("b = " + b);        // Step 11: still 5 (main's b unchanged)
    }
}
```

## Inbuilt v/s User-defined Methods

### Inbuilt Methods (Pre-defined)

- Built into Java libraries/APIs
- Ready to use without writing code
- Part of packages like java.lang, java.util

### User-defined Methods

- Created by programmer
- Custom logic for specific needs
- Must be defined before use

### Example:

```java
public class Main {
    
    // User-defined method
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        // Built-in method
        System.out.println(Math.max(10, 20)); // 20
        
        // User-defined method
        System.out.println(add(5, 3)); // 8
    }
}
```

## Function Overloading

**Function Overloading:** When multiple methods have the **same name** but **different parameters** (different count or different data types) in the same class.

### Rule:

- Same method name
- Different parameters (count OR type)
- Same name + same parameters = error

### Using Parameters

```java
public class Main {
    // Same name, different parameter count
    public static int add(int a, int b) {
        return a + b; // 2 params
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c; // 3 params
    }
    
    public static void main(String[] args) {
        System.out.println(add(5, 3));
        System.out.println(add(5, 3, 2));
    }
}
```

### Using Data Types

```java
public class Main {
    // Same name, different parameter types
    public static int sub(int a, int b) {
        return a - b;
    }
    
    public static float sub(float a, float b) {
        return a - b;
    }
    
    public static void main(String[] args) {
        System.out.println(sub(5, 2));
        System.out.println(sub(10.3f, 5.1f)); // Float subtraction shows precision issue
        System.out.printf("%.1f", sub(10.3f, 5.1f)); // Formatted output to hide precision issue
    }
}
```

## Scope

### Method Scope

Variables declared inside a method cannot be accessed by other methods. Each method has its own separate scope. However, values can be passed from one method to another using parameters - but these are COPIES, not the original variables.

```java
public class Main {
    
    public static void methodScope(int param) { // param gets COPY
        int local = 5; // local exists ONLY here
        System.out.println("param=" + param + ", local=" + local); // Works
        
        // Cannot access x from main
        // System.out.println(x); Error - x does not exist here
    }
    
    public static void main(String[] args) {
        int x = 10; // x exists ONLY here
        
        methodScope(x); // Passes COPY of x (10) to param
        
        System.out.println("x=" + x); // Works

        // Cannot access param or local from methodScope
        // System.out.println(local); Error - local does not exist here
        // System.out.println(param); Error - param does not exist here
    }
}
```

### Block Scope

Variables declared inside a block { } (if, for, while, etc.) can only be accessed within that specific block. They are destroyed when the block ends.

```java
public class BlockScope {
    public static void main(String[] args) {
        if (true) {
            int a = 5;
            System.out.println(a); // Works
        }

        // System.out.println(a);  Error - a is gone
        
        for (int i = 0; i < 3; i++) {
            int b = i;
            System.out.println(b); // Works
        }

        // System.out.println(b); Error - b is gone
        // System.out.println(i); Error - i is gone
    }
}
```
