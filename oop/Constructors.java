package oop;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("Jomon");
        System.out.println(s2.name);

        Student s3 = new Student(123);
        System.out.println(s3.roll);
    }
}

class Student {
    String name;
    int roll;

    // --- Non parameterized constructor ---
    Student() {
        System.out.println("Constructor is called...");
    }

    // --- Parameterized constructor ---
    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}

// Having multiple constructors in the same class (the class name) with different parameters is called constructor overloading.
