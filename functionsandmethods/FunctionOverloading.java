package functionsandmethods;

public class FunctionOverloading {
    // ----- Using Parameters (Same Name, Different Count) -----
    public static int add(int a, int b) {
        return a + b; // 2 params
    }

    public static int add(int a, int b, int c) {
        return a + b + c; // 3 params
    }


    
   // ----- Using Data Types (Same Name, Different Types) -----
    public static int sub(int a, int b) {
        return a - b;
    }
    
    public static float sub(float a, float b) {
        return a - b;
    }
    
    public static void main(String[] args) {
        System.out.println(add(5, 5));
        System.out.println(add(5, 3, 2));

        System.out.println(sub(5, 2));
        System.out.println(sub(10.3f, 5.1f)); // Float subtraction shows precision issue
        System.out.printf("%.1f", sub(10.3f, 5.1f)); // Formatted output to hide precision issue
    }
}



