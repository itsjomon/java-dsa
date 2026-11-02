package operators;

// What will be the output of the following program:
public class PracticeQn5 {
    public static void main(String[] args) {
        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);

        System.out.print(exp1 + ", ");
        System.out.print(exp2);
    }
}

// Output: 20, 20
