package variablesanddatatypes;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 25;
        long b = a;
        System.out.println(b);

        char ch = 'a';
        int number = ch; // char -> int (ASCII value of 'a' is 97)
        System.out.println(number); // Print the ASCII value of the character 'a'

    }
}

/*
Type conversion is also known as Implicit/Widening conversion.

Conversion happens when :
1. type compatible
2. destination type > source type

byte -> short -> int -> float -> long -> double
 */
