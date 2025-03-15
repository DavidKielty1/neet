// O(n)^2 time
// inputBoxesArray = [1, 1, 0]
// inputBoxesArray = [0, 0, 1, 0, 1, 1]

const movingBalls = (boxes: string) => {
    const inputBoxesArray = boxes.split('').map(Number);
    console.log(inputBoxesArray)

    let k = 0;
    const output = new Array(inputBoxesArray.length).fill(0);

    for(let i = 0; i < boxes.length; i++) {

        for(let j = 0; j < boxes.length; j++) {

            if (j === i) continue;
            if (inputBoxesArray[j] !== 1) continue;

           
            output[k] === 0 ? output[k] = Math.abs(j - i) : output[k] += Math.abs(j - i);
        }

        k++;
    }

    console.log("Output Array:", output)

    return output;
}

// movingBalls("110")
movingBalls("001011")