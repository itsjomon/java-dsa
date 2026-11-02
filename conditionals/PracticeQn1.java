package conditionals;

// What will be the value of x and y in the following program:
public class PracticeQn1 {
    public static void main(String[] args) {
        int a = 63, b = 36;

        boolean x = (a < b) ? true : false;
        int y = (a > b) ? a : b;

        System.out.println(x);
        System.out.println(y);

    }
}

// Value of x = false and y = 63
