package strings;

import java.util.Scanner;

public class StringBasics {

    // ----- charAt method -----
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    // ----- Substring -----
    public static String substr(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }


    public static void main(String[] args) {
        // ----- Input/Output -----
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        sc.close();


        // ----- String length -----
        String fullName = "Arya Stark";
        System.out.println(fullName.length());


        // ----- Concatenation -----
        String fName = "Tony";
        String lName = "Stark";
        String fullName2 = fName + " " + lName;
        System.out.println(fullName2);
        

        // ----- charAt method -----
        printLetters(fullName2);


        // ----- Compare -----
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if (s1 == s3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        // Use .equals() to compare string content, == compares memory references. String literals share the same memory, but new String() creates a separate object. Always prefer .equals() for value comparison.


        // ----- Substring -----
        String str3 = "HelloWorld";
        System.out.println(str3.substring(0, 5));
        // System.out.println(substr(str3, 0, 5));


        // ----- StringBuilder -----
        StringBuilder sb = new StringBuilder("");
        for ( char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        } // abcdefgh.....

        System.out.println(sb);
        System.out.println(sb.length());
    }
}