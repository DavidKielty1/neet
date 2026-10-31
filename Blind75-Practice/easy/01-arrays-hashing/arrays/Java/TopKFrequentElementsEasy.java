/*
 * Easy Variant: Most Frequent Element
 * Difficulty: Easy
 * Pattern: Hash Map
 *
 * Problem:
 * Given an integer array nums, return the value that appears most often. You
 * may assume there is exactly one mode (no ties) for this practice variant.
 *
 * Example 1:
 * Input: nums = [1,1,1,2,2,3]
 * Output: 1
 *
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 * - Exactly one most frequent value exists
 */

public class TopKFrequentElementsEasy {
    public int TopKFrequentElements (int[] nums) {
        
    }


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

        // Map<Integer, Integer> count = new HashMap<>();
        // for (int x : nums) {
            // count.merge(x, 1, Integer::sum);
        // }
        // int best = nums[0], bestFreq = 0;
        // for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            // if (e.getValue() > bestFreq) {
                // bestFreq = e.getValue();
                // best = e.getKey();
            // }
        // }
        // return best;
    

    public static void main(String[] args) {
        TopKFrequentElementsEasy sol = new TopKFrequentElementsEasy();
        assert sol.mostFrequent(new int[] {1, 1, 1, 2, 2, 3}) == 1;
        assert sol.mostFrequent(new int[] {2, 2, 1, 1, 1, 2, 2}) == 2;
        System.out.println("All test cases passed!");
    }
}
