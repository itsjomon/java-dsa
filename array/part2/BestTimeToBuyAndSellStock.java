package array.part2;

public class BestTimeToBuyAndSellStock {
    public static int stock(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buyPrice) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println(stock(prices));
    }
}

// Best time to buy and sell stock (LeetCode 121)
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/