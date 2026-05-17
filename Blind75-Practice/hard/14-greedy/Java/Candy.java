/*
 * 135. Candy
 * Difficulty: Hard
 * Pattern: Greedy
 *
 * Problem:
 * There are n children standing in a line. Each child is assigned a rating value
 * given in the integer array ratings.
 *
 * You are giving candies to these children subject to the following requirements:
 * - Each child must have at least one candy.
 * - Children with a higher rating than their neighbors get more candies than
 *   their neighbors.
 *
 * Return the minimum number of candies you need to distribute.
 *
 * Example 1:
 * Input: ratings = [1,0,2]
 * Output: 5
 * Explanation: Give candies [2,1,2].
 *
 * Example 2:
 * Input: ratings = [1,2,2]
 * Output: 4
 * Explanation: Give candies [1,2,1].
 *
 * Constraints:
 * - n == ratings.length
 * - 1 <= n <= 2 * 10^4
 * - 0 <= ratings[i] <= 2 * 10^4
 */
public class Candy {
    static class Solution {
        public int candy(int[] ratings) {
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

            // int n = ratings.length;
            // int[] candies = new int[n];
            // Arrays.fill(candies, 1);
            //
            // for (int i = 1; i < n; i++) {
            //     if (ratings[i] > ratings[i - 1]) {
            //         candies[i] = candies[i - 1] + 1;
            //     }
            // }
            //
            // int total = candies[n - 1];
            // for (int i = n - 2; i >= 0; i--) {
            //     if (ratings[i] > ratings[i + 1]) {
            //         candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            //     }
            //     total += candies[i];
            // }
            //
            // return total;
            throw new UnsupportedOperationException("Implement candy");
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement candy and add checks.");
    }
}
