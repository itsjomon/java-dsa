package oop;

public class Abstraction {
    public static void main(String[] args) {
        // ----- Abstract class -----
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();

       // Constructor chaining: Calling one constructor from another using super() or this()
       // Java automatically adds super() if not written
       Mustang myHorse = new Mustang(); // Constructor chaining: Animal -> Horse -> Mustang



        // ----- Interface -----
        Queen q = new Queen();
        q.moves();

        // --- Multiple Interface ---
        Bear b = new Bear();
        b.eat();
        b.hunt();
        b.roar(); 
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
        System.out.println("Animal constructor called...");
    }

    void eat() {
        System.out.println("Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called...");
    }


    void changeColor() {
        color = "Dark brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called...");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "White";
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}



// ----- Interface -----

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right, Diagonal (In all 4 directions)");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right, Diagonal - (By 1 step)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, Left, Right");
    }
}


// --- Multiple Interface ---
interface Herbivore {
    void eat();
}

interface Carnivore {
    void hunt();
}

class Bear implements Herbivore, Carnivore {
    
    public void eat() {
        System.out.println("Bear eats berries, nuts, roots, and grass");
    }
    
    public void hunt() {
        System.out.println("Bear hunts fish, small mammals, and insects");
    }
    
    public void roar() {
        System.out.println("BEAR ROARS loudly!!!");
    }
}