function isIncrease(arr) {

    for (let i = 0; i < arr.length-1; i++) {
       
        if (arr[i] >= arr[i+1]) {
            return false;
        }
    }
    return true;
}


console.log(isIncrease([1,2,3]));
console.log(isIncrease([2,2,3]));
console.log(isIncrease([3,2,1]));