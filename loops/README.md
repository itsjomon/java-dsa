# Loops

- While
- For
- Do While

## While Loop

Checks the condition first. If true, the body runs. If false, the body never runs.

```java
while (condition) {
    // do something
}
```

## For Loop

Initialization runs once at the start. Then the condition is checked. If true, the body runs, and after that the update runs. If false, the loop stops. This repeats until the condition becomes false. Best when you know how many times to repeat.

```java
for (initialization; condition; update) {
    // do something
}
```

## Do While Loop

Runs the body first, then checks the condition. If true, it runs again. If false, it stops. So the body runs at least one time, even if the condition is false from the start.

```java
do {
    // do something
} while (condition);
```

## Break Statement

To exit the loop

```java
break;
```

## Continue Statement

To skip an iteration

```java
continue;
```
