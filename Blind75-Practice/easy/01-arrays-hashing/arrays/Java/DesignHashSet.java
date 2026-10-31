/*
 * 705. Design HashSet
 * Difficulty: Easy
 * Pattern: Arrays & Hashing
 *
 * Problem:
 * Design a HashSet without using any built-in hash table libraries. Implement
 * the MyHashSet class with these operations:
 * - void add(int key): insert key into the set.
 * - void remove(int key): remove key from the set if present.
 * - boolean contains(int key): return true if key is in the set.
 * Keys are integers.
 *
 * Example 1:
 * Input: ["MyHashSet","add","add","contains","contains","add","contains","remove","contains"]
 * [[],[1],[2],[1],[3],[2],[2],[2],[2]]
 * Output: [null,null,null,true,false,null,true,null,false]
 *
 * Constraints:
 * - 0 <= key <= 10^6
 * - At most 10^4 calls will be made to add, remove, and contains
 */

public class DesignHashSet {
    static class MyHashSet {
        boolean[] set = new boolean[1_000_000_1];

        private void add(int key) {
            set[key] = true;
        }


        private void remove(int key) {
            set[key] = false;
        }


        private boolean contains(int key) {
            return set[key];
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
        }

        // get :  
        // present[key] = true;
        // remove :
        // present[key] = false;
        // contains :
        // return present[key];

    public static void main(String[] args) {
        MyHashSet hs = new MyHashSet();
        hs.add(1);
        hs.add(2);
        assert hs.contains(1);
        assert !hs.contains(3);
        hs.add(2);
        assert hs.contains(2);
        hs.remove(2);
        assert !hs.contains(2);
        System.out.println("All test cases passed!");
    }
}
