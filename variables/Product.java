package variables;

import java.util.*;

// Product of a and b, input from user
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a * b;

        System.out.println(product);
        
        sc.close();
    }
}
