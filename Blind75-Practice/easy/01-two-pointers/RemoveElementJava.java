import java.util.Arrays;

/*
27. Remove Element
Difficulty: Easy
Pattern: Two Pointers

Given an integer array nums and an integer val, remove all occurrences of
val in-place. The order of the elements may be changed.

Contract (LeetCode 27):
- Modify nums in-place so that the first k elements of nums contain the
  elements that are not equal to val (order of these elements may change).
- Return k (the number of elements not equal to val). The values beyond
  index k-1 are ignored by the caller and may be any value.

Example:
Input: nums = [1,2,3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]

Time: O(n), Space: O(1)
*/
public class RemoveElementJava {

    /*
     * Two pointers: write index tracks where to place next 'keep' element.
     *
     * nums: [3, 2, 2, 3], target = 3
     */

    // [1,2,3,2,2,3,2,2] target = 2


    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //


    // public static int removeElement(int[] nums, int val) {
    //     int left = 0;

    //     for (int right = 0; right < nums.length; right++) {
    //         if (nums[right] != val) {
    //             nums[left] = nums[right];
    //             left++;
    //         }
    //     }

    //     return left;
    // }

    // Test cases
    public static void main(String[] args) {
        // Test 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int result1 = removeElement(nums1, val1);
        System.out.println("Remove Element: " + result1 + ", nums = " + Arrays.toString(nums1));
        // 2, [2, 2, _, _]

        // Test 2
        int[] nums2 = {0, 1, 3, 0, 4, 0, 4, 2};
        int val2 = 2;
        int result2 = removeElement(nums2, val2);
        System.out.println("Remove Element: " + result2 + ", nums = " + Arrays.toString(nums2));
        // 7, all except 2 kept in front (order may vary)

        // Test 3
        int[] nums3 = {1};
        int val3 = 1;
        int result3 = removeElement(nums3, val3);
        System.out.println("Remove Element: " + result3 + ", nums = " + Arrays.toString(nums3));
        // 0, all removed
    }
}

