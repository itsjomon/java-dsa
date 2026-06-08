# Strings

Strings are used for storing text.

A `String` variable contains a collection of characters surrounded by double quotes (`""`):

```java
String greeting = "Hello";
```

In Java, strings are **immutable**, meaning their values cannot be changed once created.

```java
// String Literal - Stored in STRING POOL
String str1 = "abcd";
// str1 points to "abcd" in String Pool

String str2 = "abcd";
// str2 points to the SAME "abcd" as str1 (reused from String Pool)
// str1 == str2 is true (same memory location)

// Using 'new' keyword - Stored in HEAP memory
String str3 = new String("abcd");
// str3 points to a BRAND NEW String object in Heap memory
// str1 == str3 is false (different memory locations)

// Char Array - Mutable (can be changed)
char[] arr = {'a', 'b', 'c', 'd'};
// arr points to an array where each element can be modified
// arr[0] = 'z' works!
```

When you try to modify a string, Java creates a new string object instead of changing the original.

## StringBuilder

**StringBuilder** is a mutable sequence of characters in Java that allows you to modify strings without creating new objects each time. Unlike `String` (immutable), `StringBuilder` can be changed efficiently.

```java
StringBuilder sb = new StringBuilder("Hello");
```