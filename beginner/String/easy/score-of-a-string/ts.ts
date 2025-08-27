const scoreOfString = (s: string): number => {
    const stringArray = s.split('')

    let score = 0;

    for (let i = 0; i < stringArray.length - 1; i++) {
        if (i === stringArray.length) continue;

        const prev = stringArray[i].charCodeAt(0)
        const curr = stringArray[i + 1].charCodeAt(0)
        
        score = score + Math.abs(prev - curr);
    }

    console.log("SCore:", score)
    return score;
}

scoreOfString('hello');