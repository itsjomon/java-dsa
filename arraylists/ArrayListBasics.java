package arraylists;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        // ArrayList is a part of Java Collection Framework
        // className objName = new className();
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();


        // ===== Operations =====

        // === add ===
        list.add(1); // TC: O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(2, 15); // TC: O(n)

        System.out.println(list);


        // === get ===
        int element = list.get(2); // TC: O(1)
        System.out.println(element);


        // === remove ===
        list.remove(2); // TC: O(n)
        System.out.println(list);


        // === set ===
        list.set(3, 10); // TC: O(1)
        System.out.println(list);


        // === contains ===
        System.out.println(list.contains(1)); // TC: O(n)
        System.out.println(list.contains(11));



        // ===== Size of ArrayList =====
        System.out.println(list.size()); // TC: O(1)


        // Print arraylist
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        for (int num : list) { // for-each loop
            System.out.print(num + " ");
        }
        System.out.println();
        // TC: O(n)

    }
}
