package oop;

public class Encapsulation {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Created a pen object alled p1
        
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Green");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;  // Private field (data hiding)
    private int tip;

    // Getter - reads/returns the value
    String getColor() {
        return this.color;
    }

    // Getter - reads/returns the value
    int getTip() {
        return this.tip;
    }

    // Setter - sets/modifies the value
    void setColor(String color) {
        this.color = color;  // 'this' refers to class field (avoid name conflict)
    }

    // Setter - sets/modifies the value
    void setTip (int tip) {
        this.tip = tip;
    }
}

// ENCAPSULATION = Private fields + Getter/Setter methods
// Benefits: Hide data, control access, add validation later

// GETTER = Method that reads/returns a private field
// SETTER = Method that sets/modifies a private field

// 'this' keyword is used when parameter name and field name are SAME
// this.field = parameter;
// Without 'this', Java can't distinguish between field and parameter