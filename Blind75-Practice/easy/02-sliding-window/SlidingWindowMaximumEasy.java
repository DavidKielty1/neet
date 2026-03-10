
/**
 * Easy Version: Maximum of All Subarrays of Size K
 * Difficulty: Medium
 * Pattern: Sliding Window + Deque
 *
 * Given an array and an integer k, find the maximum
 * for each and every contiguous subarray of size k.
 *
 * Example:
 * Input:  arr = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
 * Output: [3, 3, 5, 5, 6, 7]
 *
 * Time: O(n), Space: O(k)
 */
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximumEasy {

    /**
     * two cleanups - remove those out of window
     * remove those which are smaller than the next one coming in
     * 
     */

    /**
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */

    public static int[] maxOfAllSubarrays(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = arr.length;
        int[] output = new int[Math.max(0, n - k + 1)];
        Deque<Integer> deque = new ArrayDeque<>(); // stores indices

        int outIdx = 0;
        for (int i = 0; i < n; i++) {
            // Remove indices that are outside the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove indices whose corresponding values are smaller than current
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            // Start recording results once we've hit window size k
            if (i >= k - 1) {
                output[outIdx++] = arr[deque.peekFirst()];
            }
        }

        return output;
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k1 = 3;
        int[] result1 = maxOfAllSubarrays(arr1, k1);
        printArray(result1); // [3, 3, 5, 5, 6, 7]
    }
}
