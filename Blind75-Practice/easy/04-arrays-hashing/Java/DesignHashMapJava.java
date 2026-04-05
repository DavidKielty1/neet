/*
706. Design HashMap
Difficulty: Easy
Pattern: Arrays & Hashing

put(key, value), get(key), remove(key). Missing key => get returns -1.
Keys and values in [0, 1_000_000].

Approach: parallel boolean[] for occupancy and int[] for values.

Time: O(1) per op, Space: O(10^6)
*/

public class DesignHashMapJava {

    static class MyHashMap {
        private final boolean[] has = new boolean[1_000_001];
        private final int[] vals = new int[1_000_001];

        public void put(int key, int value) {
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

            // has[key] = true;
            // vals[key] = value;

            throw new UnsupportedOperationException("Implement put");
        }

        public int get(int key) {
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

            // return has[key] ? vals[key] : -1;

            throw new UnsupportedOperationException("Implement get");
        }

        public void remove(int key) {
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

            // has[key] = false;

            throw new UnsupportedOperationException("Implement remove");
        }
    }

    public static void main(String[] args) {
        MyHashMap hm = new MyHashMap();
        hm.put(1, 1);
        hm.put(2, 2);
        assert hm.get(1) == 1;
        assert hm.get(3) == -1;
        hm.put(2, 1);
        assert hm.get(2) == 1;
        hm.remove(2);
        assert hm.get(2) == -1;
        System.out.println("All test cases passed!");
    }
}
