public class ContainsDuplicateHashMapJava {
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

        //                //

        //

                //

        //

                //

        //

    // public boolean containsDuplicate(int[] nums) {
    //     if (nums == null || nums.length < 2) return false;    
        // Map<Integer, Integer> freq = new HashMap<>();
        // for (int num : nums) {
        //     int count = freq.getOrDefault(num, 0) + 1;
        //     freq.put(num, count);
        //     if (count >= 2) {
        //         return true;
        //     }
        // }
        // return false;
    // }   

    // Simpler: containsKey method
//     public boolean isDuplicate(int[] nums) {
//         Map<Integer, Integer> seen = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (seen.containsKey(nums[i])) {
//                 return true;
//             }
//             seen.put(nums[i], 1);
//         }
//         return false;
//     }

    public static void main(String[] args) {
        ContainsDuplicateHashMapJava s = new ContainsDuplicateHashMapJava();
        assert s.containsDuplicate(new int[] {1, 2, 3, 1});
        assert !s.containsDuplicate(new int[] {1, 2, 3, 4});
        assert s.containsDuplicate(new int[] {7, 7});
        System.out.println("HashMap version: all test cases passed!");
    }
}
