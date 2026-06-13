package oop;

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Jomon", 456);
        s1.password = "abcdefghi";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // Copy
        s2.password = "pqrstuvwxyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // --- Shallow copy constructor ---
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    
    // --- Deep copy constructor ---
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }


    Student(String name, int roll) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }
}


// SHALLOW COPY: Copies reference only. Original and copy share same data.
// Changes in one affect the other.

// DEEP COPY: Copies actual values. Creates independent duplicate.
// Changes in one DO NOT affect the other.

// LAZY COPY: Starts as shallow copy, becomes deep copy when someone tries to modify.
// Copy-on-write strategy.

/* --- Lazy Copy ---
package oop;

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Jomon", 456);
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // Lazy copy
        s2.setMark(2, 100); // First modify - becomes deep copy
        
        System.out.println(s1.marks[2]); // 80 (unchanged)
        System.out.println(s2.marks[2]); // 100 (changed)
    }
}

class Student {
    String name;
    int roll;
    int marks[];
    private boolean isShared;

    // Lazy copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;  // Start as shallow
        this.isShared = true;
    }
    
    void setMark(int index, int value) {
        if(isShared) {  // First modify? Convert to deep
            int[] newMarks = new int[marks.length];
            for(int i = 0; i < marks.length; i++) newMarks[i] = marks[i];
            this.marks = newMarks;
            isShared = false;
        }
        this.marks[index] = value;
    }

    Student(String name, int roll) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }
}
 */