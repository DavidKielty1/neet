import java.util.Arrays;

/*
LeetCode 977: Squares of a Sorted Array
Difficulty: Easy
Pattern: Two Pointers

Problem:
Given an integer array nums sorted in non-decreasing order, return an array of the squares
of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Time Complexity: O(n)
Space Complexity: O(n)
*/
public class SquaresOfSortedArray {

    /*
     * Approach: Two pointers from both ends
     *
     * Strategy:
     * 1. Since array is sorted, largest squares are at ends
     * 2. Use two pointers, compare values
     * 3. Place larger square at end of result array
     * 4. Move corresponding pointer inward
     *
     * [-4, -1, 0, 3, 10] -> [0, 1, 9, 16, 100]
     */
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[pos] = leftSq;
                left++;
            } else {
                result[pos] = rightSq;
                right--;
            }

            pos--;
        }

        return result;
    }

    // Test cases
    public static void main(String[] args) {
        // Test case 1
        int[] res1 = sortedSquares(new int[]{-4, -1, 0, 3, 10});
        assert Arrays.equals(res1, new int[]{0, 1, 9, 16, 100});
        System.out.println("✓ Test case 1 passed");

        // Test case 2
        int[] res2 = sortedSquares(new int[]{-7, -3, 2, 3, 11});
        assert Arrays.equals(res2, new int[]{4, 9, 9, 49, 121});
        System.out.println("✓ Test case 2 passed");

        System.out.println("\nAll test cases passed!");
    }
}

