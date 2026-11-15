package variables;

import java.util.*;

// In a program, input the side of a square. You have to output the area of the square.
// (Hint: area of a square is (side x side))

public class SquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();

        int area = side * side;

        System.out.println("Area of the square is: " + area);
        
        sc.close();
    }
}
