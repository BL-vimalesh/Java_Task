let number = 10
const readline = require("readline").createInterface
({
    input: process.stdin,
    output: process.stdout
});
readline.question("get the year from console",(number) => {
if(number == 1){
    console.log("Unit");
}else if(number == 10){
    console.log("Ten");
}else if(number == 100){
    console.log("Hundred");
}else if(number == 1000){
    console.log("Thousand");
}
});