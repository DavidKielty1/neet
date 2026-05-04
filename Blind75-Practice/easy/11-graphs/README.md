# Graphs (Easy)

## Pattern overview

Grid and relationship modeling: treat cells or people as nodes and adjacency (neighbors, trust edges) as graph structure. Often linear scans with maps or counting degrees suffice at easy difficulty.

## Java Practice File Builder

When a Java practice file has only one solution method, keep the usual single spoiler spacer
block in that method.

When the solution naturally spans multiple methods, such as a helper DFS, a comparison
helper, a constructor plus `add`, or an API method plus the main solver:

1. Leave the earlier/helper method bodies unimplemented.
2. Do not add separate 40-60 line `//` spacer blocks to those helper methods.
3. Keep exactly one 40-60 line `//` spacer block in the main method the learner is meant
   to solve from.
4. Put one combined commented reference implementation under that single spacer block,
   including all related methods together.
5. Keep exactly one commented reference solution block per file or per multi-method solution.
   Do not leave older duplicate versions underneath it.
6. Avoid duplicate commented solutions and do not add `throw new UnsupportedOperationException(...)`
   placeholders.

## Problems in this folder

| Problem                       | LeetCode # | Idea                                       |
| ----------------------------- | ---------- | ------------------------------------------ |
| Island Perimeter              | 463        | Land cell contributes 4 minus shared edges |
| Verifying an Alien Dictionary | 953        | Compare adjacent words with custom order   |
| Find the Town Judge           | 997        | In/out degree on trust directed edges      |
