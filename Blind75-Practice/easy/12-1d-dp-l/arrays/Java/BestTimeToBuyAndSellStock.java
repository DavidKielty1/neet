/*
121. Best Time to Buy and Sell Stock
Difficulty: Easy
Pattern: Dynamic Programming / One Pass

Max profit from one buy and one sell on a later day; return 0 if no profit.

Time: O(n), Space: O(1)
*/
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            lowestPrice = Math.min(lowestPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - lowestPrice);
        }
        return maxProfit;
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

        // Track minimum price seen so far; update max profit.
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock s = new BestTimeToBuyAndSellStock();
        assert s.maxProfit(new int[] {7, 1, 5, 3, 6, 4}) == 5;
        assert s.maxProfit(new int[] {7, 6, 4, 3, 1}) == 0;
        System.out.println("All test cases passed!");
    }

}
