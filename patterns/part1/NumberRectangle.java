package patterns.part1;

public class NumberRectangle {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        int num = 1;

        for (int line = 1; line <= n; line++) {
            for (int nums = 1; nums <= m; nums++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }

}

/*
Print the following pattern:

1 2 3
4 5 6
7 8 9
10 11 12
13 14 15
 */