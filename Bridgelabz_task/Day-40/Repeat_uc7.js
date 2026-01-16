const WAGE_PER_HOUR = 20;
const FULL_TIME_HOURS = 8;
const PART_TIME_HOURS = 4;
const FULL_DAY_WAGE = FULL_TIME_HOURS * WAGE_PER_HOUR; 
const PART_DAY_WAGE = PART_TIME_HOURS * WAGE_PER_HOUR; 


let dailyWages = [];
for (let day = 1; day <= 20; day++) {
    let empCheck = Math.floor(Math.random() * 3); 
    let hours = 0;
    if (empCheck === 1) hours = PART_TIME_HOURS;  
    else if (empCheck === 2) hours = FULL_TIME_HOURS;
    let wage = hours * WAGE_PER_HOUR;
    dailyWages.push({ day, wage });
}

const totalWage = dailyWages.reduce((sum, obj) => sum + obj.wage, 0);
console.log("Total Wage:", totalWage);

const dayWithWage = dailyWages.map(obj => `Day ${obj.day} => Wage ${obj.wage}`);
console.log("Day with Wage:", dayWithWage);

const fullTimeDays = dailyWages.filter(obj => obj.wage === FULL_DAY_WAGE).map(obj => obj.day);
console.log("Days with Full Time Wage:", fullTimeDays);

const firstFullTimeDay = dailyWages.find(obj => obj.wage === FULL_DAY_WAGE);
console.log("First Full Time Wage Day:", firstFullTimeDay ? firstFullTimeDay.day : "None");

const allFullTime = dailyWages.every(obj => obj.wage === FULL_DAY_WAGE);
console.log("Every day full time wage?", allFullTime);

const hasPartTime = dailyWages.some(obj => obj.wage === PART_DAY_WAGE);
console.log("Any Part Time Wage?", hasPartTime);

const daysWorked = dailyWages.filter(obj => obj.wage > 0).length;
console.log("Number of Days Worked:", daysWorked);
