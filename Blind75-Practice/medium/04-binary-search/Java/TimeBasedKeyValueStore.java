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
 * [[],["foo","bar",1],["foo",1],["foo",3],["foo","bar2",4],["foo",4],["foo",5]]
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStore {
    static class TimeMap {
        private record Pair(String value, int timestamp) {}
        private final Map<String, List<Pair>> map = new HashMap<>();

        public TimeMap() { 
        }

        public void set(String key, String value, int timestamp) {
            map.computeIfAbsent(key, ignored -> new ArrayList<>()).add(new Pair(value, timestamp));
        }

        public String get(String key, int timestamp) {
            List<Pair> pairings = map.get(key);
            if (pairings.size() < 1) {
                return "";
            }

            int left = 0;
            int right = pairings.size() - 1;
            String answer = "";

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (pairings.get(mid).timestamp() <= timestamp) {
                    answer = pairings.get(mid).value;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return answer;
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
            // private final Map<String, List<Pair>> map = new HashMap<>();
            //
            // public TimeMap() {
            // }
            //
            // public void set(String key, String value, int timestamp) {
            //     map.computeIfAbsent(key, ignored -> new ArrayList<>()).add(new Pair(timestamp, value));
            // }
            //
            // public String get(String key, int timestamp) {
            //     List<Pair> values = map.get(key);
            //     if (values == null) {
            //         return "";
            //     }
            //     int left = 0;
            //     int right = values.size() - 1;
            //     String answer = "";
            //     while (left <= right) {
            //         int mid = left + (right - left) / 2;
            //         if (values.get(mid).timestamp <= timestamp) {
            //             answer = values.get(mid).value;
            //             left = mid + 1;
            //         } else {
            //             right = mid - 1;
            //         }
            //     }
            //     return answer;
            // }
            //
            // private static class Pair {
            //     int timestamp;
            //     String value;
            //
            //     Pair(int timestamp, String value) {
            //         this.timestamp = timestamp;
            //         this.value = value;
            //     }
            // }
    }

    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        assert timeMap.get("foo", 1).equals("bar");
        assert timeMap.get("foo", 3).equals("bar");
        timeMap.set("foo", "bar2", 4);
        assert timeMap.get("foo", 4).equals("bar2");
        assert timeMap.get("foo", 5).equals("bar2");
        System.out.println("All test cases passed!");
    }
}
