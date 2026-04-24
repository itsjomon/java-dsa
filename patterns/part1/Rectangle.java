package patterns.part1;

public class Rectangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= m; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

/*
Print the following pattern:

* * * * *
* * * * *
* * * * *
* * * * *
 */