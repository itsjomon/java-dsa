package arraylists;

import java.util.ArrayList;

// For given n lines on the x-axis, use 2 lines to form a container that holds maximum water.
// height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
public class ContainerWithMostWater {
    public static int mostWater(ArrayList<Integer> height) {
        // === brute force - O(n^2) ===
        // int maxWater = 0;
        // for (int i = 0; i < height.size(); i++) {
        //     for (int j = i + 1; j < height.size(); j++) {
        //         int ht = Math.min(height.get(i), height.get(j));
        //         int width = j - i;
        //         int currWater = ht * width;

        //         maxWater = Math.max(maxWater, currWater);
        //     }
        // }

        // return maxWater;


        // === two pointer - O(n) ===
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(mostWater(height));
    }
}
