'use strict';

function sumOfDigit(n) {
    let sum = 0;
    
    while (n >0) {
        sum += n / 10;
        n = Math.floor(n / 10);
    }
    
    return sum;
}

function sortArray(arr) {
    let vp = [];
    
    for (let i=0; i < arr.length; i++) {
        vp.push([sumOfDigit(arr[i]), arr[i]]);
    }
    
    vp.sort();
    
    let string = "";
    
    for (let i=0; i< vp.length; i++) {
       string = string + vp[i][1] + " ";
    }
    
    console.log(string);
    
}

let input = "45 56 212";
let arr = [];

for (let i=0; i< input.length; i++) {
    let temp = parseInt(input[i]);
    arr[i] = (isNaN(temp) ? 0 : temp);
}
sortArray(arr);