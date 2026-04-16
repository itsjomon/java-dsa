package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 10;
        // System.out.println(a == b); // true
        // System.out.println(a != b); // false

        int a = 10;
        int b = 5;
        System.out.println(a == b); // false
        System.out.println((a > b)); // true
        System.out.println((b > a)); // false
        System.out.println((b >= a)); // false
        
    }
}

/*
Relational Operators

| Operator | Description                | Example     |
|----------|----------------------------|-------------|
| ==       | Equal to                   | a == b      |
| !=       | Not equal to               | a != b      |
| >        | Greater than               | a > b       |
| <        | Less than                  | a < b       |
| >=       | Greater than or equal to   | a >= b      |
| <=       | Less than or equal to      | a <= b      |
 */
