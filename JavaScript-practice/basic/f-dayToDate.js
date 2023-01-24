


function firstSol() {

    for (var year = 2014; year <= 2050; year++) {
        var d = new Date(year, 0, 1);
        if ( d.getDay() === 0 ) {
            console.log("1st January is being a Sunday  "+year);
        }
    }
}

firstSol();


// =================================================================


// sec sol


var junFirst = 0; // day in 2014
const dayList = ["sunday", "Monday","Tuesday","Wednesday ","Thursday","Friday","Saturday"];


isJunFirstSunday();


function isJunFirstSunday() {

    for (let i = 2014; i < 2050; i++) {

        const steps = howManyDaysInYear(i)%7;
        junFirst = (junFirst + steps)%7;
        
        if (junFirst === 0) {
            console.log("junuary 1th, " + (i+1) + " is in " + dayList[0]);
        }
    }
}




function howManyDaysInYear(year) {

    var days = 0;
    var daysInMonth = [31, isLeap(year), 31,30,31,30,31,31,30,31,30,31];
    
    for (let i = 0; i < 12; i++) {
        var num = parseInt(daysInMonth[i]);
        days = days + num;
    }
    return days;
}




function isLeap(year) {

    if (year%400 === 0) {
        return 29;
        
    } else if ((year%4 === 0) && (year%100 !=0 )) {
        return 29;
        
    } else {
        return 28;
    }
}










