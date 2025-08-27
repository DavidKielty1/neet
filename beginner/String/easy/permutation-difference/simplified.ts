function findPermutationDifferenceSimp(s: string, t: string): number {
    let sum = 0;
    
    // Single map to store s positions
    const positions = new Map();
    for (let i = 0; i < s.length; i++) {
        positions.set(s[i], i);
    }
    
    // Calculate differences directly while iterating t
    for (let i = 0; i < t.length; i++) {
        sum += Math.abs(positions.get(t[i]) - i);
    }
    
    return sum;
}