#include <iostream>
#include <vector>
#include <unordered_map>
#include <utility>

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        // Unordered_map for the HashMap equivalent 
        std::unordered_map<int, int> map;

        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i];

            // If complement in the map, return indices
            if (map.find(complement) != map.end()) {
                return { map[complement], i };
            }

            // Store current number & its index in map
            map[nums[i]] = i;
        }

        // Return an empty vector if no solution is found
        return {};
    }
};

int main() {
    Solution sol;

    std::vector<int> result = sol.twoSum(std::vector<int>{3, 4, 5, 6}, 7);

    std::cout << "[" << result[0] << ", " << result[1] << "]" << std::endl;  // Output: [0, 1]
    result = sol.twoSum(std::vector<int>{4, 5, 6}, 10);
    std::cout << "[" << result[0] << ", " << result[1] << "]" << std::endl;  // Output: [0, 2]
    result = sol.twoSum(std::vector<int>{5, 5}, 10);
    std::cout << "[" << result[0] << ", " << result[1] << "]" << std::endl;  // Output: [0, 1]

    return 0;
}
