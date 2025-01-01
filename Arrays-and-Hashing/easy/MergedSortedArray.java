class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0)return;
        int len1 = nums1.length;
        int end_idx = len1-1;
        while(n > 0 && m > 0){
            if(nums2[n-1] >= nums1[m-1]){
                nums1[end_idx] = nums2[n-1];
                n--;
            }else{
                nums1[end_idx] = nums1[m-1];
                m--;
            }
            end_idx--;
        }
        while (n > 0) {
            nums1[end_idx] = nums2[n-1];
            n--;
            end_idx--;
        }
    }
}

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i = m - 1; // Pointer for the last element in the "real" part of nums1
//         int j = n - 1; // Pointer for the last element in nums2
//         int k = m + n - 1; // Pointer for the end of nums1 array

//         while (j >= 0) {
//             if (i >= 0 && nums1[i] > nums2[j]) {
//                 nums1[k] = nums1[i]; // Place the larger element from nums1
//                 i--;
//             } else {
//                 nums1[k] = nums2[j]; // Place the larger element from nums2
//                 j--;
//             }
//             k--; // Move the pointer in nums1
//         }
//     }
// }