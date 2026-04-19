/*
Practice: min and max in array (pairs with best-time-to-buy-and-sell-stock-easy.py)
Difficulty: Easy
Pattern: One Pass

Return [min, max] for the array values.

Time: O(n), Space: O(1)
*/
import java.util.Arrays;

public class BestTimeToBuyAndSellStockEasyJava {
    public int[] findMinMax(int[] nums) {
        int maxProfit = 0;
        int lowest = nums[0];
        int maxIdx = 0;
        int lowIdx = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] < lowest) {
                lowest = nums[i];
                lowIdx = i;
            }
            int currProfit = nums[i] - lowest;
            if (currProfit > maxProfit){
                maxProfit = currProfit;
                maxIdx = i;
            }
        }

        return new int[] {lowIdx, maxIdx};
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

        // One pass: track running min and max.

        // if (nums == null || nums.length == 0) {
        //     return new int[0];
        // }
        // int min = nums[0];
        // int max = nums[0];
        // for (int num : nums) {
        //     min = Math.min(min, num);
        //     max = Math.max(max, num);
        // }
        // return new int[] {min, max};
        throw new UnsupportedOperationException("Implement findMinMax");
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockEasyJava s = new BestTimeToBuyAndSellStockEasyJava();
        assert Arrays.equals(s.findMinMax(new int[] {3, 2, 1, 4, 5}), new int[] {1, 5});
        System.out.println("All test cases passed!");
    }

}
