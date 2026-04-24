package patterns.part1;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

/*
Print the following pattern:

* * * * 
* * *
* *
*
 */
