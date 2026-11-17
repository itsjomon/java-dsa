package oop;

public class Inheritance {
    public static void main(String[] args) {
        // === Single level inheritance ===
        InherFish shark = new InherFish();
        shark.eat();  // From parent Animal
        shark.swim(); // From own class Fish


        // === Multi level inheritance ===
        InherDog dobby = new InherDog();
        dobby.eat();    // From Animal (grandparent)
        dobby.bark();   // From Dog (own)
        dobby.legs = 4; // From Mammal (parent)
        dobby.breed = "Labrador";
        System.out.println("Breed: " + dobby.breed);


        // === Hierarchical inheritance ===
        InherFish f = new InherFish();
        InherMammal m = new InherMammal();
        InherBird b = new InherBird();
        
        f.eat(); // All share Animal's eat()
        m.eat();
        b.eat();


        // === Hybrid inheritance ===
        // Combination of Multi-level + Hierarchical
        InherDog d = new InherDog();
        d.eat();  // From Animal (hierarchical part)
        d.walk(); // From Mammal (multi-level part)
    }
}


// BASE CLASS (Parent for all)
class InherAnimal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}


// === Single level inheritance ===
// Animal -> Fish (one parent, one child)
class InherFish extends InherAnimal {
    int fins;

    void swim() {
        System.out.println("Swim");
    }
}


// === Multi level inheritance ===
// Animal -> Mammal -> Dog (chain of inheritance)
class InherMammal extends InherAnimal {
    int legs;

    void walk() {
        System.out.println("Walks");
    }
}

class InherDog extends InherMammal {
    String breed;

    void bark() {
        System.out.println("Barks");
    }
}


// === Hierarchical inheritance ===
// Animal -> Fish, Mammal, Bird (one parent, multiple children)
class InherBird extends InherAnimal {
    void fly() {
        System.out.println("Fly");
    }
}


// === Hybrid inheritance ===
// Combination of Multi-level + Hierarchical
// Present in same structure: (Animal -> Mammal -> Dog (Multi-level)) + (Animal -> Fish, Bird (Hierarchical))


// Note: Java doesn't support multiple inheritance (extends 2 classes)
// Hybrid is achieved through combination of inheritance types
