package oop;

public class Super {
    public static void main(String[] args) {
        SuperMustang m = new SuperMustang();
        System.out.println(m.color);
    }
}

class SuperAnimal {
    String color;

    SuperAnimal() {
        System.out.println("Animal constructor called...");
    }
}

class SuperHorse extends SuperAnimal {
    SuperHorse() {
        System.out.println("Horse constructor called...");
    }
}

class SuperMustang extends SuperHorse {
    SuperMustang() {
        super();
        super.color = "Brown";
        System.out.println("Mustang constructor called...");
    }
}
