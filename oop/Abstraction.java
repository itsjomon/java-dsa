package oop;

public class Abstraction {
    public static void main(String[] args) {
        // ===== Abstract class =====
        AbsHorse h = new AbsHorse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        AbsChicken c = new AbsChicken();
        c.eat();
        c.walk();

       // Constructor chaining: Calling one constructor from another using super() or this()
       // Java automatically adds super() if not written
       AbsMustang myHorse = new AbsMustang(); // Constructor chaining: Animal -> Horse -> Mustang
       myHorse.eat();



        // ===== Interface ======
        Queen q = new Queen();
        q.moves();

        // === Multiple Interface ===
        AbsBear b = new AbsBear();
        b.eat();
        b.hunt();
        b.roar(); 
    }
}

abstract class AbsAnimal {
    String color;

    AbsAnimal() {
        color = "Brown";
        System.out.println("Animal constructor called...");
    }

    void eat() {
        System.out.println("Eats");
    }

    abstract void walk();
}

class AbsHorse extends AbsAnimal {
    AbsHorse() {
        System.out.println("Horse constructor called...");
    }

    void changeColor() {
        color = "Dark brown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class AbsMustang extends AbsHorse {
    AbsMustang() {
        System.out.println("Mustang constructor called...");
    }
}

class AbsChicken extends AbsAnimal {
    void changeColor() {
        color = "White";
    }

    void walk() {
        System.out.println("Walks on 2 legs");
    }
}



// ===== Interface =====

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


// === Multiple Interface ===
interface Herbivore {
    void eat();
}

interface Carnivore {
    void hunt();
}

class AbsBear implements Herbivore, Carnivore {
    
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
