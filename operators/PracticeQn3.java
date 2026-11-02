package operators;

// What will be the output of the following program:
public class PracticeQn3 {
    public static void main(String[] args) {
        int x, y, z;

        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);

        System.out.println(x + ", " + y + ", " + z);
    }
}

// Output: 4, 0, 0
// x becomes 4 (2+2), y becomes 0 (2-2) and z becomes 0 because 2 / (4+0) truncates to 0 in integer division
