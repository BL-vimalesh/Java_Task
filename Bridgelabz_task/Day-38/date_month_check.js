const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
let boolean = false;
rl.question("Enter a: ", (month) => {
  rl.question("Enter b: ", (year) => {
    console.log("Sum =",month + parseInt(year));
if(month == "april" || month == "may"){
    boolean = true;
}
if(month == "march"){
    if(date> 20){
        boolean = true;
    }
}
if(month == "june"){
    if(date <20){
        boolean = true;
    }
}
console.log(boolean);  
    rl.close();
  });
});
