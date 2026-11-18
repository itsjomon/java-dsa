package recursion.part2;

/*
TOWER OF HANOI (Important!)

You have 3 towers and n disks of different sizes which can slide on to any tower. The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).

You have the following constraints:

1. Only one disk can be moved at a time.
2. A disk is slid off the top of one tower onto another tower.
3. A disk cannot be placed on top of a smaller disk.

Write a program to move the disks from the first tower to the last using Stacks.

Let rod 1 = 'A', rod 2 = 'B', rod 3 = 'C'.

An example with 2 disks i.e., n = 2:

Step 1: Shift the first disk from 'A' to 'B'.
Step 2: Shift the second disk from 'A' to 'C'.
Step 3: Shift the first disk from 'B' to 'C'.

An example with 3 disks i.e., n = 3:

Step 1: Shift the first disk from 'A' to 'C'.
Step 2: Shift the second disk from 'A' to 'B'.
Step 3: Shift the first disk from 'C' to 'B'.
Step 4: Shift the third disk from 'A' to 'C'.
Step 5: Shift the first disk from 'B' to 'A'.
Step 6: Shift the second disk from 'B' to 'C'.
Step 7: Shift the first disk from 'A' to 'C'.

The Approach here is:

- Shift n - 1 disks from 'A' to 'B', using C.
- Shift the last disk from 'A' to 'C'.
- Shift n - 1 disks from 'B' to 'C', using A.
 */
public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char source, char helper, char destination) {
        if (n == 0) {
            return;
        }

        // Move n-1 disks from source to helper (using destination as helper)
        towerOfHanoi(n - 1, source, destination, helper);

        // Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " rod to " + destination + " rod");

        // Move n-1 disks from helper to destination (using source as helper)
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;

        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
