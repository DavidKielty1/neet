/*
 * LeetCode 229. Majority Element II
 *
 * Given an integer array of size n, find all elements that appear more than
 * floor(n / 3) times.
 *
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: [3]
 *
 * Example 2:
 * Input: nums = [1]
 * Output: [1]
 *
 * Example 3:
 * Input: nums = [1,2]
 * Output: [1,2]
 *
 * Constraints:
 * - 1 <= nums.length <= 50000
 * - -1000000000 <= nums[i] <= 1000000000
 *
 * Follow-up:
 * - Could you solve the problem in linear time and O(1) extra space?
 */
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        //
        //
        //
        //
        //  
        //  
        //  
        //  
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Boyer-Moore with two candidates, then verify counts.
        //
        // int candidate1 = 0;
        // int candidate2 = 1;
        // int count1 = 0;
        // int count2 = 0;
        // for (int num : nums) {
        //     if (num == candidate1) {
        //         count1++;
        //     } else if (num == candidate2) {
        //         count2++;
        //     } else if (count1 == 0) {
        //         candidate1 = num;
        //         count1 = 1;
        //     } else if (count2 == 0) {
        //         candidate2 = num;
        //         count2 = 1;
        //     } else {
        //         count1--;
        //         count2--;
        //     }
        // }
        // count1 = 0;
        // count2 = 0;
        // for (int num : nums) {
        //     if (num == candidate1) {
        //         count1++;
        //     } else if (num == candidate2) {
        //         count2++;
        //     }
        // }
        // List<Integer> result = new ArrayList<>();
        // if (count1 > nums.length / 3) {
        //     result.add(candidate1);
        // }
        // if (count2 > nums.length / 3) {
        //     result.add(candidate2);
        // }
        // return result;
    }

    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }
}
