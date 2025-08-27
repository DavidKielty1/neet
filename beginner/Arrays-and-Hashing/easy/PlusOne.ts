function plusOne(digits: number[]): number[] {
  const numDigit = BigInt(digits.join("")) + BigInt(1);
  console.log(numDigit);

  const split = numDigit.toString().split("");
  console.log("PlusOne:", split);

  const mapped = split.map(Number);
  console.log("Mapped:", mapped);

  return mapped;
}

function plusOneConcise(digits: number[]): number[] {
  const num = BigInt(digits.join("")) + BigInt(1);

  return num.toString().split("").map(Number);
}

// From right, loops through each '9' at end of array.
// Changes it to 0, i--, if no 9 found, append carry to [i] e.g.
// [9, 1, 2, 3, 9, 9, 9]
// [9, 1, 2, 3, 9, 9, 0]
// [9, 1, 2, 3, 9, 0, 0]
// [9, 1, 2, 3, 0, 0, 0]
// [9, 1, 2, 4, 0, 0, 0]
var fasterBetterMemory = function (digits) {
  let carry = 1; // Start with the "plus one"
  for (let i = digits.length - 1; i >= 0; i--) {
    const sum = digits[i] + carry;
    digits[i] = sum % 10; // Update the current digit
    carry = Math.floor(sum / 10); // Determine if there’s a carry

    // If no carry remains, we can stop early
    if (carry === 0) break;
  }

  // If there's still a carry after the loop, we need to add it at the front
  if (carry > 0) {
    digits.unshift(carry);
  }

  return digits;
};

// Example usage
console.log(plusOne([6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3]));
