/*
 * 239. Sliding Window Maximum
 * Difficulty: Hard
 * Pattern: Sliding window and monotonic deque
 *
 * Problem:
 * You are given an array of integers nums and an integer k. There is a sliding
 * window of size k moving from the very left of the array to the very right.
 * You can only see the k numbers in the window. Each time the sliding window
 * moves right by one position, return the maximum in the current window.
 *
 * Example 1:
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 *
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * - 1 <= k <= nums.length
 */
public class SlidingWindowMaximum {
    static class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
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

            // int[] result = new int[nums.length - k + 1];
            // Deque<Integer> deque = new ArrayDeque<>();
            //
            // for (int right = 0; right < nums.length; right++) {
            //     while (!deque.isEmpty() && deque.peekFirst() <= right - k) {
            //         deque.pollFirst();
            //     }
            //
            //     while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[right]) {
            //         deque.pollLast();
            //     }
            //
            //     deque.offerLast(right);
            //
            //     if (right >= k - 1) {
            //         result[right - k + 1] = nums[deque.peekFirst()];
            //     }
            // }
            //
            // return result;
            throw new UnsupportedOperationException("Implement maxSlidingWindow");
        }
    }

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement maxSlidingWindow and add checks.");
    }
}
