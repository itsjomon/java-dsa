package variables;

import java.util.*;

// Area of a circle, input from user
public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();

        float area = 3.14f * rad * rad;

        System.out.println(area);
        
        sc.close();
    }
}
