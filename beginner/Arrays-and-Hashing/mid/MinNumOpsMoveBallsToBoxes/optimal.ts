// O(n) time complexity

const minOperations = (boxes: string) => {
    const n = boxes.length;

    const result = new Array(n).fill(0);
    
    // Count balls and cost from left to right
    let ballsOnLeft = 0;
    let costFromLeft = 0;
    
    // [1, 1, 0]
    for (let i = 0; i < n; i++) {
        result[i] += costFromLeft;
        if (boxes[i] === '1') {
            ballsOnLeft++;
        }
        costFromLeft += ballsOnLeft; // Cost increases by number of balls on left
    }
    
    // [1, 1, 3]

    // Count balls and cost from right to left
    let ballsOnRight = 0;
    let costFromRight = 0;
    
    for (let i = n - 1; i >= 0; i--) {
        result[i] += costFromRight;
        if (boxes[i] === '1') {
            ballsOnRight++;
        }
        costFromRight += ballsOnRight; // Cost increases by number of balls on right
    }
    
    return result;
}

minOperations("110")