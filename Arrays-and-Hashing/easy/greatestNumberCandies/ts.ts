// o(n) space + time:
function kidsWithCandiesSimple(
  candies: number[],
  extraCandies: number
): boolean[] {
  let highestBaseCandy = 0;

  for (let i = 0; i < candies.length; i++) {
    if (candies[i] > highestBaseCandy) {
      highestBaseCandy = candies[i];
    }
  }
  console.log("highestBaseCandy", highestBaseCandy);

  let booleanArray: boolean[] = [];

  for (let i = 0; i < candies.length; i++) {
    if (candies[i] + extraCandies >= highestBaseCandy) {
      booleanArray.push(true);
    } else {
      booleanArray.push(false);
    }
  }

  return booleanArray;
}

// o(n) space + time:
function kidsWithCandiesRefined(
  candies: number[],
  extraCandies: number
): boolean[] {
  const highestBaseCandy = Math.max(...candies);
  return candies.map((candy) => candy + extraCandies >= highestBaseCandy);
}

// o(n) time, o(1) space:
// (Act with caution, should not change number array to boolean array. )
// Breaks typing contract.
function kidsWithCandiesSpaceRefine(
  candies: number[],
  extraCandies: number
): boolean[] {
  const highestBaseCandy = Math.max(...candies);

  for (let i = 0; i < candies.length; i++) {
    // Replace each candy value with the boolean result
    candies[i] = (candies[i] + extraCandies >=
      highestBaseCandy) as unknown as number;
  }

  return candies as unknown as boolean[];
}
