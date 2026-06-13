package oop;

public class Super {
    public static void main(String[] args) {
        Mustang m = new Mustang();
        System.out.println(m.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called...");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called...");
    }
}

class Mustang extends Horse {
    Mustang() {
        super();
        super.color = "Brown";
        System.out.println("Mustang constructor called...");
    }
}