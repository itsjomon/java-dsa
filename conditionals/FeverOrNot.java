package conditionals;

// Write a program using an if-else statement to check a person's body temperature. If the temperature is above 100, print "You have a fever". Otherwise, print "You don't have a fever".
public class FeverOrNot {
    public static void main(String[] args) {
        double temp = 105.3;

        if (temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
    }
}
