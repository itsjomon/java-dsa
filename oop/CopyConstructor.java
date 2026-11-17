package oop;

public class CopyConstructor {
    public static void main(String[] args) {
        CopyStudent s1 = new CopyStudent("Jomon", 456);
        s1.password = "abcdefghi";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        CopyStudent s2 = new CopyStudent(s1); // Copy
        s2.password = "pqrstuvwxyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class CopyStudent {
    String name;
    int roll;
    String password;
    int marks[];

    // === Shallow copy constructor ===
    // CopyStudent(CopyStudent s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    
    // === Deep copy constructor ===
    CopyStudent(CopyStudent s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }


    CopyStudent(String name, int roll) {
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

/* === Lazy Copy ===

package oop;

public class CopyConstructor {
    public static void main(String[] args) {
        LazyCopyStudent s1 = new LazyCopyStudent("Jomon", 456);
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        LazyCopyStudent s2 = new LazyCopyStudent(s1); // Lazy copy
        s2.setMark(2, 100); // First modify - becomes deep copy
        
        System.out.println(s1.marks[2]); // 80 (unchanged)
        System.out.println(s2.marks[2]); // 100 (changed)
    }
}

class LazyCopyStudent {
    String name;
    int roll;
    int marks[];
    private boolean isShared;

    // Lazy copy constructor
    LazyCopyStudent(LazyCopyStudent s1) {
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

    LazyCopyStudent(String name, int roll) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }
}
 */