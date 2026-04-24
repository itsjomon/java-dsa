package patterns.part1;

public class HalfDiamond {
    public static void main(String[] args) {
        int n = 5;

        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int line = n-1; line >= 1; line--) {
            for (int star = 1; star <= line; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

/*
Print the following pattern:

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*
 */