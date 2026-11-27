package operators;

public class LogicalOperators {
    
    public static void main(String[] args) {
        int a = 3, b = 2, c = 5, d = 0;
        
        // Logical AND
        System.out.println((a > b) && (c > d)); // true
        System.out.println((a < b) && (c > d)); // false

        // Logical OR
        System.out.println((a > b) || (c > d)); // true
        System.out.println((a < b) || (c > d)); // true
        System.out.println((a > b) || (c < d)); // true

        // Logical NOT
        System.out.println(!(c > d)); // false
        System.out.println(!(d > c)); // true
    }
}

/*
Logical Operators

| Operator | Description   |
|----------|---------------|
| &&       | Logical AND   |
| ||       | Logical OR    |
| !        | Logical NOT   |


&& (Logical AND)
| Statement 1 | Statement 2 | Result |
|-------------|-------------|--------|
| T           | T           | T      |
| T           | F           | F      |
| F           | T           | F      |
| F           | F           | F      |


|| (Logical OR)
| Statement 1 | Statement 2 | Result |
|-------------|-------------|--------|
| T           | T           | T      |
| T           | F           | T      |
| F           | T           | T      |
| F           | F           | F      |


! (Logical NOT)
| Statement | Result |
|-----------|--------|
| T         | F      |
| F         | T      |
 */
