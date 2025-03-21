function findPermutationDifference(s: string, t: string): number {
    const sMap = new Map;
    for (let i = 0; i < s.length; i++) {
        sMap.set(s[i], i)
    }

    const tMap = new Map;
    for (let i = 0; i < t.length; i++) {
        tMap.set(t[i], i)
    }

    let differences: number[] = [];
        for (let char of s) {
        differences.push(Math.abs(sMap.get(char) - tMap.get(char)));
    }

    return differences.reduce((sum, diff) => sum + diff, 0);  
};

findPermutationDifference('abc', 'bac')
