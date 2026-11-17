package oop;

public class Constructors {
    public static void main(String[] args) {
        ConStudent s1 = new ConStudent();

        ConStudent s2 = new ConStudent("Jomon");
        System.out.println(s2.name);

        ConStudent s3 = new ConStudent(123);
        System.out.println(s3.roll);
    }
}

class ConStudent {
    String name;
    int roll;

    // === Non parameterized constructor ===
    ConStudent() {
        System.out.println("Constructor is called...");
    }

    // === Parameterized constructor ===
    ConStudent(String name) {
        this.name = name;
    }

    ConStudent(int roll) {
        this.roll = roll;
    }
}

// Having multiple constructors in the same class (the class name) with different parameters is called constructor overloading.
