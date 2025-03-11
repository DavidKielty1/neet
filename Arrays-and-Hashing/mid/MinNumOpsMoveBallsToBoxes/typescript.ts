// boxes [0, 0, 0, 1] - 4 boxes, last has a ball in it rest are empty


const movingBalls = (balls: string) => {
    console.log("Ma Balls!", balls)
    const inputBallsArray = "110".split('').map(Number);

    const output = [];

    for(let i = 0; i < balls.length; i++) {

        for(let j = 0; j < balls.length; j++) {

            console.log(inputBallsArray[i]);
            console.log(inputBallsArray[j]);

            if (j === i) continue;
            if (inputBallsArray[j] === 0) continue;
            


        }
    }
}

//Test

movingBalls("110")