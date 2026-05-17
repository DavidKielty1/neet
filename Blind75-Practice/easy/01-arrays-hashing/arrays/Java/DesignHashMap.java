/*
706. Design HashMap
Difficulty: Easy
Pattern: Arrays & Hashing

put(key, value), get(key), remove(key). Missing key => get returns -1.
Keys and values in [0, 1_000_000].

Approach: parallel boolean[] for occupancy and int[] for values.

Example:
Input:  ["MyHashMap","put","put","get","get","put","get","remove","get"]
        [[],[1,1],[2,2],[1],[3],[2,1],[2],[2],[2]]
Output: [null,null,null,1,-1,null,1,null,-1]
Explanation:
  put(1,1) → map: {1→1}
  put(2,2) → map: {1→1, 2→2}
  get(1)   → 1
  get(3)   → -1 (not found)
  put(2,1) → map: {1→1, 2→1}  (value updated)
  get(2)   → 1
  remove(2)→ map: {1→1}
  get(2)   → -1 (not found)

Time: O(1) per op, Space: O(10^6)
*/

public class DesignHashMap {

    static class MyHashMap {
            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            //

            // put :
            // has[key] = true;
            // vals[key] = value;

            // get : 
            // return has[key] ? vals[key] : -1;

            // remove:
            // has[key] = false;
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
