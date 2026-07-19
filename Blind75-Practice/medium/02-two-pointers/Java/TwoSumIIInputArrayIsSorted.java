/*
 * 167. Two Sum II - Input Array Is Sorted
 * Difficulty: Medium
 * Pattern: Two Pointers
 *
 * Problem:
 * Given a 1-indexed array of integers `numbers` that is already sorted in non-decreasing
 * order, find two numbers such that they add up to a specific `target` number.
 *
 * Return the indices of the two numbers, added by one, as an integer array
 * `[index1, index2]` of length 2, where `1 <= index1 < index2 <= numbers.length`.
 *
 * The tests are generated such that there is exactly one solution. You may not use the
 * same element twice.
 *
 * Example 1:
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 *
 * Example 2:
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 *
 * Example 3:
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 *
 * Constraints:
 * - 2 <= numbers.length <= 3 * 10^4
 * - -1000 <= numbers[i] <= 1000
 * - numbers is sorted in non-decreasing order
 * - -1000 <= target <= 1000
 * - Exactly one solution exists
 */

public class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) { 
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
    // int right = numbers.length - 1;
    //
    // while (left < right) {
    //     int sum = numbers[left] + numbers[right];
    //     if (sum == target) {
    //         return new int[] {left + 1, right + 1};
    //     }
    //     if (sum < target) {
    //         left++;
    //     } else {
    //         right--;
    //     }
    // }
    }
    

    public static void main(String[] args) {
        TwoSumIIInputArrayIsSorted sol = new TwoSumIIInputArrayIsSorted();
        int[] ans1 = sol.twoSum(new int[] {2, 7, 11, 15}, 9);
        assert ans1[0] == 1 && ans1[1] == 2;
        int[] ans2 = sol.twoSum(new int[] {2, 3, 4}, 6);
        assert ans2[0] == 1 && ans2[1] == 3;
        int[] ans3 = sol.twoSum(new int[] {-1, 0}, -1);
        assert ans3[0] == 1 && ans3[1] == 2;
        System.out.println("All test cases passed!");
    }
}
