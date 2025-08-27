function interpretRegex(command: string): string {
    return command
        .replace(/\(\)/g, 'o')
        .replace(/\(al\)/g, 'al');
}

// Test cases
console.log(interpretRegex("G()(al)")); // "Goal"
console.log(interpretRegex("G()()()()(al)")); // "Gooooal"
console.log(interpretRegex("(al)G(al)()()G")); // "alGalooG"
