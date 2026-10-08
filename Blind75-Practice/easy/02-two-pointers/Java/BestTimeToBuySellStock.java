/*
 * 121. Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Pattern: Sliding Window / Greedy
 *
 * Problem:
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day. You want to maximize your profit by choosing a single day to
 * buy one stock and a different day in the future to sell that stock. Return
 * the maximum profit you can achieve from this transaction. If you cannot
 * achieve any profit, return 0.
 *
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 *
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 *
 * Constraints:
 * - 1 <= prices.length <= 10^5
 * - 0 <= prices[i] <= 10^4
 */
public class BestTimeToBuySellStock {
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

    // if (prices == null || prices.length == 0) {
        // return 0;
    // }
    // int lowest = Integer.MAX_VALUE;
    // int maxProfit = 0;
    // for (int price : prices) {
    //     lowest = Math.min(lowest, price);
    //     maxProfit = Math.max(maxProfit, price - lowest);
    // }
    // return maxProfit

        throw new UnsupportedOperationException("Implement maxProfit");
    }
    

    static class SolutionSlidingWindow {
        /*
         * Think of it as a sliding window where:
         * - left = buy day
         * - right = sell day
         */
    // public int maxProfit(int[] prices) {
    //     int left = 0;
    //     int right = 1;
    //     int maxProfit = 0;
    //     while (right < prices.length) {
    //         if (prices[left] < prices[right]) {
    //             int profit = prices[right] - prices[left];
    //             maxProfit = Math.max(maxProfit, profit);
    //         } else {
    //             left = right;
    //         }
    //         right++;
    //     }
    //     return maxProfit;
    // }
    }

    public static void main(String[] args) {
        BestTimeToBuySellStock solution = new BestTimeToBuySellStock();

        assert solution.maxProfit(new int[] {7, 1, 5, 3, 6, 4}) == 5;
        System.out.println("✓ Test case 1 passed");

        assert solution.maxProfit(new int[] {7, 6, 4, 3, 1}) == 0;
        System.out.println("✓ Test case 2 passed");

        assert solution.maxProfit(new int[] {2, 4, 1}) == 2;
        System.out.println("✓ Test case 3 passed");

        assert solution.maxProfit(new int[] {1}) == 0;
        System.out.println("✓ Test case 4 passed");

        System.out.println("\nAll test cases passed!");
    }
}
