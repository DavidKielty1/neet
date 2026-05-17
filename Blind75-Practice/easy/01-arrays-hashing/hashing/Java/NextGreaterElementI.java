/*
496. Next Greater Element I
Difficulty: Easy
Pattern: Hash Map / Monotonic Stack

Problem:
nums1 is a subset of nums2 (distinct integers). For each value in nums1, find the next
greater element to its right in nums2; if none exists, use -1.

Example 1:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]

Example 2:
Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]

Time: O(n + m), Space: O(n) — n = nums2.length, m = nums1.length
*/
import java.util.Arrays;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
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

        // Map<Integer, Integer> next = new HashMap<>();
        // Deque<Integer> stack = new ArrayDeque<>();
        // for (int x : nums2) {
            // while (!stack.isEmpty() && stack.peek() < x) {
                // next.put(stack.pop(), x);
            // }
            // stack.push(x);
        // }
        // int[] ans = new int[nums1.length];
        // for (int i = 0; i < nums1.length; i++) {
            // ans[i] = next.getOrDefault(nums1[i], -1);
        // }
        // return ans;

    }

    public static void main(String[] args) {
        NextGreaterElementI sol = new NextGreaterElementI();
        assert Arrays.equals(
                sol.nextGreaterElement(new int[] {4, 1, 2}, new int[] {1, 3, 4, 2}),
                new int[] {-1, 3, -1});
        assert Arrays.equals(
                sol.nextGreaterElement(new int[] {2, 4}, new int[] {1, 2, 3, 4}),
                new int[] {3, -1});
        System.out.println("All test cases passed!");
    }
}
