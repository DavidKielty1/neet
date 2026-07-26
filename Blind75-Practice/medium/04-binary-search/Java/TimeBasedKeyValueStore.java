/*
 * 981. Time Based Key-Value Store
 * Difficulty: Medium
 * Pattern: Binary Search / Design
 *
 * Problem:
 * Design a time-based key-value data structure that can store multiple values for the
 * same key at different timestamps and retrieve the value with the largest timestamp
 * less than or equal to a given timestamp.
 *
 * Implement the `TimeMap` class:
 * - `TimeMap()` initializes the data structure
 * - `void set(String key, String value, int timestamp)` stores the key and value
 * - `String get(String key, int timestamp)` returns the value with the greatest
 *   timestamp <= given timestamp, or `""` if none exists
 *
 * All `set` calls for a given key are made with strictly increasing timestamps.
 *
 * Example 1:
 * Input:
 * ["TimeMap","set","get","get","set","get","get"]
 * [[], ["foo","bar",1],["foo",1],["foo",3],["foo","bar2",4],["foo",4],["foo",5]]
 * Output:
 * [null,null,"bar","bar",null,"bar2","bar2"]
 *
 * Constraints:
 * - 1 <= key.length, value.length <= 100
 * - key and value consist of lowercase English letters and digits
 * - 1 <= timestamp <= 10^7
 * - At most 2 * 10^5 calls will be made
 *
 * Notes:
 * - Store the values for each key in timestamp order.
 * - Use binary search inside the key's history during `get`.
 */

public class TimeBasedKeyValueStore {
    // data structure shared across methods
    // data structure shared across methods

    public void set(String key, String value, Integer timestamp) {
        
    }

    public String get(String key, Integer timestamp) {
        
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
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            // private record Pair(String value, int timestamp) {}
            // private final Map<String, List<Pair>> map = new HashMap<>();
        
            // public void set(String key, String value, int timestamp) {
            //     map.computeIfAbsent(key, _ -> new ArrayList<>()).add(new Pair(value, timestamp));
            // }
        
            // public String get(String key, int timestamp) {
            //     List<Pair> pairings = map.get(key);
            //     if (pairings == null || pairings.isEmpty()) {
            //         return "";
            //     }
        
            //     int left = 0;
            //     int right = pairings.size() - 1;
        
            //     while (left <= right) {
            //         int mid = left + (right - left) / 2;
        
            //         if (pairings.get(mid).timestamp() <= timestamp) {
            //             left = mid + 1;
            //         } else {
            //             right = mid - 1;
            //         }
            //     }
            //     return right >= 0 ? pairings.get(right).value() : "";
            //
}
