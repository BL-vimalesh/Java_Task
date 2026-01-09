let number = 1
const readline = require("readline").createInterface
({
    input: process.stdin,
    output: process.stdout
});
readline.question("get the year from console",(number) => {

if(number == 0){
    console.log("sunday");
}else if(number == 1){
    console.log("Monday");
}else if(number == 2){
    console.log("Tuesday");
}else if(number == 3){
    console.log("Wednesday");
}else if(number == 4){
    console.log("Thursday");
}else if(number == 5){
    console.log("Friday");
}else if(number == 6){
    console.log("Saturday");
}
});