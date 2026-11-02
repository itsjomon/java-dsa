package conditionals;

// Print the largest of two numbers (a = 2 and b = 5)
public class LargestOfTwo {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        if (a > b) {
            System.out.println("a is greater");
        } else if (b > a) {
            System.out.println("b is greater");
        } else {
            System.out.println("Both are equal");
        }
    }
}
