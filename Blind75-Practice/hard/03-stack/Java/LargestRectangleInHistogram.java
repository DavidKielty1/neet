/*
 * 84. Largest Rectangle in Histogram
 * Difficulty: Hard
 * Pattern: Monotonic stack
 *
 * Problem:
 * Given an array of integers heights representing the histogram's bar height
 * where the width of each bar is 1, return the area of the largest rectangle in
 * the histogram.
 *
 * Example 1:
 * Input: heights = [2,1,5,6,2,3]
 * Output: 10
 * Explanation: The largest rectangle uses heights 5 and 6 with width 2.
 *
 * Example 2:
 * Input: heights = [2,4]
 * Output: 4
 *
 * Constraints:
 * - 1 <= heights.length <= 10^5
 * - 0 <= heights[i] <= 10^4
 */
public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
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

    // Deque<Integer> stack = new ArrayDeque<>();
    // int best = 0;
    //
    // for (int i = 0; i <= heights.length; i++) {
    //     int currentHeight = i == heights.length ? 0 : heights[i];
    //     while (!stack.isEmpty() && heights[stack.peek()] > currentHeight) {
    //         int height = heights[stack.pop()];
    //         int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
    //         int width = i - leftBoundary - 1;
    //         best = Math.max(best, height * width);
    //     }
    //     stack.push(i);
    // }
    //
    // return best;
        throw new UnsupportedOperationException("Implement largestRectangleArea");
    }
    

    public static void main(String[] args) {
        System.out.println("Practice stub ready. Implement largestRectangleArea and add checks.");
    }
}
