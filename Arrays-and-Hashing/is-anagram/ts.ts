class anaSolution {
  isAnagram(s: string, t: string): boolean {
    // Check if lengths of both strings are not equal
    if (s.length !== t.length) {
      return false;
    }

    // Convert string t into an array of characters
    let tArray: string[] = t.split("");
    console.log("tArray:", tArray);

    // Loop through each character in string s
    for (let char of s) {
      // Find the index of the current character in tArray
      let index: number = tArray.indexOf(char);

      // If the character is found, remove it from tArray
      if (index !== -1) {
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
