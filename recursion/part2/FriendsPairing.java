package recursion.part2;

// Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.
public class FriendsPairing {
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // // Choice 1: Current friend stays single
        // int singleWays = friendsPairing(n - 1);

        // // Choice 2: Current friend pairs with any of remaining (n-1) friends
        // int pairWays = (n - 1) * friendsPairing(n - 2);

        // // Total Ways
        // int totalWays = singleWays + pairWays;
        // return totalWays;

        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println(friendsPairing(n));
    }
}
