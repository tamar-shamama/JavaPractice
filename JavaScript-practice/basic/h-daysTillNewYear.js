const today = new Date();
const currentYear = today.getFullYear();
const todayInMachineTime = today.getTime();

const newYear = new Date(currentYear+1,0,1);
const newYearInMachineTime = newYear.getTime();

const timeLeftInMachineTime = newYearInMachineTime - todayInMachineTime;
const daysLeft = timeLeftInMachineTime/(1000*60*60*24);
console.log(daysLeft + " untill new year");
