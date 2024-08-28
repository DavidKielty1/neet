class Solution {
  isAnagram(s, t) {
    if (s.length !== t.length) {
      return false;
    }

    let tArray = t.split("");
    console.log("tArray:", tArray);

    for (let char of s) {
      // Find the index of the current character in tArray
      let index = tArray.indexOf(char);

      // If the character is found, remove it
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
const sol = new Solution();

console.log(sol.isAnagram("anagram", "nagaram")); // true
console.log(sol.isAnagram("rat", "car")); // false
