package conditionalstatements;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 1, b = 3, c = 6;

        if (a >= b && a >= c) {
            System.out.println("a");
        } else if (b >= c) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }
    }
}

// Print the largest of three numbers (a = 1, b = 3, c = 6)
