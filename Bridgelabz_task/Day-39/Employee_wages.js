const IS_PART_TIME = 1;
const IS_FULL_TIME = 2;
const IS_PART_HOURS = 4;
const IS_FULL_HOURS = 8;
const WAGES_PER_HOUR = 20;
let random = Math.floor(Math.random() * 10) % 3;
console.log(random)
let empwages = 0;
switch(random){
    case IS_PART_TIME:
         empwages = empwages + IS_PART_HOURS;
         break;
    case IS_FULL_TIME:
        empwages = empwages + IS_FULL_HOURS;
        break;
    default:
        empwages = 0;
}
console.log(empwages * WAGES_PER_HOUR);