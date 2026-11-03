package patterns.part1;

/*
Print the following pattern:

1 2 3 
4 5 6 
7 8 9 
10 11 12 
13 14 15 
 */
public class NumberRectangle {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
