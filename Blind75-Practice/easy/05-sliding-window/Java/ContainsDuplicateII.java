/*
 * 219. Contains Duplicate II
 * Difficulty: Easy
 * Pattern: Sliding Window
 *
 * Problem:
 * Given an integer array nums and an integer k, return true if there are two
 * distinct indices i and j such that nums[i] == nums[j] and |i - j| <= k.
 * Otherwise return false.
 *
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 * - 0 <= k <= 10^5
 */

public class ContainsDuplicateII {
    // [1 4 2 3 4 4 1 2 3 4] k = 3
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
    }
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        // Set<Integer> seen = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (!seen.add(nums[i])) return true;
        //     if (seen.size() > k) seen.remove(nums[i - k]);
        // }
        // return false;


    public static void main(String[] args) {
        ContainsDuplicateII s = new ContainsDuplicateII();
        assert s.containsNearbyDuplicate(new int[] {1, 2, 3, 1}, 3);
        assert s.containsNearbyDuplicate(new int[] {1, 0, 1, 1}, 1);
        assert !s.containsNearbyDuplicate(new int[] {1, 2, 3, 1, 2, 3}, 2);
        System.out.println("All test cases passed!");
    }
}
