/**
 * Easy Version: Maximum of All Subarrays of Size K
 * Difficulty: Medium
 * Pattern: Sliding Window + Deque
 *
 * Given an array and an integer k, find the maximum for each contiguous subarray of size k.
 *
 * Example 1:
 * Input: arr = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * Hint: Deque of indices, decreasing values; drop indices outside window or too small.
 *
 * Example 2:
 * Input: arr = [1], k = 1
 * Output: [1]
 * Hint: One window only; deque holds that single index as the current max.
 *
 * Time: O(n), Space: O(k)
 */
import java.util.Arrays;

public class SlidingWindowMaximumEasy {

    public static int[] maxOfAllSubarrays(int[] arr, int k) {
        //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

        //

    //

    

        // if (arr == null || arr.length == 0 || k <= 0) {
        //     return new int[0];
        // }
        // int n = arr.length;
        // int[] output = new int[Math.max(0, n - k + 1)];
        // Deque<Integer> deque = new ArrayDeque<>();
        // int outIdx = 0;
        // for (int i = 0; i < n; i++) {
        //     while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
        //         deque.pollFirst();
        //     }
        //     while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
        //         deque.pollLast();
        //     }
        //     deque.offerLast(i);
        //     if (i >= k - 1) {
        //         output[outIdx++] = arr[deque.peekFirst()];
        //     }
        // }
        // return output;

        throw new UnsupportedOperationException("Implement maxOfAllSubarrays");
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        int[] result1 = maxOfAllSubarrays(arr1, k1);
        printArray(result1);
    }
}
