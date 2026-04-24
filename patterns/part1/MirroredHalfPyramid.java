package patterns.part1;

public class MirroredHalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        
        for (int line = 1; line <= n; line++) {
            for (int space = 1; space <= n - line; space++) {
                System.out.print("  ");
            }
            
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
 */