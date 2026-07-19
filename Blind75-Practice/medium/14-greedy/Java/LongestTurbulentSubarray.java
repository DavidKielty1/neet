/*
 * 978. Longest Turbulent Subarray
 * Difficulty: Medium
 * Pattern: Greedy / Sliding Window
 *
 * Problem:
 * Given an integer array arr, return the length of a maximum size turbulent
 * subarray of arr.
 *
 * A subarray is turbulent if the comparison sign flips between each adjacent
 * pair. For example, arr[i] < arr[i + 1] > arr[i + 2] < arr[i + 3], or the
 * reverse pattern.
 *
 * Example 1:
 * Input: arr = [9,4,2,10,7,8,8,1,9]
 * Output: 5
 * Explanation: [4,2,10,7,8] is turbulent.
 *
 * Example 2:
 * Input: arr = [4,8,12,16]
 * Output: 2
 *
 * Example 3:
 * Input: arr = [100]
 * Output: 1
 *
 * Constraints:
 * - 1 <= arr.length <= 4 * 10^4
 * - 0 <= arr[i] <= 10^9
 */
public class LongestTurbulentSubarray {
    public int maxTurbulenceSize(int[] arr) {
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

    // int up = 1;
    // int down = 1;
    // int best = 1;
    // for (int i = 1; i < arr.length; i++) {
    //     if (arr[i - 1] < arr[i]) {
    //         up = down + 1;
    //         down = 1;
    //     } else if (arr[i - 1] > arr[i]) {
    //         down = up + 1;
    //         up = 1;
    //     } else {
    //         up = 1;
    //         down = 1;
    //     }
    //     best = Math.max(best, Math.max(up, down));
    // }
    // return best;
    }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement maxTurbulenceSize and add checks.");
    }
}
