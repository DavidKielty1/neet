/*
 * 15. 3Sum
 * Difficulty: Medium
 * Pattern: Two Pointers / Sorting
 *
 * Problem:
 * Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]`
 * such that `i != j`, `i != k`, `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 * Example 1:
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 *
 * Example 2:
 * Input: nums = [0,1,1]
 * Output: []
 *
 * Example 3:
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 *
 * Constraints:
 * - 3 <= nums.length <= 3000
 * - -10^5 <= nums[i] <= 10^5
 *
 * Notes:
 * - Sort the array so duplicates are adjacent and two pointers can move predictably.
 * - Skip duplicates for the fixed value and after finding a valid triplet.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 0; i < nums.length - 2; i++) {
                while (nums[i] == nums[i - 1]) {
                    continue;
                }
                if (nums[i] > 0) {
                    break;
                }

                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }

                    if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }

            return result;
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //

            // Arrays.sort(nums);
            // List<List<Integer>> result = new ArrayList<>();
            //
            // for (int i = 0; i < nums.length - 2; i++) {
            //     if (i > 0 && nums[i] == nums[i - 1]) {
            //         continue;
            //     }
            //     if (nums[i] > 0) {
            //         break;
            //     }
            //
            //     int left = i + 1;
            //     int right = nums.length - 1;
            //     while (left < right) {
            //         int sum = nums[i] + nums[left] + nums[right];
            //         if (sum == 0) {
            //             result.add(Arrays.asList(nums[i], nums[left], nums[right]));
            //             left++;
            //             right--;
            //             while (left < right && nums[left] == nums[left - 1]) {
            //                 left++;
            //             }
            //             while (left < right && nums[right] == nums[right + 1]) {
            //                 right--;
            //             }
            //         } else if (sum < 0) {
            //             left++;
            //         } else {
            //             right--;
            //         }
            //     }
            // }
            // return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = sol.threeSum(nums1);
        assert result1.size() == 2;

        int[] nums2 = {0, 1, 1};
        assert sol.threeSum(nums2).isEmpty();

        int[] nums3 = {0, 0, 0};
        assert sol.threeSum(nums3).size() == 1;
        System.out.println("All test cases passed!");
    }
}
