/*
347. Top K Frequent Elements
Difficulty: Medium
Pattern: Hash Map + Heap / Bucket Sort

Problem:
Given an integer array nums and an integer k, return the k most frequent elements.
You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Time: O(n log k) with a heap, or O(n) with bucket sort; Space: O(n)
*/
import java.util.Arrays;

public class TopKFrequentElementsJava {
    public int[] topKFrequent(int[] nums, int k) {
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

    

        // Count frequencies with a HashMap, then:
        // - use a min-heap of size k on (freq, value), or
        // - bucket sort by frequency index 1..n

        throw new UnsupportedOperationException("Implement topKFrequent");
    }

    public static void main(String[] args) {
        TopKFrequentElementsJava sol = new TopKFrequentElementsJava();
        int[] a = sol.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2);
        Arrays.sort(a);
        assert Arrays.equals(a, new int[] {1, 2});
        assert Arrays.equals(sol.topKFrequent(new int[] {1}, 1), new int[] {1});
        System.out.println("All test cases passed!");
    }
}
