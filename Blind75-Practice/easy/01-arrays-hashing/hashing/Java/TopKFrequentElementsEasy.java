/*
Easy variant: most frequent element (pairs with Python top-k-frequent-elements-easy.py)
Difficulty: Easy
Pattern: Hash Map

Problem:
Given an integer array nums, return the value that appears most often. You may assume
exactly one such mode for practice, or adapt if ties are possible.

Example 1:
Input: nums = [1,1,1,2,2,3]
Output: 1

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Time: O(n), Space: O(n)
*/

public class TopKFrequentElementsEasy {
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
    }

    public static void main(String[] args) {
        TopKFrequentElementsEasy sol = new TopKFrequentElementsEasy();
        assert sol.mostFrequent(new int[] {1, 1, 1, 2, 2, 3}) == 1;
        assert sol.mostFrequent(new int[] {2, 2, 1, 1, 1, 2, 2}) == 2;
        System.out.println("All test cases passed!");
    }
}
