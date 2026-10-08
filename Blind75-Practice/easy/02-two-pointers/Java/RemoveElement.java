import java.util.Arrays;

/*
 * 27. Remove Element
 * Difficulty: Easy
 * Pattern: Two Pointers
 *
 * Problem:
 * Given an integer array nums and an integer val, remove all occurrences of
 * val in-place. The order of the remaining elements may change. Return k, the
 * number of elements not equal to val. The first k elements of nums should
 * contain those kept values. Anything after index k - 1 is ignored.
 *
 * Example 1:
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 *
 * Example 2:
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 *
 * Constraints:
 * - 0 <= nums.length <= 100
 * - 0 <= nums[i] <= 50
 * - 0 <= val <= 100
 */ 
public class RemoveElement {
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
