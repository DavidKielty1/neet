/*
 * 239. Sliding Window Maximum
 * Difficulty: Hard
 * Pattern: Sliding Window / Monotonic Deque
 *
 * Problem:
 * You are given an array of integers `nums`, and there is a sliding window of size `k`
 * moving from the very left of the array to the very right. You can only see the `k`
 * numbers inside the window at a time.
 *
 * Return the maximum value in each sliding window.
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
 *
 */

import java.util.Arrays;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {

    // return new int[stack.size] { turn stack into int array}
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

    // int n = nums.length;
    // int[] answer = new int[n - k + 1];
    // Deque<Integer> deque = new ArrayDeque<>();
    // for (int i = 0; i < n; i++) {
    //     while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
    //         deque.pollFirst();
    //     }
        
    //     while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
    //         deque.pollLast();
    //     }

    //     deque.offerLast(i);

    //     if (i >= k - 1) {
    //         answer[i - k + 1] = nums[deque.peekFirst()];
    //     }
    // }
    // return answer;
    }
    

    public static void main(String[] args) {
        SlidingWindowMaximum sol = new SlidingWindowMaximum();
        assert Arrays.equals(sol.maxSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3), new int[] {3, 3, 5, 5, 6, 7});
        assert Arrays.equals(sol.maxSlidingWindow(new int[] {1}, 1), new int[] {1});
        System.out.println("All test cases passed!");
    }
}
