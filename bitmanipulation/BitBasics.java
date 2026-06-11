package bitmanipulation;

public class BitBasics {
    // ----- Bit Operations -----
    
    // --- Get ith bit ---
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // --- Set ith bit ---
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // --- Clear ith bit ---
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // --- Update ith bit ---
    public static int updateIthBit(int n, int i, int newBit) {
        // if ( newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    // --- Clear last i bits ---
    public static int clearLastIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    // --- Clear range of bits (i to j) ---
    public static int clearRangeOfBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }


    public static void main(String[] args) {
        // ----- Bitwise Operators -----
        System.out.println( 5 & 6); // 4
        System.out.println( 5 | 6); // 7
        System.out.println( 5 ^ 6); // 3
        System.out.println( ~5); // -6
        System.out.println( 5 << 2); // 20
        System.out.println( 5 >> 2); // 1


        // ----- Bit Operations -----

        // --- Get ith bit ---
        System.out.println(getIthBit(10, 2)); // 0

        // --- Set ith bit ---
        System.out.println(setIthBit(10, 2)); // 14

        // --- Clear ith bit ---
        System.out.println(clearIthBit(10, 1)); // 8

        // --- Update ith bit ---
        System.out.println(updateIthBit(10, 2, 1)); // 14

        // --- Clear last i bits ---
        System.out.println(clearLastIBits(15, 2)); // 12

        // --- Clear range of bits (i to j) ---
        System.out.println(clearRangeOfBits(10, 2, 4)); // 2

    }
}