let number = 1
const readline = require("readline").createInterface
({
    input: process.stdin,
    output: process.stdout
});
readline.question("get the year from console",(number) => {
  switch(number){
    case 0:
        console.log("sunday");
        break;
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
    case 3:
        console.log("Wednesday");
        break;
    case 4:
        console.log("Thursday");
        break;
    case 5:
        console.log("Friday");
        break;
    case 6:
        console.log("saturday");
        break;
  }
});