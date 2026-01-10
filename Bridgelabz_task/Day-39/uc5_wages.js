const IS_PART_TIME = 1;
const IS_FULL_TIME = 2;
const IS_PART_HOURS = 4;
const IS_FULL_HOURS = 8;
const WAGES_PER_HOUR = 20;
let empwages = 0;
function calculate(values){
    switch(values){
        case IS_PART_TIME:
            return empwages = empwages + IS_PART_HOURS
             
            break;
        case IS_FULL_TIME:
            return empwages = empwages + IS_FULL_HOURS
            break;
        default:
            empwages = 0;
    }
}

let values = Math.floor(Math.random() * 10) % 2;
console.log(calculate(values)* WAGES_PER_HOUR);
console.log(calculate(values));