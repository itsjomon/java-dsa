package bitmanipulation;

// Convert uppercase characters to lowercase using bits.
public class UpToLow {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' ') + " ");
        }
    }
}
