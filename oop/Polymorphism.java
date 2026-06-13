package oop;

public class Polymorphism {
    public static void main(String[] args) {
        // ----- Compile-time polymorphism (Method Overloading) -----
        // Compiler decides which method to call based on number and type of arguments

        Calculator calc = new Calculator();

        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1.5f, 2.5f));
        System.out.println(calc.sum(1, 2, 3));


        // ----- Run-time polymorphism (Method Overriding) -----
        Animal a = new Animal();
        Deer d = new Deer();
        Animal ref = new Deer();  // Parent reference, child object
        
        a.eat();   // Calls Animal's eat()
        d.eat();   // Calls Deer's eat()
        ref.eat(); // Calls Deer's eat() (runtime decision)
    }
}


// ----- Compile-time polymorphism
// Method Overloading: Same name, different parameters
class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}



// ----- Run-time polymorphism -----
// Method Overriding: Same name, same parameters, different class
class Animal {
    void eat() {
        System.out.println("Eats anything");
    }
}

class Deer extends Animal {
    @Override // Not required but good to add - helps compiler catch mistakes like typos
    void eat() { // Overriding parent method
        System.out.println("Eats grass");
    }
}

/*
COMPILE-TIME POLYMORPHISM (Method Overloading)
- Same method name, DIFFERENT parameters
- Decision made by COMPILER
- Example: sum(int,int) vs sum(float,float)

RUNTIME POLYMORPHISM (Method Overriding)  
- Same method name, SAME parameters
- Decision made by JVM at RUNTIME
- Example: Animal eat() vs Deer eat()
- @Override helps compiler catch typos
*/