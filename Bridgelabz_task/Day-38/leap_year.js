const readline = require("readline").createInterface
({
    input: process.stdin,
    output: process.stdout
});
readline.question("get the year from console",(year) => {
      if(year % 4 == 0 && year % 400 != 0 || year == 400){
        console.log("leap year");
      }else{
        console.log("not an leap year");
      }
});