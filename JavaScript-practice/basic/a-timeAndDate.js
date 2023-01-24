
const today = new Date();

const day = today.getDay();
const dayList = ["sunday", "Monday","Tuesday","Wednesday ","Thursday","Friday","Saturday"];

const houre = today.getHours();
const minute = today.getMinutes();
const second = today.getSeconds();

const date = today.getDate();
const month = today.getMonth() + 1;
const year = today.getFullYear();

var dd;
if (date <10) {
    dd = "0" + date;
} else {
    dd = date;
}


var mm;
if (month <10) {
    mm = "0" + month;
} else {
    mm = month;
}


console.log("today is: " + dayList[day]);
console.log("current time: " + houre + " : " + minute + " : " + second);
console.log("current date: " + dd + "/" + mm + "/" + year);

