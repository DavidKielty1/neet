class anaSolution {
  isAnagram(s: string, t: string): boolean {
    if (s.length !== t.length) {
      return false;
    }

    let tArray: string[] = t.split(""); // Convert string t into an array of characters
    console.log("tArray:", tArray);

    for (let char of s) {
      // Find the index of the current character in tArray
      let index: number = tArray.indexOf(char);

      if (index !== -1) {
        // If char found, remove from tArray
        tArray.splice(index, 1);
      } else {
        // If any character in s is not found in t, return false
        return false;
      }
    }

    // After removing all matching characters, tArray should be empty
    return tArray.length === 0;
  }
}

const pysol = new anaSolution();

console.log(pysol.isAnagram("anagram", "nagaram")); // true
console.log(pysol.isAnagram("rat", "car")); // false
