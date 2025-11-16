// Simple counter map implementation
function createCounterMap(arr: number[]): Map<number, number> {
    const counterMap = new Map<number, number>();
    
    for (const num of arr) {
        counterMap.set(num, (counterMap.get(num) || 0) + 1);
    }
    
    return counterMap;
}

// Alternative: Using an object instead of Map
function createCounterObject(arr: number[]): Record<number, number> {
    const counterObj: Record<number, number> = {};
    
    for (const num of arr) {
        counterObj[num] = (counterObj[num] || 0) + 1;
    }
    
    return counterObj;
}

// Test with example
const input = [1, 4, 6, 5, 2, 1, 2, 3];

console.log("Using Map:");
const mapResult = createCounterMap(input);
console.log(mapResult);
// Output: Map(6) { 1 => 2, 4 => 1, 6 => 1, 5 => 1, 2 => 2, 3 => 1 }

console.log("\nUsing Object:");
const objResult = createCounterObject(input);
console.log(objResult);
// Output: { '1': 2, '4': 1, '6': 1, '5': 1, '2': 2, '3': 1 }

// Helper: Print Map in readable format
console.log("\nMap entries:");
mapResult.forEach((count, value) => {
    console.log(`${value} appears ${count} time(s)`);
});

