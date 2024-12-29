function twoSum(nums: number[], target: number): number[] {

    const map: Record<number, number> = {}

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i]

        if (complement in map) {
            return [i, map[complement]]
        }

        map[nums[i]] = i
    }
    return
};

twoSum([1, 2, 3, 4], 5)