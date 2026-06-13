package oop;

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "JVM"; // Sets static variable to "JVM"

        Student s2 = new Student();
        System.out.println(s2.schoolName); // Prints "JVM"

        Student s3 = new Student();
        s3.schoolName = "JRE"; // Changes static variable to "JRE"

        // Now ALL students have schoolName = "JRE"
        System.out.println("s1 now sees: " + s1.schoolName); // Prints "JRE"
        System.out.println("s2 now sees: " + s2.schoolName); // Prints "JRE"
        System.out.println("s3 now sees: " + s3.schoolName); // Prints "JRE"
    }
}

class Student {
    String name;
    int roll;
    static String schoolName;  // Shared by ALL Student objects

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}