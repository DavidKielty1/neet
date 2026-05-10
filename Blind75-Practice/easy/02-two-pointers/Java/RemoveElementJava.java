import java.util.Arrays;

/*
LeetCode 27: Remove Element
Difficulty: Easy
Pattern: Two Pointers

Problem:
Given an integer array `nums` and an integer `val`, remove all occurrences of
`val` in-place.

Return `k`, the number of elements in `nums` that are not equal to `val`. The
first `k` elements should contain the kept values. The order of those kept
elements does not matter, and anything after index `k - 1` is ignored.

Example 1:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: The remaining valid prefix contains the two values not equal to 3.

Example 2:
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Any order is acceptable as long as the first 5 values are not 2.

Time Complexity: O(n)
Space Complexity: O(1)
*/
public class RemoveElementJava {

    /*
     * Two pointers: write index tracks where to place next 'keep' element.
     *
     * nums: [3, 2, 2, 3], target = 3
     */

    // [3 2 2 3]
    // [2 2 2 3]

    public static int removeElement(int[] nums, int val) {
        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

        //

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
        // for (int right = 0; right < nums.length; right++) {
            // if (nums[right] != val) {
                // nums[left] = nums[right];
                // left++;
            // }
        // }
        // return left;

        throw new UnsupportedOperationException("Implement removeElement");
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int result1 = removeElement(nums1, val1);
        System.out.println("Remove Element: " + result1 + ", nums = " + Arrays.toString(nums1));

        int[] nums2 = {0, 1, 3, 0, 4, 0, 4, 2};
        int val2 = 2;
        int result2 = removeElement(nums2, val2);
        System.out.println("Remove Element: " + result2 + ", nums = " + Arrays.toString(nums2));

        int[] nums3 = {1};
        int val3 = 1;
        int result3 = removeElement(nums3, val3);
        System.out.println("Remove Element: " + result3 + ", nums = " + Arrays.toString(nums3));
    }
}
