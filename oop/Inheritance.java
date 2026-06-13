package oop;

public class Inheritance {
    public static void main(String[] args) {
        // --- Single level inheritance ---
        Fish shark = new Fish();
        shark.eat();  // From parent Animal
        shark.swim(); // From own class Fish


        // --- Multi level inheritance ---
        Dog dobby = new Dog();
        dobby.eat();    // From Animal (grandparent)
        dobby.bark();   // From Dog (own)
        dobby.legs = 4; // From Mammal (parent)
        dobby.breed = "Labrador";
        System.out.println("Breed: " + dobby.breed);


        // --- Hierarchical inheritance ---
        Fish f = new Fish();
        Mammal m = new Mammal();
        Bird b = new Bird();
        
        f.eat(); // All share Animal's eat()
        m.eat();
        b.eat();


        // --- Hybrid inheritance ---
        // Combination of Multi-level + Hierarchical
        Dog d = new Dog();
        d.eat();  // From Animal (hierarchical part)
        d.walk(); // From Mammal (multi-level part)
    }
}


// BASE CLASS (Parent for all)
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breaths");
    }
}


// --- Single level inheritance ---
// Animal -> Fish (one parent, one child)
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swim");
    }
}


// --- Multi level inheritance ---
// Animal -> Mammal -> Dog (chain of inheritance)
class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println("Walks");
    }
}

class Dog extends Mammal {
    String breed;

    void bark() {
        System.out.println("Barks");
    }
}


// --- Hierarchical inheritance ---
// Animal -> Fish, Mammal, Bird (one parent, multiple children)
class Bird extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}


// --- Hybrid inheritance ---
// Combination of Multi-level + Hierarchical
// Present in same structure: (Animal -> Mammal -> Dog (Multi-level)) + (Animal -> Fish, Bird (Hierarchical))


// Note: Java doesn't support multiple inheritance (extends 2 classes)
// Hybrid is achieved through combination of inheritance types