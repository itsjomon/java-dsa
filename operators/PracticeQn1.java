package operators;

// What will be the output of the following program:
public class PracticeQn1 {
    public static void main(String[] args) {
        int x = 2, y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
    
        System.out.print(exp1 + ", ");
        System.out.print(exp2);
    }
}

// Output: 5, 4
// exp2: 5 / 2 truncates to 2 (integer division), then 2 * 2 = 4
