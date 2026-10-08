/*
 * 496. Next Greater Element I
 * Difficulty: Easy
 * Pattern: Hash Map / Monotonic Stack
 *
 * Problem:
 * The next greater element of some element x in an array is the first greater
 * element that is to the right of x in the same array. You are given two
 * distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset
 * of nums2. For each value in nums1, find that value in nums2 and return the
 * next greater element to its right in nums2. If none exists, use -1. Return
 * an array ans of length nums1.length.
 *
 * Example 1:
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
 * Output: [-1,3,-1]
 *
 * Example 2:
 * Input: nums1 = [2,4], nums2 = [1,2,3,4]
 * Output: [3,-1]
 *
 * Constraints:
 * - 1 <= nums1.length <= nums2.length <= 1000
 * - 0 <= nums1[i], nums2[i] <= 10^4
 * - All integers in nums1 and nums2 are unique
 * - All the integers of nums1 also appear in nums2
 */
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> next = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int x : nums2) {
            while (!stack.isEmpty() && stack.peek() < x) {
                next.put(stack.pop(), x);
            }
            stack.push(x);
        }
        
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = next.getOrDefault(nums1[i], -1);
        }
        return ans;
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
