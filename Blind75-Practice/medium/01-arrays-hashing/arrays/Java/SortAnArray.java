/*
 * LeetCode 912. Sort an Array
 *
 * Given an array of integers nums, sort the array in ascending order and
 * return it.
 *
 * You must solve the problem without using any built-in functions in O(n log n)
 * time complexity and with the smallest space complexity possible.
 *
 * Example 1:
 * Input: nums = [5,2,3,1]
 * Output: [1,2,3,5]
 *
 * Example 2:
 * Input: nums = [5,1,1,2,0,0]
 * Output: [0,0,1,1,2,5]
 *
 * Example 3:
 * Input: nums = [3,-1,4,1,5]
 * Output: [-1,1,3,4,5]
 *
 * Constraints:
 * - 1 <= nums.length <= 50000
 * - -50000 <= nums[i] <= 50000
 */
public class SortAnArray {
    public int[] sortArray(int[] nums) {
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        //
        // Merge sort is a straightforward O(n log n) option.
        //
        // mergeSort(nums, 0, nums.length - 1, new int[nums.length]);
        // return nums;
    }

    // private void mergeSort(int[] nums, int left, int right, int[] temp) {
    //     if (left >= right) {
    //         return;
    //     }
    //     int mid = left + (right - left) / 2;
    //     mergeSort(nums, left, mid, temp);
    //     mergeSort(nums, mid + 1, right, temp);
    //     merge(nums, left, mid, right, temp);
    // }

    // private void merge(int[] nums, int left, int mid, int right, int[] temp) {
    //     int i = left;
    //     int j = mid + 1;
    //     int k = left;
    //     while (i <= mid && j <= right) {
    //         if (nums[i] <= nums[j]) {
    //             temp[k++] = nums[i++];
    //         } else {
    //             temp[k++] = nums[j++];
    //         }
    //     }
    //     while (i <= mid) {
    //         temp[k++] = nums[i++];
    //     }
    //     while (j <= right) {
    //         temp[k++] = nums[j++];
    //     }
    //     for (int index = left; index <= right; index++) {
    //         nums[index] = temp[index];
    //     }
    // }

    public static void main(String[] args) {
        System.out.println("Implement tests.");
    }
}
