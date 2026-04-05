/*
705. Design HashSet
Difficulty: Easy
Pattern: Arrays & Hashing

void add(key), void remove(key), boolean contains(key). Keys in [0, 1_000_000].

Approach: boolean[] presence table — O(1) ops, fixed space for key range.

Time: O(1) per op, Space: O(10^6)
*/

public class DesignHashSetJava {

    static class MyHashSet {
        private final boolean[] present = new boolean[1_000_001];

        public void add(int key) {
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

            // present[key] = true;

            throw new UnsupportedOperationException("Implement add");
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

            // present[key] = false;

            throw new UnsupportedOperationException("Implement remove");
        }

        public boolean contains(int key) {
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

            // return present[key];

            throw new UnsupportedOperationException("Implement contains");
        }
    }

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
