package arrays.part1;

public class ArrayAsMethodArg {
    public static void update(int[] marks, int value) {
        value = 10;

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int[] marks = {97, 98, 99};
        int value = 5;

        update(marks, value);
        System.out.println(value);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + ", ");
        }

        System.out.println();
    }
}
