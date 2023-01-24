
function diffFrom13(num) {

    var diff = num - 13;

    // if num > 13, return double the difference
    if (diff < 0) {
        diff = -diff;
        return diff;
    
    } else {
        return 2*diff;
    }
}

console.log(diffFrom13(84));
console.log(diffFrom13(32));
console.log(diffFrom13(11));

