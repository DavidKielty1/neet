function countConsistentStrings(allowed: string, words: string[]): number {
  const allowedSet = new Set(allowed);
  const validWords = new Set();

  for (const word of words) {
    if (word.split("").every((char) => allowedSet.has(char))) {
      validWords.add(word);
    }
  }

  return Array.from(validWords).length;
}
