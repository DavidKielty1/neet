/*
 * 11. Container With Most Water
 * Difficulty: Medium
 * Pattern: Two Pointers
 *
 * Problem:
 * You are given an integer array `height` of length `n`. There are `n` vertical lines
 * drawn such that the two endpoints of the `i`th line are `(i, 0)` and `(i, height[i])`.
 *
 * Find two lines that together with the x-axis form a container that holds the most
 * water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 *
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 *
 * Constraints:
 * - n == height.length
 * - 2 <= n <= 10^5
 * - 0 <= height[i] <= 10^4
 *
 * Notes:
 * - The area is controlled by the shorter wall times the width.
 * - Start wide, then move the shorter side inward because moving the taller one cannot
 *   increase the limiting height.
 */

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //

    // int left = 0;
    // int right = height.length - 1;
    // int best = 0;
    //
    // while (left < right) {
    //     int width = right - left;
    //     int area = Math.min(height[left], height[right]) * width;
    //     best = Math.max(best, area);
    //
    //     if (height[left] < height[right]) {
    //         left++;
    //     } else {
    //         right--;
    //     }
    // }
    //
    // return best;
        
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        assert sol.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}) == 49;
        assert sol.maxArea(new int[] {1, 1}) == 1;
        System.out.println("All test cases passed!");
    }
}
