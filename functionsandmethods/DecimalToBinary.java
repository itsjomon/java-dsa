package functionsandmethods;

public class DecimalToBinary {
    public static void decToBin(int decNum) {
        int originalDecNum = decNum;
        int pow = 0;
        int binNum = 0;
        
        while (decNum > 0) {
            int lastDigit = decNum % 2;
            binNum = binNum + (lastDigit * (int)Math.pow(10, pow));

            pow++;
            decNum = decNum / 2;
        }

        System.out.println("Binary of " + originalDecNum + " = " + binNum);
    }

    public static void main(String[] args) {
        decToBin(345);
    }
}
