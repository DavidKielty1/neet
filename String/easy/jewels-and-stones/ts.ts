const jewelsAndStones = (jewels: string, stones: string): number => { 
    const jewelsArray = jewels.split('')

    let output = 0;

    for(let char of stones) {
        if (jewelsArray.includes(char)) output++;
    }

    return output;
}

jewelsAndStones('aA', 'aAAbbbb')
jewelsAndStones('z', 'ZZ')