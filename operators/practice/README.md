# Practice Questions

What will be the output of the following programs:

## Qn 1.

```java
public class Qn1 {
    public static void main(String[] args) {
        int x = 2, y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
    
        System.out.print(exp1 + “, ”);
        System.out.print(exp2);
    }
}
```

## Qn 2.

```java
public class Qn2 {
    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;

        if(x > y && y > z) {
            System.out.println("Hello");
        }
        if(z > y && z < x) {
            System.out.println("Java");
        }
        if((y+200) < x && (y+150) < z) {
            System.out.println("Hello Java");
        }
    }
}
```

## Qn 3.

```java
public class Qn3 {
    public static void main(String[] args) {
        int x, y, z;

        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);

        System.out.println(x + " " + y + " " + z);
    }
}
```

## Qn 4.

```java
public class Qn4 {
    public static void main(String[] args) {
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;

        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);

        System.out.println(exp);
    }
}
```

## Qn 5.

```java
public class Qn5 {
    public static void main(String[] args) {
        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);

        System.out.println(exp1);
        System.out.println(exp2);
    }
}
```