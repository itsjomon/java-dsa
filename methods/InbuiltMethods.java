package methods;

/*
Search and use the following methods of the Math class in Java:

- Math.min( )
- Math.max( )
- Math.sqrt( )
- Math.pow( )
- Math.abs( )

Math Class Reference:

Java SE 8 Documentation:
https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

Java SE 27 Documentation (Latest):
https://docs.oracle.com/en/java/javase/27/docs/api/java.base/java/lang/Math.html
 */
public class InbuiltMethods {
    public static void main(String[] args) {
        System.out.println(Math.min(10, 20)); // 10
        System.out.println(Math.max(10, 20)); // 20
        System.out.println(Math.sqrt(25));    // 5.0
        System.out.println(Math.pow(2, 3));   // 8.0
        System.out.println(Math.abs(-15));    // 15
    }
}
