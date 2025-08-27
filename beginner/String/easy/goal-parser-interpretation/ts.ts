function interpret(command: string): string {
    let goalArray: string[] = [];

    for (let i = 0; i < command.length;) {        
        if (command[i] === 'G') {
            goalArray.push('G');
            i++;
            continue;
        }

        if (command[i] === '(') {
            if (command[i + 1] === ')') {
                goalArray.push('o');
                i += 2;
                continue;
            } else {
                goalArray.push('al');
                i += 4;
                continue;
            }
        }
        
        i++;
    }

    const joined = goalArray.join('');

    return joined;
};

interpret("G()(al)");
interpret("G()()()()(al)")
interpret("(al)G(al)()()G")