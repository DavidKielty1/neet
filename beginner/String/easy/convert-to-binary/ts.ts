const convertDateToBinary = (date: string): string =>{
    let splitDate = date.split('-').map((date) => {
        const num = parseInt(date, 10);  
        return num.toString(2); 
    })

    const result = splitDate.join('-');
    console.log("result:", result)

    return result
}

convertDateToBinary('2080-02-29')