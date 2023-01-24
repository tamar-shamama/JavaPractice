

const year = 2027;
console.log ("the year is " + year);
isLeap(year);

function isLeap(year) {

    if (year%400 == 0) {
        console.log("leaped");
        return 29;
        
    } else if ((year%4 === 0) && (year%100 !=0 )) {
        console.log("leaped");
        return 29;
        
        
    } else {
        console.log("not leaped");
        return 28;
    }
}

console.log(isLeap(2027));
