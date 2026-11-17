package oop;

public class Static {
    public static void main(String[] args) {
        StudentStatic s1 = new StudentStatic();
        s1.schoolName = "JVM"; // Sets static variable to "JVM"

        StudentStatic s2 = new StudentStatic();
        System.out.println(s2.schoolName); // Prints "JVM"

        StudentStatic s3 = new StudentStatic();
        s3.schoolName = "JRE"; // Changes static variable to "JRE"

        // Now ALL students have schoolName = "JRE"
        System.out.println("s1 now sees: " + s1.schoolName); // Prints "JRE"
        System.out.println("s2 now sees: " + s2.schoolName); // Prints "JRE"
        System.out.println("s3 now sees: " + s3.schoolName); // Prints "JRE"
    }
}

class StudentStatic {
    String name;
    int roll;
    static String schoolName; // Shared by ALL Student objects

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}