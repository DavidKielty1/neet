/*
 * 309. Best Time to Buy and Sell Stock with Cooldown
 * Difficulty: Medium
 * Pattern: Dynamic Programming (state machine)
 *
 * Problem:
 * You are given an array prices where prices[i] is the price of a given stock on the
 * ith day.
 *
 * Find the maximum profit you can achieve. You may complete as many transactions as
 * you like (buy one and sell one share multiple times) with these restrictions:
 * - After you sell your stock, you cannot buy stock on the next day (cooldown).
 * - You may not hold more than one share at a time.
 *
 * Example 1:
 * Input: prices = [1,2,3,0,2]
 * Output: 3
 * Explanation: buy day 0, sell day 1, cooldown day 2, buy day 3, sell day 4.
 *
 * Example 2:
 * Input: prices = [1]
 * Output: 0
 *
 * Constraints:
 * - 1 <= prices.length <= 5000
 * - 0 <= prices[i] <= 1000
 *
 * Notes:
 * - Track states: holding stock, sold (cooldown), or free to buy.
 * - Can roll three state variables through the days.
 */

public class BestTimeToBuyAndSellStockWithCooldown {
    public int maxProfit(int[] prices) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // int sold = 0;
    // int hold = Integer.MIN_VALUE;
    // int rest = 0;
    // for (int price : prices) {
    //     int prevSold = sold;
    //     sold = hold + price;
    //     hold = Math.max(hold, rest - price);
    //     rest = Math.max(rest, prevSold);
    // }
    // return Math.max(sold, rest);
    }
    

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockWithCooldown sol = new BestTimeToBuyAndSellStockWithCooldown();
        assert sol.maxProfit(new int[] {1, 2, 3, 0, 2}) == 3;
        assert sol.maxProfit(new int[] {1}) == 0;
        System.out.println("All test cases passed!");
    }
}
